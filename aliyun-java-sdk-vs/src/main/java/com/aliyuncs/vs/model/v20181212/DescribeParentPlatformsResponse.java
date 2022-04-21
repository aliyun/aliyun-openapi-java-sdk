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
import com.aliyuncs.vs.transform.v20181212.DescribeParentPlatformsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeParentPlatformsResponse extends AcsResponse {

	private Long pageNum;

	private Long pageSize;

	private String requestId;

	private Long totalCount;

	private Long pageCount;

	private List<Platform> platforms;

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

	public List<Platform> getPlatforms() {
		return this.platforms;
	}

	public void setPlatforms(List<Platform> platforms) {
		this.platforms = platforms;
	}

	public static class Platform {

		private String status;

		private Long clientPort;

		private String protocol;

		private String clientGbId;

		private String ip;

		private Long port;

		private String clientUsername;

		private String clientPassword;

		private Boolean autoStart;

		private Boolean clientAuth;

		private String gbId;

		private String description;

		private String clientIp;

		private String name;

		private String createdTime;

		private String id;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Long getClientPort() {
			return this.clientPort;
		}

		public void setClientPort(Long clientPort) {
			this.clientPort = clientPort;
		}

		public String getBizProtocol() {
			return this.protocol;
		}

		public void setBizProtocol(String protocol) {
			this.protocol = protocol;
		}

		public String getClientGbId() {
			return this.clientGbId;
		}

		public void setClientGbId(String clientGbId) {
			this.clientGbId = clientGbId;
		}

		public String getIp() {
			return this.ip;
		}

		public void setIp(String ip) {
			this.ip = ip;
		}

		public Long getPort() {
			return this.port;
		}

		public void setPort(Long port) {
			this.port = port;
		}

		public String getClientUsername() {
			return this.clientUsername;
		}

		public void setClientUsername(String clientUsername) {
			this.clientUsername = clientUsername;
		}

		public String getClientPassword() {
			return this.clientPassword;
		}

		public void setClientPassword(String clientPassword) {
			this.clientPassword = clientPassword;
		}

		public Boolean getAutoStart() {
			return this.autoStart;
		}

		public void setAutoStart(Boolean autoStart) {
			this.autoStart = autoStart;
		}

		public Boolean getClientAuth() {
			return this.clientAuth;
		}

		public void setClientAuth(Boolean clientAuth) {
			this.clientAuth = clientAuth;
		}

		public String getGbId() {
			return this.gbId;
		}

		public void setGbId(String gbId) {
			this.gbId = gbId;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getClientIp() {
			return this.clientIp;
		}

		public void setClientIp(String clientIp) {
			this.clientIp = clientIp;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getCreatedTime() {
			return this.createdTime;
		}

		public void setCreatedTime(String createdTime) {
			this.createdTime = createdTime;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}
	}

	@Override
	public DescribeParentPlatformsResponse getInstance(UnmarshallerContext context) {
		return	DescribeParentPlatformsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
