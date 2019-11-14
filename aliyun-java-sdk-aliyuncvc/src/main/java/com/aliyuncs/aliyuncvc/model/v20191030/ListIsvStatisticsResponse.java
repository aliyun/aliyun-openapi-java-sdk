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

package com.aliyuncs.aliyuncvc.model.v20191030;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.aliyuncvc.transform.v20191030.ListIsvStatisticsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListIsvStatisticsResponse extends AcsResponse {

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

		private List<Statistic> statistics;

		private Total total;

		public List<Statistic> getStatistics() {
			return this.statistics;
		}

		public void setStatistics(List<Statistic> statistics) {
			this.statistics = statistics;
		}

		public Total getTotal() {
			return this.total;
		}

		public void setTotal(Total total) {
			this.total = total;
		}

		public static class Statistic {

			private String meetingNumber;

			private String meetingLength;

			private String memberNumber;

			private String day;

			public String getMeetingNumber() {
				return this.meetingNumber;
			}

			public void setMeetingNumber(String meetingNumber) {
				this.meetingNumber = meetingNumber;
			}

			public String getMeetingLength() {
				return this.meetingLength;
			}

			public void setMeetingLength(String meetingLength) {
				this.meetingLength = meetingLength;
			}

			public String getMemberNumber() {
				return this.memberNumber;
			}

			public void setMemberNumber(String memberNumber) {
				this.memberNumber = memberNumber;
			}

			public String getDay() {
				return this.day;
			}

			public void setDay(String day) {
				this.day = day;
			}
		}

		public static class Total {

			private Integer meetingNumber;

			private Integer meetingLength;

			private Integer memberNumber;

			public Integer getMeetingNumber() {
				return this.meetingNumber;
			}

			public void setMeetingNumber(Integer meetingNumber) {
				this.meetingNumber = meetingNumber;
			}

			public Integer getMeetingLength() {
				return this.meetingLength;
			}

			public void setMeetingLength(Integer meetingLength) {
				this.meetingLength = meetingLength;
			}

			public Integer getMemberNumber() {
				return this.memberNumber;
			}

			public void setMemberNumber(Integer memberNumber) {
				this.memberNumber = memberNumber;
			}
		}
	}

	@Override
	public ListIsvStatisticsResponse getInstance(UnmarshallerContext context) {
		return	ListIsvStatisticsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
