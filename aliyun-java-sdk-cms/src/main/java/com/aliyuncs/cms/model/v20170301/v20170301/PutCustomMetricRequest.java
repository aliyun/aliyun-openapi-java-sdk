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
package com.aliyuncs.cms.model.v20170301;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class PutCustomMetricRequest extends RpcAcsRequest<PutCustomMetricResponse> {
	
	public PutCustomMetricRequest() {
		super("Cms", "2017-03-01", "PutCustomMetric", "cms");
	}

	private String metricList;

	public String getMetricList() {
		return this.metricList;
	}

	public void setMetricList(String metricList) {
		this.metricList = metricList;
		if(metricList != null){
			putQueryParameter("MetricList", metricList);
		}
	}

	@Override
	public Class<PutCustomMetricResponse> getResponseClass() {
		return PutCustomMetricResponse.class;
	}

}
