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

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateLinkeantcodeAntcodeRecoverytaskRequest extends RpcAcsRequest<CreateLinkeantcodeAntcodeRecoverytaskResponse> {
	   

	private String startTime;

	private String branch;

	private String antcodeTarget;

	private String id;

	private String requestGitOperate;

	private String endTime;
	public CreateLinkeantcodeAntcodeRecoverytaskRequest() {
		super("SOFA", "2019-08-15", "CreateLinkeantcodeAntcodeRecoverytask", "sofacafedeps");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putBodyParameter("StartTime", startTime);
		}
	}

	public String getBranch() {
		return this.branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
		if(branch != null){
			putBodyParameter("Branch", branch);
		}
	}

	public String getAntcodeTarget() {
		return this.antcodeTarget;
	}

	public void setAntcodeTarget(String antcodeTarget) {
		this.antcodeTarget = antcodeTarget;
		if(antcodeTarget != null){
			putBodyParameter("AntcodeTarget", antcodeTarget);
		}
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
		if(id != null){
			putBodyParameter("Id", id);
		}
	}

	public String getRequestGitOperate() {
		return this.requestGitOperate;
	}

	public void setRequestGitOperate(String requestGitOperate) {
		this.requestGitOperate = requestGitOperate;
		if(requestGitOperate != null){
			putBodyParameter("RequestGitOperate", requestGitOperate);
		}
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putBodyParameter("EndTime", endTime);
		}
	}

	@Override
	public Class<CreateLinkeantcodeAntcodeRecoverytaskResponse> getResponseClass() {
		return CreateLinkeantcodeAntcodeRecoverytaskResponse.class;
	}

}
