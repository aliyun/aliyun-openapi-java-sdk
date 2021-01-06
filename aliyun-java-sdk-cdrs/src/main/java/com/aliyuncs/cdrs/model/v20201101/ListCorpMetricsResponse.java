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

package com.aliyuncs.cdrs.model.v20201101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cdrs.transform.v20201101.ListCorpMetricsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListCorpMetricsResponse extends AcsResponse {

	private Integer totalCount;

	private Integer pageSize;

	private String message;

	private String requestId;

	private Integer pageNumber;

	private String code;

	private String success;

	private List<DataItem> data;

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

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String corpId;

		private String personId;

		private String deviceGroupId;

		private String deviceId;

		private String userGroupId;

		private String tagMetrics;

		private String tagCode;

		private String tagValue;

		private String dateId;

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

		public String getDeviceGroupId() {
			return this.deviceGroupId;
		}

		public void setDeviceGroupId(String deviceGroupId) {
			this.deviceGroupId = deviceGroupId;
		}

		public String getDeviceId() {
			return this.deviceId;
		}

		public void setDeviceId(String deviceId) {
			this.deviceId = deviceId;
		}

		public String getUserGroupId() {
			return this.userGroupId;
		}

		public void setUserGroupId(String userGroupId) {
			this.userGroupId = userGroupId;
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

		public String getTagValue() {
			return this.tagValue;
		}

		public void setTagValue(String tagValue) {
			this.tagValue = tagValue;
		}

		public String getDateId() {
			return this.dateId;
		}

		public void setDateId(String dateId) {
			this.dateId = dateId;
		}
	}

	@Override
	public ListCorpMetricsResponse getInstance(UnmarshallerContext context) {
		return	ListCorpMetricsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
