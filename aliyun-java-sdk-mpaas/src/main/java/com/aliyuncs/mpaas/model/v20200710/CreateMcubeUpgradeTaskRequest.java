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

package com.aliyuncs.mpaas.model.v20200710;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.mpaas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateMcubeUpgradeTaskRequest extends RpcAcsRequest<CreateMcubeUpgradeTaskResponse> {
	   

	private Long packageInfoId;

	private String upgradeContent;

	private String memo;

	private Integer upgradeType;

	private String greyConfigInfo;

	private String tenantId;

	private Integer publishMode;

	private String whitelistIds;

	private Integer publishType;

	private Integer greyNum;

	private String appId;

	private Integer historyForce;

	private String greyEndtimeData;

	private String workspaceId;
	public CreateMcubeUpgradeTaskRequest() {
		super("mPaaS", "2020-07-10", "CreateMcubeUpgradeTask");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getPackageInfoId() {
		return this.packageInfoId;
	}

	public void setPackageInfoId(Long packageInfoId) {
		this.packageInfoId = packageInfoId;
		if(packageInfoId != null){
			putBodyParameter("PackageInfoId", packageInfoId.toString());
		}
	}

	public String getUpgradeContent() {
		return this.upgradeContent;
	}

	public void setUpgradeContent(String upgradeContent) {
		this.upgradeContent = upgradeContent;
		if(upgradeContent != null){
			putBodyParameter("UpgradeContent", upgradeContent);
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

	public Integer getUpgradeType() {
		return this.upgradeType;
	}

	public void setUpgradeType(Integer upgradeType) {
		this.upgradeType = upgradeType;
		if(upgradeType != null){
			putBodyParameter("UpgradeType", upgradeType.toString());
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

	public String getAppId() {
		return this.appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
		if(appId != null){
			putBodyParameter("AppId", appId);
		}
	}

	public Integer getHistoryForce() {
		return this.historyForce;
	}

	public void setHistoryForce(Integer historyForce) {
		this.historyForce = historyForce;
		if(historyForce != null){
			putBodyParameter("HistoryForce", historyForce.toString());
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

	public String getWorkspaceId() {
		return this.workspaceId;
	}

	public void setWorkspaceId(String workspaceId) {
		this.workspaceId = workspaceId;
		if(workspaceId != null){
			putBodyParameter("WorkspaceId", workspaceId);
		}
	}

	@Override
	public Class<CreateMcubeUpgradeTaskResponse> getResponseClass() {
		return CreateMcubeUpgradeTaskResponse.class;
	}

}
