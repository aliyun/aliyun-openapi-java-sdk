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

package com.aliyuncs.finmall.model.v20180723;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class AddTrialRecordRequest extends RpcAcsRequest<AddTrialRecordResponse> {
	
	public AddTrialRecordRequest() {
		super("finmall", "2018-07-23", "AddTrialRecord", "finmall", "innerAPI");
	}

	private String note;

	private String enterpriseEmail;

	private String contractPhoneNumber;

	private String contractName;

	private String enterpriseName;

	private String userId;

	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
		if(note != null){
			putQueryParameter("Note", note);
		}
	}

	public String getEnterpriseEmail() {
		return this.enterpriseEmail;
	}

	public void setEnterpriseEmail(String enterpriseEmail) {
		this.enterpriseEmail = enterpriseEmail;
		if(enterpriseEmail != null){
			putQueryParameter("EnterpriseEmail", enterpriseEmail);
		}
	}

	public String getContractPhoneNumber() {
		return this.contractPhoneNumber;
	}

	public void setContractPhoneNumber(String contractPhoneNumber) {
		this.contractPhoneNumber = contractPhoneNumber;
		if(contractPhoneNumber != null){
			putQueryParameter("ContractPhoneNumber", contractPhoneNumber);
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

	public String getEnterpriseName() {
		return this.enterpriseName;
	}

	public void setEnterpriseName(String enterpriseName) {
		this.enterpriseName = enterpriseName;
		if(enterpriseName != null){
			putQueryParameter("EnterpriseName", enterpriseName);
		}
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
		if(userId != null){
			putQueryParameter("UserId", userId);
		}
	}

	@Override
	public Class<AddTrialRecordResponse> getResponseClass() {
		return AddTrialRecordResponse.class;
	}

}
