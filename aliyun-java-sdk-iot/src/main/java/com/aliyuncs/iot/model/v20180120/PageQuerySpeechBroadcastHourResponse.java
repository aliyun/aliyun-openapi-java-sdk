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

package com.aliyuncs.iot.model.v20180120;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.iot.transform.v20180120.PageQuerySpeechBroadcastHourResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class PageQuerySpeechBroadcastHourResponse extends AcsResponse {

	private String code;

	private String errorMessage;

	private String requestId;

	private Boolean success;

	private Data data;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer pageSize;

		private Integer pageId;

		private Integer total;

		private String pageToken;

		private List<Data1> resultData;

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public Integer getPageId() {
			return this.pageId;
		}

		public void setPageId(Integer pageId) {
			this.pageId = pageId;
		}

		public Integer getTotal() {
			return this.total;
		}

		public void setTotal(Integer total) {
			this.total = total;
		}

		public String getPageToken() {
			return this.pageToken;
		}

		public void setPageToken(String pageToken) {
			this.pageToken = pageToken;
		}

		public List<Data1> getResultData() {
			return this.resultData;
		}

		public void setResultData(List<Data1> resultData) {
			this.resultData = resultData;
		}

		public static class Data1 {

			private String msg;

			private Long startTime;

			private String productKey;

			private String deviceName;

			private String shareTaskCode;

			private String speechId;

			private Integer code;

			private String speechs;

			public String getMsg() {
				return this.msg;
			}

			public void setMsg(String msg) {
				this.msg = msg;
			}

			public Long getStartTime() {
				return this.startTime;
			}

			public void setStartTime(Long startTime) {
				this.startTime = startTime;
			}

			public String getProductKey() {
				return this.productKey;
			}

			public void setProductKey(String productKey) {
				this.productKey = productKey;
			}

			public String getDeviceName() {
				return this.deviceName;
			}

			public void setDeviceName(String deviceName) {
				this.deviceName = deviceName;
			}

			public String getShareTaskCode() {
				return this.shareTaskCode;
			}

			public void setShareTaskCode(String shareTaskCode) {
				this.shareTaskCode = shareTaskCode;
			}

			public String getSpeechId() {
				return this.speechId;
			}

			public void setSpeechId(String speechId) {
				this.speechId = speechId;
			}

			public Integer getCode() {
				return this.code;
			}

			public void setCode(Integer code) {
				this.code = code;
			}

			public String getSpeechs() {
				return this.speechs;
			}

			public void setSpeechs(String speechs) {
				this.speechs = speechs;
			}
		}
	}

	@Override
	public PageQuerySpeechBroadcastHourResponse getInstance(UnmarshallerContext context) {
		return	PageQuerySpeechBroadcastHourResponseUnmarshaller.unmarshall(this, context);
	}
}
