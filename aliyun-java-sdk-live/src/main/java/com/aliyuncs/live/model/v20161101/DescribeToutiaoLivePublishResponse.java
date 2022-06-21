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
import com.aliyuncs.live.transform.v20161101.DescribeToutiaoLivePublishResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeToutiaoLivePublishResponse extends AcsResponse {

	private String requestId;

	private String description;

	private List<ContentItem> content;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<ContentItem> getContent() {
		return this.content;
	}

	public void setContent(List<ContentItem> content) {
		this.content = content;
	}

	public static class ContentItem {

		private String app;

		private Float bitrate;

		private Float bwDiff;

		private String cdnName;

		private String domain;

		private Float flr;

		private Float fps;

		private String streamName;

		private Long timestamp;

		public String getApp() {
			return this.app;
		}

		public void setApp(String app) {
			this.app = app;
		}

		public Float getBitrate() {
			return this.bitrate;
		}

		public void setBitrate(Float bitrate) {
			this.bitrate = bitrate;
		}

		public Float getBwDiff() {
			return this.bwDiff;
		}

		public void setBwDiff(Float bwDiff) {
			this.bwDiff = bwDiff;
		}

		public String getCdnName() {
			return this.cdnName;
		}

		public void setCdnName(String cdnName) {
			this.cdnName = cdnName;
		}

		public String getDomain() {
			return this.domain;
		}

		public void setDomain(String domain) {
			this.domain = domain;
		}

		public Float getFlr() {
			return this.flr;
		}

		public void setFlr(Float flr) {
			this.flr = flr;
		}

		public Float getFps() {
			return this.fps;
		}

		public void setFps(Float fps) {
			this.fps = fps;
		}

		public String getStreamName() {
			return this.streamName;
		}

		public void setStreamName(String streamName) {
			this.streamName = streamName;
		}

		public Long getTimestamp() {
			return this.timestamp;
		}

		public void setTimestamp(Long timestamp) {
			this.timestamp = timestamp;
		}
	}

	@Override
	public DescribeToutiaoLivePublishResponse getInstance(UnmarshallerContext context) {
		return	DescribeToutiaoLivePublishResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
