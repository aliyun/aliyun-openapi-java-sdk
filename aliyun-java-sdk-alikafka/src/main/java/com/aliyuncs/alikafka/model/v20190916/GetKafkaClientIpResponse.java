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

package com.aliyuncs.alikafka.model.v20190916;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.alikafka.transform.v20190916.GetKafkaClientIpResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetKafkaClientIpResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Long code;

	private String message;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Long getCode() {
		return this.code;
	}

	public void setCode(Long code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer searchTimeRange;

		private Boolean alert;

		private Integer timeLimitDay;

		private Long startDate;

		private Long endDate;

		private List<DataItem> data1;

		public Integer getSearchTimeRange() {
			return this.searchTimeRange;
		}

		public void setSearchTimeRange(Integer searchTimeRange) {
			this.searchTimeRange = searchTimeRange;
		}

		public Boolean getAlert() {
			return this.alert;
		}

		public void setAlert(Boolean alert) {
			this.alert = alert;
		}

		public Integer getTimeLimitDay() {
			return this.timeLimitDay;
		}

		public void setTimeLimitDay(Integer timeLimitDay) {
			this.timeLimitDay = timeLimitDay;
		}

		public Long getStartDate() {
			return this.startDate;
		}

		public void setStartDate(Long startDate) {
			this.startDate = startDate;
		}

		public Long getEndDate() {
			return this.endDate;
		}

		public void setEndDate(Long endDate) {
			this.endDate = endDate;
		}

		public List<DataItem> getData1() {
			return this.data1;
		}

		public void setData1(List<DataItem> data1) {
			this.data1 = data1;
		}

		public static class DataItem {

			private String name;

			private List<DataItem3> data2;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public List<DataItem3> getData2() {
				return this.data2;
			}

			public void setData2(List<DataItem3> data2) {
				this.data2 = data2;
			}

			public static class DataItem3 {

				private String ip;

				private Long num;

				public String getIp() {
					return this.ip;
				}

				public void setIp(String ip) {
					this.ip = ip;
				}

				public Long getNum() {
					return this.num;
				}

				public void setNum(Long num) {
					this.num = num;
				}
			}
		}
	}

	@Override
	public GetKafkaClientIpResponse getInstance(UnmarshallerContext context) {
		return	GetKafkaClientIpResponseUnmarshaller.unmarshall(this, context);
	}
}
