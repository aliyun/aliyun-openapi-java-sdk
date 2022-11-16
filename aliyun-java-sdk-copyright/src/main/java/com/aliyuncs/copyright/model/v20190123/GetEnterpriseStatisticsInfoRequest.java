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

package com.aliyuncs.copyright.model.v20190123;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetEnterpriseStatisticsInfoRequest extends RpcAcsRequest<GetEnterpriseStatisticsInfoResponse> {
	   

	private String enterprise;
	public GetEnterpriseStatisticsInfoRequest() {
		super("Copyright", "2019-01-23", "GetEnterpriseStatisticsInfo", "swcopyright");
		setMethod(MethodType.POST);
	}

	public String getEnterprise() {
		return this.enterprise;
	}

	public void setEnterprise(String enterprise) {
		this.enterprise = enterprise;
		if(enterprise != null){
			putQueryParameter("Enterprise", enterprise);
		}
	}

	@Override
	public Class<GetEnterpriseStatisticsInfoResponse> getResponseClass() {
		return GetEnterpriseStatisticsInfoResponse.class;
	}

}
