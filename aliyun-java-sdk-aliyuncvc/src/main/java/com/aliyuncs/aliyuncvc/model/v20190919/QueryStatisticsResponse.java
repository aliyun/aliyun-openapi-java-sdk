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

package com.aliyuncs.aliyuncvc.model.v20190919;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.aliyuncvc.transform.v20190919.QueryStatisticsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryStatisticsResponse extends AcsResponse {

	private Integer errorCode;

	private String message;

	private Boolean success;

	private String requestId;

	private Data data;

	public Integer getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(Integer errorCode) {
		this.errorCode = errorCode;
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

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private List<DayInfoItem> dayInfo;

		private Total total;

		public List<DayInfoItem> getDayInfo() {
			return this.dayInfo;
		}

		public void setDayInfo(List<DayInfoItem> dayInfo) {
			this.dayInfo = dayInfo;
		}

		public Total getTotal() {
			return this.total;
		}

		public void setTotal(Total total) {
			this.total = total;
		}

		public static class DayInfoItem {

			private String meetingNum;

			private String meetingLength;

			private String memberNum;

			private String day;

			public String getMeetingNum() {
				return this.meetingNum;
			}

			public void setMeetingNum(String meetingNum) {
				this.meetingNum = meetingNum;
			}

			public String getMeetingLength() {
				return this.meetingLength;
			}

			public void setMeetingLength(String meetingLength) {
				this.meetingLength = meetingLength;
			}

			public String getMemberNum() {
				return this.memberNum;
			}

			public void setMemberNum(String memberNum) {
				this.memberNum = memberNum;
			}

			public String getDay() {
				return this.day;
			}

			public void setDay(String day) {
				this.day = day;
			}
		}

		public static class Total {

			private Integer meetingNum;

			private Integer meetingLength;

			private Integer memberNum;

			public Integer getMeetingNum() {
				return this.meetingNum;
			}

			public void setMeetingNum(Integer meetingNum) {
				this.meetingNum = meetingNum;
			}

			public Integer getMeetingLength() {
				return this.meetingLength;
			}

			public void setMeetingLength(Integer meetingLength) {
				this.meetingLength = meetingLength;
			}

			public Integer getMemberNum() {
				return this.memberNum;
			}

			public void setMemberNum(Integer memberNum) {
				this.memberNum = memberNum;
			}
		}
	}

	@Override
	public QueryStatisticsResponse getInstance(UnmarshallerContext context) {
		return	QueryStatisticsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
