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

		private String instanceName;

		private String ip;

		private String create;

		private Long createTimestamp;

		private String uuid;

		private String instanceId;

		private String intranetIp;

		private String internetIp;

		private String name;

		private String type;

		private String version;

		private String pid;

		private String bizType;

		private String bizTypeDispaly;

		private String port;

		private String containerName;

		private String path;

		private String ppid;

		private String processUser;

		private String listenIp;

		private String listenStatus;

		private String listenProtocol;

		private Long processStarted;

		private String cmdline;

		private String configPath;

		private String webPath;

		private String proof;

		private String imageName;

		public String getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}

		public String getIp() {
			return this.ip;
		}

		public void setIp(String ip) {
			this.ip = ip;
		}

		public String getCreate() {
			return this.create;
		}

		public void setCreate(String create) {
			this.create = create;
		}

		public Long getCreateTimestamp() {
			return this.createTimestamp;
		}

		public void setCreateTimestamp(Long createTimestamp) {
			this.createTimestamp = createTimestamp;
		}

		public String getUuid() {
			return this.uuid;
		}

		public void setUuid(String uuid) {
			this.uuid = uuid;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getIntranetIp() {
			return this.intranetIp;
		}

		public void setIntranetIp(String intranetIp) {
			this.intranetIp = intranetIp;
		}

		public String getInternetIp() {
			return this.internetIp;
		}

		public void setInternetIp(String internetIp) {
			this.internetIp = internetIp;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getVersion() {
			return this.version;
		}

		public void setVersion(String version) {
			this.version = version;
		}

		public String getPid() {
			return this.pid;
		}

		public void setPid(String pid) {
			this.pid = pid;
		}

		public String getBizType() {
			return this.bizType;
		}

		public void setBizType(String bizType) {
			this.bizType = bizType;
		}

		public String getBizTypeDispaly() {
			return this.bizTypeDispaly;
		}

		public void setBizTypeDispaly(String bizTypeDispaly) {
			this.bizTypeDispaly = bizTypeDispaly;
		}

		public String getPort() {
			return this.port;
		}

		public void setPort(String port) {
			this.port = port;
		}

		public String getContainerName() {
			return this.containerName;
		}

		public void setContainerName(String containerName) {
			this.containerName = containerName;
		}

		public String getPath() {
			return this.path;
		}

		public void setPath(String path) {
			this.path = path;
		}

		public String getPpid() {
			return this.ppid;
		}

		public void setPpid(String ppid) {
			this.ppid = ppid;
		}

		public String getProcessUser() {
			return this.processUser;
		}

		public void setProcessUser(String processUser) {
			this.processUser = processUser;
		}

		public String getListenIp() {
			return this.listenIp;
		}

		public void setListenIp(String listenIp) {
			this.listenIp = listenIp;
		}

		public String getListenStatus() {
			return this.listenStatus;
		}

		public void setListenStatus(String listenStatus) {
			this.listenStatus = listenStatus;
		}

		public String getListenProtocol() {
			return this.listenProtocol;
		}

		public void setListenProtocol(String listenProtocol) {
			this.listenProtocol = listenProtocol;
		}

		public Long getProcessStarted() {
			return this.processStarted;
		}

		public void setProcessStarted(Long processStarted) {
			this.processStarted = processStarted;
		}

		public String getCmdline() {
			return this.cmdline;
		}

		public void setCmdline(String cmdline) {
			this.cmdline = cmdline;
		}

		public String getConfigPath() {
			return this.configPath;
		}

		public void setConfigPath(String configPath) {
			this.configPath = configPath;
		}

		public String getWebPath() {
			return this.webPath;
		}

		public void setWebPath(String webPath) {
			this.webPath = webPath;
		}

		public String getProof() {
			return this.proof;
		}

		public void setProof(String proof) {
			this.proof = proof;
		}

		public String getImageName() {
			return this.imageName;
		}

		public void setImageName(String imageName) {
			this.imageName = imageName;
		}
	}

	public static class PageInfo {

		private Integer count;

		private Integer pageSize;

		private Integer totalCount;

		private Integer currentPage;

		public Integer getCount() {
			return this.count;
		}

		public void setCount(Integer count) {
			this.count = count;
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

		public Integer getCurrentPage() {
			return this.currentPage;
		}

		public void setCurrentPage(Integer currentPage) {
			this.currentPage = currentPage;
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
