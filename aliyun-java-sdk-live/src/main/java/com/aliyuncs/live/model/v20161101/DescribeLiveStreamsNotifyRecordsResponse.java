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
import com.aliyuncs.live.transform.v20161101.DescribeLiveStreamsNotifyRecordsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLiveStreamsNotifyRecordsResponse extends AcsResponse {

	private Integer pageNum;

	private Integer pageSize;

	private String requestId;

	private Integer totalNum;

	private Integer totalPage;

	private List<LiveStreamNotifyRecordsInfo> notifyRecordsInfo;

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

	public List<LiveStreamNotifyRecordsInfo> getNotifyRecordsInfo() {
		return this.notifyRecordsInfo;
	}

	public void setNotifyRecordsInfo(List<LiveStreamNotifyRecordsInfo> notifyRecordsInfo) {
		this.notifyRecordsInfo = notifyRecordsInfo;
	}

	public static class LiveStreamNotifyRecordsInfo {

		private String notifyType;

		private String description;

		private String streamName;

		private String notifyTime;

		private String domainName;

		private String notifyContent;

		private String notifyUrl;

		private String notifyResult;

		private String appName;

		private String notifyResponse;

		private String notifyHeader;

		public String getNotifyType() {
			return this.notifyType;
		}

		public void setNotifyType(String notifyType) {
			this.notifyType = notifyType;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getStreamName() {
			return this.streamName;
		}

		public void setStreamName(String streamName) {
			this.streamName = streamName;
		}

		public String getNotifyTime() {
			return this.notifyTime;
		}

		public void setNotifyTime(String notifyTime) {
			this.notifyTime = notifyTime;
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

		public String getNotifyUrl() {
			return this.notifyUrl;
		}

		public void setNotifyUrl(String notifyUrl) {
			this.notifyUrl = notifyUrl;
		}

		public String getNotifyResult() {
			return this.notifyResult;
		}

		public void setNotifyResult(String notifyResult) {
			this.notifyResult = notifyResult;
		}

		public String getAppName() {
			return this.appName;
		}

		public void setAppName(String appName) {
			this.appName = appName;
		}

		public String getNotifyResponse() {
			return this.notifyResponse;
		}

		public void setNotifyResponse(String notifyResponse) {
			this.notifyResponse = notifyResponse;
		}

		public String getNotifyHeader() {
			return this.notifyHeader;
		}

		public void setNotifyHeader(String notifyHeader) {
			this.notifyHeader = notifyHeader;
		}
	}

	@Override
	public DescribeLiveStreamsNotifyRecordsResponse getInstance(UnmarshallerContext context) {
		return	DescribeLiveStreamsNotifyRecordsResponseUnmarshaller.unmarshall(this, context);
	}
}
