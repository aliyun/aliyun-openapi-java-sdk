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
import com.aliyuncs.vcs.transform.v20200515.ListPersonVisitCountResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListPersonVisitCountResponse extends AcsResponse {

	private String totalCount;

	private String pageSize;

	private String message;

	private String requestId;

	private String pageNo;

	private String code;

	private String success;

	private List<Datas> data;

	public String getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}

	public String getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(String pageSize) {
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

	public String getPageNo() {
		return this.pageNo;
	}

	public void setPageNo(String pageNo) {
		this.pageNo = pageNo;
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

	public List<Datas> getData() {
		return this.data;
	}

	public void setData(List<Datas> data) {
		this.data = data;
	}

	public static class Datas {

		private String corpId;

		private String personId;

		private String deviceId;

		private String tagMetrics;

		private String tagCode;

		private String dayId;

		private String hourId;

		private String groupId;

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

		public String getTagMetrics() {
			return this.tagMetrics;
		}

		public void setTagMetrics(String tagMetrics) {
			this.tagMetrics = tagMetrics;
		}

		public String getTagCode() {
			return this.tagCode;
		}

		public void setTagCode(String tagCode) {
			this.tagCode = tagCode;
		}

		public String getDayId() {
			return this.dayId;
		}

		public void setDayId(String dayId) {
			this.dayId = dayId;
		}

		public String getHourId() {
			return this.hourId;
		}

		public void setHourId(String hourId) {
			this.hourId = hourId;
		}

		public String getGroupId() {
			return this.groupId;
		}

		public void setGroupId(String groupId) {
			this.groupId = groupId;
		}
	}

	@Override
	public ListPersonVisitCountResponse getInstance(UnmarshallerContext context) {
		return	ListPersonVisitCountResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
