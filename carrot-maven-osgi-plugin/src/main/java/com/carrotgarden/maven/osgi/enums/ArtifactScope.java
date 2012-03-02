package com.carrotgarden.maven.osgi.enums;

import java.util.List;

import org.apache.maven.artifact.Artifact;

public enum ArtifactScope {

	UNKNOWN("unknown"), //

	//

	COMPILE(Artifact.SCOPE_COMPILE), //

	TEST(Artifact.SCOPE_TEST), //

	RUNTIME(Artifact.SCOPE_RUNTIME), //

	PROVIDED(Artifact.SCOPE_PROVIDED), //

	SYSTEM(Artifact.SCOPE_SYSTEM), //

	IMPORT(Artifact.SCOPE_IMPORT), //

	;

	public final String code;

	ArtifactScope(String code) {
		this.code = code;
	}

	public static boolean isIncluded(List<String> includeScopeList,
			Artifact artifact) {

		for (String scope : includeScopeList) {
			if (scope.equalsIgnoreCase(artifact.getScope())) {
				return true;
			}
		}

		return false;

	}

}