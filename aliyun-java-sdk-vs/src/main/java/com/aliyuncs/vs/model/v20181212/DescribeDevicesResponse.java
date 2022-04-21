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
import com.aliyuncs.vs.transform.v20181212.DescribeDevicesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDevicesResponse extends AcsResponse {

	private Long pageNum;

	private Long pageSize;

	private String requestId;

	private Long totalCount;

	private Long pageCount;

	private List<Device> devices;

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

	public List<Device> getDevices() {
		return this.devices;
	}

	public void setDevices(List<Device> devices) {
		this.devices = devices;
	}

	public static class Device {

		private String type;

		private String status;

		private String alarmMethod;

		private String dsn;

		private Long port;

		private Long posInterval;

		private Boolean autoDirectory;

		private String parentId;

		private String password;

		private Boolean autoPos;

		private String params;

		private String description;

		private Boolean enabled;

		private String name;

		private String channelSyncTime;

		private String createdTime;

		private String directoryId;

		private String registeredTime;

		private String protocol;

		private String ip;

		private String url;

		private Boolean autoStart;

		private String vendor;

		private String gbId;

		private String groupId;

		private String longitude;

		private String latitude;

		private String id;

		private String username;

		private Stats stats;

		private Directory directory;

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getAlarmMethod() {
			return this.alarmMethod;
		}

		public void setAlarmMethod(String alarmMethod) {
			this.alarmMethod = alarmMethod;
		}

		public String getDsn() {
			return this.dsn;
		}

		public void setDsn(String dsn) {
			this.dsn = dsn;
		}

		public Long getPort() {
			return this.port;
		}

		public void setPort(Long port) {
			this.port = port;
		}

		public Long getPosInterval() {
			return this.posInterval;
		}

		public void setPosInterval(Long posInterval) {
			this.posInterval = posInterval;
		}

		public Boolean getAutoDirectory() {
			return this.autoDirectory;
		}

		public void setAutoDirectory(Boolean autoDirectory) {
			this.autoDirectory = autoDirectory;
		}

		public String getParentId() {
			return this.parentId;
		}

		public void setParentId(String parentId) {
			this.parentId = parentId;
		}

		public String getPassword() {
			return this.password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public Boolean getAutoPos() {
			return this.autoPos;
		}

		public void setAutoPos(Boolean autoPos) {
			this.autoPos = autoPos;
		}

		public String getParams() {
			return this.params;
		}

		public void setParams(String params) {
			this.params = params;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Boolean getEnabled() {
			return this.enabled;
		}

		public void setEnabled(Boolean enabled) {
			this.enabled = enabled;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getChannelSyncTime() {
			return this.channelSyncTime;
		}

		public void setChannelSyncTime(String channelSyncTime) {
			this.channelSyncTime = channelSyncTime;
		}

		public String getCreatedTime() {
			return this.createdTime;
		}

		public void setCreatedTime(String createdTime) {
			this.createdTime = createdTime;
		}

		public String getDirectoryId() {
			return this.directoryId;
		}

		public void setDirectoryId(String directoryId) {
			this.directoryId = directoryId;
		}

		public String getRegisteredTime() {
			return this.registeredTime;
		}

		public void setRegisteredTime(String registeredTime) {
			this.registeredTime = registeredTime;
		}

		public String getBizProtocol() {
			return this.protocol;
		}

		public void setBizProtocol(String protocol) {
			this.protocol = protocol;
		}

		public String getIp() {
			return this.ip;
		}

		public void setIp(String ip) {
			this.ip = ip;
		}

		public String getUrl() {
			return this.url;
		}

		public void setUrl(String url) {
			this.url = url;
		}

		public Boolean getAutoStart() {
			return this.autoStart;
		}

		public void setAutoStart(Boolean autoStart) {
			this.autoStart = autoStart;
		}

		public String getVendor() {
			return this.vendor;
		}

		public void setVendor(String vendor) {
			this.vendor = vendor;
		}

		public String getGbId() {
			return this.gbId;
		}

		public void setGbId(String gbId) {
			this.gbId = gbId;
		}

		public String getGroupId() {
			return this.groupId;
		}

		public void setGroupId(String groupId) {
			this.groupId = groupId;
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

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getUsername() {
			return this.username;
		}

		public void setUsername(String username) {
			this.username = username;
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

			private Long failedNum;

			private Long streamNum;

			private Long channelNum;

			private Long onlineNum;

			private Long offlineNum;

			public Long getFailedNum() {
				return this.failedNum;
			}

			public void setFailedNum(Long failedNum) {
				this.failedNum = failedNum;
			}

			public Long getStreamNum() {
				return this.streamNum;
			}

			public void setStreamNum(Long streamNum) {
				this.streamNum = streamNum;
			}

			public Long getChannelNum() {
				return this.channelNum;
			}

			public void setChannelNum(Long channelNum) {
				this.channelNum = channelNum;
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
		}

		public static class Directory {

			private String parentId;

			private String description;

			private String groupId;

			private String name;

			private String createdTime;

			private String id;

			public String getParentId() {
				return this.parentId;
			}

			public void setParentId(String parentId) {
				this.parentId = parentId;
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
	}

	@Override
	public DescribeDevicesResponse getInstance(UnmarshallerContext context) {
		return	DescribeDevicesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
