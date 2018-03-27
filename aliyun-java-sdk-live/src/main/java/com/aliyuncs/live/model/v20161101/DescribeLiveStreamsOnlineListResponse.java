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
import com.aliyuncs.live.transform.v20161101.DescribeLiveStreamsOnlineListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLiveStreamsOnlineListResponse extends AcsResponse {

	private String requestId;

	private Integer pageNum;

	private Integer pageSize;

	private Integer totalNum;

	private Integer totalPage;

	private List<LiveStreamOnlineInfo> onlineInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

	public List<LiveStreamOnlineInfo> getOnlineInfo() {
		return this.onlineInfo;
	}

	public void setOnlineInfo(List<LiveStreamOnlineInfo> onlineInfo) {
		this.onlineInfo = onlineInfo;
	}

	public static class LiveStreamOnlineInfo {

		private String domainName;

		private String appName;

		private String streamName;

		private String publishTime;

		private String publishUrl;

		private String publishDomain;

		public String getDomainName() {
			return this.domainName;
		}

		public void setDomainName(String domainName) {
			this.domainName = domainName;
		}

		public String getAppName() {
			return this.appName;
		}

		public void setAppName(String appName) {
			this.appName = appName;
		}

		public String getStreamName() {
			return this.streamName;
		}

		public void setStreamName(String streamName) {
			this.streamName = streamName;
		}

		public String getPublishTime() {
			return this.publishTime;
		}

		public void setPublishTime(String publishTime) {
			this.publishTime = publishTime;
		}

		public String getPublishUrl() {
			return this.publishUrl;
		}

		public void setPublishUrl(String publishUrl) {
			this.publishUrl = publishUrl;
		}

		public String getPublishDomain() {
			return this.publishDomain;
		}

		public void setPublishDomain(String publishDomain) {
			this.publishDomain = publishDomain;
		}
	}

	@Override
	public DescribeLiveStreamsOnlineListResponse getInstance(UnmarshallerContext context) {
		return	DescribeLiveStreamsOnlineListResponseUnmarshaller.unmarshall(this, context);
	}
}
