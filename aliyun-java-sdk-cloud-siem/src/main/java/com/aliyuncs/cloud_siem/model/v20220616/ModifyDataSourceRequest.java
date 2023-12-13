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
public class ModifyDataSourceRequest extends RpcAcsRequest<ModifyDataSourceResponse> {
	   

	private String dataSourceType;

	private String cloudCode;

	private String dataSourceInstanceName;

	private String accountId;

	private String dataSourceInstanceRemark;

	private String dataSourceInstanceParams;

	private String dataSourceInstanceId;
	public ModifyDataSourceRequest() {
		super("cloud-siem", "2022-06-16", "ModifyDataSource", "cloud-siem");
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

	public String getDataSourceInstanceName() {
		return this.dataSourceInstanceName;
	}

	public void setDataSourceInstanceName(String dataSourceInstanceName) {
		this.dataSourceInstanceName = dataSourceInstanceName;
		if(dataSourceInstanceName != null){
			putBodyParameter("DataSourceInstanceName", dataSourceInstanceName);
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

	public String getDataSourceInstanceRemark() {
		return this.dataSourceInstanceRemark;
	}

	public void setDataSourceInstanceRemark(String dataSourceInstanceRemark) {
		this.dataSourceInstanceRemark = dataSourceInstanceRemark;
		if(dataSourceInstanceRemark != null){
			putBodyParameter("DataSourceInstanceRemark", dataSourceInstanceRemark);
		}
	}

	public String getDataSourceInstanceParams() {
		return this.dataSourceInstanceParams;
	}

	public void setDataSourceInstanceParams(String dataSourceInstanceParams) {
		this.dataSourceInstanceParams = dataSourceInstanceParams;
		if(dataSourceInstanceParams != null){
			putBodyParameter("DataSourceInstanceParams", dataSourceInstanceParams);
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
	public Class<ModifyDataSourceResponse> getResponseClass() {
		return ModifyDataSourceResponse.class;
	}

}
