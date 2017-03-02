package org.owasp.dependencycheck.xml.pom;

/**
 *
 * @author Prakhash Sivakumar
 */

public class PomCoordinates {

    private String name;
    private String version;
    private String artifactID;
    private String groupId;

    public PomCoordinates(){
    }

    public PomCoordinates(String name, String version, String artifactID, String groupId) {
        this.name = name;
        this.version = version;
        this.artifactID = artifactID;
        this.groupId = groupId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getArtifactID() {
        return artifactID;
    }

    public void setArtifactID(String artifactID) {
        this.artifactID = artifactID;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }
}
