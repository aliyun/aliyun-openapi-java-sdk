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

package com.aliyuncs.unimkt.model.v20181212;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.unimkt.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetUnionTaskStatusRequest extends RpcAcsRequest<GetUnionTaskStatusResponse> {
	   

	private String sign;

	private Long alipayOpenId;

	private Long taskId;
	public GetUnionTaskStatusRequest() {
		super("UniMkt", "2018-12-12", "GetUnionTaskStatus", "uniMkt");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSign() {
		return this.sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
		if(sign != null){
			putQueryParameter("Sign", sign);
		}
	}

	public Long getAlipayOpenId() {
		return this.alipayOpenId;
	}

	public void setAlipayOpenId(Long alipayOpenId) {
		this.alipayOpenId = alipayOpenId;
		if(alipayOpenId != null){
			putQueryParameter("AlipayOpenId", alipayOpenId.toString());
		}
	}

	public Long getTaskId() {
		return this.taskId;
	}

	public void setTaskId(Long taskId) {
		this.taskId = taskId;
		if(taskId != null){
			putQueryParameter("TaskId", taskId.toString());
		}
	}

	@Override
	public Class<GetUnionTaskStatusResponse> getResponseClass() {
		return GetUnionTaskStatusResponse.class;
	}

}
