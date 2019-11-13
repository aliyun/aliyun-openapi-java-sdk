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

package com.aliyuncs.linkvisual.model.v20180120;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.linkvisual.transform.v20180120.QueryDeviceEventRecordResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryDeviceEventRecordResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String errorMessage;

	private Integer code;

	private List<VodInfo> data;

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

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public List<VodInfo> getData() {
		return this.data;
	}

	public void setData(List<VodInfo> data) {
		this.data = data;
	}

	public static class VodInfo {

		private String fileName;

		private String vodUrl;

		private String beginTime;

		private String endTime;

		public String getFileName() {
			return this.fileName;
		}

		public void setFileName(String fileName) {
			this.fileName = fileName;
		}

		public String getVodUrl() {
			return this.vodUrl;
		}

		public void setVodUrl(String vodUrl) {
			this.vodUrl = vodUrl;
		}

		public String getBeginTime() {
			return this.beginTime;
		}

		public void setBeginTime(String beginTime) {
			this.beginTime = beginTime;
		}

		public String getEndTime() {
			return this.endTime;
		}

		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}
	}

	@Override
	public QueryDeviceEventRecordResponse getInstance(UnmarshallerContext context) {
		return	QueryDeviceEventRecordResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
