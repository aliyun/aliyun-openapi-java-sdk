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

package com.aliyuncs.dbfs.model.v20200418;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dbfs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateDbfsRequest extends RpcAcsRequest<CreateDbfsResponse> {
	   

	private Integer sizeG;

	private String snapshotId;

	private String clientToken;

	private String usedScene;

	private String fsName;

	private Integer raidStripeUnitNumber;

	private Boolean encryption;

	private String performanceLevel;

	private Boolean enableRaid;

	private Boolean deleteSnapshot;

	private String zoneId;

	private String category;

	private String kMSKeyId;
	public CreateDbfsRequest() {
		super("DBFS", "2020-04-18", "CreateDbfs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getSizeG() {
		return this.sizeG;
	}

	public void setSizeG(Integer sizeG) {
		this.sizeG = sizeG;
		if(sizeG != null){
			putQueryParameter("SizeG", sizeG.toString());
		}
	}

	public String getSnapshotId() {
		return this.snapshotId;
	}

	public void setSnapshotId(String snapshotId) {
		this.snapshotId = snapshotId;
		if(snapshotId != null){
			putQueryParameter("SnapshotId", snapshotId);
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

	public String getUsedScene() {
		return this.usedScene;
	}

	public void setUsedScene(String usedScene) {
		this.usedScene = usedScene;
		if(usedScene != null){
			putQueryParameter("UsedScene", usedScene);
		}
	}

	public String getFsName() {
		return this.fsName;
	}

	public void setFsName(String fsName) {
		this.fsName = fsName;
		if(fsName != null){
			putQueryParameter("FsName", fsName);
		}
	}

	public Integer getRaidStripeUnitNumber() {
		return this.raidStripeUnitNumber;
	}

	public void setRaidStripeUnitNumber(Integer raidStripeUnitNumber) {
		this.raidStripeUnitNumber = raidStripeUnitNumber;
		if(raidStripeUnitNumber != null){
			putQueryParameter("RaidStripeUnitNumber", raidStripeUnitNumber.toString());
		}
	}

	public Boolean getEncryption() {
		return this.encryption;
	}

	public void setEncryption(Boolean encryption) {
		this.encryption = encryption;
		if(encryption != null){
			putQueryParameter("Encryption", encryption.toString());
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

	public Boolean getEnableRaid() {
		return this.enableRaid;
	}

	public void setEnableRaid(Boolean enableRaid) {
		this.enableRaid = enableRaid;
		if(enableRaid != null){
			putQueryParameter("EnableRaid", enableRaid.toString());
		}
	}

	public Boolean getDeleteSnapshot() {
		return this.deleteSnapshot;
	}

	public void setDeleteSnapshot(Boolean deleteSnapshot) {
		this.deleteSnapshot = deleteSnapshot;
		if(deleteSnapshot != null){
			putQueryParameter("DeleteSnapshot", deleteSnapshot.toString());
		}
	}

	public String getZoneId() {
		return this.zoneId;
	}

	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
		if(zoneId != null){
			putQueryParameter("ZoneId", zoneId);
		}
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
		if(category != null){
			putQueryParameter("Category", category);
		}
	}

	public String getKMSKeyId() {
		return this.kMSKeyId;
	}

	public void setKMSKeyId(String kMSKeyId) {
		this.kMSKeyId = kMSKeyId;
		if(kMSKeyId != null){
			putQueryParameter("KMSKeyId", kMSKeyId);
		}
	}

	@Override
	public Class<CreateDbfsResponse> getResponseClass() {
		return CreateDbfsResponse.class;
	}

}
