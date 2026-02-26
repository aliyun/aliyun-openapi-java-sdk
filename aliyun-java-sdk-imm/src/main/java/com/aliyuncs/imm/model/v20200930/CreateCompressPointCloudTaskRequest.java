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
public class CreateCompressPointCloudTaskRequest extends RpcAcsRequest<CreateCompressPointCloudTaskResponse> {
	   

	@SerializedName("notification")
	private Notification notification;

	private String compressMethod;

	private String projectName;

	@SerializedName("tags")
	private Map<String,String> tags;

	@SerializedName("pointCloudFields")
	private List<String> pointCloudFields;

	private String sourceURI;

	private String pointCloudFileFormat;

	@SerializedName("octreeOption")
	private OctreeOption octreeOption;

	private String userData;

	private String targetURI;

	@SerializedName("kdtreeOption")
	private KdtreeOption kdtreeOption;

	@SerializedName("credentialConfig")
	private CredentialConfig credentialConfig;
	public CreateCompressPointCloudTaskRequest() {
		super("imm", "2020-09-30", "CreateCompressPointCloudTask", "imm");
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
			putQueryParameter("Notification" , new Gson().toJson(notification));
		}	
	}

	public String getCompressMethod() {
		return this.compressMethod;
	}

	public void setCompressMethod(String compressMethod) {
		this.compressMethod = compressMethod;
		if(compressMethod != null){
			putQueryParameter("CompressMethod", compressMethod);
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

	public Map<String,String> getTags() {
		return this.tags;
	}

	public void setTags(Map<String,String> tags) {
		this.tags = tags;	
		if (tags != null) {
			putQueryParameter("Tags" , new Gson().toJson(tags));
		}	
	}

	public List<String> getPointCloudFields() {
		return this.pointCloudFields;
	}

	public void setPointCloudFields(List<String> pointCloudFields) {
		this.pointCloudFields = pointCloudFields;	
		if (pointCloudFields != null) {
			putQueryParameter("PointCloudFields" , new Gson().toJson(pointCloudFields));
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

	public String getPointCloudFileFormat() {
		return this.pointCloudFileFormat;
	}

	public void setPointCloudFileFormat(String pointCloudFileFormat) {
		this.pointCloudFileFormat = pointCloudFileFormat;
		if(pointCloudFileFormat != null){
			putQueryParameter("PointCloudFileFormat", pointCloudFileFormat);
		}
	}

	public OctreeOption getOctreeOption() {
		return this.octreeOption;
	}

	public void setOctreeOption(OctreeOption octreeOption) {
		this.octreeOption = octreeOption;	
		if (octreeOption != null) {
			putQueryParameter("OctreeOption" , new Gson().toJson(octreeOption));
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

	public String getTargetURI() {
		return this.targetURI;
	}

	public void setTargetURI(String targetURI) {
		this.targetURI = targetURI;
		if(targetURI != null){
			putQueryParameter("TargetURI", targetURI);
		}
	}

	public KdtreeOption getKdtreeOption() {
		return this.kdtreeOption;
	}

	public void setKdtreeOption(KdtreeOption kdtreeOption) {
		this.kdtreeOption = kdtreeOption;	
		if (kdtreeOption != null) {
			putQueryParameter("KdtreeOption" , new Gson().toJson(kdtreeOption));
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

	public static class OctreeOption {

		@SerializedName("PointResolution")
		private Double pointResolution;

		@SerializedName("LibraryName")
		private String libraryName;

		@SerializedName("DoVoxelGridDownDownSampling")
		private Boolean doVoxelGridDownDownSampling;

		@SerializedName("OctreeResolution")
		private Double octreeResolution;

		public Double getPointResolution() {
			return this.pointResolution;
		}

		public void setPointResolution(Double pointResolution) {
			this.pointResolution = pointResolution;
		}

		public String getLibraryName() {
			return this.libraryName;
		}

		public void setLibraryName(String libraryName) {
			this.libraryName = libraryName;
		}

		public Boolean getDoVoxelGridDownDownSampling() {
			return this.doVoxelGridDownDownSampling;
		}

		public void setDoVoxelGridDownDownSampling(Boolean doVoxelGridDownDownSampling) {
			this.doVoxelGridDownDownSampling = doVoxelGridDownDownSampling;
		}

		public Double getOctreeResolution() {
			return this.octreeResolution;
		}

		public void setOctreeResolution(Double octreeResolution) {
			this.octreeResolution = octreeResolution;
		}
	}

	public static class KdtreeOption {

		@SerializedName("QuantizationBits")
		private Integer quantizationBits;

		@SerializedName("LibraryName")
		private String libraryName;

		@SerializedName("CompressionLevel")
		private Integer compressionLevel;

		public Integer getQuantizationBits() {
			return this.quantizationBits;
		}

		public void setQuantizationBits(Integer quantizationBits) {
			this.quantizationBits = quantizationBits;
		}

		public String getLibraryName() {
			return this.libraryName;
		}

		public void setLibraryName(String libraryName) {
			this.libraryName = libraryName;
		}

		public Integer getCompressionLevel() {
			return this.compressionLevel;
		}

		public void setCompressionLevel(Integer compressionLevel) {
			this.compressionLevel = compressionLevel;
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
	public Class<CreateCompressPointCloudTaskResponse> getResponseClass() {
		return CreateCompressPointCloudTaskResponse.class;
	}

}
