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

	private String requestId;

	private Long pageSize;

	private Long pageNum;

	private Long pageCount;

	private Long totalCount;

	private List<Channel> channels;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Long getPageNum() {
		return this.pageNum;
	}

	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

	public Long getPageCount() {
		return this.pageCount;
	}

	public void setPageCount(Long pageCount) {
		this.pageCount = pageCount;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public List<Channel> getChannels() {
		return this.channels;
	}

	public void setChannels(List<Channel> channels) {
		this.channels = channels;
	}

	public static class Channel {

		private String name;

		private String gbId;

		private String streamId;

		private String streamStatus;

		private String deviceId;

		private String deviceStatus;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getGbId() {
			return this.gbId;
		}

		public void setGbId(String gbId) {
			this.gbId = gbId;
		}

		public String getStreamId() {
			return this.streamId;
		}

		public void setStreamId(String streamId) {
			this.streamId = streamId;
		}

		public String getStreamStatus() {
			return this.streamStatus;
		}

		public void setStreamStatus(String streamStatus) {
			this.streamStatus = streamStatus;
		}

		public String getDeviceId() {
			return this.deviceId;
		}

		public void setDeviceId(String deviceId) {
			this.deviceId = deviceId;
		}

		public String getDeviceStatus() {
			return this.deviceStatus;
		}

		public void setDeviceStatus(String deviceStatus) {
			this.deviceStatus = deviceStatus;
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
