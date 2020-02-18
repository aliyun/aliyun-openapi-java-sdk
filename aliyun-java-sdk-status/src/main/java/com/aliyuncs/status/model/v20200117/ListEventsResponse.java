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

package com.aliyuncs.status.model.v20200117;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.status.transform.v20200117.ListEventsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListEventsResponse extends AcsResponse {

	private Integer total;

	private String info;

	private Integer code;

	private String success;

	private Integer hTTPCode;

	private String requestId;

	private List<DataItem> data;

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public String getInfo() {
		return this.info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getSuccess() {
		return this.success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public Integer getHTTPCode() {
		return this.hTTPCode;
	}

	public void setHTTPCode(Integer hTTPCode) {
		this.hTTPCode = hTTPCode;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String title;

		private String currentStateSeverity;

		private Long sartTime;

		private Long endTime;

		public String getTitle() {
			return this.title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getCurrentStateSeverity() {
			return this.currentStateSeverity;
		}

		public void setCurrentStateSeverity(String currentStateSeverity) {
			this.currentStateSeverity = currentStateSeverity;
		}

		public Long getSartTime() {
			return this.sartTime;
		}

		public void setSartTime(Long sartTime) {
			this.sartTime = sartTime;
		}

		public Long getEndTime() {
			return this.endTime;
		}

		public void setEndTime(Long endTime) {
			this.endTime = endTime;
		}
	}

	@Override
	public ListEventsResponse getInstance(UnmarshallerContext context) {
		return	ListEventsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
