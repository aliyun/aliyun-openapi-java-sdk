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

package com.aliyuncs.cloudcallcenter.model.v20170705;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class GetCabTaskRequest extends RpcAcsRequest<GetCabTaskResponse> {
	
	public GetCabTaskRequest() {
		super("CloudCallCenter", "2017-07-05", "GetCabTask", "CloudCallCenter", "innerAPI");
	}

	private String accTaskId;

	public String getAccTaskId() {
		return this.accTaskId;
	}

	public void setAccTaskId(String accTaskId) {
		this.accTaskId = accTaskId;
		if(accTaskId != null){
			putQueryParameter("AccTaskId", accTaskId);
		}
	}

	@Override
	public Class<GetCabTaskResponse> getResponseClass() {
		return GetCabTaskResponse.class;
	}

}
