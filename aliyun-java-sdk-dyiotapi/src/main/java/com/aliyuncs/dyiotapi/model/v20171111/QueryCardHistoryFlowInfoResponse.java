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

package com.aliyuncs.dyiotapi.model.v20171111;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dyiotapi.transform.v20171111.QueryCardHistoryFlowInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryCardHistoryFlowInfoResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private Boolean success;

	private List<GprsMonthUsageDTO> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<GprsMonthUsageDTO> getData() {
		return this.data;
	}

	public void setData(List<GprsMonthUsageDTO> data) {
		this.data = data;
	}

	public static class GprsMonthUsageDTO {

		private Long month;

		private Long curValue;

		private List<GprsDayUsage> dayUsageList;

		public Long getMonth() {
			return this.month;
		}

		public void setMonth(Long month) {
			this.month = month;
		}

		public Long getCurValue() {
			return this.curValue;
		}

		public void setCurValue(Long curValue) {
			this.curValue = curValue;
		}

		public List<GprsDayUsage> getDayUsageList() {
			return this.dayUsageList;
		}

		public void setDayUsageList(List<GprsDayUsage> dayUsageList) {
			this.dayUsageList = dayUsageList;
		}

		public static class GprsDayUsage {

			private Integer day;

			private Long value;

			public Integer getDay() {
				return this.day;
			}

			public void setDay(Integer day) {
				this.day = day;
			}

			public Long getValue() {
				return this.value;
			}

			public void setValue(Long value) {
				this.value = value;
			}
		}
	}

	@Override
	public QueryCardHistoryFlowInfoResponse getInstance(UnmarshallerContext context) {
		return	QueryCardHistoryFlowInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
