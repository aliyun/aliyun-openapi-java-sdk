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

package com.aliyuncs.sae.model.v20190506;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sae.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetChangeOrderMetricRequest extends RoaAcsRequest<GetChangeOrderMetricResponse> {
	   

	private String appSource;

	private String createTime;

	private String cpuStrategy;

	private Long limit;

	private String orderBy;
	public GetChangeOrderMetricRequest() {
		super("sae", "2019-05-06", "GetChangeOrderMetric", "serverless");
		setUriPattern("/pop/v1/sam/getChangeOrderMetric");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getAppSource() {
		return this.appSource;
	}

	public void setAppSource(String appSource) {
		this.appSource = appSource;
		if(appSource != null){
			putQueryParameter("AppSource", appSource);
		}
	}

	public String getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
		if(createTime != null){
			putQueryParameter("CreateTime", createTime);
		}
	}

	public String getCpuStrategy() {
		return this.cpuStrategy;
	}

	public void setCpuStrategy(String cpuStrategy) {
		this.cpuStrategy = cpuStrategy;
		if(cpuStrategy != null){
			putQueryParameter("CpuStrategy", cpuStrategy);
		}
	}

	public Long getLimit() {
		return this.limit;
	}

	public void setLimit(Long limit) {
		this.limit = limit;
		if(limit != null){
			putQueryParameter("Limit", limit.toString());
		}
	}

	public String getOrderBy() {
		return this.orderBy;
	}

	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
		if(orderBy != null){
			putQueryParameter("OrderBy", orderBy);
		}
	}

	@Override
	public Class<GetChangeOrderMetricResponse> getResponseClass() {
		return GetChangeOrderMetricResponse.class;
	}

}
