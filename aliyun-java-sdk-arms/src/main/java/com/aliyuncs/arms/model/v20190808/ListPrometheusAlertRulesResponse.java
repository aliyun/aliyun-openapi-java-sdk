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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.arms.transform.v20190808.ListPrometheusAlertRulesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListPrometheusAlertRulesResponse extends AcsResponse {

	private String requestId;

	private List<PrometheusAlertRule> prometheusAlertRules;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<PrometheusAlertRule> getPrometheusAlertRules() {
		return this.prometheusAlertRules;
	}

	public void setPrometheusAlertRules(List<PrometheusAlertRule> prometheusAlertRules) {
		this.prometheusAlertRules = prometheusAlertRules;
	}

	public static class PrometheusAlertRule {

		private Integer status;

		private String type;

		private String notifyType;

		private String expression;

		private String message;

		private String duration;

		private Long dispatchRuleId;

		private String alertName;

		private Long alertId;

		private String clusterId;

		private List<Label> labels;

		private List<Annotation> annotations;

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getNotifyType() {
			return this.notifyType;
		}

		public void setNotifyType(String notifyType) {
			this.notifyType = notifyType;
		}

		public String getExpression() {
			return this.expression;
		}

		public void setExpression(String expression) {
			this.expression = expression;
		}

		public String getMessage() {
			return this.message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public String getDuration() {
			return this.duration;
		}

		public void setDuration(String duration) {
			this.duration = duration;
		}

		public Long getDispatchRuleId() {
			return this.dispatchRuleId;
		}

		public void setDispatchRuleId(Long dispatchRuleId) {
			this.dispatchRuleId = dispatchRuleId;
		}

		public String getAlertName() {
			return this.alertName;
		}

		public void setAlertName(String alertName) {
			this.alertName = alertName;
		}

		public Long getAlertId() {
			return this.alertId;
		}

		public void setAlertId(Long alertId) {
			this.alertId = alertId;
		}

		public String getClusterId() {
			return this.clusterId;
		}

		public void setClusterId(String clusterId) {
			this.clusterId = clusterId;
		}

		public List<Label> getLabels() {
			return this.labels;
		}

		public void setLabels(List<Label> labels) {
			this.labels = labels;
		}

		public List<Annotation> getAnnotations() {
			return this.annotations;
		}

		public void setAnnotations(List<Annotation> annotations) {
			this.annotations = annotations;
		}

		public static class Label {

			private String name;

			private String value;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}
		}

		public static class Annotation {

			private String name;

			private String value;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}
		}
	}

	@Override
	public ListPrometheusAlertRulesResponse getInstance(UnmarshallerContext context) {
		return	ListPrometheusAlertRulesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
