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

package com.aliyuncs.scsp.model.v20200702;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.scsp.transform.v20200702.GetCallsPerDayResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetCallsPerDayResponse extends AcsResponse {

	private String message;

	private String requestId;

	private String code;

	private String success;

	private Data data;

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

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

	public String getSuccess() {
		return this.success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long totalNum;

		private Long pageSize;

		private String pageNo;

		private List<CallsPerdayResponseListItem> callsPerdayResponseList;

		public Long getTotalNum() {
			return this.totalNum;
		}

		public void setTotalNum(Long totalNum) {
			this.totalNum = totalNum;
		}

		public Long getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Long pageSize) {
			this.pageSize = pageSize;
		}

		public String getPageNo() {
			return this.pageNo;
		}

		public void setPageNo(String pageNo) {
			this.pageNo = pageNo;
		}

		public List<CallsPerdayResponseListItem> getCallsPerdayResponseList() {
			return this.callsPerdayResponseList;
		}

		public void setCallsPerdayResponseList(List<CallsPerdayResponseListItem> callsPerdayResponseList) {
			this.callsPerdayResponseList = callsPerdayResponseList;
		}

		public static class CallsPerdayResponseListItem {

			private String dataId;

			private String hourId;

			private String tenantId;

			private String tenantName;

			private String phoneNum;

			private String callOutCnt;

			private String callInCnt;

			private String minuteId;

			public String getDataId() {
				return this.dataId;
			}

			public void setDataId(String dataId) {
				this.dataId = dataId;
			}

			public String getHourId() {
				return this.hourId;
			}

			public void setHourId(String hourId) {
				this.hourId = hourId;
			}

			public String getTenantId() {
				return this.tenantId;
			}

			public void setTenantId(String tenantId) {
				this.tenantId = tenantId;
			}

			public String getTenantName() {
				return this.tenantName;
			}

			public void setTenantName(String tenantName) {
				this.tenantName = tenantName;
			}

			public String getPhoneNum() {
				return this.phoneNum;
			}

			public void setPhoneNum(String phoneNum) {
				this.phoneNum = phoneNum;
			}

			public String getCallOutCnt() {
				return this.callOutCnt;
			}

			public void setCallOutCnt(String callOutCnt) {
				this.callOutCnt = callOutCnt;
			}

			public String getCallInCnt() {
				return this.callInCnt;
			}

			public void setCallInCnt(String callInCnt) {
				this.callInCnt = callInCnt;
			}

			public String getMinuteId() {
				return this.minuteId;
			}

			public void setMinuteId(String minuteId) {
				this.minuteId = minuteId;
			}
		}
	}

	@Override
	public GetCallsPerDayResponse getInstance(UnmarshallerContext context) {
		return	GetCallsPerDayResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
