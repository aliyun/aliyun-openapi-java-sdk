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

package com.aliyuncs.vcs.model.v20200515;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vcs.transform.v20200515.ListPersonTraceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListPersonTraceResponse extends AcsResponse {

	private Integer totalCount;

	private Integer pageSize;

	private String message;

	private String requestId;

	private Integer pageNumber;

	private String code;

	private String success;

	private List<Day> data;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

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

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
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

	public List<Day> getData() {
		return this.data;
	}

	public void setData(List<Day> data) {
		this.data = data;
	}

	public static class Day {

		private String startTargetImage;

		private String startSourceImage;

		private String corpId;

		private String personId;

		private String deviceId;

		private String endTargetImage;

		private String endSourceImage;

		private String startTime;

		private String date;

		private String lastTime;

		private String groupId;

		public String getStartTargetImage() {
			return this.startTargetImage;
		}

		public void setStartTargetImage(String startTargetImage) {
			this.startTargetImage = startTargetImage;
		}

		public String getStartSourceImage() {
			return this.startSourceImage;
		}

		public void setStartSourceImage(String startSourceImage) {
			this.startSourceImage = startSourceImage;
		}

		public String getCorpId() {
			return this.corpId;
		}

		public void setCorpId(String corpId) {
			this.corpId = corpId;
		}

		public String getPersonId() {
			return this.personId;
		}

		public void setPersonId(String personId) {
			this.personId = personId;
		}

		public String getDeviceId() {
			return this.deviceId;
		}

		public void setDeviceId(String deviceId) {
			this.deviceId = deviceId;
		}

		public String getEndTargetImage() {
			return this.endTargetImage;
		}

		public void setEndTargetImage(String endTargetImage) {
			this.endTargetImage = endTargetImage;
		}

		public String getEndSourceImage() {
			return this.endSourceImage;
		}

		public void setEndSourceImage(String endSourceImage) {
			this.endSourceImage = endSourceImage;
		}

		public String getStartTime() {
			return this.startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}

		public String getDate() {
			return this.date;
		}

		public void setDate(String date) {
			this.date = date;
		}

		public String getLastTime() {
			return this.lastTime;
		}

		public void setLastTime(String lastTime) {
			this.lastTime = lastTime;
		}

		public String getGroupId() {
			return this.groupId;
		}

		public void setGroupId(String groupId) {
			this.groupId = groupId;
		}
	}

	@Override
	public ListPersonTraceResponse getInstance(UnmarshallerContext context) {
		return	ListPersonTraceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
