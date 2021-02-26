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

package com.aliyuncs.workbench_ide.model.v20210121;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetSystemSolutionRelyServiceRequest extends RpcAcsRequest<GetSystemSolutionRelyServiceResponse> {
	   

	private String computeType;

	private String currentOrgId;

	private Integer solutionId;
	public GetSystemSolutionRelyServiceRequest() {
		super("Workbench-ide", "2021-01-21", "GetSystemSolutionRelyService");
		setMethod(MethodType.POST);
	}

	public String getComputeType() {
		return this.computeType;
	}

	public void setComputeType(String computeType) {
		this.computeType = computeType;
		if(computeType != null){
			putQueryParameter("ComputeType", computeType);
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

	@Override
	public Class<GetSystemSolutionRelyServiceResponse> getResponseClass() {
		return GetSystemSolutionRelyServiceResponse.class;
	}

}
