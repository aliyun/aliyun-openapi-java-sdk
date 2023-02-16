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

package com.aliyuncs.adb.model.v20190315;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.adb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeDiagnosisSQLInfoRequest extends RpcAcsRequest<DescribeDiagnosisSQLInfoResponse> {
	   

	private String dBClusterId;

	private String processState;

	private Long processStartTime;

	private String processId;

	private String processRcHost;

	private String lang;
	public DescribeDiagnosisSQLInfoRequest() {
		super("adb", "2019-03-15", "DescribeDiagnosisSQLInfo", "ads");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDBClusterId() {
		return this.dBClusterId;
	}

	public void setDBClusterId(String dBClusterId) {
		this.dBClusterId = dBClusterId;
		if(dBClusterId != null){
			putQueryParameter("DBClusterId", dBClusterId);
		}
	}

	public String getProcessState() {
		return this.processState;
	}

	public void setProcessState(String processState) {
		this.processState = processState;
		if(processState != null){
			putQueryParameter("ProcessState", processState);
		}
	}

	public Long getProcessStartTime() {
		return this.processStartTime;
	}

	public void setProcessStartTime(Long processStartTime) {
		this.processStartTime = processStartTime;
		if(processStartTime != null){
			putQueryParameter("ProcessStartTime", processStartTime.toString());
		}
	}

	public String getProcessId() {
		return this.processId;
	}

	public void setProcessId(String processId) {
		this.processId = processId;
		if(processId != null){
			putQueryParameter("ProcessId", processId);
		}
	}

	public String getProcessRcHost() {
		return this.processRcHost;
	}

	public void setProcessRcHost(String processRcHost) {
		this.processRcHost = processRcHost;
		if(processRcHost != null){
			putQueryParameter("ProcessRcHost", processRcHost);
		}
	}

	public String getLang() {
		return this.lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
		if(lang != null){
			putQueryParameter("Lang", lang);
		}
	}

	@Override
	public Class<DescribeDiagnosisSQLInfoResponse> getResponseClass() {
		return DescribeDiagnosisSQLInfoResponse.class;
	}

}
