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

package com.aliyuncs.itaas.model.v20170505;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class CreateEnterpriseRequest extends RpcAcsRequest<CreateEnterpriseResponse> {
	
	public CreateEnterpriseRequest() {
		super("ITaaS", "2017-05-05", "CreateEnterprise", "itaas");
	}

	private String clientappid;

	private Boolean serviceFlag;

	private String sysfrom;

	private Integer boxNumber;

	private String operator;

	public String getClientappid() {
		return this.clientappid;
	}

	public void setClientappid(String clientappid) {
		this.clientappid = clientappid;
		if(clientappid != null){
			putQueryParameter("Clientappid", clientappid);
		}
	}

	public Boolean getServiceFlag() {
		return this.serviceFlag;
	}

	public void setServiceFlag(Boolean serviceFlag) {
		this.serviceFlag = serviceFlag;
		if(serviceFlag != null){
			putQueryParameter("ServiceFlag", serviceFlag.toString());
		}
	}

	public String getSysfrom() {
		return this.sysfrom;
	}

	public void setSysfrom(String sysfrom) {
		this.sysfrom = sysfrom;
		if(sysfrom != null){
			putQueryParameter("Sysfrom", sysfrom);
		}
	}

	public Integer getBoxNumber() {
		return this.boxNumber;
	}

	public void setBoxNumber(Integer boxNumber) {
		this.boxNumber = boxNumber;
		if(boxNumber != null){
			putQueryParameter("BoxNumber", boxNumber.toString());
		}
	}

	public String getOperator() {
		return this.operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
		if(operator != null){
			putQueryParameter("Operator", operator);
		}
	}

	@Override
	public Class<CreateEnterpriseResponse> getResponseClass() {
		return CreateEnterpriseResponse.class;
	}

}
