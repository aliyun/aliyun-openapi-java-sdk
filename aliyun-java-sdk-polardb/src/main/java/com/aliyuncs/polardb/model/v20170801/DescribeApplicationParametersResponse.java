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

package com.aliyuncs.polardb.model.v20170801;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.polardb.transform.v20170801.DescribeApplicationParametersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeApplicationParametersResponse extends AcsResponse {

	private String requestId;

	private Parameters parameters;

	private ParameterTemplates parameterTemplates;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Parameters getParameters() {
		return this.parameters;
	}

	public void setParameters(Parameters parameters) {
		this.parameters = parameters;
	}

	public ParameterTemplates getParameterTemplates() {
		return this.parameterTemplates;
	}

	public void setParameterTemplates(ParameterTemplates parameterTemplates) {
		this.parameterTemplates = parameterTemplates;
	}

	public static class Parameters {

		private List<ComponentParameter> componentParameters;

		public List<ComponentParameter> getComponentParameters() {
			return this.componentParameters;
		}

		public void setComponentParameters(List<ComponentParameter> componentParameters) {
			this.componentParameters = componentParameters;
		}

		public static class ComponentParameter {

			private String componentType;

			private String componentId;

			private List<Parameter> parameters1;

			public String getComponentType() {
				return this.componentType;
			}

			public void setComponentType(String componentType) {
				this.componentType = componentType;
			}

			public String getComponentId() {
				return this.componentId;
			}

			public void setComponentId(String componentId) {
				this.componentId = componentId;
			}

			public List<Parameter> getParameters1() {
				return this.parameters1;
			}

			public void setParameters1(List<Parameter> parameters1) {
				this.parameters1 = parameters1;
			}

			public static class Parameter {

				private String status;

				private Boolean readOnly;

				private String pattern;

				private String type;

				private String description;

				private String value;

				private Boolean needRestart;

				private String _default;

				private String name;

				public String getStatus() {
					return this.status;
				}

				public void setStatus(String status) {
					this.status = status;
				}

				public Boolean getReadOnly() {
					return this.readOnly;
				}

				public void setReadOnly(Boolean readOnly) {
					this.readOnly = readOnly;
				}

				public String getPattern() {
					return this.pattern;
				}

				public void setPattern(String pattern) {
					this.pattern = pattern;
				}

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}

				public String getDescription() {
					return this.description;
				}

				public void setDescription(String description) {
					this.description = description;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}

				public Boolean getNeedRestart() {
					return this.needRestart;
				}

				public void setNeedRestart(Boolean needRestart) {
					this.needRestart = needRestart;
				}

				public String get_Default() {
					return this._default;
				}

				public void set_Default(String _default) {
					this._default = _default;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}
			}
		}
	}

	public static class ParameterTemplates {

		private List<ComponentParameterTemplate> componentParameterTemplates;

		public List<ComponentParameterTemplate> getComponentParameterTemplates() {
			return this.componentParameterTemplates;
		}

		public void setComponentParameterTemplates(List<ComponentParameterTemplate> componentParameterTemplates) {
			this.componentParameterTemplates = componentParameterTemplates;
		}

		public static class ComponentParameterTemplate {

			private String componentType;

			private String parameterTemplateId;

			private String componentId;

			private String parentParameterTemplateId;

			private List<Parameter3> parameters2;

			public String getComponentType() {
				return this.componentType;
			}

			public void setComponentType(String componentType) {
				this.componentType = componentType;
			}

			public String getParameterTemplateId() {
				return this.parameterTemplateId;
			}

			public void setParameterTemplateId(String parameterTemplateId) {
				this.parameterTemplateId = parameterTemplateId;
			}

			public String getComponentId() {
				return this.componentId;
			}

			public void setComponentId(String componentId) {
				this.componentId = componentId;
			}

			public String getParentParameterTemplateId() {
				return this.parentParameterTemplateId;
			}

			public void setParentParameterTemplateId(String parentParameterTemplateId) {
				this.parentParameterTemplateId = parentParameterTemplateId;
			}

			public List<Parameter3> getParameters2() {
				return this.parameters2;
			}

			public void setParameters2(List<Parameter3> parameters2) {
				this.parameters2 = parameters2;
			}

			public static class Parameter3 {

				private String pattern;

				private String type;

				private String description;

				private Boolean readOnly;

				private String _default;

				private String name;

				private Boolean needRestart;

				public String getPattern() {
					return this.pattern;
				}

				public void setPattern(String pattern) {
					this.pattern = pattern;
				}

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}

				public String getDescription() {
					return this.description;
				}

				public void setDescription(String description) {
					this.description = description;
				}

				public Boolean getReadOnly() {
					return this.readOnly;
				}

				public void setReadOnly(Boolean readOnly) {
					this.readOnly = readOnly;
				}

				public String get_Default() {
					return this._default;
				}

				public void set_Default(String _default) {
					this._default = _default;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public Boolean getNeedRestart() {
					return this.needRestart;
				}

				public void setNeedRestart(Boolean needRestart) {
					this.needRestart = needRestart;
				}
			}
		}
	}

	@Override
	public DescribeApplicationParametersResponse getInstance(UnmarshallerContext context) {
		return	DescribeApplicationParametersResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
