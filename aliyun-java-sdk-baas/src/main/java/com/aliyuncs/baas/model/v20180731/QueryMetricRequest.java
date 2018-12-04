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

package com.aliyuncs.baas.model.v20180731;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class QueryMetricRequest extends RpcAcsRequest<QueryMetricResponse> {
	
	public QueryMetricRequest() {
		super("Baas", "2018-07-31", "QueryMetric");
	}

	private String period;

	private String metric;

	private String port;

	private String bizid;

	private String timeArea;

	private String innerIp;

	public String getPeriod() {
		return this.period;
	}

	public void setPeriod(String period) {
		this.period = period;
		if(period != null){
			putBodyParameter("Period", period);
		}
	}

	public String getMetric() {
		return this.metric;
	}

	public void setMetric(String metric) {
		this.metric = metric;
		if(metric != null){
			putBodyParameter("Metric", metric);
		}
	}

	public String getPort() {
		return this.port;
	}

	public void setPort(String port) {
		this.port = port;
		if(port != null){
			putBodyParameter("Port", port);
		}
	}

	public String getBizid() {
		return this.bizid;
	}

	public void setBizid(String bizid) {
		this.bizid = bizid;
		if(bizid != null){
			putQueryParameter("Bizid", bizid);
		}
	}

	public String getTimeArea() {
		return this.timeArea;
	}

	public void setTimeArea(String timeArea) {
		this.timeArea = timeArea;
		if(timeArea != null){
			putBodyParameter("TimeArea", timeArea);
		}
	}

	public String getInnerIp() {
		return this.innerIp;
	}

	public void setInnerIp(String innerIp) {
		this.innerIp = innerIp;
		if(innerIp != null){
			putBodyParameter("InnerIp", innerIp);
		}
	}

	@Override
	public Class<QueryMetricResponse> getResponseClass() {
		return QueryMetricResponse.class;
	}

}
