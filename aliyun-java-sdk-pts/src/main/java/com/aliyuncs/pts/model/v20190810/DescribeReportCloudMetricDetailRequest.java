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

package com.aliyuncs.pts.model.v20190810;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.pts.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeReportCloudMetricDetailRequest extends RpcAcsRequest<DescribeReportCloudMetricDetailResponse> {
	   

	private Long endTime;

	private Long beginTime;

	private String groupIds;

	private String metrics;

	private String instanceIdAndPortList;
	public DescribeReportCloudMetricDetailRequest() {
		super("PTS", "2019-08-10", "DescribeReportCloudMetricDetail", "1.0.0");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Long endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putQueryParameter("EndTime", endTime.toString());
		}
	}

	public Long getBeginTime() {
		return this.beginTime;
	}

	public void setBeginTime(Long beginTime) {
		this.beginTime = beginTime;
		if(beginTime != null){
			putQueryParameter("BeginTime", beginTime.toString());
		}
	}

	public String getGroupIds() {
		return this.groupIds;
	}

	public void setGroupIds(String groupIds) {
		this.groupIds = groupIds;
		if(groupIds != null){
			putQueryParameter("GroupIds", groupIds);
		}
	}

	public String getMetrics() {
		return this.metrics;
	}

	public void setMetrics(String metrics) {
		this.metrics = metrics;
		if(metrics != null){
			putQueryParameter("Metrics", metrics);
		}
	}

	public String getInstanceIdAndPortList() {
		return this.instanceIdAndPortList;
	}

	public void setInstanceIdAndPortList(String instanceIdAndPortList) {
		this.instanceIdAndPortList = instanceIdAndPortList;
		if(instanceIdAndPortList != null){
			putQueryParameter("InstanceIdAndPortList", instanceIdAndPortList);
		}
	}

	@Override
	public Class<DescribeReportCloudMetricDetailResponse> getResponseClass() {
		return DescribeReportCloudMetricDetailResponse.class;
	}

}
