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

package com.aliyuncs.mpserverless.model.v20190930;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class RunFunctionRequest extends RpcAcsRequest<RunFunctionResponse> {
	   

	private String runParams;

	private String spaceId;
	public RunFunctionRequest() {
		super("MPServerless", "2019-09-30", "RunFunction", "MPServerless");
		setMethod(MethodType.POST);
	}

	public String getRunParams() {
		return this.runParams;
	}

	public void setRunParams(String runParams) {
		this.runParams = runParams;
		if(runParams != null){
			putBodyParameter("RunParams", runParams);
		}
	}

	public String getSpaceId() {
		return this.spaceId;
	}

	public void setSpaceId(String spaceId) {
		this.spaceId = spaceId;
		if(spaceId != null){
			putBodyParameter("SpaceId", spaceId);
		}
	}

	@Override
	public Class<RunFunctionResponse> getResponseClass() {
		return RunFunctionResponse.class;
	}

}
