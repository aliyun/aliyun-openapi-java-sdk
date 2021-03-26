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
import com.aliyuncs.arms.transform.v20190808.ListPrometheusAlertTemplatesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListPrometheusAlertTemplatesResponse extends AcsResponse {

	private String requestId;

	private List<PrometheusAlertTemplate> prometheusAlertTemplates;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<PrometheusAlertTemplate> getPrometheusAlertTemplates() {
		return this.prometheusAlertTemplates;
	}

	public void setPrometheusAlertTemplates(List<PrometheusAlertTemplate> prometheusAlertTemplates) {
		this.prometheusAlertTemplates = prometheusAlertTemplates;
	}

	public static class PrometheusAlertTemplate {

		private String alertName;

		private String description;

		private String type;

		private String expression;

		private String duration;

		private String version;

		private List<Label> labels;

		private List<Annotation> annotations;

		public String getAlertName() {
			return this.alertName;
		}

		public void setAlertName(String alertName) {
			this.alertName = alertName;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getExpression() {
			return this.expression;
		}

		public void setExpression(String expression) {
			this.expression = expression;
		}

		public String getDuration() {
			return this.duration;
		}

		public void setDuration(String duration) {
			this.duration = duration;
		}

		public String getVersion() {
			return this.version;
		}

		public void setVersion(String version) {
			this.version = version;
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
	public ListPrometheusAlertTemplatesResponse getInstance(UnmarshallerContext context) {
		return	ListPrometheusAlertTemplatesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
