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

package com.aliyuncs.ehpc.model.v20180412;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ehpc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class RunCloudMetricProfilingRequest extends RpcAcsRequest<RunCloudMetricProfilingResponse> {
	   

	private Integer freq;

	private String clusterId;

	private Integer duration;

	private String hostName;

	private Integer processId;
	public RunCloudMetricProfilingRequest() {
		super("EHPC", "2018-04-12", "RunCloudMetricProfiling", "ehs");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getFreq() {
		return this.freq;
	}

	public void setFreq(Integer freq) {
		this.freq = freq;
		if(freq != null){
			putQueryParameter("Freq", freq.toString());
		}
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		if(clusterId != null){
			putQueryParameter("ClusterId", clusterId);
		}
	}

	public Integer getDuration() {
		return this.duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
		if(duration != null){
			putQueryParameter("Duration", duration.toString());
		}
	}

	public String getHostName() {
		return this.hostName;
	}

	public void setHostName(String hostName) {
		this.hostName = hostName;
		if(hostName != null){
			putQueryParameter("HostName", hostName);
		}
	}

	public Integer getProcessId() {
		return this.processId;
	}

	public void setProcessId(Integer processId) {
		this.processId = processId;
		if(processId != null){
			putQueryParameter("ProcessId", processId.toString());
		}
	}

	@Override
	public Class<RunCloudMetricProfilingResponse> getResponseClass() {
		return RunCloudMetricProfilingResponse.class;
	}

}
