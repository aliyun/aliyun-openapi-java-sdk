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

package com.aliyuncs.ecsinc.model.v20160314;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class CopyImageAtTargetRequest extends RpcAcsRequest<CopyImageAtTargetResponse> {
	
	public CopyImageAtTargetRequest() {
		super("EcsInc", "2016-03-14", "CopyImageAtTarget", "ecs", "innerAPI");
	}

	private Boolean toEncrypted;

	private Long resourceOwnerId;

	private String fromSnapshotListBase64;

	private String imageId;

	private String resourceOwnerAccount;

	private String imageSnapshotMappingsBase64;

	private String destinationImageName;

	private String resourceMetaMappingsBase64;

	private String ownerAccount;

	private String destinationRegionId;

	private String arnsBase64;

	private Long ownerId;

	private String fromRegionId;

	private String fromRegionName;

	private String fromImageBase64;

	private Long destinationRegionPriId;

	private String kmsKeyId;

	private String destinationDescription;

	public Boolean getToEncrypted() {
		return this.toEncrypted;
	}

	public void setToEncrypted(Boolean toEncrypted) {
		this.toEncrypted = toEncrypted;
		if(toEncrypted != null){
			putQueryParameter("ToEncrypted", toEncrypted.toString());
		}
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

	public String getFromSnapshotListBase64() {
		return this.fromSnapshotListBase64;
	}

	public void setFromSnapshotListBase64(String fromSnapshotListBase64) {
		this.fromSnapshotListBase64 = fromSnapshotListBase64;
		if(fromSnapshotListBase64 != null){
			putQueryParameter("FromSnapshotListBase64", fromSnapshotListBase64);
		}
	}

	public String getImageId() {
		return this.imageId;
	}

	public void setImageId(String imageId) {
		this.imageId = imageId;
		if(imageId != null){
			putQueryParameter("ImageId", imageId);
		}
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public String getImageSnapshotMappingsBase64() {
		return this.imageSnapshotMappingsBase64;
	}

	public void setImageSnapshotMappingsBase64(String imageSnapshotMappingsBase64) {
		this.imageSnapshotMappingsBase64 = imageSnapshotMappingsBase64;
		if(imageSnapshotMappingsBase64 != null){
			putQueryParameter("ImageSnapshotMappingsBase64", imageSnapshotMappingsBase64);
		}
	}

	public String getDestinationImageName() {
		return this.destinationImageName;
	}

	public void setDestinationImageName(String destinationImageName) {
		this.destinationImageName = destinationImageName;
		if(destinationImageName != null){
			putQueryParameter("DestinationImageName", destinationImageName);
		}
	}

	public String getResourceMetaMappingsBase64() {
		return this.resourceMetaMappingsBase64;
	}

	public void setResourceMetaMappingsBase64(String resourceMetaMappingsBase64) {
		this.resourceMetaMappingsBase64 = resourceMetaMappingsBase64;
		if(resourceMetaMappingsBase64 != null){
			putQueryParameter("ResourceMetaMappingsBase64", resourceMetaMappingsBase64);
		}
	}

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		if(ownerAccount != null){
			putQueryParameter("OwnerAccount", ownerAccount);
		}
	}

	public String getDestinationRegionId() {
		return this.destinationRegionId;
	}

	public void setDestinationRegionId(String destinationRegionId) {
		this.destinationRegionId = destinationRegionId;
		if(destinationRegionId != null){
			putQueryParameter("DestinationRegionId", destinationRegionId);
		}
	}

	public String getArnsBase64() {
		return this.arnsBase64;
	}

	public void setArnsBase64(String arnsBase64) {
		this.arnsBase64 = arnsBase64;
		if(arnsBase64 != null){
			putQueryParameter("ArnsBase64", arnsBase64);
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

	public String getFromRegionId() {
		return this.fromRegionId;
	}

	public void setFromRegionId(String fromRegionId) {
		this.fromRegionId = fromRegionId;
		if(fromRegionId != null){
			putQueryParameter("FromRegionId", fromRegionId);
		}
	}

	public String getFromRegionName() {
		return this.fromRegionName;
	}

	public void setFromRegionName(String fromRegionName) {
		this.fromRegionName = fromRegionName;
		if(fromRegionName != null){
			putQueryParameter("FromRegionName", fromRegionName);
		}
	}

	public String getFromImageBase64() {
		return this.fromImageBase64;
	}

	public void setFromImageBase64(String fromImageBase64) {
		this.fromImageBase64 = fromImageBase64;
		if(fromImageBase64 != null){
			putQueryParameter("FromImageBase64", fromImageBase64);
		}
	}

	public Long getDestinationRegionPriId() {
		return this.destinationRegionPriId;
	}

	public void setDestinationRegionPriId(Long destinationRegionPriId) {
		this.destinationRegionPriId = destinationRegionPriId;
		if(destinationRegionPriId != null){
			putQueryParameter("DestinationRegionPriId", destinationRegionPriId.toString());
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

	public String getDestinationDescription() {
		return this.destinationDescription;
	}

	public void setDestinationDescription(String destinationDescription) {
		this.destinationDescription = destinationDescription;
		if(destinationDescription != null){
			putQueryParameter("DestinationDescription", destinationDescription);
		}
	}

	@Override
	public Class<CopyImageAtTargetResponse> getResponseClass() {
		return CopyImageAtTargetResponse.class;
	}

}
