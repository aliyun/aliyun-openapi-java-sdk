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
import com.aliyuncs.live.transform.v20161101.DescribeCasterChannelsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCasterChannelsResponse extends AcsResponse {

	private Integer total;

	private String requestId;

	private List<Channel> channels;

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Channel> getChannels() {
		return this.channels;
	}

	public void setChannels(List<Channel> channels) {
		this.channels = channels;
	}

	public static class Channel {

		private Integer inputType;

		private String rtmpUrl;

		private String channelId;

		private String rtsUrl;

		private String faceBeauty;

		private String resourceId;

		private String streamUrl;

		public Integer getInputType() {
			return this.inputType;
		}

		public void setInputType(Integer inputType) {
			this.inputType = inputType;
		}

		public String getRtmpUrl() {
			return this.rtmpUrl;
		}

		public void setRtmpUrl(String rtmpUrl) {
			this.rtmpUrl = rtmpUrl;
		}

		public String getChannelId() {
			return this.channelId;
		}

		public void setChannelId(String channelId) {
			this.channelId = channelId;
		}

		public String getRtsUrl() {
			return this.rtsUrl;
		}

		public void setRtsUrl(String rtsUrl) {
			this.rtsUrl = rtsUrl;
		}

		public String getFaceBeauty() {
			return this.faceBeauty;
		}

		public void setFaceBeauty(String faceBeauty) {
			this.faceBeauty = faceBeauty;
		}

		public String getResourceId() {
			return this.resourceId;
		}

		public void setResourceId(String resourceId) {
			this.resourceId = resourceId;
		}

		public String getStreamUrl() {
			return this.streamUrl;
		}

		public void setStreamUrl(String streamUrl) {
			this.streamUrl = streamUrl;
		}
	}

	@Override
	public DescribeCasterChannelsResponse getInstance(UnmarshallerContext context) {
		return	DescribeCasterChannelsResponseUnmarshaller.unmarshall(this, context);
	}
}
