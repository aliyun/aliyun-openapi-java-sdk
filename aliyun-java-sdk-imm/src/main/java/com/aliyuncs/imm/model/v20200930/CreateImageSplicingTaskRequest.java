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
public class CreateImageSplicingTaskRequest extends RpcAcsRequest<CreateImageSplicingTaskResponse> {
	   

	private Long padding;

	private String projectName;

	private Long margin;

	private String notifyTopicName;

	@SerializedName("sources")
	private List<Sources> sources;

	@SerializedName("credentialConfig")
	private CredentialConfig credentialConfig;

	private Long align;

	private Long quality;

	private String backgroundColor;

	@SerializedName("tags")
	private Map<String,String> tags;

	private String userData;

	private String notifyEndpoint;

	private String targetURI;

	private String scaleType;

	private String imageFormat;

	private String direction;
	public CreateImageSplicingTaskRequest() {
		super("imm", "2020-09-30", "CreateImageSplicingTask", "imm");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getPadding() {
		return this.padding;
	}

	public void setPadding(Long padding) {
		this.padding = padding;
		if(padding != null){
			putQueryParameter("Padding", padding.toString());
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

	public Long getMargin() {
		return this.margin;
	}

	public void setMargin(Long margin) {
		this.margin = margin;
		if(margin != null){
			putQueryParameter("Margin", margin.toString());
		}
	}

	public String getNotifyTopicName() {
		return this.notifyTopicName;
	}

	public void setNotifyTopicName(String notifyTopicName) {
		this.notifyTopicName = notifyTopicName;
		if(notifyTopicName != null){
			putQueryParameter("NotifyTopicName", notifyTopicName);
		}
	}

	public List<Sources> getSources() {
		return this.sources;
	}

	public void setSources(List<Sources> sources) {
		this.sources = sources;	
		if (sources != null) {
			putQueryParameter("Sources" , new Gson().toJson(sources));
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

	public Long getAlign() {
		return this.align;
	}

	public void setAlign(Long align) {
		this.align = align;
		if(align != null){
			putQueryParameter("Align", align.toString());
		}
	}

	public Long getQuality() {
		return this.quality;
	}

	public void setQuality(Long quality) {
		this.quality = quality;
		if(quality != null){
			putQueryParameter("Quality", quality.toString());
		}
	}

	public String getBackgroundColor() {
		return this.backgroundColor;
	}

	public void setBackgroundColor(String backgroundColor) {
		this.backgroundColor = backgroundColor;
		if(backgroundColor != null){
			putQueryParameter("BackgroundColor", backgroundColor);
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

	public String getUserData() {
		return this.userData;
	}

	public void setUserData(String userData) {
		this.userData = userData;
		if(userData != null){
			putQueryParameter("UserData", userData);
		}
	}

	public String getNotifyEndpoint() {
		return this.notifyEndpoint;
	}

	public void setNotifyEndpoint(String notifyEndpoint) {
		this.notifyEndpoint = notifyEndpoint;
		if(notifyEndpoint != null){
			putQueryParameter("NotifyEndpoint", notifyEndpoint);
		}
	}

	public String getTargetURI() {
		return this.targetURI;
	}

	public void setTargetURI(String targetURI) {
		this.targetURI = targetURI;
		if(targetURI != null){
			putQueryParameter("TargetURI", targetURI);
		}
	}

	public String getScaleType() {
		return this.scaleType;
	}

	public void setScaleType(String scaleType) {
		this.scaleType = scaleType;
		if(scaleType != null){
			putQueryParameter("ScaleType", scaleType);
		}
	}

	public String getImageFormat() {
		return this.imageFormat;
	}

	public void setImageFormat(String imageFormat) {
		this.imageFormat = imageFormat;
		if(imageFormat != null){
			putQueryParameter("ImageFormat", imageFormat);
		}
	}

	public String getDirection() {
		return this.direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
		if(direction != null){
			putQueryParameter("Direction", direction);
		}
	}

	public static class Sources {

		@SerializedName("Rotate")
		private Long rotate;

		@SerializedName("URI")
		private String uRI;

		public Long getRotate() {
			return this.rotate;
		}

		public void setRotate(Long rotate) {
			this.rotate = rotate;
		}

		public String getURI() {
			return this.uRI;
		}

		public void setURI(String uRI) {
			this.uRI = uRI;
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
	public Class<CreateImageSplicingTaskResponse> getResponseClass() {
		return CreateImageSplicingTaskResponse.class;
	}

}
