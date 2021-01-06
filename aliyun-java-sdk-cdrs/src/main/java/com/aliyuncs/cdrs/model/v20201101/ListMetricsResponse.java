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
import com.aliyuncs.cdrs.transform.v20201101.ListMetricsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListMetricsResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private String pageNumber;

	private String pageSize;

	private String totalCount;

	private List<DataItem> data;

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

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(String pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public String getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String dateTime;

		private String tagCode;

		private String tagValue;

		private String dateTime1;

		public String getDateTime() {
			return this.dateTime;
		}

		public void setDateTime(String dateTime) {
			this.dateTime = dateTime;
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

		public String getDateTime1() {
			return this.dateTime1;
		}

		public void setDateTime1(String dateTime1) {
			this.dateTime1 = dateTime1;
		}
	}

	@Override
	public ListMetricsResponse getInstance(UnmarshallerContext context) {
		return	ListMetricsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
