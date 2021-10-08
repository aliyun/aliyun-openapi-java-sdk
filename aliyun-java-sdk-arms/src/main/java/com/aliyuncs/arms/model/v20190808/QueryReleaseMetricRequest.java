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

package com.aliyuncs.arms.model.v20190808;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.arms.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class QueryReleaseMetricRequest extends RpcAcsRequest<QueryReleaseMetricResponse> {
	   

	private String changeOrderId;

	private String metricType;

	private Long createTime;

	private String pid;

	private String proxyUserId;

	private Long releaseEndTime;

	private String service;

	private Long releaseStartTime;
	public QueryReleaseMetricRequest() {
		super("ARMS", "2019-08-08", "QueryReleaseMetric", "arms");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getChangeOrderId() {
		return this.changeOrderId;
	}

	public void setChangeOrderId(String changeOrderId) {
		this.changeOrderId = changeOrderId;
		if(changeOrderId != null){
			putQueryParameter("ChangeOrderId", changeOrderId);
		}
	}

	public String getMetricType() {
		return this.metricType;
	}

	public void setMetricType(String metricType) {
		this.metricType = metricType;
		if(metricType != null){
			putQueryParameter("MetricType", metricType);
		}
	}

	public Long getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
		if(createTime != null){
			putQueryParameter("CreateTime", createTime.toString());
		}
	}

	public String getPid() {
		return this.pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
		if(pid != null){
			putQueryParameter("Pid", pid);
		}
	}

	public String getProxyUserId() {
		return this.proxyUserId;
	}

	public void setProxyUserId(String proxyUserId) {
		this.proxyUserId = proxyUserId;
		if(proxyUserId != null){
			putQueryParameter("ProxyUserId", proxyUserId);
		}
	}

	public Long getReleaseEndTime() {
		return this.releaseEndTime;
	}

	public void setReleaseEndTime(Long releaseEndTime) {
		this.releaseEndTime = releaseEndTime;
		if(releaseEndTime != null){
			putQueryParameter("ReleaseEndTime", releaseEndTime.toString());
		}
	}

	public String getService() {
		return this.service;
	}

	public void setService(String service) {
		this.service = service;
		if(service != null){
			putQueryParameter("Service", service);
		}
	}

	public Long getReleaseStartTime() {
		return this.releaseStartTime;
	}

	public void setReleaseStartTime(Long releaseStartTime) {
		this.releaseStartTime = releaseStartTime;
		if(releaseStartTime != null){
			putQueryParameter("ReleaseStartTime", releaseStartTime.toString());
		}
	}

	@Override
	public Class<QueryReleaseMetricResponse> getResponseClass() {
		return QueryReleaseMetricResponse.class;
	}

}
