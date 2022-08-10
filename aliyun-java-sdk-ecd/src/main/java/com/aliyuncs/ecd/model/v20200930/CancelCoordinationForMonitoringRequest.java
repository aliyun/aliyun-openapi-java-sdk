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
public class CancelCoordinationForMonitoringRequest extends RpcAcsRequest<CancelCoordinationForMonitoringResponse> {
	   

	private String userType;

	private List<String> coIdss;

	private String endUserId;
	public CancelCoordinationForMonitoringRequest() {
		super("ecd", "2020-09-30", "CancelCoordinationForMonitoring");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getUserType() {
		return this.userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
		if(userType != null){
			putQueryParameter("UserType", userType);
		}
	}

	public List<String> getCoIdss() {
		return this.coIdss;
	}

	public void setCoIdss(List<String> coIdss) {
		this.coIdss = coIdss;	
		if (coIdss != null) {
			for (int i = 0; i < coIdss.size(); i++) {
				putQueryParameter("CoIds." + (i + 1) , coIdss.get(i));
			}
		}	
	}

	public String getEndUserId() {
		return this.endUserId;
	}

	public void setEndUserId(String endUserId) {
		this.endUserId = endUserId;
		if(endUserId != null){
			putQueryParameter("EndUserId", endUserId);
		}
	}

	@Override
	public Class<CancelCoordinationForMonitoringResponse> getResponseClass() {
		return CancelCoordinationForMonitoringResponse.class;
	}

}
