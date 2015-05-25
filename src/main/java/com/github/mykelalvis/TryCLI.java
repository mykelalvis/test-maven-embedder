package com.github.mykelalvis;

import org.apache.maven.cli.MavenCli;

public class TryCLI {

	public TryCLI(String projHome) {
		String[] goals = new String[] {"clean"};

		MavenCli cli = new MavenCli();
		int z = cli.doMain(goals,projHome + "/src/test/resources/simple", System.out, System.err);
		System.out.println("Z = " + z);
	}

	public static void main(String[] args) {
		TryCLI c = new TryCLI(".");
//		TryCLI c = new TryCLI(System.getProperty("HOME") + "/git/test-maven-embedder");
	}

}
