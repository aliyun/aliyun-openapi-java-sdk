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

package com.aliyuncs.dyplsapi.model.v20170525;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dyplsapi.transform.v20170525.CreatePickUpWaybillPreQueryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreatePickUpWaybillPreQueryResponse extends AcsResponse {

	private String requestId;

	private Integer httpStatusCode;

	private String message;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
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

		private Boolean success;

		private String errorCode;

		private String errorMsg;

		private String code;

		private String message;

		private List<TdTimeSelect> cpTimeSelectList;

		public Boolean getSuccess() {
			return this.success;
		}

		public void setSuccess(Boolean success) {
			this.success = success;
		}

		public String getErrorCode() {
			return this.errorCode;
		}

		public void setErrorCode(String errorCode) {
			this.errorCode = errorCode;
		}

		public String getErrorMsg() {
			return this.errorMsg;
		}

		public void setErrorMsg(String errorMsg) {
			this.errorMsg = errorMsg;
		}

		public String getCode() {
			return this.code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getMessage() {
			return this.message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public List<TdTimeSelect> getCpTimeSelectList() {
			return this.cpTimeSelectList;
		}

		public void setCpTimeSelectList(List<TdTimeSelect> cpTimeSelectList) {
			this.cpTimeSelectList = cpTimeSelectList;
		}

		public static class TdTimeSelect {

			private String prePrice;

			private List<TdAppointTimeDTO> appointTimes;

			private RealTime realTime;

			public String getPrePrice() {
				return this.prePrice;
			}

			public void setPrePrice(String prePrice) {
				this.prePrice = prePrice;
			}

			public List<TdAppointTimeDTO> getAppointTimes() {
				return this.appointTimes;
			}

			public void setAppointTimes(List<TdAppointTimeDTO> appointTimes) {
				this.appointTimes = appointTimes;
			}

			public RealTime getRealTime() {
				return this.realTime;
			}

			public void setRealTime(RealTime realTime) {
				this.realTime = realTime;
			}

			public static class TdAppointTimeDTO {

				private String date;

				private Boolean dateSelectable;

				private List<TdAppointTimeSlotDTO> timeList;

				public String getDate() {
					return this.date;
				}

				public void setDate(String date) {
					this.date = date;
				}

				public Boolean getDateSelectable() {
					return this.dateSelectable;
				}

				public void setDateSelectable(Boolean dateSelectable) {
					this.dateSelectable = dateSelectable;
				}

				public List<TdAppointTimeSlotDTO> getTimeList() {
					return this.timeList;
				}

				public void setTimeList(List<TdAppointTimeSlotDTO> timeList) {
					this.timeList = timeList;
				}

				public static class TdAppointTimeSlotDTO {

					private String startTime;

					private String endTime;

					private Boolean selectable;

					private String selectDisableTip;

					public String getStartTime() {
						return this.startTime;
					}

					public void setStartTime(String startTime) {
						this.startTime = startTime;
					}

					public String getEndTime() {
						return this.endTime;
					}

					public void setEndTime(String endTime) {
						this.endTime = endTime;
					}

					public Boolean getSelectable() {
						return this.selectable;
					}

					public void setSelectable(Boolean selectable) {
						this.selectable = selectable;
					}

					public String getSelectDisableTip() {
						return this.selectDisableTip;
					}

					public void setSelectDisableTip(String selectDisableTip) {
						this.selectDisableTip = selectDisableTip;
					}
				}
			}

			public static class RealTime {

				private String name;

				private Boolean selectable;

				private String selectDisableTip;

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public Boolean getSelectable() {
					return this.selectable;
				}

				public void setSelectable(Boolean selectable) {
					this.selectable = selectable;
				}

				public String getSelectDisableTip() {
					return this.selectDisableTip;
				}

				public void setSelectDisableTip(String selectDisableTip) {
					this.selectDisableTip = selectDisableTip;
				}
			}
		}
	}

	@Override
	public CreatePickUpWaybillPreQueryResponse getInstance(UnmarshallerContext context) {
		return	CreatePickUpWaybillPreQueryResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
