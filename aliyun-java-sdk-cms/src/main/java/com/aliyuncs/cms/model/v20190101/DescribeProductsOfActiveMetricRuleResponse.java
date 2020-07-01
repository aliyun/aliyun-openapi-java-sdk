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

package com.aliyuncs.cms.model.v20190101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cms.transform.v20190101.DescribeProductsOfActiveMetricRuleResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeProductsOfActiveMetricRuleResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Integer code;

	private String message;

	private String datapoints;

	private List<AllProductInitMetricRule> allProductInitMetricRuleList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDatapoints() {
		return this.datapoints;
	}

	public void setDatapoints(String datapoints) {
		this.datapoints = datapoints;
	}

	public List<AllProductInitMetricRule> getAllProductInitMetricRuleList() {
		return this.allProductInitMetricRuleList;
	}

	public void setAllProductInitMetricRuleList(List<AllProductInitMetricRule> allProductInitMetricRuleList) {
		this.allProductInitMetricRuleList = allProductInitMetricRuleList;
	}

	public static class AllProductInitMetricRule {

		private String product;

		private List<AlertInitConfig> alertInitConfigList;

		public String getProduct() {
			return this.product;
		}

		public void setProduct(String product) {
			this.product = product;
		}

		public List<AlertInitConfig> getAlertInitConfigList() {
			return this.alertInitConfigList;
		}

		public void setAlertInitConfigList(List<AlertInitConfig> alertInitConfigList) {
			this.alertInitConfigList = alertInitConfigList;
		}

		public static class AlertInitConfig {

			private String namespace;

			private String metricName;

			private String statistics;

			private String evaluationCount;

			private String threshold;

			private String period;

			public String getNamespace() {
				return this.namespace;
			}

			public void setNamespace(String namespace) {
				this.namespace = namespace;
			}

			public String getMetricName() {
				return this.metricName;
			}

			public void setMetricName(String metricName) {
				this.metricName = metricName;
			}

			public String getStatistics() {
				return this.statistics;
			}

			public void setStatistics(String statistics) {
				this.statistics = statistics;
			}

			public String getEvaluationCount() {
				return this.evaluationCount;
			}

			public void setEvaluationCount(String evaluationCount) {
				this.evaluationCount = evaluationCount;
			}

			public String getThreshold() {
				return this.threshold;
			}

			public void setThreshold(String threshold) {
				this.threshold = threshold;
			}

			public String getPeriod() {
				return this.period;
			}

			public void setPeriod(String period) {
				this.period = period;
			}
		}
	}

	@Override
	public DescribeProductsOfActiveMetricRuleResponse getInstance(UnmarshallerContext context) {
		return	DescribeProductsOfActiveMetricRuleResponseUnmarshaller.unmarshall(this, context);
	}
}
