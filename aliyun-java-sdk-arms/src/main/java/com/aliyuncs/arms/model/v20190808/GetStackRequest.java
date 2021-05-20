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

package com.aliyuncs.arms.model.v20190808;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.arms.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetStackRequest extends RpcAcsRequest<GetStackResponse> {
	   

	private String traceID;

	private String rpcID;

	private String pid;
	public GetStackRequest() {
		super("ARMS", "2019-08-08", "GetStack", "arms");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getTraceID() {
		return this.traceID;
	}

	public void setTraceID(String traceID) {
		this.traceID = traceID;
		if(traceID != null){
			putQueryParameter("TraceID", traceID);
		}
	}

	public String getRpcID() {
		return this.rpcID;
	}

	public void setRpcID(String rpcID) {
		this.rpcID = rpcID;
		if(rpcID != null){
			putQueryParameter("RpcID", rpcID);
		}
	}

	public String getPid() {
		return this.pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
		if(pid != null){
			putQueryParameter("Pid", pid);
		}
	}

	@Override
	public Class<GetStackResponse> getResponseClass() {
		return GetStackResponse.class;
	}

}
