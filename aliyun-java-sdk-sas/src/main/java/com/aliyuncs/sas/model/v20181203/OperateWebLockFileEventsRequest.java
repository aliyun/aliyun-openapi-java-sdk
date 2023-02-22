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
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class OperateWebLockFileEventsRequest extends RpcAcsRequest<OperateWebLockFileEventsResponse> {
	   

	private Integer dealAll;

	private List<Long> eventIdss;

	private String operationCode;
	public OperateWebLockFileEventsRequest() {
		super("Sas", "2018-12-03", "OperateWebLockFileEvents");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getDealAll() {
		return this.dealAll;
	}

	public void setDealAll(Integer dealAll) {
		this.dealAll = dealAll;
		if(dealAll != null){
			putQueryParameter("DealAll", dealAll.toString());
		}
	}

	public List<Long> getEventIdss() {
		return this.eventIdss;
	}

	public void setEventIdss(List<Long> eventIdss) {
		this.eventIdss = eventIdss;	
		if (eventIdss != null) {
			for (int i = 0; i < eventIdss.size(); i++) {
				putQueryParameter("EventIds." + (i + 1) , eventIdss.get(i));
			}
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
	public Class<OperateWebLockFileEventsResponse> getResponseClass() {
		return OperateWebLockFileEventsResponse.class;
	}

}
