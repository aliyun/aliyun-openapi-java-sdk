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

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeDSTTimeSeriesMetricsRequest extends RpcAcsRequest<DescribeDSTTimeSeriesMetricsResponse> {
	   

	private Long startTime;

	private String type;

	private String aggregator;

	private Long endTime;

	private List<Tags> tagss;

	private String instanceId;

	private List<Metrics> metricss;
	public DescribeDSTTimeSeriesMetricsRequest() {
		super("SOFA", "2019-08-15", "DescribeDSTTimeSeriesMetrics", "ApplySidecarCert");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Long startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putBodyParameter("StartTime", startTime.toString());
		}
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putBodyParameter("Type", type);
		}
	}

	public String getAggregator() {
		return this.aggregator;
	}

	public void setAggregator(String aggregator) {
		this.aggregator = aggregator;
		if(aggregator != null){
			putBodyParameter("Aggregator", aggregator);
		}
	}

	public Long getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Long endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putBodyParameter("EndTime", endTime.toString());
		}
	}

	public List<Tags> getTagss() {
		return this.tagss;
	}

	public void setTagss(List<Tags> tagss) {
		this.tagss = tagss;	
		if (tagss != null) {
			for (int depth1 = 0; depth1 < tagss.size(); depth1++) {
				putBodyParameter("Tags." + (depth1 + 1) + ".Value" , tagss.get(depth1).getValue());
				putBodyParameter("Tags." + (depth1 + 1) + ".Key" , tagss.get(depth1).getKey());
			}
		}	
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putBodyParameter("InstanceId", instanceId);
		}
	}

	public List<Metrics> getMetricss() {
		return this.metricss;
	}

	public void setMetricss(List<Metrics> metricss) {
		this.metricss = metricss;	
		if (metricss != null) {
			for (int depth1 = 0; depth1 < metricss.size(); depth1++) {
				putBodyParameter("Metrics." + (depth1 + 1) + ".Value" , metricss.get(depth1).getValue());
			}
		}	
	}

	public static class Tags {

		private String value;

		private String key;

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}
	}

	public static class Metrics {

		private String value;

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}
	}

	@Override
	public Class<DescribeDSTTimeSeriesMetricsResponse> getResponseClass() {
		return DescribeDSTTimeSeriesMetricsResponse.class;
	}

}
