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

package com.aliyuncs.workbench_inner.model.v20210121;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class InnerSetSolutionRelyServiceRequest extends RpcAcsRequest<InnerSetSolutionRelyServiceResponse> {
	   

	private String relyServices;

	private String currentOrgId;

	private Integer solutionId;

	private String userId;
	public InnerSetSolutionRelyServiceRequest() {
		super("Workbench-inner", "2021-01-21", "InnerSetSolutionRelyService");
		setMethod(MethodType.POST);
	}

	public String getRelyServices() {
		return this.relyServices;
	}

	public void setRelyServices(String relyServices) {
		this.relyServices = relyServices;
		if(relyServices != null){
			putQueryParameter("RelyServices", relyServices);
		}
	}

	public String getCurrentOrgId() {
		return this.currentOrgId;
	}

	public void setCurrentOrgId(String currentOrgId) {
		this.currentOrgId = currentOrgId;
		if(currentOrgId != null){
			putQueryParameter("CurrentOrgId", currentOrgId);
		}
	}

	public Integer getSolutionId() {
		return this.solutionId;
	}

	public void setSolutionId(Integer solutionId) {
		this.solutionId = solutionId;
		if(solutionId != null){
			putQueryParameter("SolutionId", solutionId.toString());
		}
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
		if(userId != null){
			putQueryParameter("UserId", userId);
		}
	}

	@Override
	public Class<InnerSetSolutionRelyServiceResponse> getResponseClass() {
		return InnerSetSolutionRelyServiceResponse.class;
	}

}