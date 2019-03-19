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

package com.aliyuncs.cloudwf.model.v20170328;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class ReleaseInstanceRequest extends RpcAcsRequest<ReleaseInstanceResponse> {
	
	public ReleaseInstanceRequest() {
		super("cloudwf", "2017-03-28", "ReleaseInstance", "cloudwf");
	}

	private String traceId;

	private String spMsg;

	public String getTraceId() {
		return this.traceId;
	}

	public void setTraceId(String traceId) {
		this.traceId = traceId;
		if(traceId != null){
			putQueryParameter("TraceId", traceId);
		}
	}

	public String getSpMsg() {
		return this.spMsg;
	}

	public void setSpMsg(String spMsg) {
		this.spMsg = spMsg;
		if(spMsg != null){
			putQueryParameter("SpMsg", spMsg);
		}
	}

	@Override
	public Class<ReleaseInstanceResponse> getResponseClass() {
		return ReleaseInstanceResponse.class;
	}

}
