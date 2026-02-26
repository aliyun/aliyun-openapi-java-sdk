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
public class CreateImageModerationTaskRequest extends RpcAcsRequest<CreateImageModerationTaskResponse> {
	   

	private String userData;

	@SerializedName("notification")
	private Notification notification;

	private String projectName;

	private Long maxFrames;

	@SerializedName("credentialConfig")
	private CredentialConfig credentialConfig;

	private String reviewer;

	@SerializedName("tags")
	private Map<String,String> tags;

	private String sourceURI;

	@SerializedName("scenes")
	private List<String> scenes;

	private Long interval;
	public CreateImageModerationTaskRequest() {
		super("imm", "2020-09-30", "CreateImageModerationTask", "imm");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getUserData() {
		return this.userData;
	}

	public void setUserData(String userData) {
		this.userData = userData;
		if(userData != null){
			putQueryParameter("UserData", userData);
		}
	}

	public Notification getNotification() {
		return this.notification;
	}

	public void setNotification(Notification notification) {
		this.notification = notification;	
		if (notification != null) {
			putQueryParameter("Notification" , new Gson().toJson(notification));
		}	
	}

	public String getProjectName() {
		return this.projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
		if(projectName != null){
			putQueryParameter("ProjectName", projectName);
		}
	}

	public Long getMaxFrames() {
		return this.maxFrames;
	}

	public void setMaxFrames(Long maxFrames) {
		this.maxFrames = maxFrames;
		if(maxFrames != null){
			putQueryParameter("MaxFrames", maxFrames.toString());
		}
	}

	public CredentialConfig getCredentialConfig() {
		return this.credentialConfig;
	}

	public void setCredentialConfig(CredentialConfig credentialConfig) {
		this.credentialConfig = credentialConfig;	
		if (credentialConfig != null) {
			putQueryParameter("CredentialConfig" , new Gson().toJson(credentialConfig));
		}	
	}

	public String getReviewer() {
		return this.reviewer;
	}

	public void setReviewer(String reviewer) {
		this.reviewer = reviewer;
		if(reviewer != null){
			putQueryParameter("Reviewer", reviewer);
		}
	}

	public Map<String,String> getTags() {
		return this.tags;
	}

	public void setTags(Map<String,String> tags) {
		this.tags = tags;	
		if (tags != null) {
			putQueryParameter("Tags" , new Gson().toJson(tags));
		}	
	}

	public String getSourceURI() {
		return this.sourceURI;
	}

	public void setSourceURI(String sourceURI) {
		this.sourceURI = sourceURI;
		if(sourceURI != null){
			putQueryParameter("SourceURI", sourceURI);
		}
	}

	public List<String> getScenes() {
		return this.scenes;
	}

	public void setScenes(List<String> scenes) {
		this.scenes = scenes;	
		if (scenes != null) {
			putQueryParameter("Scenes" , new Gson().toJson(scenes));
		}	
	}

	public Long getInterval() {
		return this.interval;
	}

	public void setInterval(Long interval) {
		this.interval = interval;
		if(interval != null){
			putQueryParameter("Interval", interval.toString());
		}
	}

	public static class Notification {

		@SerializedName("MNS")
		private MNS mNS;

		@SerializedName("RocketMQ")
		private RocketMQ rocketMQ;

		public MNS getMNS() {
			return this.mNS;
		}

		public void setMNS(MNS mNS) {
			this.mNS = mNS;
		}

		public RocketMQ getRocketMQ() {
			return this.rocketMQ;
		}

		public void setRocketMQ(RocketMQ rocketMQ) {
			this.rocketMQ = rocketMQ;
		}

		public static class MNS {

			@SerializedName("Endpoint")
			private String endpoint;

			@SerializedName("TopicName")
			private String topicName;

			public String getEndpoint() {
				return this.endpoint;
			}

			public void setEndpoint(String endpoint) {
				this.endpoint = endpoint;
			}

			public String getTopicName() {
				return this.topicName;
			}

			public void setTopicName(String topicName) {
				this.topicName = topicName;
			}
		}

		public static class RocketMQ {

			@SerializedName("Endpoint")
			private String endpoint;

			@SerializedName("InstanceId")
			private String instanceId;

			@SerializedName("TopicName")
			private String topicName;

			public String getEndpoint() {
				return this.endpoint;
			}

			public void setEndpoint(String endpoint) {
				this.endpoint = endpoint;
			}

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public String getTopicName() {
				return this.topicName;
			}

			public void setTopicName(String topicName) {
				this.topicName = topicName;
			}
		}
	}

	public static class CredentialConfig {

		@SerializedName("Chain")
		private List<ChainItem> chain;

		@SerializedName("ServiceRole")
		private String serviceRole;

		@SerializedName("Policy")
		private String policy;

		public List<ChainItem> getChain() {
			return this.chain;
		}

		public void setChain(List<ChainItem> chain) {
			this.chain = chain;
		}

		public String getServiceRole() {
			return this.serviceRole;
		}

		public void setServiceRole(String serviceRole) {
			this.serviceRole = serviceRole;
		}

		public String getPolicy() {
			return this.policy;
		}

		public void setPolicy(String policy) {
			this.policy = policy;
		}

		public static class ChainItem {

			@SerializedName("Role")
			private String role;

			@SerializedName("RoleType")
			private String roleType;

			@SerializedName("AssumeRoleFor")
			private String assumeRoleFor;

			public String getRole() {
				return this.role;
			}

			public void setRole(String role) {
				this.role = role;
			}

			public String getRoleType() {
				return this.roleType;
			}

			public void setRoleType(String roleType) {
				this.roleType = roleType;
			}

			public String getAssumeRoleFor() {
				return this.assumeRoleFor;
			}

			public void setAssumeRoleFor(String assumeRoleFor) {
				this.assumeRoleFor = assumeRoleFor;
			}
		}
	}

	@Override
	public Class<CreateImageModerationTaskResponse> getResponseClass() {
		return CreateImageModerationTaskResponse.class;
	}

}
