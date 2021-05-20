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

package com.aliyuncs.ens.model.v20171110;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DescribeEpnBandWidthDataRequest extends RpcAcsRequest<DescribeEpnBandWidthDataResponse> {
	   

	private String isp;

	private String startTime;

	private String ensRegionId;

	private String ePNInstanceId;

	private String period;

	private String instanceId;

	private String networkingModel;

	private String endTime;
	public DescribeEpnBandWidthDataRequest() {
		super("Ens", "2017-11-10", "DescribeEpnBandWidthData", "ens");
		setMethod(MethodType.POST);
	}

	public String getIsp() {
		return this.isp;
	}

	public void setIsp(String isp) {
		this.isp = isp;
		if(isp != null){
			putQueryParameter("Isp", isp);
		}
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putQueryParameter("StartTime", startTime);
		}
	}

	public String getEnsRegionId() {
		return this.ensRegionId;
	}

	public void setEnsRegionId(String ensRegionId) {
		this.ensRegionId = ensRegionId;
		if(ensRegionId != null){
			putQueryParameter("EnsRegionId", ensRegionId);
		}
	}

	public String getEPNInstanceId() {
		return this.ePNInstanceId;
	}

	public void setEPNInstanceId(String ePNInstanceId) {
		this.ePNInstanceId = ePNInstanceId;
		if(ePNInstanceId != null){
			putQueryParameter("EPNInstanceId", ePNInstanceId);
		}
	}

	public String getPeriod() {
		return this.period;
	}

	public void setPeriod(String period) {
		this.period = period;
		if(period != null){
			putQueryParameter("Period", period);
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

	public String getNetworkingModel() {
		return this.networkingModel;
	}

	public void setNetworkingModel(String networkingModel) {
		this.networkingModel = networkingModel;
		if(networkingModel != null){
			putQueryParameter("NetworkingModel", networkingModel);
		}
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putQueryParameter("EndTime", endTime);
		}
	}

	@Override
	public Class<DescribeEpnBandWidthDataResponse> getResponseClass() {
		return DescribeEpnBandWidthDataResponse.class;
	}

}
