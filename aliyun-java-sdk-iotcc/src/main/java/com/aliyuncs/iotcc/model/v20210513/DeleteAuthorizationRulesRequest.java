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

package com.aliyuncs.iotcc.model.v20210513;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DeleteAuthorizationRulesRequest extends RpcAcsRequest<DeleteAuthorizationRulesResponse> {
	   

	private Boolean dryRun;

	private String clientToken;

	private List<String> authorizationRuleIdss;

	private String ioTCloudConnectorId;
	public DeleteAuthorizationRulesRequest() {
		super("IoTCC", "2021-05-13", "DeleteAuthorizationRules", "IoTCC");
		setMethod(MethodType.POST);
	}

	public Boolean getDryRun() {
		return this.dryRun;
	}

	public void setDryRun(Boolean dryRun) {
		this.dryRun = dryRun;
		if(dryRun != null){
			putQueryParameter("DryRun", dryRun.toString());
		}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public List<String> getAuthorizationRuleIdss() {
		return this.authorizationRuleIdss;
	}

	public void setAuthorizationRuleIdss(List<String> authorizationRuleIdss) {
		this.authorizationRuleIdss = authorizationRuleIdss;	
		if (authorizationRuleIdss != null) {
			for (int i = 0; i < authorizationRuleIdss.size(); i++) {
				putQueryParameter("AuthorizationRuleIds." + (i + 1) , authorizationRuleIdss.get(i));
			}
		}	
	}

	public String getIoTCloudConnectorId() {
		return this.ioTCloudConnectorId;
	}

	public void setIoTCloudConnectorId(String ioTCloudConnectorId) {
		this.ioTCloudConnectorId = ioTCloudConnectorId;
		if(ioTCloudConnectorId != null){
			putQueryParameter("IoTCloudConnectorId", ioTCloudConnectorId);
		}
	}

	@Override
	public Class<DeleteAuthorizationRulesResponse> getResponseClass() {
		return DeleteAuthorizationRulesResponse.class;
	}

}
