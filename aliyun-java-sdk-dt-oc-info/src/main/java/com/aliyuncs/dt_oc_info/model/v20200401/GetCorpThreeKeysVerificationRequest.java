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

package com.aliyuncs.dt_oc_info.model.v20200401;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetCorpThreeKeysVerificationRequest extends RpcAcsRequest<GetCorpThreeKeysVerificationResponse> {
	   

	private String registerNo;

	private String companyName;

	private String legalPersonName;
	public GetCorpThreeKeysVerificationRequest() {
		super("dt-oc-info", "2020-04-01", "GetCorpThreeKeysVerification");
		setMethod(MethodType.POST);
	}

	public String getRegisterNo() {
		return this.registerNo;
	}

	public void setRegisterNo(String registerNo) {
		this.registerNo = registerNo;
		if(registerNo != null){
			putQueryParameter("RegisterNo", registerNo);
		}
	}

	public String getCompanyName() {
		return this.companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
		if(companyName != null){
			putQueryParameter("CompanyName", companyName);
		}
	}

	public String getLegalPersonName() {
		return this.legalPersonName;
	}

	public void setLegalPersonName(String legalPersonName) {
		this.legalPersonName = legalPersonName;
		if(legalPersonName != null){
			putQueryParameter("LegalPersonName", legalPersonName);
		}
	}

	@Override
	public Class<GetCorpThreeKeysVerificationResponse> getResponseClass() {
		return GetCorpThreeKeysVerificationResponse.class;
	}

}
