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
package com.aliyuncs.csb.model.v20171118;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UpdateServiceQPSRequest extends RpcAcsRequest<UpdateServiceQPSResponse> {
	
	public UpdateServiceQPSRequest() {
		super("CSB", "2017-11-18", "UpdateServiceQPS", "CSB");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	private String qps;

	private Long serviceId;

	public String getQps() {
		return this.qps;
	}

	public void setQps(String qps) {
		this.qps = qps;
		if(qps != null){
			putQueryParameter("Qps", qps);
		}
	}

	public Long getServiceId() {
		return this.serviceId;
	}

	public void setServiceId(Long serviceId) {
		this.serviceId = serviceId;
		if(serviceId != null){
			putQueryParameter("ServiceId", serviceId.toString());
		}
	}

	@Override
	public Class<UpdateServiceQPSResponse> getResponseClass() {
		return UpdateServiceQPSResponse.class;
	}

}
