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

package com.aliyuncs.finance_rule.model.v20180808;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class QueryOuRuleRequest extends RpcAcsRequest<QueryOuRuleResponse> {
	   

	private String companyEntity;

	private String ouCode;

	private String ouName;
	public QueryOuRuleRequest() {
		super("Finance-Rule", "2018-08-08", "QueryOuRule");
		setMethod(MethodType.POST);
	}

	public String getCompanyEntity() {
		return this.companyEntity;
	}

	public void setCompanyEntity(String companyEntity) {
		this.companyEntity = companyEntity;
		if(companyEntity != null){
			putQueryParameter("CompanyEntity", companyEntity);
		}
	}

	public String getOuCode() {
		return this.ouCode;
	}

	public void setOuCode(String ouCode) {
		this.ouCode = ouCode;
		if(ouCode != null){
			putQueryParameter("OuCode", ouCode);
		}
	}

	public String getOuName() {
		return this.ouName;
	}

	public void setOuName(String ouName) {
		this.ouName = ouName;
		if(ouName != null){
			putQueryParameter("OuName", ouName);
		}
	}

	@Override
	public Class<QueryOuRuleResponse> getResponseClass() {
		return QueryOuRuleResponse.class;
	}

}
