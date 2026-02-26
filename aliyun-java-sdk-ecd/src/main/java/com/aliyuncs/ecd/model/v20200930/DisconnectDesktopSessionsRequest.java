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
public class DisconnectDesktopSessionsRequest extends RpcAcsRequest<DisconnectDesktopSessionsResponse> {
	   

	private Boolean preCheck;

	private List<Sessions> sessionss;
	public DisconnectDesktopSessionsRequest() {
		super("ecd", "2020-09-30", "DisconnectDesktopSessions", "gwsecd");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getPreCheck() {
		return this.preCheck;
	}

	public void setPreCheck(Boolean preCheck) {
		this.preCheck = preCheck;
		if(preCheck != null){
			putQueryParameter("PreCheck", preCheck.toString());
		}
	}

	public List<Sessions> getSessionss() {
		return this.sessionss;
	}

	public void setSessionss(List<Sessions> sessionss) {
		this.sessionss = sessionss;	
		if (sessionss != null) {
			for (int depth1 = 0; depth1 < sessionss.size(); depth1++) {
				putQueryParameter("Sessions." + (depth1 + 1) + ".EndUserId" , sessionss.get(depth1).getEndUserId());
				putQueryParameter("Sessions." + (depth1 + 1) + ".DesktopId" , sessionss.get(depth1).getDesktopId());
			}
		}	
	}

	public static class Sessions {

		private String endUserId;

		private String desktopId;

		public String getEndUserId() {
			return this.endUserId;
		}

		public void setEndUserId(String endUserId) {
			this.endUserId = endUserId;
		}

		public String getDesktopId() {
			return this.desktopId;
		}

		public void setDesktopId(String desktopId) {
			this.desktopId = desktopId;
		}
	}

	@Override
	public Class<DisconnectDesktopSessionsResponse> getResponseClass() {
		return DisconnectDesktopSessionsResponse.class;
	}

}
