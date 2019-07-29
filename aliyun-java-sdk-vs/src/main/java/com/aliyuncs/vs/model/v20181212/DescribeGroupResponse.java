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
import com.aliyuncs.vs.transform.v20181212.DescribeGroupResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeGroupResponse extends AcsResponse {

	private String requestId;

	private String id;

	private String name;

	private String description;

	private String app;

	private String region;

	private String inProtocol;

	private String outProtocol;

	private Boolean enabled;

	private String status;

	private String createdTime;

	private String pushDomain;

	private String playDomain;

	private String gbId;

	private String gbIp;

	private Long gbPort;

	private Long gbUdpPort;

	private Long gbTcpPort;

	private Stats stats;

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

	public String getApp() {
		return this.app;
	}

	public void setApp(String app) {
		this.app = app;
	}

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getInProtocol() {
		return this.inProtocol;
	}

	public void setInProtocol(String inProtocol) {
		this.inProtocol = inProtocol;
	}

	public String getOutProtocol() {
		return this.outProtocol;
	}

	public void setOutProtocol(String outProtocol) {
		this.outProtocol = outProtocol;
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

	public Long getGbPort() {
		return this.gbPort;
	}

	public void setGbPort(Long gbPort) {
		this.gbPort = gbPort;
	}

	public Long getGbUdpPort() {
		return this.gbUdpPort;
	}

	public void setGbUdpPort(Long gbUdpPort) {
		this.gbUdpPort = gbUdpPort;
	}

	public Long getGbTcpPort() {
		return this.gbTcpPort;
	}

	public void setGbTcpPort(Long gbTcpPort) {
		this.gbTcpPort = gbTcpPort;
	}

	public Stats getStats() {
		return this.stats;
	}

	public void setStats(Stats stats) {
		this.stats = stats;
	}

	public static class Stats {

		private Long deviceNum;

		private Long iedNum;

		private Long ipcNum;

		private Long platformNum;

		public Long getDeviceNum() {
			return this.deviceNum;
		}

		public void setDeviceNum(Long deviceNum) {
			this.deviceNum = deviceNum;
		}

		public Long getIedNum() {
			return this.iedNum;
		}

		public void setIedNum(Long iedNum) {
			this.iedNum = iedNum;
		}

		public Long getIpcNum() {
			return this.ipcNum;
		}

		public void setIpcNum(Long ipcNum) {
			this.ipcNum = ipcNum;
		}

		public Long getPlatformNum() {
			return this.platformNum;
		}

		public void setPlatformNum(Long platformNum) {
			this.platformNum = platformNum;
		}
	}

	@Override
	public DescribeGroupResponse getInstance(UnmarshallerContext context) {
		return	DescribeGroupResponseUnmarshaller.unmarshall(this, context);
	}
}
