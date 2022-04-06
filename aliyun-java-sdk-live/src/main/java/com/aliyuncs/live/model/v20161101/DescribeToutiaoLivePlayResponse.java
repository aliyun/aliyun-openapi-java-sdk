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
import com.aliyuncs.live.transform.v20161101.DescribeToutiaoLivePlayResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeToutiaoLivePlayResponse extends AcsResponse {

	private String description;

	private String requestId;

	private List<ContentItem> content;

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ContentItem> getContent() {
		return this.content;
	}

	public void setContent(List<ContentItem> content) {
		this.content = content;
	}

	public static class ContentItem {

		private String domain;

		private Float bandwidth;

		private String streamName;

		private String app;

		private Long playNum;

		private Long timestamp;

		private String cdnName;

		public String getDomain() {
			return this.domain;
		}

		public void setDomain(String domain) {
			this.domain = domain;
		}

		public Float getBandwidth() {
			return this.bandwidth;
		}

		public void setBandwidth(Float bandwidth) {
			this.bandwidth = bandwidth;
		}

		public String getStreamName() {
			return this.streamName;
		}

		public void setStreamName(String streamName) {
			this.streamName = streamName;
		}

		public String getApp() {
			return this.app;
		}

		public void setApp(String app) {
			this.app = app;
		}

		public Long getPlayNum() {
			return this.playNum;
		}

		public void setPlayNum(Long playNum) {
			this.playNum = playNum;
		}

		public Long getTimestamp() {
			return this.timestamp;
		}

		public void setTimestamp(Long timestamp) {
			this.timestamp = timestamp;
		}

		public String getCdnName() {
			return this.cdnName;
		}

		public void setCdnName(String cdnName) {
			this.cdnName = cdnName;
		}
	}

	@Override
	public DescribeToutiaoLivePlayResponse getInstance(UnmarshallerContext context) {
		return	DescribeToutiaoLivePlayResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
