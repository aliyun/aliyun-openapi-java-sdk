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
public class AddBaaSFabricBizChainRequest extends RpcAcsRequest<AddBaaSFabricBizChainResponse> {
	   

	private String baaSFabricConsortiumId;

	private String remark;

	private String name;

	private String baaSFabricChannelId;

	private String baaSFabricOrganizationId;

	private String contractTemplateIdList;
	public AddBaaSFabricBizChainRequest() {
		super("lto", "2021-07-07", "AddBaaSFabricBizChain");
		setMethod(MethodType.POST);
	}

	public String getBaaSFabricConsortiumId() {
		return this.baaSFabricConsortiumId;
	}

	public void setBaaSFabricConsortiumId(String baaSFabricConsortiumId) {
		this.baaSFabricConsortiumId = baaSFabricConsortiumId;
		if(baaSFabricConsortiumId != null){
			putQueryParameter("BaaSFabricConsortiumId", baaSFabricConsortiumId);
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public String getBaaSFabricChannelId() {
		return this.baaSFabricChannelId;
	}

	public void setBaaSFabricChannelId(String baaSFabricChannelId) {
		this.baaSFabricChannelId = baaSFabricChannelId;
		if(baaSFabricChannelId != null){
			putQueryParameter("BaaSFabricChannelId", baaSFabricChannelId);
		}
	}

	public String getBaaSFabricOrganizationId() {
		return this.baaSFabricOrganizationId;
	}

	public void setBaaSFabricOrganizationId(String baaSFabricOrganizationId) {
		this.baaSFabricOrganizationId = baaSFabricOrganizationId;
		if(baaSFabricOrganizationId != null){
			putQueryParameter("BaaSFabricOrganizationId", baaSFabricOrganizationId);
		}
	}

	public String getContractTemplateIdList() {
		return this.contractTemplateIdList;
	}

	public void setContractTemplateIdList(String contractTemplateIdList) {
		this.contractTemplateIdList = contractTemplateIdList;
		if(contractTemplateIdList != null){
			putQueryParameter("ContractTemplateIdList", contractTemplateIdList);
		}
	}

	@Override
	public Class<AddBaaSFabricBizChainResponse> getResponseClass() {
		return AddBaaSFabricBizChainResponse.class;
	}

}
