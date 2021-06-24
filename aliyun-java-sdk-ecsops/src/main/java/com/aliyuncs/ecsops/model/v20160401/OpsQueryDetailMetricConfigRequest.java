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

package com.aliyuncs.ecsops.model.v20160401;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class OpsQueryDetailMetricConfigRequest extends RpcAcsRequest<OpsQueryDetailMetricConfigResponse> {
	   

	private String chooseAggregationMetric;

	private String metricName;

	private String auditParamStr;
	public OpsQueryDetailMetricConfigRequest() {
		super("Ecsops", "2016-04-01", "OpsQueryDetailMetricConfig", "ecsops");
		setMethod(MethodType.POST);
	}

	public String getChooseAggregationMetric() {
		return this.chooseAggregationMetric;
	}

	public void setChooseAggregationMetric(String chooseAggregationMetric) {
		this.chooseAggregationMetric = chooseAggregationMetric;
		if(chooseAggregationMetric != null){
			putQueryParameter("ChooseAggregationMetric", chooseAggregationMetric);
		}
	}

	public String getMetricName() {
		return this.metricName;
	}

	public void setMetricName(String metricName) {
		this.metricName = metricName;
		if(metricName != null){
			putQueryParameter("MetricName", metricName);
		}
	}

	public String getAuditParamStr() {
		return this.auditParamStr;
	}

	public void setAuditParamStr(String auditParamStr) {
		this.auditParamStr = auditParamStr;
		if(auditParamStr != null){
			putQueryParameter("AuditParamStr", auditParamStr);
		}
	}

	@Override
	public Class<OpsQueryDetailMetricConfigResponse> getResponseClass() {
		return OpsQueryDetailMetricConfigResponse.class;
	}

}
