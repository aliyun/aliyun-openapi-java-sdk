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

package com.aliyuncs.cloud_siem.model.v20220616;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DescribeDataSourceParametersRequest extends RpcAcsRequest<DescribeDataSourceParametersResponse> {
	   

	private String dataSourceType;

	private String cloudCode;
	public DescribeDataSourceParametersRequest() {
		super("cloud-siem", "2022-06-16", "DescribeDataSourceParameters", "cloud-siem");
		setMethod(MethodType.POST);
	}

	public String getDataSourceType() {
		return this.dataSourceType;
	}

	public void setDataSourceType(String dataSourceType) {
		this.dataSourceType = dataSourceType;
		if(dataSourceType != null){
			putBodyParameter("DataSourceType", dataSourceType);
		}
	}

	public String getCloudCode() {
		return this.cloudCode;
	}

	public void setCloudCode(String cloudCode) {
		this.cloudCode = cloudCode;
		if(cloudCode != null){
			putBodyParameter("CloudCode", cloudCode);
		}
	}

	@Override
	public Class<DescribeDataSourceParametersResponse> getResponseClass() {
		return DescribeDataSourceParametersResponse.class;
	}

}
