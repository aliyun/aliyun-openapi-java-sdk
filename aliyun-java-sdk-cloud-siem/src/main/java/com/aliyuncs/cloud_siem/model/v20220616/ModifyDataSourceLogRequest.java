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
public class ModifyDataSourceLogRequest extends RpcAcsRequest<ModifyDataSourceLogResponse> {
	   

	private String dataSourceType;

	private String cloudCode;

	private String accountId;

	private String logCode;

	private String logInstanceId;

	private String dataSourceInstanceLogs;

	private String dataSourceInstanceId;
	public ModifyDataSourceLogRequest() {
		super("cloud-siem", "2022-06-16", "ModifyDataSourceLog", "cloud-siem");
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

	public String getAccountId() {
		return this.accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
		if(accountId != null){
			putBodyParameter("AccountId", accountId);
		}
	}

	public String getLogCode() {
		return this.logCode;
	}

	public void setLogCode(String logCode) {
		this.logCode = logCode;
		if(logCode != null){
			putBodyParameter("LogCode", logCode);
		}
	}

	public String getLogInstanceId() {
		return this.logInstanceId;
	}

	public void setLogInstanceId(String logInstanceId) {
		this.logInstanceId = logInstanceId;
		if(logInstanceId != null){
			putBodyParameter("LogInstanceId", logInstanceId);
		}
	}

	public String getDataSourceInstanceLogs() {
		return this.dataSourceInstanceLogs;
	}

	public void setDataSourceInstanceLogs(String dataSourceInstanceLogs) {
		this.dataSourceInstanceLogs = dataSourceInstanceLogs;
		if(dataSourceInstanceLogs != null){
			putBodyParameter("DataSourceInstanceLogs", dataSourceInstanceLogs);
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
	public Class<ModifyDataSourceLogResponse> getResponseClass() {
		return ModifyDataSourceLogResponse.class;
	}

}
