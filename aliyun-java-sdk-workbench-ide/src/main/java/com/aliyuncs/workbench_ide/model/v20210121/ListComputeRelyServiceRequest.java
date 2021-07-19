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
import java.util.List;
import com.google.gson.Gson;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListComputeRelyServiceRequest extends RpcAcsRequest<ListComputeRelyServiceResponse> {
	   

	private List<Object> computeTypes;

	private String currentOrgId;
	public ListComputeRelyServiceRequest() {
		super("Workbench-ide", "2021-01-21", "ListComputeRelyService");
		setMethod(MethodType.POST);
	}

	public List<Object> getComputeTypes() {
		return this.computeTypes;
	}

	public void setComputeTypes(List<Object> computeTypes) {
		this.computeTypes = computeTypes;
		if(computeTypes != null){
			putQueryParameter("ComputeTypes", new Gson().toJson(computeTypes));
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

	@Override
	public Class<ListComputeRelyServiceResponse> getResponseClass() {
		return ListComputeRelyServiceResponse.class;
	}

}
