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
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.imm.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class AddImageMosaicRequest extends RpcAcsRequest<AddImageMosaicResponse> {
	   

	@SerializedName("targets")
	private List<Targets> targets;

	private String targetURI;

	private String imageFormat;

	private String projectName;

	@SerializedName("credentialConfig")
	private CredentialConfig credentialConfig;

	private Integer quality;

	private String sourceURI;
	public AddImageMosaicRequest() {
		super("imm", "2020-09-30", "AddImageMosaic", "imm");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<Targets> getTargets() {
		return this.targets;
	}

	public void setTargets(List<Targets> targets) {
		this.targets = targets;	
		if (targets != null) {
			putQueryParameter("Targets" , new Gson().toJson(targets));
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

	public String getImageFormat() {
		return this.imageFormat;
	}

	public void setImageFormat(String imageFormat) {
		this.imageFormat = imageFormat;
		if(imageFormat != null){
			putQueryParameter("ImageFormat", imageFormat);
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

	public CredentialConfig getCredentialConfig() {
		return this.credentialConfig;
	}

	public void setCredentialConfig(CredentialConfig credentialConfig) {
		this.credentialConfig = credentialConfig;	
		if (credentialConfig != null) {
			putQueryParameter("CredentialConfig" , new Gson().toJson(credentialConfig));
		}	
	}

	public Integer getQuality() {
		return this.quality;
	}

	public void setQuality(Integer quality) {
		this.quality = quality;
		if(quality != null){
			putQueryParameter("Quality", quality.toString());
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

	public static class Targets {

		@SerializedName("Boundary")
		private Boundary boundary;

		@SerializedName("Sigma")
		private Integer sigma;

		@SerializedName("BlurRadius")
		private Integer blurRadius;

		@SerializedName("Color")
		private String color;

		@SerializedName("MosaicRadius")
		private Integer mosaicRadius;

		@SerializedName("Type")
		private String type;

		public Boundary getBoundary() {
			return this.boundary;
		}

		public void setBoundary(Boundary boundary) {
			this.boundary = boundary;
		}

		public Integer getSigma() {
			return this.sigma;
		}

		public void setSigma(Integer sigma) {
			this.sigma = sigma;
		}

		public Integer getBlurRadius() {
			return this.blurRadius;
		}

		public void setBlurRadius(Integer blurRadius) {
			this.blurRadius = blurRadius;
		}

		public String getColor() {
			return this.color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		public Integer getMosaicRadius() {
			return this.mosaicRadius;
		}

		public void setMosaicRadius(Integer mosaicRadius) {
			this.mosaicRadius = mosaicRadius;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public static class Boundary {

			@SerializedName("X")
			private Float x;

			@SerializedName("Width")
			private Float width;

			@SerializedName("Y")
			private Float y;

			@SerializedName("ReferPos")
			private String referPos;

			@SerializedName("Height")
			private Float height;

			public Float getX() {
				return this.x;
			}

			public void setX(Float x) {
				this.x = x;
			}

			public Float getWidth() {
				return this.width;
			}

			public void setWidth(Float width) {
				this.width = width;
			}

			public Float getY() {
				return this.y;
			}

			public void setY(Float y) {
				this.y = y;
			}

			public String getReferPos() {
				return this.referPos;
			}

			public void setReferPos(String referPos) {
				this.referPos = referPos;
			}

			public Float getHeight() {
				return this.height;
			}

			public void setHeight(Float height) {
				this.height = height;
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
	public Class<AddImageMosaicResponse> getResponseClass() {
		return AddImageMosaicResponse.class;
	}

}
