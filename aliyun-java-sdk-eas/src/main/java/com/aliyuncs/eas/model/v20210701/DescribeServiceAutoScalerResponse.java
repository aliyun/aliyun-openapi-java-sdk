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

package com.aliyuncs.eas.model.v20210701;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.eas.transform.v20210701.DescribeServiceAutoScalerResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeServiceAutoScalerResponse extends AcsResponse {

	private String requestId;

	private String serviceName;

	private Integer minReplica;

	private Integer maxReplica;

	private Map<Object,Object> behavior;

	private List<ScaleStrategy> scaleStrategies;

	private List<CurrentMetric> currentMetrics;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getServiceName() {
		return this.serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public Integer getMinReplica() {
		return this.minReplica;
	}

	public void setMinReplica(Integer minReplica) {
		this.minReplica = minReplica;
	}

	public Integer getMaxReplica() {
		return this.maxReplica;
	}

	public void setMaxReplica(Integer maxReplica) {
		this.maxReplica = maxReplica;
	}

	public Map<Object,Object> getBehavior() {
		return this.behavior;
	}

	public void setBehavior(Map<Object,Object> behavior) {
		this.behavior = behavior;
	}

	public List<ScaleStrategy> getScaleStrategies() {
		return this.scaleStrategies;
	}

	public void setScaleStrategies(List<ScaleStrategy> scaleStrategies) {
		this.scaleStrategies = scaleStrategies;
	}

	public List<CurrentMetric> getCurrentMetrics() {
		return this.currentMetrics;
	}

	public void setCurrentMetrics(List<CurrentMetric> currentMetrics) {
		this.currentMetrics = currentMetrics;
	}

	public static class ScaleStrategy {

		private String metricName;

		private Float threshold;

		private String service;

		public String getMetricName() {
			return this.metricName;
		}

		public void setMetricName(String metricName) {
			this.metricName = metricName;
		}

		public Float getThreshold() {
			return this.threshold;
		}

		public void setThreshold(Float threshold) {
			this.threshold = threshold;
		}

		public String getService() {
			return this.service;
		}

		public void setService(String service) {
			this.service = service;
		}
	}

	public static class CurrentMetric {

		private String metricName;

		private Float value;

		private String service;

		public String getMetricName() {
			return this.metricName;
		}

		public void setMetricName(String metricName) {
			this.metricName = metricName;
		}

		public Float getValue() {
			return this.value;
		}

		public void setValue(Float value) {
			this.value = value;
		}

		public String getService() {
			return this.service;
		}

		public void setService(String service) {
			this.service = service;
		}
	}

	@Override
	public DescribeServiceAutoScalerResponse getInstance(UnmarshallerContext context) {
		return	DescribeServiceAutoScalerResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
