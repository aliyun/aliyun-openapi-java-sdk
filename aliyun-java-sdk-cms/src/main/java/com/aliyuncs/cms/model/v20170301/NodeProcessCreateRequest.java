/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.cms.model.v20170301;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class NodeProcessCreateRequest extends RpcAcsRequest<NodeProcessCreateResponse> {
	
	public NodeProcessCreateRequest() {
		super("Cms", "2017-03-01", "NodeProcessCreate", "cms");
	}

	private String instanceId;

	private String name;

	private String processName;

	private String processUser;

	private String command;

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		putQueryParameter("InstanceId", instanceId);
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		putQueryParameter("Name", name);
	}

	public String getProcessName() {
		return this.processName;
	}

	public void setProcessName(String processName) {
		this.processName = processName;
		putQueryParameter("ProcessName", processName);
	}

	public String getProcessUser() {
		return this.processUser;
	}

	public void setProcessUser(String processUser) {
		this.processUser = processUser;
		putQueryParameter("ProcessUser", processUser);
	}

	public String getCommand() {
		return this.command;
	}

	public void setCommand(String command) {
		this.command = command;
		putQueryParameter("Command", command);
	}

	@Override
	public Class<NodeProcessCreateResponse> getResponseClass() {
		return NodeProcessCreateResponse.class;
	}

}
