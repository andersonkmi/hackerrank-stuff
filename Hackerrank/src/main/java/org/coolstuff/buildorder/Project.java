package org.coolstuff.buildorder;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Project {
    private String name;
    private Map<String, Project> dependents = new HashMap<>();
    private int dependencies = 0;

    public Project(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addDependent(Project project) {
        dependents.put(project.getName(), project);
    }

    public Collection<Project> getDependents() {
        return dependents.values();
    }

    public boolean hasDependents() {
        return !dependents.isEmpty();
    }

    public void addDependencies() {
        dependencies++;
    }

    public void removeDependencies() {
        dependencies--;
    }

    public int getDependencies() {
        return dependencies;
    }

    public boolean equals(Object other) {
        if(this == other) {
            return true;
        }

        if(!getClass().equals(other.getClass())) {
            return false;
        }

        Project instance = (Project) other;
        return getName().equals(instance.getName());
    }
}
