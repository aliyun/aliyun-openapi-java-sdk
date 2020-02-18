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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.vs.transform.v20181212.DescribeDeviceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDeviceResponse extends AcsResponse {

	private String requestId;

	private String id;

	private String name;

	private String description;

	private String groupId;

	private String parentId;

	private String directoryId;

	private String type;

	private Boolean autoStart;

	private Boolean enabled;

	private String protocol;

	private String status;

	private String gbId;

	private String ip;

	private Long port;

	private String url;

	private String username;

	private String password;

	private String vendor;

	private String dsn;

	private String longitude;

	private String latitude;

	private Boolean autoPos;

	private Long posInterval;

	private String createdTime;

	private String registeredTime;

	private String channelSyncTime;

	private String params;

	private Stats stats;

	private Directory directory;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

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

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getGroupId() {
		return this.groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getParentId() {
		return this.parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public String getDirectoryId() {
		return this.directoryId;
	}

	public void setDirectoryId(String directoryId) {
		this.directoryId = directoryId;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Boolean getAutoStart() {
		return this.autoStart;
	}

	public void setAutoStart(Boolean autoStart) {
		this.autoStart = autoStart;
	}

	public Boolean getEnabled() {
		return this.enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	public String getBizProtocol() {
		return this.protocol;
	}

	public void setBizProtocol(String protocol) {
		this.protocol = protocol;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getGbId() {
		return this.gbId;
	}

	public void setGbId(String gbId) {
		this.gbId = gbId;
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

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getVendor() {
		return this.vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public String getDsn() {
		return this.dsn;
	}

	public void setDsn(String dsn) {
		this.dsn = dsn;
	}

	public String getLongitude() {
		return this.longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getLatitude() {
		return this.latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public Boolean getAutoPos() {
		return this.autoPos;
	}

	public void setAutoPos(Boolean autoPos) {
		this.autoPos = autoPos;
	}

	public Long getPosInterval() {
		return this.posInterval;
	}

	public void setPosInterval(Long posInterval) {
		this.posInterval = posInterval;
	}

	public String getCreatedTime() {
		return this.createdTime;
	}

	public void setCreatedTime(String createdTime) {
		this.createdTime = createdTime;
	}

	public String getRegisteredTime() {
		return this.registeredTime;
	}

	public void setRegisteredTime(String registeredTime) {
		this.registeredTime = registeredTime;
	}

	public String getChannelSyncTime() {
		return this.channelSyncTime;
	}

	public void setChannelSyncTime(String channelSyncTime) {
		this.channelSyncTime = channelSyncTime;
	}

	public String getParams() {
		return this.params;
	}

	public void setParams(String params) {
		this.params = params;
	}

	public Stats getStats() {
		return this.stats;
	}

	public void setStats(Stats stats) {
		this.stats = stats;
	}

	public Directory getDirectory() {
		return this.directory;
	}

	public void setDirectory(Directory directory) {
		this.directory = directory;
	}

	public static class Stats {

		private Long channelNum;

		private Long streamNum;

		private Long onlineNum;

		private Long offlineNum;

		private Long failedNum;

		public Long getChannelNum() {
			return this.channelNum;
		}

		public void setChannelNum(Long channelNum) {
			this.channelNum = channelNum;
		}

		public Long getStreamNum() {
			return this.streamNum;
		}

		public void setStreamNum(Long streamNum) {
			this.streamNum = streamNum;
		}

		public Long getOnlineNum() {
			return this.onlineNum;
		}

		public void setOnlineNum(Long onlineNum) {
			this.onlineNum = onlineNum;
		}

		public Long getOfflineNum() {
			return this.offlineNum;
		}

		public void setOfflineNum(Long offlineNum) {
			this.offlineNum = offlineNum;
		}

		public Long getFailedNum() {
			return this.failedNum;
		}

		public void setFailedNum(Long failedNum) {
			this.failedNum = failedNum;
		}
	}

	public static class Directory {

		private String id;

		private String name;

		private String description;

		private String groupId;

		private String parentId;

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

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getGroupId() {
			return this.groupId;
		}

		public void setGroupId(String groupId) {
			this.groupId = groupId;
		}

		public String getParentId() {
			return this.parentId;
		}

		public void setParentId(String parentId) {
			this.parentId = parentId;
		}

		public String getCreatedTime() {
			return this.createdTime;
		}

		public void setCreatedTime(String createdTime) {
			this.createdTime = createdTime;
		}
	}

	@Override
	public DescribeDeviceResponse getInstance(UnmarshallerContext context) {
		return	DescribeDeviceResponseUnmarshaller.unmarshall(this, context);
	}
}
