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

package com.aliyuncs.ecs.model.v20140526;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CloneDisksRequest extends RpcAcsRequest<CloneDisksResponse> {
	   

	private Long resourceOwnerId;

	private String clientToken;

	private String diskName;

	private String resourceGroupId;

	private String diskCategory;

	private String multiAttach;

	private List<Tag> tags;

	private List<Arn> arns;

	private String sourceDiskId;

	private String dryRun;

	private String performanceLevel;

	private Long ownerId;

	private Boolean burstingEnabled;

	private Long provisionedIops;

	private Integer size;

	private Boolean encrypted;

	private String kmsKeyId;
	public CloneDisksRequest() {
		super("Ecs", "2014-05-26", "CloneDisks", "ecs");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public String getDiskName() {
		return this.diskName;
	}

	public void setDiskName(String diskName) {
		this.diskName = diskName;
		if(diskName != null){
			putQueryParameter("DiskName", diskName);
		}
	}

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
		if(resourceGroupId != null){
			putQueryParameter("ResourceGroupId", resourceGroupId);
		}
	}

	public String getDiskCategory() {
		return this.diskCategory;
	}

	public void setDiskCategory(String diskCategory) {
		this.diskCategory = diskCategory;
		if(diskCategory != null){
			putQueryParameter("DiskCategory", diskCategory);
		}
	}

	public String getMultiAttach() {
		return this.multiAttach;
	}

	public void setMultiAttach(String multiAttach) {
		this.multiAttach = multiAttach;
		if(multiAttach != null){
			putQueryParameter("MultiAttach", multiAttach);
		}
	}

	public List<Tag> getTags() {
		return this.tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;	
		if (tags != null) {
			for (int depth1 = 0; depth1 < tags.size(); depth1++) {
				putQueryParameter("Tag." + (depth1 + 1) + ".Value" , tags.get(depth1).getValue());
				putQueryParameter("Tag." + (depth1 + 1) + ".Key" , tags.get(depth1).getKey());
			}
		}	
	}

	public List<Arn> getArns() {
		return this.arns;
	}

	public void setArns(List<Arn> arns) {
		this.arns = arns;	
		if (arns != null) {
			for (int depth1 = 0; depth1 < arns.size(); depth1++) {
				putQueryParameter("Arn." + (depth1 + 1) + ".Rolearn" , arns.get(depth1).getRolearn());
				putQueryParameter("Arn." + (depth1 + 1) + ".RoleType" , arns.get(depth1).getRoleType());
				putQueryParameter("Arn." + (depth1 + 1) + ".AssumeRoleFor" , arns.get(depth1).getAssumeRoleFor());
			}
		}	
	}

	public String getSourceDiskId() {
		return this.sourceDiskId;
	}

	public void setSourceDiskId(String sourceDiskId) {
		this.sourceDiskId = sourceDiskId;
		if(sourceDiskId != null){
			putQueryParameter("SourceDiskId", sourceDiskId);
		}
	}

	public String getDryRun() {
		return this.dryRun;
	}

	public void setDryRun(String dryRun) {
		this.dryRun = dryRun;
		if(dryRun != null){
			putQueryParameter("DryRun", dryRun);
		}
	}

	public String getPerformanceLevel() {
		return this.performanceLevel;
	}

	public void setPerformanceLevel(String performanceLevel) {
		this.performanceLevel = performanceLevel;
		if(performanceLevel != null){
			putQueryParameter("PerformanceLevel", performanceLevel);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public Boolean getBurstingEnabled() {
		return this.burstingEnabled;
	}

	public void setBurstingEnabled(Boolean burstingEnabled) {
		this.burstingEnabled = burstingEnabled;
		if(burstingEnabled != null){
			putQueryParameter("BurstingEnabled", burstingEnabled.toString());
		}
	}

	public Long getProvisionedIops() {
		return this.provisionedIops;
	}

	public void setProvisionedIops(Long provisionedIops) {
		this.provisionedIops = provisionedIops;
		if(provisionedIops != null){
			putQueryParameter("ProvisionedIops", provisionedIops.toString());
		}
	}

	public Integer getSize() {
		return this.size;
	}

	public void setSize(Integer size) {
		this.size = size;
		if(size != null){
			putQueryParameter("Size", size.toString());
		}
	}

	public Boolean getEncrypted() {
		return this.encrypted;
	}

	public void setEncrypted(Boolean encrypted) {
		this.encrypted = encrypted;
		if(encrypted != null){
			putQueryParameter("Encrypted", encrypted.toString());
		}
	}

	public String getKmsKeyId() {
		return this.kmsKeyId;
	}

	public void setKmsKeyId(String kmsKeyId) {
		this.kmsKeyId = kmsKeyId;
		if(kmsKeyId != null){
			putQueryParameter("KmsKeyId", kmsKeyId);
		}
	}

	public static class Tag {

		private String value;

		private String key;

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}
	}

	public static class Arn {

		private String rolearn;

		private String roleType;

		private String assumeRoleFor;

		public String getRolearn() {
			return this.rolearn;
		}

		public void setRolearn(String rolearn) {
			this.rolearn = rolearn;
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

	@Override
	public Class<CloneDisksResponse> getResponseClass() {
		return CloneDisksResponse.class;
	}

}
