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

package com.aliyuncs.dataworks_public.model.v20180601;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataworks_public.transform.v20180601.StartCollectQualityResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class StartCollectQualityResponse extends AcsResponse {

	private String returnCode;

	private String requestId;

	private List<ReturnValueItem> returnValue;

	public String getReturnCode() {
		return this.returnCode;
	}

	public void setReturnCode(String returnCode) {
		this.returnCode = returnCode;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ReturnValueItem> getReturnValue() {
		return this.returnValue;
	}

	public void setReturnValue(List<ReturnValueItem> returnValue) {
		this.returnValue = returnValue;
	}

	public static class ReturnValueItem {

		private String actualExpression;

		private String bizDate;

		private String callbackUrl;

		private String connection;

		private Long entityId;

		private String matchExpression;

		private String pluginName;

		private String tableGuid;

		private String taskId;

		private List<StrongMethodSetItem> strongMethodSet;

		private List<WeakMethodSetItem> weakMethodSet;

		public String getActualExpression() {
			return this.actualExpression;
		}

		public void setActualExpression(String actualExpression) {
			this.actualExpression = actualExpression;
		}

		public String getBizDate() {
			return this.bizDate;
		}

		public void setBizDate(String bizDate) {
			this.bizDate = bizDate;
		}

		public String getCallbackUrl() {
			return this.callbackUrl;
		}

		public void setCallbackUrl(String callbackUrl) {
			this.callbackUrl = callbackUrl;
		}

		public String getConnection() {
			return this.connection;
		}

		public void setConnection(String connection) {
			this.connection = connection;
		}

		public Long getEntityId() {
			return this.entityId;
		}

		public void setEntityId(Long entityId) {
			this.entityId = entityId;
		}

		public String getMatchExpression() {
			return this.matchExpression;
		}

		public void setMatchExpression(String matchExpression) {
			this.matchExpression = matchExpression;
		}

		public String getPluginName() {
			return this.pluginName;
		}

		public void setPluginName(String pluginName) {
			this.pluginName = pluginName;
		}

		public String getTableGuid() {
			return this.tableGuid;
		}

		public void setTableGuid(String tableGuid) {
			this.tableGuid = tableGuid;
		}

		public String getTaskId() {
			return this.taskId;
		}

		public void setTaskId(String taskId) {
			this.taskId = taskId;
		}

		public List<StrongMethodSetItem> getStrongMethodSet() {
			return this.strongMethodSet;
		}

		public void setStrongMethodSet(List<StrongMethodSetItem> strongMethodSet) {
			this.strongMethodSet = strongMethodSet;
		}

		public List<WeakMethodSetItem> getWeakMethodSet() {
			return this.weakMethodSet;
		}

		public void setWeakMethodSet(List<WeakMethodSetItem> weakMethodSet) {
			this.weakMethodSet = weakMethodSet;
		}

		public static class StrongMethodSetItem {

			private String colName;

			private Boolean isColRule;

			private Boolean isSqlRule;

			private Boolean isStrongRule;

			private String methodName;

			private Long ruleId;

			public String getColName() {
				return this.colName;
			}

			public void setColName(String colName) {
				this.colName = colName;
			}

			public Boolean getIsColRule() {
				return this.isColRule;
			}

			public void setIsColRule(Boolean isColRule) {
				this.isColRule = isColRule;
			}

			public Boolean getIsSqlRule() {
				return this.isSqlRule;
			}

			public void setIsSqlRule(Boolean isSqlRule) {
				this.isSqlRule = isSqlRule;
			}

			public Boolean getIsStrongRule() {
				return this.isStrongRule;
			}

			public void setIsStrongRule(Boolean isStrongRule) {
				this.isStrongRule = isStrongRule;
			}

			public String getMethodName() {
				return this.methodName;
			}

			public void setMethodName(String methodName) {
				this.methodName = methodName;
			}

			public Long getRuleId() {
				return this.ruleId;
			}

			public void setRuleId(Long ruleId) {
				this.ruleId = ruleId;
			}
		}

		public static class WeakMethodSetItem {

			private String colName;

			private Boolean isColRule;

			private Boolean isSqlRule;

			private Boolean isStrongRule;

			private String methodName;

			private Long ruleId;

			public String getColName() {
				return this.colName;
			}

			public void setColName(String colName) {
				this.colName = colName;
			}

			public Boolean getIsColRule() {
				return this.isColRule;
			}

			public void setIsColRule(Boolean isColRule) {
				this.isColRule = isColRule;
			}

			public Boolean getIsSqlRule() {
				return this.isSqlRule;
			}

			public void setIsSqlRule(Boolean isSqlRule) {
				this.isSqlRule = isSqlRule;
			}

			public Boolean getIsStrongRule() {
				return this.isStrongRule;
			}

			public void setIsStrongRule(Boolean isStrongRule) {
				this.isStrongRule = isStrongRule;
			}

			public String getMethodName() {
				return this.methodName;
			}

			public void setMethodName(String methodName) {
				this.methodName = methodName;
			}

			public Long getRuleId() {
				return this.ruleId;
			}

			public void setRuleId(Long ruleId) {
				this.ruleId = ruleId;
			}
		}
	}

	@Override
	public StartCollectQualityResponse getInstance(UnmarshallerContext context) {
		return	StartCollectQualityResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
