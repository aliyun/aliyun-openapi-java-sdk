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
public class GetCompanyProfileRequest extends RpcAcsRequest<GetCompanyProfileResponse> {
	   

	private Integer sqlId;

	private String companyIdKeyParam;
	public GetCompanyProfileRequest() {
		super("dt-oc-info", "2020-04-01", "GetCompanyProfile");
		setMethod(MethodType.POST);
	}

	public Integer getSqlId() {
		return this.sqlId;
	}

	public void setSqlId(Integer sqlId) {
		this.sqlId = sqlId;
		if(sqlId != null){
			putQueryParameter("SqlId", sqlId.toString());
		}
	}

	public String getCompanyIdKeyParam() {
		return this.companyIdKeyParam;
	}

	public void setCompanyIdKeyParam(String companyIdKeyParam) {
		this.companyIdKeyParam = companyIdKeyParam;
		if(companyIdKeyParam != null){
			putQueryParameter("CompanyIdKeyParam", companyIdKeyParam);
		}
	}

	@Override
	public Class<GetCompanyProfileResponse> getResponseClass() {
		return GetCompanyProfileResponse.class;
	}

}
