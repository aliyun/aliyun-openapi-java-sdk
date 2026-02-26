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
public class AddBaaSAntChainBizChainRequest extends RpcAcsRequest<AddBaaSAntChainBizChainResponse> {
	   

	private String caCertPassword;

	private String nodeNameList;

	private String remark;

	private String userKey;

	private String clientCert;

	private String baaSAntChainConsortiumId;

	private String userKeyPassword;

	private String baaSAntChainChainId;

	private String clientKey;

	private String caCert;

	private String name;

	private String clientKeyPassword;

	private String contractTemplateIdList;

	private String userName;
	public AddBaaSAntChainBizChainRequest() {
		super("lto", "2021-07-07", "AddBaaSAntChainBizChain");
		setMethod(MethodType.POST);
	}

	public String getCaCertPassword() {
		return this.caCertPassword;
	}

	public void setCaCertPassword(String caCertPassword) {
		this.caCertPassword = caCertPassword;
		if(caCertPassword != null){
			putQueryParameter("CaCertPassword", caCertPassword);
		}
	}

	public String getNodeNameList() {
		return this.nodeNameList;
	}

	public void setNodeNameList(String nodeNameList) {
		this.nodeNameList = nodeNameList;
		if(nodeNameList != null){
			putQueryParameter("NodeNameList", nodeNameList);
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

	public String getUserKey() {
		return this.userKey;
	}

	public void setUserKey(String userKey) {
		this.userKey = userKey;
		if(userKey != null){
			putQueryParameter("UserKey", userKey);
		}
	}

	public String getClientCert() {
		return this.clientCert;
	}

	public void setClientCert(String clientCert) {
		this.clientCert = clientCert;
		if(clientCert != null){
			putQueryParameter("ClientCert", clientCert);
		}
	}

	public String getBaaSAntChainConsortiumId() {
		return this.baaSAntChainConsortiumId;
	}

	public void setBaaSAntChainConsortiumId(String baaSAntChainConsortiumId) {
		this.baaSAntChainConsortiumId = baaSAntChainConsortiumId;
		if(baaSAntChainConsortiumId != null){
			putQueryParameter("BaaSAntChainConsortiumId", baaSAntChainConsortiumId);
		}
	}

	public String getUserKeyPassword() {
		return this.userKeyPassword;
	}

	public void setUserKeyPassword(String userKeyPassword) {
		this.userKeyPassword = userKeyPassword;
		if(userKeyPassword != null){
			putQueryParameter("UserKeyPassword", userKeyPassword);
		}
	}

	public String getBaaSAntChainChainId() {
		return this.baaSAntChainChainId;
	}

	public void setBaaSAntChainChainId(String baaSAntChainChainId) {
		this.baaSAntChainChainId = baaSAntChainChainId;
		if(baaSAntChainChainId != null){
			putQueryParameter("BaaSAntChainChainId", baaSAntChainChainId);
		}
	}

	public String getClientKey() {
		return this.clientKey;
	}

	public void setClientKey(String clientKey) {
		this.clientKey = clientKey;
		if(clientKey != null){
			putQueryParameter("ClientKey", clientKey);
		}
	}

	public String getCaCert() {
		return this.caCert;
	}

	public void setCaCert(String caCert) {
		this.caCert = caCert;
		if(caCert != null){
			putQueryParameter("CaCert", caCert);
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

	public String getClientKeyPassword() {
		return this.clientKeyPassword;
	}

	public void setClientKeyPassword(String clientKeyPassword) {
		this.clientKeyPassword = clientKeyPassword;
		if(clientKeyPassword != null){
			putQueryParameter("ClientKeyPassword", clientKeyPassword);
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

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
		if(userName != null){
			putQueryParameter("UserName", userName);
		}
	}

	@Override
	public Class<AddBaaSAntChainBizChainResponse> getResponseClass() {
		return AddBaaSAntChainBizChainResponse.class;
	}

}
