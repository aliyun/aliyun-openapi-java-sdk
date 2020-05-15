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

package com.aliyuncs.voicenavigator.model.v20180612;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.voicenavigator.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeStatisticalDataRequest extends RpcAcsRequest<DescribeStatisticalDataResponse> {
	   

	private Long beginTimeLeftRange;

	private String timeUnit;

	private String instanceId;

	private Long beginTimeRightRange;
	public DescribeStatisticalDataRequest() {
		super("VoiceNavigator", "2018-06-12", "DescribeStatisticalData", "voicebot");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getBeginTimeLeftRange() {
		return this.beginTimeLeftRange;
	}

	public void setBeginTimeLeftRange(Long beginTimeLeftRange) {
		this.beginTimeLeftRange = beginTimeLeftRange;
		if(beginTimeLeftRange != null){
			putQueryParameter("BeginTimeLeftRange", beginTimeLeftRange.toString());
		}
	}

	public String getTimeUnit() {
		return this.timeUnit;
	}

	public void setTimeUnit(String timeUnit) {
		this.timeUnit = timeUnit;
		if(timeUnit != null){
			putQueryParameter("TimeUnit", timeUnit);
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

	public Long getBeginTimeRightRange() {
		return this.beginTimeRightRange;
	}

	public void setBeginTimeRightRange(Long beginTimeRightRange) {
		this.beginTimeRightRange = beginTimeRightRange;
		if(beginTimeRightRange != null){
			putQueryParameter("BeginTimeRightRange", beginTimeRightRange.toString());
		}
	}

	@Override
	public Class<DescribeStatisticalDataResponse> getResponseClass() {
		return DescribeStatisticalDataResponse.class;
	}

}
