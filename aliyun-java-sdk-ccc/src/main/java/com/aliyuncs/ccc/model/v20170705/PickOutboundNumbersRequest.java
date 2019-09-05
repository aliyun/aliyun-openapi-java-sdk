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

package com.aliyuncs.ccc.model.v20170705;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ccc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class PickOutboundNumbersRequest extends RpcAcsRequest<PickOutboundNumbersResponse> {
	
	public PickOutboundNumbersRequest() {
		super("CCC", "2017-07-05", "PickOutboundNumbers");
		setSysMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private Integer count;

	private String instanceId;

	private List<String> candidateNumbers;

	private String calleeNumber;

	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
		if(count != null){
			putQueryParameter("Count", count.toString());
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public List<String> getCandidateNumbers() {
		return this.candidateNumbers;
	}

	public void setCandidateNumbers(List<String> candidateNumbers) {
		this.candidateNumbers = candidateNumbers;	
		if (candidateNumbers != null) {
			for (int i = 0; i < candidateNumbers.size(); i++) {
				putQueryParameter("CandidateNumber." + (i + 1) , candidateNumbers.get(i));
			}
		}	
	}

	public String getCalleeNumber() {
		return this.calleeNumber;
	}

	public void setCalleeNumber(String calleeNumber) {
		this.calleeNumber = calleeNumber;
		if(calleeNumber != null){
			putQueryParameter("CalleeNumber", calleeNumber);
		}
	}

	@Override
	public Class<PickOutboundNumbersResponse> getResponseClass() {
		return PickOutboundNumbersResponse.class;
	}

}
