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

package com.aliyuncs.lubanruler.model.v20171228;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetResultByLubanrulerRequest extends RpcAcsRequest<GetResultByLubanrulerResponse> {
	
	public GetResultByLubanrulerRequest() {
		super("Lubanruler", "2017-12-28", "GetResultByLubanruler", "lubanruler");
		setMethod(MethodType.POST);
	}

	private Integer aonePipelineId;

	private String token;

	public Integer getAonePipelineId() {
		return this.aonePipelineId;
	}

	public void setAonePipelineId(Integer aonePipelineId) {
		this.aonePipelineId = aonePipelineId;
		if(aonePipelineId != null){
			putQueryParameter("AonePipelineId", aonePipelineId.toString());
		}
	}

	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
		if(token != null){
			putQueryParameter("Token", token);
		}
	}

	@Override
	public Class<GetResultByLubanrulerResponse> getResponseClass() {
		return GetResultByLubanrulerResponse.class;
	}

}
