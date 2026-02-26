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

package com.aliyuncs.lto.model.v20210707;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class AddRouteRuleRequest extends RpcAcsRequest<AddRouteRuleResponse> {
	   

	private String contractTemplateId;

	private String contractName;

	private String privacyRuleId;

	private String remark;

	private String bizChainId;

	private String invokeType;

	private String deviceGroupId;

	private String chainUpMode;
	public AddRouteRuleRequest() {
		super("lto", "2021-07-07", "AddRouteRule");
		setMethod(MethodType.POST);
	}

	public String getContractTemplateId() {
		return this.contractTemplateId;
	}

	public void setContractTemplateId(String contractTemplateId) {
		this.contractTemplateId = contractTemplateId;
		if(contractTemplateId != null){
			putQueryParameter("ContractTemplateId", contractTemplateId);
		}
	}

	public String getContractName() {
		return this.contractName;
	}

	public void setContractName(String contractName) {
		this.contractName = contractName;
		if(contractName != null){
			putQueryParameter("ContractName", contractName);
		}
	}

	public String getPrivacyRuleId() {
		return this.privacyRuleId;
	}

	public void setPrivacyRuleId(String privacyRuleId) {
		this.privacyRuleId = privacyRuleId;
		if(privacyRuleId != null){
			putQueryParameter("PrivacyRuleId", privacyRuleId);
		}
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
		if(remark != null){
			putQueryParameter("Remark", remark);
		}
	}

	public String getBizChainId() {
		return this.bizChainId;
	}

	public void setBizChainId(String bizChainId) {
		this.bizChainId = bizChainId;
		if(bizChainId != null){
			putQueryParameter("BizChainId", bizChainId);
		}
	}

	public String getInvokeType() {
		return this.invokeType;
	}

	public void setInvokeType(String invokeType) {
		this.invokeType = invokeType;
		if(invokeType != null){
			putQueryParameter("InvokeType", invokeType);
		}
	}

	public String getDeviceGroupId() {
		return this.deviceGroupId;
	}

	public void setDeviceGroupId(String deviceGroupId) {
		this.deviceGroupId = deviceGroupId;
		if(deviceGroupId != null){
			putQueryParameter("DeviceGroupId", deviceGroupId);
		}
	}

	public String getChainUpMode() {
		return this.chainUpMode;
	}

	public void setChainUpMode(String chainUpMode) {
		this.chainUpMode = chainUpMode;
		if(chainUpMode != null){
			putQueryParameter("ChainUpMode", chainUpMode);
		}
	}

	@Override
	public Class<AddRouteRuleResponse> getResponseClass() {
		return AddRouteRuleResponse.class;
	}

}
