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
public class StartOnlineWorkRequest extends RpcAcsRequest<StartOnlineWorkResponse> {
	   

	private Long agentId;

	private String stationType;

	private Integer workType;

	private String userAgent;
	public StartOnlineWorkRequest() {
		super("CCCXSpaceInner", "2019-12-27", "StartOnlineWork");
		setMethod(MethodType.PUT);
	}

	public Long getAgentId() {
		return this.agentId;
	}

	public void setAgentId(Long agentId) {
		this.agentId = agentId;
		if(agentId != null){
			putBodyParameter("AgentId", agentId.toString());
		}
	}

	public String getStationType() {
		return this.stationType;
	}

	public void setStationType(String stationType) {
		this.stationType = stationType;
		if(stationType != null){
			putBodyParameter("StationType", stationType);
		}
	}

	public Integer getWorkType() {
		return this.workType;
	}

	public void setWorkType(Integer workType) {
		this.workType = workType;
		if(workType != null){
			putBodyParameter("WorkType", workType.toString());
		}
	}

	public String getUserAgent() {
		return this.userAgent;
	}

	public void setUserAgent(String userAgent) {
		this.userAgent = userAgent;
		if(userAgent != null){
			putBodyParameter("UserAgent", userAgent);
		}
	}

	@Override
	public Class<StartOnlineWorkResponse> getResponseClass() {
		return StartOnlineWorkResponse.class;
	}

}
