/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.das.model.v20200116;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.das.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateKillInstanceSessionTaskRequest extends RpcAcsRequest<CreateKillInstanceSessionTaskResponse> {
	   

	private Boolean killAllSessions;

	private String dbUser;

	private String sessionIds;

	private String dbUserPassword;

	private String instanceId;

	private String ignoredUsers;

	private String nodeId;
	public CreateKillInstanceSessionTaskRequest() {
		super("DAS", "2020-01-16", "CreateKillInstanceSessionTask");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getKillAllSessions() {
		return this.killAllSessions;
	}

	public void setKillAllSessions(Boolean killAllSessions) {
		this.killAllSessions = killAllSessions;
		if(killAllSessions != null){
			putQueryParameter("KillAllSessions", killAllSessions.toString());
		}
	}

	public String getDbUser() {
		return this.dbUser;
	}

	public void setDbUser(String dbUser) {
		this.dbUser = dbUser;
		if(dbUser != null){
			putQueryParameter("DbUser", dbUser);
		}
	}

	public String getSessionIds() {
		return this.sessionIds;
	}

	public void setSessionIds(String sessionIds) {
		this.sessionIds = sessionIds;
		if(sessionIds != null){
			putQueryParameter("SessionIds", sessionIds);
		}
	}

	public String getDbUserPassword() {
		return this.dbUserPassword;
	}

	public void setDbUserPassword(String dbUserPassword) {
		this.dbUserPassword = dbUserPassword;
		if(dbUserPassword != null){
			putQueryParameter("DbUserPassword", dbUserPassword);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public String getIgnoredUsers() {
		return this.ignoredUsers;
	}

	public void setIgnoredUsers(String ignoredUsers) {
		this.ignoredUsers = ignoredUsers;
		if(ignoredUsers != null){
			putQueryParameter("IgnoredUsers", ignoredUsers);
		}
	}

	public String getNodeId() {
		return this.nodeId;
	}

	public void setNodeId(String nodeId) {
		this.nodeId = nodeId;
		if(nodeId != null){
			putQueryParameter("NodeId", nodeId);
		}
	}

	@Override
	public Class<CreateKillInstanceSessionTaskResponse> getResponseClass() {
		return CreateKillInstanceSessionTaskResponse.class;
	}

}
