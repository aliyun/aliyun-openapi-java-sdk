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
public class SubmitImportLogTasksRequest extends RpcAcsRequest<SubmitImportLogTasksResponse> {
	   

	private String cloudCode;

	private String logCodes;

	private String prodCode;

	private Integer autoImported;

	private String accounts;
	public SubmitImportLogTasksRequest() {
		super("cloud-siem", "2022-06-16", "SubmitImportLogTasks", "cloud-siem");
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

	public String getLogCodes() {
		return this.logCodes;
	}

	public void setLogCodes(String logCodes) {
		this.logCodes = logCodes;
		if(logCodes != null){
			putBodyParameter("LogCodes", logCodes);
		}
	}

	public String getProdCode() {
		return this.prodCode;
	}

	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
		if(prodCode != null){
			putBodyParameter("ProdCode", prodCode);
		}
	}

	public Integer getAutoImported() {
		return this.autoImported;
	}

	public void setAutoImported(Integer autoImported) {
		this.autoImported = autoImported;
		if(autoImported != null){
			putBodyParameter("AutoImported", autoImported.toString());
		}
	}

	public String getAccounts() {
		return this.accounts;
	}

	public void setAccounts(String accounts) {
		this.accounts = accounts;
		if(accounts != null){
			putBodyParameter("Accounts", accounts);
		}
	}

	@Override
	public Class<SubmitImportLogTasksResponse> getResponseClass() {
		return SubmitImportLogTasksResponse.class;
	}

}
