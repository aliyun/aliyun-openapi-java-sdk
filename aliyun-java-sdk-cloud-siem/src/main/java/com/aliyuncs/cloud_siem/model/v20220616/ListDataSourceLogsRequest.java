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
public class ListDataSourceLogsRequest extends RpcAcsRequest<ListDataSourceLogsResponse> {
	   

	private String cloudCode;

	private String accountId;

	private String dataSourceInstanceId;
	public ListDataSourceLogsRequest() {
		super("cloud-siem", "2022-06-16", "ListDataSourceLogs", "cloud-siem");
		setMethod(MethodType.POST);
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

	public String getAccountId() {
		return this.accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
		if(accountId != null){
			putBodyParameter("AccountId", accountId);
		}
	}

	public String getDataSourceInstanceId() {
		return this.dataSourceInstanceId;
	}

	public void setDataSourceInstanceId(String dataSourceInstanceId) {
		this.dataSourceInstanceId = dataSourceInstanceId;
		if(dataSourceInstanceId != null){
			putBodyParameter("DataSourceInstanceId", dataSourceInstanceId);
		}
	}

	@Override
	public Class<ListDataSourceLogsResponse> getResponseClass() {
		return ListDataSourceLogsResponse.class;
	}

}
