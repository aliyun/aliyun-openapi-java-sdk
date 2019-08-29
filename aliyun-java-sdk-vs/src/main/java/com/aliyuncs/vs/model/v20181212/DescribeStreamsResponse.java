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
import com.aliyuncs.vs.transform.v20181212.DescribeStreamsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeStreamsResponse extends AcsResponse {

	private String requestId;

	private Long pageSize;

	private Long pageNum;

	private Long pageCount;

	private Long totalCount;

	private List<Stream> streams;

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

	public List<Stream> getStreams() {
		return this.streams;
	}

	public void setStreams(List<Stream> streams) {
		this.streams = streams;
	}

	public static class Stream {

		private String id;

		private String name;

		private String pushDomain;

		private String playDomain;

		private String app;

		private String protocol;

		private String groupId;

		private String deviceId;

		private Boolean enabled;

		private String status;

		private String createdTime;

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getPushDomain() {
			return this.pushDomain;
		}

		public void setPushDomain(String pushDomain) {
			this.pushDomain = pushDomain;
		}

		public String getPlayDomain() {
			return this.playDomain;
		}

		public void setPlayDomain(String playDomain) {
			this.playDomain = playDomain;
		}

		public String getApp() {
			return this.app;
		}

		public void setApp(String app) {
			this.app = app;
		}

		public String getBizProtocol() {
			return this.protocol;
		}

		public void setBizProtocol(String protocol) {
			this.protocol = protocol;
		}

		/**
		 * @deprecated use getBizProtocol instead of this.
		 */
		@Deprecated
		public String getProtocol() {
			return this.protocol;
		}

		/**
		 * @deprecated use setBizProtocol instead of this.
		 */
		@Deprecated
		public void setProtocol(String protocol) {
			this.protocol = protocol;
		}

		public String getGroupId() {
			return this.groupId;
		}

		public void setGroupId(String groupId) {
			this.groupId = groupId;
		}

		public String getDeviceId() {
			return this.deviceId;
		}

		public void setDeviceId(String deviceId) {
			this.deviceId = deviceId;
		}

		public Boolean getEnabled() {
			return this.enabled;
		}

		public void setEnabled(Boolean enabled) {
			this.enabled = enabled;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getCreatedTime() {
			return this.createdTime;
		}

		public void setCreatedTime(String createdTime) {
			this.createdTime = createdTime;
		}
	}

	@Override
	public DescribeStreamsResponse getInstance(UnmarshallerContext context) {
		return	DescribeStreamsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
