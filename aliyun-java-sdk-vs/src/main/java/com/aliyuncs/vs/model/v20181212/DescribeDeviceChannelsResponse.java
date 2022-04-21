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

package com.aliyuncs.vs.model.v20181212;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vs.transform.v20181212.DescribeDeviceChannelsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDeviceChannelsResponse extends AcsResponse {

	private Long pageNum;

	private Long pageSize;

	private String requestId;

	private Long totalCount;

	private Long pageCount;

	private List<Channel> channels;

	public Long getPageNum() {
		return this.pageNum;
	}

	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public Long getPageCount() {
		return this.pageCount;
	}

	public void setPageCount(Long pageCount) {
		this.pageCount = pageCount;
	}

	public List<Channel> getChannels() {
		return this.channels;
	}

	public void setChannels(List<Channel> channels) {
		this.channels = channels;
	}

	public static class Channel {

		private String streamStatus;

		private String gbId;

		private String params;

		private String deviceId;

		private Long channelId;

		private String deviceStatus;

		private String name;

		private String streamId;

		public String getStreamStatus() {
			return this.streamStatus;
		}

		public void setStreamStatus(String streamStatus) {
			this.streamStatus = streamStatus;
		}

		public String getGbId() {
			return this.gbId;
		}

		public void setGbId(String gbId) {
			this.gbId = gbId;
		}

		public String getParams() {
			return this.params;
		}

		public void setParams(String params) {
			this.params = params;
		}

		public String getDeviceId() {
			return this.deviceId;
		}

		public void setDeviceId(String deviceId) {
			this.deviceId = deviceId;
		}

		public Long getChannelId() {
			return this.channelId;
		}

		public void setChannelId(Long channelId) {
			this.channelId = channelId;
		}

		public String getDeviceStatus() {
			return this.deviceStatus;
		}

		public void setDeviceStatus(String deviceStatus) {
			this.deviceStatus = deviceStatus;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getStreamId() {
			return this.streamId;
		}

		public void setStreamId(String streamId) {
			this.streamId = streamId;
		}
	}

	@Override
	public DescribeDeviceChannelsResponse getInstance(UnmarshallerContext context) {
		return	DescribeDeviceChannelsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
