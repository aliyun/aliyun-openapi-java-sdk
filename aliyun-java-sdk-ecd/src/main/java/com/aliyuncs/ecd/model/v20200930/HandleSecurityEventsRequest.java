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

package com.aliyuncs.ecd.model.v20200930;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecd.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class HandleSecurityEventsRequest extends RpcAcsRequest<HandleSecurityEventsResponse> {
	   

	private List<SecurityEvent> securityEvents;

	private String operationCode;

	private String operationParams;
	public HandleSecurityEventsRequest() {
		super("ecd", "2020-09-30", "HandleSecurityEvents");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<SecurityEvent> getSecurityEvents() {
		return this.securityEvents;
	}

	public void setSecurityEvents(List<SecurityEvent> securityEvents) {
		this.securityEvents = securityEvents;	
		if (securityEvents != null) {
			for (int depth1 = 0; depth1 < securityEvents.size(); depth1++) {
				putQueryParameter("SecurityEvent." + (depth1 + 1) + ".DesktopId" , securityEvents.get(depth1).getDesktopId());
				putQueryParameter("SecurityEvent." + (depth1 + 1) + ".SecurityEventId" , securityEvents.get(depth1).getSecurityEventId());
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

	public String getOperationParams() {
		return this.operationParams;
	}

	public void setOperationParams(String operationParams) {
		this.operationParams = operationParams;
		if(operationParams != null){
			putQueryParameter("OperationParams", operationParams);
		}
	}

	public static class SecurityEvent {

		private String desktopId;

		private String securityEventId;

		public String getDesktopId() {
			return this.desktopId;
		}

		public void setDesktopId(String desktopId) {
			this.desktopId = desktopId;
		}

		public String getSecurityEventId() {
			return this.securityEventId;
		}

		public void setSecurityEventId(String securityEventId) {
			this.securityEventId = securityEventId;
		}
	}

	@Override
	public Class<HandleSecurityEventsResponse> getResponseClass() {
		return HandleSecurityEventsResponse.class;
	}

}
