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
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.arms.transform.v20190808.CreateAlertTemplateResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateAlertTemplateResponse extends AcsResponse {

	private String requestId;

	private AlertTemplate alertTemplate;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public AlertTemplate getAlertTemplate() {
		return this.alertTemplate;
	}

	public void setAlertTemplate(AlertTemplate alertTemplate) {
		this.alertTemplate = alertTemplate;
	}

	public static class AlertTemplate {

		private Integer id;

		private Integer parentId;

		private String name;

		private String message;

		private String alertProvider;

		private String templateProvider;

		private String type;

		private Map<Object,Object> labels;

		private Map<Object,Object> annotations;

		private String rule;

		private String userId;

		private Boolean status;

		private Boolean _public;

		private LabelMatchExpressionGrid labelMatchExpressionGrid;

		public Integer getId() {
			return this.id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public Integer getParentId() {
			return this.parentId;
		}

		public void setParentId(Integer parentId) {
			this.parentId = parentId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getMessage() {
			return this.message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public String getAlertProvider() {
			return this.alertProvider;
		}

		public void setAlertProvider(String alertProvider) {
			this.alertProvider = alertProvider;
		}

		public String getTemplateProvider() {
			return this.templateProvider;
		}

		public void setTemplateProvider(String templateProvider) {
			this.templateProvider = templateProvider;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public Map<Object,Object> getLabels() {
			return this.labels;
		}

		public void setLabels(Map<Object,Object> labels) {
			this.labels = labels;
		}

		public Map<Object,Object> getAnnotations() {
			return this.annotations;
		}

		public void setAnnotations(Map<Object,Object> annotations) {
			this.annotations = annotations;
		}

		public String getRule() {
			return this.rule;
		}

		public void setRule(String rule) {
			this.rule = rule;
		}

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public Boolean getStatus() {
			return this.status;
		}

		public void setStatus(Boolean status) {
			this.status = status;
		}

		public Boolean get_Public() {
			return this._public;
		}

		public void set_Public(Boolean _public) {
			this._public = _public;
		}

		public LabelMatchExpressionGrid getLabelMatchExpressionGrid() {
			return this.labelMatchExpressionGrid;
		}

		public void setLabelMatchExpressionGrid(LabelMatchExpressionGrid labelMatchExpressionGrid) {
			this.labelMatchExpressionGrid = labelMatchExpressionGrid;
		}

		public static class LabelMatchExpressionGrid {

			private List<LabelMatchExpressionGroup> labelMatchExpressionGroups;

			public List<LabelMatchExpressionGroup> getLabelMatchExpressionGroups() {
				return this.labelMatchExpressionGroups;
			}

			public void setLabelMatchExpressionGroups(List<LabelMatchExpressionGroup> labelMatchExpressionGroups) {
				this.labelMatchExpressionGroups = labelMatchExpressionGroups;
			}

			public static class LabelMatchExpressionGroup {

				private List<LabelMatchExpression> labelMatchExpressions;

				public List<LabelMatchExpression> getLabelMatchExpressions() {
					return this.labelMatchExpressions;
				}

				public void setLabelMatchExpressions(List<LabelMatchExpression> labelMatchExpressions) {
					this.labelMatchExpressions = labelMatchExpressions;
				}

				public static class LabelMatchExpression {

					private String key;

					private String value;

					private String operator;

					public String getKey() {
						return this.key;
					}

					public void setKey(String key) {
						this.key = key;
					}

					public String getValue() {
						return this.value;
					}

					public void setValue(String value) {
						this.value = value;
					}

					public String getOperator() {
						return this.operator;
					}

					public void setOperator(String operator) {
						this.operator = operator;
					}
				}
			}
		}
	}

	@Override
	public CreateAlertTemplateResponse getInstance(UnmarshallerContext context) {
		return	CreateAlertTemplateResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
