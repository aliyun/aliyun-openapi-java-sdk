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
import com.aliyuncs.sofa.transform.v20190815.BatchQueryRmsMonitorMetricsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class BatchQueryRmsMonitorMetricsResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private Result result;

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

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private List<ListItem> list;

		public List<ListItem> getList() {
			return this.list;
		}

		public void setList(List<ListItem> list) {
			this.list = list;
		}

		public static class ListItem {

			private String key;

			private Value value;

			public String getKey() {
				return this.key;
			}

			public void setKey(String key) {
				this.key = key;
			}

			public Value getValue() {
				return this.value;
			}

			public void setValue(Value value) {
				this.value = value;
			}

			public static class Value {

				private String errMsg;

				private Boolean success;

				private List<DatasItem> datas;

				public String getErrMsg() {
					return this.errMsg;
				}

				public void setErrMsg(String errMsg) {
					this.errMsg = errMsg;
				}

				public Boolean getSuccess() {
					return this.success;
				}

				public void setSuccess(Boolean success) {
					this.success = success;
				}

				public List<DatasItem> getDatas() {
					return this.datas;
				}

				public void setDatas(List<DatasItem> datas) {
					this.datas = datas;
				}

				public static class DatasItem {

					private String metric;

					private List<DpsItem> dps;

					private List<TagsItem> tags;

					public String getMetric() {
						return this.metric;
					}

					public void setMetric(String metric) {
						this.metric = metric;
					}

					public List<DpsItem> getDps() {
						return this.dps;
					}

					public void setDps(List<DpsItem> dps) {
						this.dps = dps;
					}

					public List<TagsItem> getTags() {
						return this.tags;
					}

					public void setTags(List<TagsItem> tags) {
						this.tags = tags;
					}

					public static class DpsItem {

						private String key;

						private String value;

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
					}

					public static class TagsItem {

						private String key;

						private String value;

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
					}
				}
			}
		}
	}

	@Override
	public BatchQueryRmsMonitorMetricsResponse getInstance(UnmarshallerContext context) {
		return	BatchQueryRmsMonitorMetricsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
