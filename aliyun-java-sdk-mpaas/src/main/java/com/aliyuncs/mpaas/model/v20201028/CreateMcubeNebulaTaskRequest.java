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

package com.aliyuncs.mpaas.model.v20201028;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.mpaas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateMcubeNebulaTaskRequest extends RpcAcsRequest<CreateMcubeNebulaTaskResponse> {
	   

	private String greyEndtime;

	private Long serialVersionUID;

	private String productId;

	private String upgradeProgress;

	private String modifier;

	private Long packageId;

	private String taskName;

	private String memo;

	private String gmtModified;

	private String releaseVersion;

	private String syncResult;

	private Long upgradeNoticeNum;

	private Long id;

	private Integer taskType;

	private Integer publishType;

	private Integer greyNum;

	private String appCode;

	private Integer status;

	private String workspaceId;

	private String gmtModifiedStr;

	private String greyUrl;

	private String productVersion;

	private Integer percent;

	private String platform;

	private String greyConfigInfo;

	private Integer taskStatus;

	private String resIds;

	private String tenantId;

	private Integer publishMode;

	private String whitelistIds;

	private String greyEndtimeStr;

	private String creator;

	private String syncMode;

	private String gmtCreate;

	private String bizType;

	private Long taskVersion;

	private String appId;

	private String greyEndtimeData;
	public CreateMcubeNebulaTaskRequest() {
		super("mPaaS", "2020-10-28", "CreateMcubeNebulaTask");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getGreyEndtime() {
		return this.greyEndtime;
	}

	public void setGreyEndtime(String greyEndtime) {
		this.greyEndtime = greyEndtime;
		if(greyEndtime != null){
			putBodyParameter("GreyEndtime", greyEndtime);
		}
	}

	public Long getSerialVersionUID() {
		return this.serialVersionUID;
	}

	public void setSerialVersionUID(Long serialVersionUID) {
		this.serialVersionUID = serialVersionUID;
		if(serialVersionUID != null){
			putBodyParameter("SerialVersionUID", serialVersionUID.toString());
		}
	}

	public String getProductId() {
		return this.productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
		if(productId != null){
			putBodyParameter("ProductId", productId);
		}
	}

	public String getUpgradeProgress() {
		return this.upgradeProgress;
	}

	public void setUpgradeProgress(String upgradeProgress) {
		this.upgradeProgress = upgradeProgress;
		if(upgradeProgress != null){
			putBodyParameter("UpgradeProgress", upgradeProgress);
		}
	}

	public String getModifier() {
		return this.modifier;
	}

	public void setModifier(String modifier) {
		this.modifier = modifier;
		if(modifier != null){
			putBodyParameter("Modifier", modifier);
		}
	}

	public Long getPackageId() {
		return this.packageId;
	}

	public void setPackageId(Long packageId) {
		this.packageId = packageId;
		if(packageId != null){
			putBodyParameter("PackageId", packageId.toString());
		}
	}

	public String getTaskName() {
		return this.taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
		if(taskName != null){
			putBodyParameter("TaskName", taskName);
		}
	}

	public String getMemo() {
		return this.memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
		if(memo != null){
			putBodyParameter("Memo", memo);
		}
	}

	public String getGmtModified() {
		return this.gmtModified;
	}

	public void setGmtModified(String gmtModified) {
		this.gmtModified = gmtModified;
		if(gmtModified != null){
			putBodyParameter("GmtModified", gmtModified);
		}
	}

	public String getReleaseVersion() {
		return this.releaseVersion;
	}

	public void setReleaseVersion(String releaseVersion) {
		this.releaseVersion = releaseVersion;
		if(releaseVersion != null){
			putBodyParameter("ReleaseVersion", releaseVersion);
		}
	}

	public String getSyncResult() {
		return this.syncResult;
	}

	public void setSyncResult(String syncResult) {
		this.syncResult = syncResult;
		if(syncResult != null){
			putBodyParameter("SyncResult", syncResult);
		}
	}

	public Long getUpgradeNoticeNum() {
		return this.upgradeNoticeNum;
	}

	public void setUpgradeNoticeNum(Long upgradeNoticeNum) {
		this.upgradeNoticeNum = upgradeNoticeNum;
		if(upgradeNoticeNum != null){
			putBodyParameter("UpgradeNoticeNum", upgradeNoticeNum.toString());
		}
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
		if(id != null){
			putBodyParameter("Id", id.toString());
		}
	}

	public Integer getTaskType() {
		return this.taskType;
	}

	public void setTaskType(Integer taskType) {
		this.taskType = taskType;
		if(taskType != null){
			putBodyParameter("TaskType", taskType.toString());
		}
	}

	public Integer getPublishType() {
		return this.publishType;
	}

	public void setPublishType(Integer publishType) {
		this.publishType = publishType;
		if(publishType != null){
			putBodyParameter("PublishType", publishType.toString());
		}
	}

	public Integer getGreyNum() {
		return this.greyNum;
	}

	public void setGreyNum(Integer greyNum) {
		this.greyNum = greyNum;
		if(greyNum != null){
			putBodyParameter("GreyNum", greyNum.toString());
		}
	}

	public String getAppCode() {
		return this.appCode;
	}

	public void setAppCode(String appCode) {
		this.appCode = appCode;
		if(appCode != null){
			putBodyParameter("AppCode", appCode);
		}
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
		if(status != null){
			putBodyParameter("Status", status.toString());
		}
	}

	public String getWorkspaceId() {
		return this.workspaceId;
	}

	public void setWorkspaceId(String workspaceId) {
		this.workspaceId = workspaceId;
		if(workspaceId != null){
			putBodyParameter("WorkspaceId", workspaceId);
		}
	}

	public String getGmtModifiedStr() {
		return this.gmtModifiedStr;
	}

	public void setGmtModifiedStr(String gmtModifiedStr) {
		this.gmtModifiedStr = gmtModifiedStr;
		if(gmtModifiedStr != null){
			putBodyParameter("GmtModifiedStr", gmtModifiedStr);
		}
	}

	public String getGreyUrl() {
		return this.greyUrl;
	}

	public void setGreyUrl(String greyUrl) {
		this.greyUrl = greyUrl;
		if(greyUrl != null){
			putBodyParameter("GreyUrl", greyUrl);
		}
	}

	public String getProductVersion() {
		return this.productVersion;
	}

	public void setProductVersion(String productVersion) {
		this.productVersion = productVersion;
		if(productVersion != null){
			putBodyParameter("ProductVersion", productVersion);
		}
	}

	public Integer getPercent() {
		return this.percent;
	}

	public void setPercent(Integer percent) {
		this.percent = percent;
		if(percent != null){
			putBodyParameter("Percent", percent.toString());
		}
	}

	public String getPlatform() {
		return this.platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
		if(platform != null){
			putBodyParameter("Platform", platform);
		}
	}

	public String getGreyConfigInfo() {
		return this.greyConfigInfo;
	}

	public void setGreyConfigInfo(String greyConfigInfo) {
		this.greyConfigInfo = greyConfigInfo;
		if(greyConfigInfo != null){
			putBodyParameter("GreyConfigInfo", greyConfigInfo);
		}
	}

	public Integer getTaskStatus() {
		return this.taskStatus;
	}

	public void setTaskStatus(Integer taskStatus) {
		this.taskStatus = taskStatus;
		if(taskStatus != null){
			putBodyParameter("TaskStatus", taskStatus.toString());
		}
	}

	public String getResIds() {
		return this.resIds;
	}

	public void setResIds(String resIds) {
		this.resIds = resIds;
		if(resIds != null){
			putBodyParameter("ResIds", resIds);
		}
	}

	public String getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
		if(tenantId != null){
			putBodyParameter("TenantId", tenantId);
		}
	}

	public Integer getPublishMode() {
		return this.publishMode;
	}

	public void setPublishMode(Integer publishMode) {
		this.publishMode = publishMode;
		if(publishMode != null){
			putBodyParameter("PublishMode", publishMode.toString());
		}
	}

	public String getWhitelistIds() {
		return this.whitelistIds;
	}

	public void setWhitelistIds(String whitelistIds) {
		this.whitelistIds = whitelistIds;
		if(whitelistIds != null){
			putBodyParameter("WhitelistIds", whitelistIds);
		}
	}

	public String getGreyEndtimeStr() {
		return this.greyEndtimeStr;
	}

	public void setGreyEndtimeStr(String greyEndtimeStr) {
		this.greyEndtimeStr = greyEndtimeStr;
		if(greyEndtimeStr != null){
			putBodyParameter("GreyEndtimeStr", greyEndtimeStr);
		}
	}

	public String getCreator() {
		return this.creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
		if(creator != null){
			putBodyParameter("Creator", creator);
		}
	}

	public String getSyncMode() {
		return this.syncMode;
	}

	public void setSyncMode(String syncMode) {
		this.syncMode = syncMode;
		if(syncMode != null){
			putBodyParameter("SyncMode", syncMode);
		}
	}

	public String getGmtCreate() {
		return this.gmtCreate;
	}

	public void setGmtCreate(String gmtCreate) {
		this.gmtCreate = gmtCreate;
		if(gmtCreate != null){
			putBodyParameter("GmtCreate", gmtCreate);
		}
	}

	public String getBizType() {
		return this.bizType;
	}

	public void setBizType(String bizType) {
		this.bizType = bizType;
		if(bizType != null){
			putBodyParameter("BizType", bizType);
		}
	}

	public Long getTaskVersion() {
		return this.taskVersion;
	}

	public void setTaskVersion(Long taskVersion) {
		this.taskVersion = taskVersion;
		if(taskVersion != null){
			putBodyParameter("TaskVersion", taskVersion.toString());
		}
	}

	public String getAppId() {
		return this.appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
		if(appId != null){
			putBodyParameter("AppId", appId);
		}
	}

	public String getGreyEndtimeData() {
		return this.greyEndtimeData;
	}

	public void setGreyEndtimeData(String greyEndtimeData) {
		this.greyEndtimeData = greyEndtimeData;
		if(greyEndtimeData != null){
			putBodyParameter("GreyEndtimeData", greyEndtimeData);
		}
	}

	@Override
	public Class<CreateMcubeNebulaTaskResponse> getResponseClass() {
		return CreateMcubeNebulaTaskResponse.class;
	}

}
