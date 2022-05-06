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

package com.aliyuncs.educloud.model.v20220202;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.educloud.transform.v20220202.DescribeLabReservedResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLabReservedResponse extends AcsResponse {

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

		private String reservedId;

		private String labId;

		private String labTitle;

		private Long startTime;

		private Long endTime;

		private Long number;

		private Long status;

		public String getReservedId() {
			return this.reservedId;
		}

		public void setReservedId(String reservedId) {
			this.reservedId = reservedId;
		}

		public String getLabId() {
			return this.labId;
		}

		public void setLabId(String labId) {
			this.labId = labId;
		}

		public String getLabTitle() {
			return this.labTitle;
		}

		public void setLabTitle(String labTitle) {
			this.labTitle = labTitle;
		}

		public Long getStartTime() {
			return this.startTime;
		}

		public void setStartTime(Long startTime) {
			this.startTime = startTime;
		}

		public Long getEndTime() {
			return this.endTime;
		}

		public void setEndTime(Long endTime) {
			this.endTime = endTime;
		}

		public Long getNumber() {
			return this.number;
		}

		public void setNumber(Long number) {
			this.number = number;
		}

		public Long getStatus() {
			return this.status;
		}

		public void setStatus(Long status) {
			this.status = status;
		}
	}

	@Override
	public DescribeLabReservedResponse getInstance(UnmarshallerContext context) {
		return	DescribeLabReservedResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
