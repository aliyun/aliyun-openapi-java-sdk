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

package com.aliyuncs.agency.model.v20171030;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.agency.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class TransferReplaceResellerRequest extends RpcAcsRequest<TransferReplaceResellerResponse> {
	   

	private Integer tansferScene;

	private String operateReason;

	private String parentUid;

	private String transferUid;

	private String operater;

	private String operaterOrganization;

	private String operaterEmpid;

	private Integer shutdownStatus;

	private Integer quotaAmount;
	public TransferReplaceResellerRequest() {
		super("Agency", "2017-10-30", "TransferReplaceReseller", "openApi");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getTansferScene() {
		return this.tansferScene;
	}

	public void setTansferScene(Integer tansferScene) {
		this.tansferScene = tansferScene;
		if(tansferScene != null){
			putQueryParameter("TansferScene", tansferScene.toString());
		}
	}

	public String getOperateReason() {
		return this.operateReason;
	}

	public void setOperateReason(String operateReason) {
		this.operateReason = operateReason;
		if(operateReason != null){
			putQueryParameter("OperateReason", operateReason);
		}
	}

	public String getParentUid() {
		return this.parentUid;
	}

	public void setParentUid(String parentUid) {
		this.parentUid = parentUid;
		if(parentUid != null){
			putQueryParameter("ParentUid", parentUid);
		}
	}

	public String getTransferUid() {
		return this.transferUid;
	}

	public void setTransferUid(String transferUid) {
		this.transferUid = transferUid;
		if(transferUid != null){
			putQueryParameter("TransferUid", transferUid);
		}
	}

	public String getOperater() {
		return this.operater;
	}

	public void setOperater(String operater) {
		this.operater = operater;
		if(operater != null){
			putQueryParameter("Operater", operater);
		}
	}

	public String getOperaterOrganization() {
		return this.operaterOrganization;
	}

	public void setOperaterOrganization(String operaterOrganization) {
		this.operaterOrganization = operaterOrganization;
		if(operaterOrganization != null){
			putQueryParameter("OperaterOrganization", operaterOrganization);
		}
	}

	public String getOperaterEmpid() {
		return this.operaterEmpid;
	}

	public void setOperaterEmpid(String operaterEmpid) {
		this.operaterEmpid = operaterEmpid;
		if(operaterEmpid != null){
			putQueryParameter("OperaterEmpid", operaterEmpid);
		}
	}

	public Integer getShutdownStatus() {
		return this.shutdownStatus;
	}

	public void setShutdownStatus(Integer shutdownStatus) {
		this.shutdownStatus = shutdownStatus;
		if(shutdownStatus != null){
			putQueryParameter("ShutdownStatus", shutdownStatus.toString());
		}
	}

	public Integer getQuotaAmount() {
		return this.quotaAmount;
	}

	public void setQuotaAmount(Integer quotaAmount) {
		this.quotaAmount = quotaAmount;
		if(quotaAmount != null){
			putQueryParameter("QuotaAmount", quotaAmount.toString());
		}
	}

	@Override
	public Class<TransferReplaceResellerResponse> getResponseClass() {
		return TransferReplaceResellerResponse.class;
	}

}
