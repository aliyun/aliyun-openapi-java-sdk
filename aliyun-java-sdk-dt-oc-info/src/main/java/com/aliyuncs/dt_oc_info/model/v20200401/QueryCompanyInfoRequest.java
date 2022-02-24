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
public class QueryCompanyInfoRequest extends RpcAcsRequest<QueryCompanyInfoResponse> {
	   

	private Integer sQLId;

	private String returnFields;

	private String conditions;
	public QueryCompanyInfoRequest() {
		super("dt-oc-info", "2020-04-01", "QueryCompanyInfo");
		setMethod(MethodType.POST);
	}

	public Integer getSQLId() {
		return this.sQLId;
	}

	public void setSQLId(Integer sQLId) {
		this.sQLId = sQLId;
		if(sQLId != null){
			putQueryParameter("SQLId", sQLId.toString());
		}
	}

	public String getReturnFields() {
		return this.returnFields;
	}

	public void setReturnFields(String returnFields) {
		this.returnFields = returnFields;
		if(returnFields != null){
			putBodyParameter("ReturnFields", returnFields);
		}
	}

	public String getConditions() {
		return this.conditions;
	}

	public void setConditions(String conditions) {
		this.conditions = conditions;
		if(conditions != null){
			putBodyParameter("Conditions", conditions);
		}
	}

	@Override
	public Class<QueryCompanyInfoResponse> getResponseClass() {
		return QueryCompanyInfoResponse.class;
	}

}
