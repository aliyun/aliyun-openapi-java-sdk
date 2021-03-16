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

package com.aliyuncs.cccxspaceinner.model.v20191227;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GenerateTokenRequest extends RpcAcsRequest<GenerateTokenResponse> {
	   

	private String clientToken;

	private Long agentId;

	private String scene;

	private String appName;

	private String passportId;

	private String passportName;

	private Integer passportType;
	public GenerateTokenRequest() {
		super("CCCXSpaceInner", "2019-12-27", "GenerateToken");
		setMethod(MethodType.GET);
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

	public Long getAgentId() {
		return this.agentId;
	}

	public void setAgentId(Long agentId) {
		this.agentId = agentId;
		if(agentId != null){
			putQueryParameter("AgentId", agentId.toString());
		}
	}

	public String getScene() {
		return this.scene;
	}

	public void setScene(String scene) {
		this.scene = scene;
		if(scene != null){
			putQueryParameter("Scene", scene);
		}
	}

	public String getAppName() {
		return this.appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
		if(appName != null){
			putQueryParameter("AppName", appName);
		}
	}

	public String getPassportId() {
		return this.passportId;
	}

	public void setPassportId(String passportId) {
		this.passportId = passportId;
		if(passportId != null){
			putQueryParameter("PassportId", passportId);
		}
	}

	public String getPassportName() {
		return this.passportName;
	}

	public void setPassportName(String passportName) {
		this.passportName = passportName;
		if(passportName != null){
			putQueryParameter("PassportName", passportName);
		}
	}

	public Integer getPassportType() {
		return this.passportType;
	}

	public void setPassportType(Integer passportType) {
		this.passportType = passportType;
		if(passportType != null){
			putQueryParameter("PassportType", passportType.toString());
		}
	}

	@Override
	public Class<GenerateTokenResponse> getResponseClass() {
		return GenerateTokenResponse.class;
	}

}
