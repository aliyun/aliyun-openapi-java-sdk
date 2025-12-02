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

package com.aliyuncs.live.model.v20161101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.live.transform.v20161101.DescribeLiveRecordNotifyRecordsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLiveRecordNotifyRecordsResponse extends AcsResponse {

	private Integer code;

	private String msg;

	private Integer pageNum;

	private Integer pageSize;

	private String requestId;

	private Integer totalNum;

	private Integer totalPage;

	private List<Callback> callbackList;

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMsg() {
		return this.msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Integer getPageNum() {
		return this.pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalNum() {
		return this.totalNum;
	}

	public void setTotalNum(Integer totalNum) {
		this.totalNum = totalNum;
	}

	public Integer getTotalPage() {
		return this.totalPage;
	}

	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}

	public List<Callback> getCallbackList() {
		return this.callbackList;
	}

	public void setCallbackList(List<Callback> callbackList) {
		this.callbackList = callbackList;
	}

	public static class Callback {

		private String appName;

		private String description;

		private String domainName;

		private String notifyContent;

		private String notifyResult;

		private String notifyTime;

		private String notifyType;

		private String notifyUrl;

		private String notifyHeader;

		private String streamName;

		private String notifyResponse;

		public String getAppName() {
			return this.appName;
		}

		public void setAppName(String appName) {
			this.appName = appName;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getDomainName() {
			return this.domainName;
		}

		public void setDomainName(String domainName) {
			this.domainName = domainName;
		}

		public String getNotifyContent() {
			return this.notifyContent;
		}

		public void setNotifyContent(String notifyContent) {
			this.notifyContent = notifyContent;
		}

		public String getNotifyResult() {
			return this.notifyResult;
		}

		public void setNotifyResult(String notifyResult) {
			this.notifyResult = notifyResult;
		}

		public String getNotifyTime() {
			return this.notifyTime;
		}

		public void setNotifyTime(String notifyTime) {
			this.notifyTime = notifyTime;
		}

		public String getNotifyType() {
			return this.notifyType;
		}

		public void setNotifyType(String notifyType) {
			this.notifyType = notifyType;
		}

		public String getNotifyUrl() {
			return this.notifyUrl;
		}

		public void setNotifyUrl(String notifyUrl) {
			this.notifyUrl = notifyUrl;
		}

		public String getNotifyHeader() {
			return this.notifyHeader;
		}

		public void setNotifyHeader(String notifyHeader) {
			this.notifyHeader = notifyHeader;
		}

		public String getStreamName() {
			return this.streamName;
		}

		public void setStreamName(String streamName) {
			this.streamName = streamName;
		}

		public String getNotifyResponse() {
			return this.notifyResponse;
		}

		public void setNotifyResponse(String notifyResponse) {
			this.notifyResponse = notifyResponse;
		}
	}

	@Override
	public DescribeLiveRecordNotifyRecordsResponse getInstance(UnmarshallerContext context) {
		return	DescribeLiveRecordNotifyRecordsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
