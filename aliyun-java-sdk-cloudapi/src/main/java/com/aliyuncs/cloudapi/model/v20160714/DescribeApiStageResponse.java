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

package com.aliyuncs.cloudapi.model.v20160714;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudapi.transform.v20160714.DescribeApiStageResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeApiStageResponse extends AcsResponse {

	private String requestId;

	private String groupId;

	private String stageId;

	private String stageName;

	private String description;

	private String createdTime;

	private String modifiedTime;

	private List<VariableItem> variables;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getGroupId() {
		return this.groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getStageId() {
		return this.stageId;
	}

	public void setStageId(String stageId) {
		this.stageId = stageId;
	}

	public String getStageName() {
		return this.stageName;
	}

	public void setStageName(String stageName) {
		this.stageName = stageName;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCreatedTime() {
		return this.createdTime;
	}

	public void setCreatedTime(String createdTime) {
		this.createdTime = createdTime;
	}

	public String getModifiedTime() {
		return this.modifiedTime;
	}

	public void setModifiedTime(String modifiedTime) {
		this.modifiedTime = modifiedTime;
	}

	public List<VariableItem> getVariables() {
		return this.variables;
	}

	public void setVariables(List<VariableItem> variables) {
		this.variables = variables;
	}

	public static class VariableItem {

		private String variableName;

		private String variableValue;

		private Boolean supportRoute;

		private StageRouteModel stageRouteModel;

		public String getVariableName() {
			return this.variableName;
		}

		public void setVariableName(String variableName) {
			this.variableName = variableName;
		}

		public String getVariableValue() {
			return this.variableValue;
		}

		public void setVariableValue(String variableValue) {
			this.variableValue = variableValue;
		}

		public Boolean getSupportRoute() {
			return this.supportRoute;
		}

		public void setSupportRoute(Boolean supportRoute) {
			this.supportRoute = supportRoute;
		}

		public StageRouteModel getStageRouteModel() {
			return this.stageRouteModel;
		}

		public void setStageRouteModel(StageRouteModel stageRouteModel) {
			this.stageRouteModel = stageRouteModel;
		}

		public static class StageRouteModel {

			private String parameterCatalog;

			private String serviceParameterName;

			private String location;

			private String parameterType;

			private String routeMatchSymbol;

			private List<RouteRuleItem> routeRules;

			public String getParameterCatalog() {
				return this.parameterCatalog;
			}

			public void setParameterCatalog(String parameterCatalog) {
				this.parameterCatalog = parameterCatalog;
			}

			public String getServiceParameterName() {
				return this.serviceParameterName;
			}

			public void setServiceParameterName(String serviceParameterName) {
				this.serviceParameterName = serviceParameterName;
			}

			public String getLocation() {
				return this.location;
			}

			public void setLocation(String location) {
				this.location = location;
			}

			public String getParameterType() {
				return this.parameterType;
			}

			public void setParameterType(String parameterType) {
				this.parameterType = parameterType;
			}

			public String getRouteMatchSymbol() {
				return this.routeMatchSymbol;
			}

			public void setRouteMatchSymbol(String routeMatchSymbol) {
				this.routeMatchSymbol = routeMatchSymbol;
			}

			public List<RouteRuleItem> getRouteRules() {
				return this.routeRules;
			}

			public void setRouteRules(List<RouteRuleItem> routeRules) {
				this.routeRules = routeRules;
			}

			public static class RouteRuleItem {

				private Long maxValue;

				private Long minValue;

				private String conditionValue;

				private String resultValue;

				public Long getMaxValue() {
					return this.maxValue;
				}

				public void setMaxValue(Long maxValue) {
					this.maxValue = maxValue;
				}

				public Long getMinValue() {
					return this.minValue;
				}

				public void setMinValue(Long minValue) {
					this.minValue = minValue;
				}

				public String getConditionValue() {
					return this.conditionValue;
				}

				public void setConditionValue(String conditionValue) {
					this.conditionValue = conditionValue;
				}

				public String getResultValue() {
					return this.resultValue;
				}

				public void setResultValue(String resultValue) {
					this.resultValue = resultValue;
				}
			}
		}
	}

	@Override
	public DescribeApiStageResponse getInstance(UnmarshallerContext context) {
		return	DescribeApiStageResponseUnmarshaller.unmarshall(this, context);
	}
}
