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
import com.aliyuncs.vs.transform.v20181212.DescribeGroupsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeGroupsResponse extends AcsResponse {

	private Long pageNum;

	private Long pageSize;

	private String requestId;

	private Long totalCount;

	private Long pageCount;

	private List<Group> groups;

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

	public List<Group> getGroups() {
		return this.groups;
	}

	public void setGroups(List<Group> groups) {
		this.groups = groups;
	}

	public static class Group {

		private String status;

		private Boolean lazyPull;

		private String playDomain;

		private Long gbPort;

		private Integer captureInterval;

		private String callback;

		private String gbId;

		private String gbIp;

		private Integer captureImage;

		private String description;

		private String region;

		private String app;

		private String aliasId;

		private Boolean enabled;

		private String inProtocol;

		private String captureOssPath;

		private String captureOssBucket;

		private String outProtocol;

		private String pushDomain;

		private String name;

		private String createdTime;

		private Integer captureVideo;

		private String id;

		private List<String> gbTcpPorts;

		private List<String> gbUdpPorts;

		private Stats stats;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Boolean getLazyPull() {
			return this.lazyPull;
		}

		public void setLazyPull(Boolean lazyPull) {
			this.lazyPull = lazyPull;
		}

		public String getPlayDomain() {
			return this.playDomain;
		}

		public void setPlayDomain(String playDomain) {
			this.playDomain = playDomain;
		}

		public Long getGbPort() {
			return this.gbPort;
		}

		public void setGbPort(Long gbPort) {
			this.gbPort = gbPort;
		}

		public Integer getCaptureInterval() {
			return this.captureInterval;
		}

		public void setCaptureInterval(Integer captureInterval) {
			this.captureInterval = captureInterval;
		}

		public String getCallback() {
			return this.callback;
		}

		public void setCallback(String callback) {
			this.callback = callback;
		}

		public String getGbId() {
			return this.gbId;
		}

		public void setGbId(String gbId) {
			this.gbId = gbId;
		}

		public String getGbIp() {
			return this.gbIp;
		}

		public void setGbIp(String gbIp) {
			this.gbIp = gbIp;
		}

		public Integer getCaptureImage() {
			return this.captureImage;
		}

		public void setCaptureImage(Integer captureImage) {
			this.captureImage = captureImage;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getRegion() {
			return this.region;
		}

		public void setRegion(String region) {
			this.region = region;
		}

		public String getApp() {
			return this.app;
		}

		public void setApp(String app) {
			this.app = app;
		}

		public String getAliasId() {
			return this.aliasId;
		}

		public void setAliasId(String aliasId) {
			this.aliasId = aliasId;
		}

		public Boolean getEnabled() {
			return this.enabled;
		}

		public void setEnabled(Boolean enabled) {
			this.enabled = enabled;
		}

		public String getInProtocol() {
			return this.inProtocol;
		}

		public void setInProtocol(String inProtocol) {
			this.inProtocol = inProtocol;
		}

		public String getCaptureOssPath() {
			return this.captureOssPath;
		}

		public void setCaptureOssPath(String captureOssPath) {
			this.captureOssPath = captureOssPath;
		}

		public String getCaptureOssBucket() {
			return this.captureOssBucket;
		}

		public void setCaptureOssBucket(String captureOssBucket) {
			this.captureOssBucket = captureOssBucket;
		}

		public String getOutProtocol() {
			return this.outProtocol;
		}

		public void setOutProtocol(String outProtocol) {
			this.outProtocol = outProtocol;
		}

		public String getPushDomain() {
			return this.pushDomain;
		}

		public void setPushDomain(String pushDomain) {
			this.pushDomain = pushDomain;
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

		public Integer getCaptureVideo() {
			return this.captureVideo;
		}

		public void setCaptureVideo(Integer captureVideo) {
			this.captureVideo = captureVideo;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public List<String> getGbTcpPorts() {
			return this.gbTcpPorts;
		}

		public void setGbTcpPorts(List<String> gbTcpPorts) {
			this.gbTcpPorts = gbTcpPorts;
		}

		public List<String> getGbUdpPorts() {
			return this.gbUdpPorts;
		}

		public void setGbUdpPorts(List<String> gbUdpPorts) {
			this.gbUdpPorts = gbUdpPorts;
		}

		public Stats getStats() {
			return this.stats;
		}

		public void setStats(Stats stats) {
			this.stats = stats;
		}

		public static class Stats {

			private Long platformNum;

			private Long deviceNum;

			private Long ipcNum;

			private Long iedNum;

			public Long getPlatformNum() {
				return this.platformNum;
			}

			public void setPlatformNum(Long platformNum) {
				this.platformNum = platformNum;
			}

			public Long getDeviceNum() {
				return this.deviceNum;
			}

			public void setDeviceNum(Long deviceNum) {
				this.deviceNum = deviceNum;
			}

			public Long getIpcNum() {
				return this.ipcNum;
			}

			public void setIpcNum(Long ipcNum) {
				this.ipcNum = ipcNum;
			}

			public Long getIedNum() {
				return this.iedNum;
			}

			public void setIedNum(Long iedNum) {
				this.iedNum = iedNum;
			}
		}
	}

	@Override
	public DescribeGroupsResponse getInstance(UnmarshallerContext context) {
		return	DescribeGroupsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
