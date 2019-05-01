package com.design_pattern.structural.proxy;

public class CommandExecutorImpl implements CommandExecutor {

	public void runCommand(String cmd) throws Exception {
		//some heavy implementation
		Runtime.getRuntime().exec(cmd);
		System.out.println("'" + cmd + "' command executed.");

	}

}
