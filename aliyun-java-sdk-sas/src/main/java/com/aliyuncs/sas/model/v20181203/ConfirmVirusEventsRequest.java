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

package com.aliyuncs.sas.model.v20181203;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ConfirmVirusEventsRequest extends RpcAcsRequest<ConfirmVirusEventsResponse> {
	   

	private String operationRange;

	private Integer operationAll;

	private String operationCode;
	public ConfirmVirusEventsRequest() {
		super("Sas", "2018-12-03", "ConfirmVirusEvents");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getOperationRange() {
		return this.operationRange;
	}

	public void setOperationRange(String operationRange) {
		this.operationRange = operationRange;
		if(operationRange != null){
			putQueryParameter("OperationRange", operationRange);
		}
	}

	public Integer getOperationAll() {
		return this.operationAll;
	}

	public void setOperationAll(Integer operationAll) {
		this.operationAll = operationAll;
		if(operationAll != null){
			putQueryParameter("OperationAll", operationAll.toString());
		}
	}

	public String getOperationCode() {
		return this.operationCode;
	}

	public void setOperationCode(String operationCode) {
		this.operationCode = operationCode;
		if(operationCode != null){
			putQueryParameter("OperationCode", operationCode);
		}
	}

	@Override
	public Class<ConfirmVirusEventsResponse> getResponseClass() {
		return ConfirmVirusEventsResponse.class;
	}

}
