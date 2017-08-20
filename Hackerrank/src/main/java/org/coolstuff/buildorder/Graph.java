package org.coolstuff.buildorder;

import java.util.*;

public class Graph {
    private Map<String, Project> projects = new HashMap<>();
    private List<Project> projectList = new ArrayList<>();

    public void addProject(String name) {
        if(!projects.containsKey(name)) {
            Project project = new Project(name);
            projects.put(name, project);
            projectList.add(project);
        }
    }

    public void addDependency(String first, String second) {
        Project firstProject = projects.get(first);
        Project secondProject = projects.get(second);
        firstProject.addDependent(secondProject);
        secondProject.addDependencies();
    }

    public List<Project> buildOrder() {
        int totalProjects = projectList.size();
        List<Project> results = new ArrayList<>();
        results.addAll(findIndependentProjects());
        int position = 0;

        while(position < totalProjects) {
            Project current = results.get(position);
            if(current == null) {
                results.clear();
                break;
            }

            Collection<Project> dependents = current.getDependents();
            for(Project dependent : dependents) {
                dependent.removeDependencies();
            }

            results.addAll(findIndependentProjects());
            position++;
        }
        return results;
    }

    private List<Project> findIndependentProjects() {
        List<Project> results = new ArrayList<>();
        for(Project project : projectList) {
            if(project.getDependencies() == 0) {
                results.add(project);
            }
        }
        projectList.removeAll(results);
        return results;
    }

    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addProject("a");
        graph.addProject("b");
        graph.addProject("c");
        graph.addProject("d");
        graph.addProject("e");
        graph.addProject("f");
        graph.addDependency("a", "d");
        graph.addDependency("f", "b");
        graph.addDependency("b", "d");
        graph.addDependency("f", "a");
        graph.addDependency("d", "c");

        List<Project> result = graph.buildOrder();
        for(Project item : result) {
            System.out.println(item.getName());
        }
    }
}
