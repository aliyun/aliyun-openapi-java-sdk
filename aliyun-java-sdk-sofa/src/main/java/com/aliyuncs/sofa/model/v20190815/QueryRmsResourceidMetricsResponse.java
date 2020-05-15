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
import com.aliyuncs.sofa.transform.v20190815.QueryRmsResourceidMetricsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryRmsResourceidMetricsResponse extends AcsResponse {

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

		private Entity entity;

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

				private String code;

				private String cursor;

				private String iaasId;

				private String message;

				private String optionKey;

				private String paasId;

				private String period;

				private Long port;

				private Long size;

				private List<MetricsItem> metrics;

				public String getCode() {
					return this.code;
				}

				public void setCode(String code) {
					this.code = code;
				}

				public String getCursor() {
					return this.cursor;
				}

				public void setCursor(String cursor) {
					this.cursor = cursor;
				}

				public String getIaasId() {
					return this.iaasId;
				}

				public void setIaasId(String iaasId) {
					this.iaasId = iaasId;
				}

				public String getMessage() {
					return this.message;
				}

				public void setMessage(String message) {
					this.message = message;
				}

				public String getOptionKey() {
					return this.optionKey;
				}

				public void setOptionKey(String optionKey) {
					this.optionKey = optionKey;
				}

				public String getPaasId() {
					return this.paasId;
				}

				public void setPaasId(String paasId) {
					this.paasId = paasId;
				}

				public String getPeriod() {
					return this.period;
				}

				public void setPeriod(String period) {
					this.period = period;
				}

				public Long getPort() {
					return this.port;
				}

				public void setPort(Long port) {
					this.port = port;
				}

				public Long getSize() {
					return this.size;
				}

				public void setSize(Long size) {
					this.size = size;
				}

				public List<MetricsItem> getMetrics() {
					return this.metrics;
				}

				public void setMetrics(List<MetricsItem> metrics) {
					this.metrics = metrics;
				}

				public static class MetricsItem {

					private String metric;

					private String unit;

					private List<DatasItem> datas;

					public String getMetric() {
						return this.metric;
					}

					public void setMetric(String metric) {
						this.metric = metric;
					}

					public String getUnit() {
						return this.unit;
					}

					public void setUnit(String unit) {
						this.unit = unit;
					}

					public List<DatasItem> getDatas() {
						return this.datas;
					}

					public void setDatas(List<DatasItem> datas) {
						this.datas = datas;
					}

					public static class DatasItem {

						private Long average;

						private Long maximum;

						private Long minimum;

						private Long timestamp;

						public Long getAverage() {
							return this.average;
						}

						public void setAverage(Long average) {
							this.average = average;
						}

						public Long getMaximum() {
							return this.maximum;
						}

						public void setMaximum(Long maximum) {
							this.maximum = maximum;
						}

						public Long getMinimum() {
							return this.minimum;
						}

						public void setMinimum(Long minimum) {
							this.minimum = minimum;
						}

						public Long getTimestamp() {
							return this.timestamp;
						}

						public void setTimestamp(Long timestamp) {
							this.timestamp = timestamp;
						}
					}
				}
			}
		}
	}

	@Override
	public QueryRmsResourceidMetricsResponse getInstance(UnmarshallerContext context) {
		return	QueryRmsResourceidMetricsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
