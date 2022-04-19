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

package com.aliyuncs.sas.model.v20181203;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas.transform.v20181203.DescribePropertyScaDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribePropertyScaDetailResponse extends AcsResponse {

	private String requestId;

	private List<PropertySca> propertys;

	private PageInfo pageInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<PropertySca> getPropertys() {
		return this.propertys;
	}

	public void setPropertys(List<PropertySca> propertys) {
		this.propertys = propertys;
	}

	public PageInfo getPageInfo() {
		return this.pageInfo;
	}

	public void setPageInfo(PageInfo pageInfo) {
		this.pageInfo = pageInfo;
	}

	public static class PropertySca {

		private String type;

		private String bizTypeDispaly;

		private Long processStarted;

		private String internetIp;

		private String configPath;

		private String pid;

		private String port;

		private String cmdline;

		private String bizType;

		private String listenIp;

		private String version;

		private String instanceName;

		private String listenStatus;

		private String name;

		private String ip;

		private String processUser;

		private String instanceId;

		private String webPath;

		private String ppid;

		private String intranetIp;

		private String uuid;

		private String listenProtocol;

		private String imageName;

		private String path;

		private String containerName;

		private String proof;

		private Long createTimestamp;

		private String runtimeEnvVersion;

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getBizTypeDispaly() {
			return this.bizTypeDispaly;
		}

		public void setBizTypeDispaly(String bizTypeDispaly) {
			this.bizTypeDispaly = bizTypeDispaly;
		}

		public Long getProcessStarted() {
			return this.processStarted;
		}

		public void setProcessStarted(Long processStarted) {
			this.processStarted = processStarted;
		}

		public String getInternetIp() {
			return this.internetIp;
		}

		public void setInternetIp(String internetIp) {
			this.internetIp = internetIp;
		}

		public String getConfigPath() {
			return this.configPath;
		}

		public void setConfigPath(String configPath) {
			this.configPath = configPath;
		}

		public String getPid() {
			return this.pid;
		}

		public void setPid(String pid) {
			this.pid = pid;
		}

		public String getPort() {
			return this.port;
		}

		public void setPort(String port) {
			this.port = port;
		}

		public String getCmdline() {
			return this.cmdline;
		}

		public void setCmdline(String cmdline) {
			this.cmdline = cmdline;
		}

		public String getBizType() {
			return this.bizType;
		}

		public void setBizType(String bizType) {
			this.bizType = bizType;
		}

		public String getListenIp() {
			return this.listenIp;
		}

		public void setListenIp(String listenIp) {
			this.listenIp = listenIp;
		}

		public String getVersion() {
			return this.version;
		}

		public void setVersion(String version) {
			this.version = version;
		}

		public String getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}

		public String getListenStatus() {
			return this.listenStatus;
		}

		public void setListenStatus(String listenStatus) {
			this.listenStatus = listenStatus;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getIp() {
			return this.ip;
		}

		public void setIp(String ip) {
			this.ip = ip;
		}

		public String getProcessUser() {
			return this.processUser;
		}

		public void setProcessUser(String processUser) {
			this.processUser = processUser;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getWebPath() {
			return this.webPath;
		}

		public void setWebPath(String webPath) {
			this.webPath = webPath;
		}

		public String getPpid() {
			return this.ppid;
		}

		public void setPpid(String ppid) {
			this.ppid = ppid;
		}

		public String getIntranetIp() {
			return this.intranetIp;
		}

		public void setIntranetIp(String intranetIp) {
			this.intranetIp = intranetIp;
		}

		public String getUuid() {
			return this.uuid;
		}

		public void setUuid(String uuid) {
			this.uuid = uuid;
		}

		public String getListenProtocol() {
			return this.listenProtocol;
		}

		public void setListenProtocol(String listenProtocol) {
			this.listenProtocol = listenProtocol;
		}

		public String getImageName() {
			return this.imageName;
		}

		public void setImageName(String imageName) {
			this.imageName = imageName;
		}

		public String getPath() {
			return this.path;
		}

		public void setPath(String path) {
			this.path = path;
		}

		public String getContainerName() {
			return this.containerName;
		}

		public void setContainerName(String containerName) {
			this.containerName = containerName;
		}

		public String getProof() {
			return this.proof;
		}

		public void setProof(String proof) {
			this.proof = proof;
		}

		public Long getCreateTimestamp() {
			return this.createTimestamp;
		}

		public void setCreateTimestamp(Long createTimestamp) {
			this.createTimestamp = createTimestamp;
		}

		public String getRuntimeEnvVersion() {
			return this.runtimeEnvVersion;
		}

		public void setRuntimeEnvVersion(String runtimeEnvVersion) {
			this.runtimeEnvVersion = runtimeEnvVersion;
		}
	}

	public static class PageInfo {

		private Integer currentPage;

		private Integer pageSize;

		private Integer totalCount;

		private Integer count;

		public Integer getCurrentPage() {
			return this.currentPage;
		}

		public void setCurrentPage(Integer currentPage) {
			this.currentPage = currentPage;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public Integer getCount() {
			return this.count;
		}

		public void setCount(Integer count) {
			this.count = count;
		}
	}

	@Override
	public DescribePropertyScaDetailResponse getInstance(UnmarshallerContext context) {
		return	DescribePropertyScaDetailResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
