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

package com.aliyuncs.ecsops.model.v20160401;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class OpsDescribeDiagnoseRuleDefinitionRequest extends RpcAcsRequest<OpsDescribeDiagnoseRuleDefinitionResponse> {
	   

	private List<String> ruleNames;

	private Integer pageNumber;

	private Boolean enable;

	private Integer pageSize;

	private String lastModifiedUserName;

	private String auditParamStr;
	public OpsDescribeDiagnoseRuleDefinitionRequest() {
		super("Ecsops", "2016-04-01", "OpsDescribeDiagnoseRuleDefinition", "ecsops");
		setMethod(MethodType.POST);
	}

	public List<String> getRuleNames() {
		return this.ruleNames;
	}

	public void setRuleNames(List<String> ruleNames) {
		this.ruleNames = ruleNames;	
		if (ruleNames != null) {
			for (int i = 0; i < ruleNames.size(); i++) {
				putQueryParameter("RuleName." + (i + 1) , ruleNames.get(i));
			}
		}	
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
		}
	}

	public Boolean getEnable() {
		return this.enable;
	}

	public void setEnable(Boolean enable) {
		this.enable = enable;
		if(enable != null){
			putQueryParameter("Enable", enable.toString());
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public String getLastModifiedUserName() {
		return this.lastModifiedUserName;
	}

	public void setLastModifiedUserName(String lastModifiedUserName) {
		this.lastModifiedUserName = lastModifiedUserName;
		if(lastModifiedUserName != null){
			putQueryParameter("LastModifiedUserName", lastModifiedUserName);
		}
	}

	public String getAuditParamStr() {
		return this.auditParamStr;
	}

	public void setAuditParamStr(String auditParamStr) {
		this.auditParamStr = auditParamStr;
		if(auditParamStr != null){
			putQueryParameter("AuditParamStr", auditParamStr);
		}
	}

	@Override
	public Class<OpsDescribeDiagnoseRuleDefinitionResponse> getResponseClass() {
		return OpsDescribeDiagnoseRuleDefinitionResponse.class;
	}

}
