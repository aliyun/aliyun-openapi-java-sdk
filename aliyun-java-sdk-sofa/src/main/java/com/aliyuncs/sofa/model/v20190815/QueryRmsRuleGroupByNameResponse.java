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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.QueryRmsRuleGroupByNameResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryRmsRuleGroupByNameResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private Response response;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public Response getResponse() {
		return this.response;
	}

	public void setResponse(Response response) {
		this.response = response;
	}

	public static class Response {

		private String layer;

		private Entity entity;

		public String getLayer() {
			return this.layer;
		}

		public void setLayer(String layer) {
			this.layer = layer;
		}

		public Entity getEntity() {
			return this.entity;
		}

		public void setEntity(Entity entity) {
			this.entity = entity;
		}

		public static class Entity {

			private List<DataItem> data;

			public List<DataItem> getData() {
				return this.data;
			}

			public void setData(List<DataItem> data) {
				this.data = data;
			}

			public static class DataItem {

				private String monitorItemType;

				private String monitorOptionKey;

				private Long monitorPort;

				private String statisticalMethod;

				private Long statisticalPeriod;

				private String triggerCountThreshold;

				private String triggerOperator;

				private Long triggerValueThreshold;

				public String getMonitorItemType() {
					return this.monitorItemType;
				}

				public void setMonitorItemType(String monitorItemType) {
					this.monitorItemType = monitorItemType;
				}

				public String getMonitorOptionKey() {
					return this.monitorOptionKey;
				}

				public void setMonitorOptionKey(String monitorOptionKey) {
					this.monitorOptionKey = monitorOptionKey;
				}

				public Long getMonitorPort() {
					return this.monitorPort;
				}

				public void setMonitorPort(Long monitorPort) {
					this.monitorPort = monitorPort;
				}

				public String getStatisticalMethod() {
					return this.statisticalMethod;
				}

				public void setStatisticalMethod(String statisticalMethod) {
					this.statisticalMethod = statisticalMethod;
				}

				public Long getStatisticalPeriod() {
					return this.statisticalPeriod;
				}

				public void setStatisticalPeriod(Long statisticalPeriod) {
					this.statisticalPeriod = statisticalPeriod;
				}

				public String getTriggerCountThreshold() {
					return this.triggerCountThreshold;
				}

				public void setTriggerCountThreshold(String triggerCountThreshold) {
					this.triggerCountThreshold = triggerCountThreshold;
				}

				public String getTriggerOperator() {
					return this.triggerOperator;
				}

				public void setTriggerOperator(String triggerOperator) {
					this.triggerOperator = triggerOperator;
				}

				public Long getTriggerValueThreshold() {
					return this.triggerValueThreshold;
				}

				public void setTriggerValueThreshold(Long triggerValueThreshold) {
					this.triggerValueThreshold = triggerValueThreshold;
				}
			}
		}
	}

	@Override
	public QueryRmsRuleGroupByNameResponse getInstance(UnmarshallerContext context) {
		return	QueryRmsRuleGroupByNameResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
