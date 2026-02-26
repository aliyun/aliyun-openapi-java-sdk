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

package com.aliyuncs.rds.model.v20140815;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.rds.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeHistoryEventsStatRequest extends RpcAcsRequest<DescribeHistoryEventsStatResponse> {
	   

	private String toStartTime;

	private String securityToken;

	private String fromStartTime;

	private String archiveStatus;
	public DescribeHistoryEventsStatRequest() {
		super("Rds", "2014-08-15", "DescribeHistoryEventsStat", "rds");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getToStartTime() {
		return this.toStartTime;
	}

	public void setToStartTime(String toStartTime) {
		this.toStartTime = toStartTime;
		if(toStartTime != null){
			putQueryParameter("ToStartTime", toStartTime);
		}
	}

	public String getSecurityToken() {
		return this.securityToken;
	}

	public void setSecurityToken(String securityToken) {
		this.securityToken = securityToken;
		if(securityToken != null){
			putQueryParameter("SecurityToken", securityToken);
		}
	}

	public String getFromStartTime() {
		return this.fromStartTime;
	}

	public void setFromStartTime(String fromStartTime) {
		this.fromStartTime = fromStartTime;
		if(fromStartTime != null){
			putQueryParameter("FromStartTime", fromStartTime);
		}
	}

	public String getArchiveStatus() {
		return this.archiveStatus;
	}

	public void setArchiveStatus(String archiveStatus) {
		this.archiveStatus = archiveStatus;
		if(archiveStatus != null){
			putQueryParameter("ArchiveStatus", archiveStatus);
		}
	}

	@Override
	public Class<DescribeHistoryEventsStatResponse> getResponseClass() {
		return DescribeHistoryEventsStatResponse.class;
	}

}
