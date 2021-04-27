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
import com.aliyuncs.live.transform.v20161101.StartPlaylistResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class StartPlaylistResponse extends AcsResponse {

	private String requestId;

	private String programId;

	private StreamInfo streamInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getProgramId() {
		return this.programId;
	}

	public void setProgramId(String programId) {
		this.programId = programId;
	}

	public StreamInfo getStreamInfo() {
		return this.streamInfo;
	}

	public void setStreamInfo(StreamInfo streamInfo) {
		this.streamInfo = streamInfo;
	}

	public static class StreamInfo {

		private String domainName;

		private String appName;

		private String streamName;

		private List<Stream> streams;

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

		public List<Stream> getStreams() {
			return this.streams;
		}

		public void setStreams(List<Stream> streams) {
			this.streams = streams;
		}

		public static class Stream {

			private String pullFlvUrl;

			private String pullRtmpUrl;

			private String pullM3U8Url;

			private String quality;

			public String getPullFlvUrl() {
				return this.pullFlvUrl;
			}

			public void setPullFlvUrl(String pullFlvUrl) {
				this.pullFlvUrl = pullFlvUrl;
			}

			public String getPullRtmpUrl() {
				return this.pullRtmpUrl;
			}

			public void setPullRtmpUrl(String pullRtmpUrl) {
				this.pullRtmpUrl = pullRtmpUrl;
			}

			public String getPullM3U8Url() {
				return this.pullM3U8Url;
			}

			public void setPullM3U8Url(String pullM3U8Url) {
				this.pullM3U8Url = pullM3U8Url;
			}

			public String getQuality() {
				return this.quality;
			}

			public void setQuality(String quality) {
				this.quality = quality;
			}
		}
	}

	@Override
	public StartPlaylistResponse getInstance(UnmarshallerContext context) {
		return	StartPlaylistResponseUnmarshaller.unmarshall(this, context);
	}
}
