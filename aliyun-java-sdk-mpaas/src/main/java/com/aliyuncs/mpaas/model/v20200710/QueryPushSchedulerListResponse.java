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

package com.aliyuncs.mpaas.model.v20200710;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.mpaas.transform.v20200710.QueryPushSchedulerListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryPushSchedulerListResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private ResultContent resultContent;

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

	public ResultContent getResultContent() {
		return this.resultContent;
	}

	public void setResultContent(ResultContent resultContent) {
		this.resultContent = resultContent;
	}

	public static class ResultContent {

		private Data data;

		public Data getData() {
			return this.data;
		}

		public void setData(Data data) {
			this.data = data;
		}

		public static class Data {

			private Integer totalCount;

			private List<ListItem> list;

			public Integer getTotalCount() {
				return this.totalCount;
			}

			public void setTotalCount(Integer totalCount) {
				this.totalCount = totalCount;
			}

			public List<ListItem> getList() {
				return this.list;
			}

			public void setList(List<ListItem> list) {
				this.list = list;
			}

			public static class ListItem {

				private String uniqueId;

				private Integer deliveryType;

				private String executedStatus;

				private Integer strategyType;

				private Integer type;

				private Long gmtCreate;

				private Long pushTime;

				private String pushTitle;

				private String pushContent;

				private Integer createType;

				public String getUniqueId() {
					return this.uniqueId;
				}

				public void setUniqueId(String uniqueId) {
					this.uniqueId = uniqueId;
				}

				public Integer getDeliveryType() {
					return this.deliveryType;
				}

				public void setDeliveryType(Integer deliveryType) {
					this.deliveryType = deliveryType;
				}

				public String getExecutedStatus() {
					return this.executedStatus;
				}

				public void setExecutedStatus(String executedStatus) {
					this.executedStatus = executedStatus;
				}

				public Integer getStrategyType() {
					return this.strategyType;
				}

				public void setStrategyType(Integer strategyType) {
					this.strategyType = strategyType;
				}

				public Integer getType() {
					return this.type;
				}

				public void setType(Integer type) {
					this.type = type;
				}

				public Long getGmtCreate() {
					return this.gmtCreate;
				}

				public void setGmtCreate(Long gmtCreate) {
					this.gmtCreate = gmtCreate;
				}

				public Long getPushTime() {
					return this.pushTime;
				}

				public void setPushTime(Long pushTime) {
					this.pushTime = pushTime;
				}

				public String getPushTitle() {
					return this.pushTitle;
				}

				public void setPushTitle(String pushTitle) {
					this.pushTitle = pushTitle;
				}

				public String getPushContent() {
					return this.pushContent;
				}

				public void setPushContent(String pushContent) {
					this.pushContent = pushContent;
				}

				public Integer getCreateType() {
					return this.createType;
				}

				public void setCreateType(Integer createType) {
					this.createType = createType;
				}
			}
		}
	}

	@Override
	public QueryPushSchedulerListResponse getInstance(UnmarshallerContext context) {
		return	QueryPushSchedulerListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
