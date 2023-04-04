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

package com.aliyuncs.imm.model.v20200930;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import java.util.Map;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.imm.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateTriggerRequest extends RpcAcsRequest<CreateTriggerResponse> {
	   

	@SerializedName("notification")
	private Notification notification;

	private String projectName;

	@SerializedName("tags")
	private Map<String,String> tags;

	@SerializedName("input")
	private Input input;

	private String serviceRole;

	@SerializedName("actions")
	private List<Actions> actions;
	public CreateTriggerRequest() {
		super("imm", "2020-09-30", "CreateTrigger", "imm");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Notification getNotification() {
		return this.notification;
	}

	public void setNotification(Notification notification) {
		this.notification = notification;	
		if (notification != null) {
			putBodyParameter("Notification" , new Gson().toJson(notification));
		}	
	}

	public String getProjectName() {
		return this.projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
		if(projectName != null){
			putBodyParameter("ProjectName", projectName);
		}
	}

	public Map<String,String> getTags() {
		return this.tags;
	}

	public void setTags(Map<String,String> tags) {
		this.tags = tags;	
		if (tags != null) {
			putBodyParameter("Tags" , new Gson().toJson(tags));
		}	
	}

	public Input getInput() {
		return this.input;
	}

	public void setInput(Input input) {
		this.input = input;	
		if (input != null) {
			putBodyParameter("Input" , new Gson().toJson(input));
		}	
	}

	public String getServiceRole() {
		return this.serviceRole;
	}

	public void setServiceRole(String serviceRole) {
		this.serviceRole = serviceRole;
		if(serviceRole != null){
			putBodyParameter("ServiceRole", serviceRole);
		}
	}

	public List<Actions> getActions() {
		return this.actions;
	}

	public void setActions(List<Actions> actions) {
		this.actions = actions;	
		if (actions != null) {
			putBodyParameter("Actions" , new Gson().toJson(actions));
		}	
	}

	public static class Notification {

		@SerializedName("Endpoint")
		private String endpoint;

		@SerializedName("Topic")
		private String topic;

		public String getEndpoint() {
			return this.endpoint;
		}

		public void setEndpoint(String endpoint) {
			this.endpoint = endpoint;
		}

		public String getTopic() {
			return this.topic;
		}

		public void setTopic(String topic) {
			this.topic = topic;
		}
	}

	public static class Input {

		@SerializedName("OSS")
		private OSS oSS;

		public OSS getOSS() {
			return this.oSS;
		}

		public void setOSS(OSS oSS) {
			this.oSS = oSS;
		}

		public static class OSS {

			@SerializedName("Bucket")
			private String bucket;

			@SerializedName("Prefix")
			private String prefix;

			@SerializedName("MatchExpressions")
			private List<String> matchExpressions;

			public String getBucket() {
				return this.bucket;
			}

			public void setBucket(String bucket) {
				this.bucket = bucket;
			}

			public String getPrefix() {
				return this.prefix;
			}

			public void setPrefix(String prefix) {
				this.prefix = prefix;
			}

			public List<String> getMatchExpressions() {
				return this.matchExpressions;
			}

			public void setMatchExpressions(List<String> matchExpressions) {
				this.matchExpressions = matchExpressions;
			}
		}
	}

	public static class Actions {

		@SerializedName("Name")
		private String name;

		@SerializedName("Parameters")
		private List<String> parameters;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public List<String> getParameters() {
			return this.parameters;
		}

		public void setParameters(List<String> parameters) {
			this.parameters = parameters;
		}
	}

	@Override
	public Class<CreateTriggerResponse> getResponseClass() {
		return CreateTriggerResponse.class;
	}

}
