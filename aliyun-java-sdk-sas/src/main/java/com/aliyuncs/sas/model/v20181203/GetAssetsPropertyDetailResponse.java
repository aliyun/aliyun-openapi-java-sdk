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
import com.aliyuncs.sas.transform.v20181203.GetAssetsPropertyDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetAssetsPropertyDetailResponse extends AcsResponse {

	private String requestId;

	private List<Property> propertys;

	private PageInfo pageInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Property> getPropertys() {
		return this.propertys;
	}

	public void setPropertys(List<Property> propertys) {
		this.propertys = propertys;
	}

	public PageInfo getPageInfo() {
		return this.pageInfo;
	}

	public void setPageInfo(PageInfo pageInfo) {
		this.pageInfo = pageInfo;
	}

	public static class Property {

		private String moduleName;

		private Integer size;

		private String filepath;

		private Integer usedByCount;

		private String path;

		private String serverType;

		private String port;

		private String pid;

		private String listenIp;

		private String listenStatus;

		private String listenProtocol;

		private Long processStarted;

		private String processStartedTime;

		private String webPath;

		private String domain;

		private String user;

		private String pathMode;

		private String instanceId;

		private String intranetIp;

		private String internetIp;

		private String ip;

		private String uuid;

		private String instanceName;

		private String regionId;

		private Long createTimestamp;

		private Long id;

		private String imageName;

		private String containerName;

		private String runtimeEnvVersion;

		public String getModuleName() {
			return this.moduleName;
		}

		public void setModuleName(String moduleName) {
			this.moduleName = moduleName;
		}

		public Integer getSize() {
			return this.size;
		}

		public void setSize(Integer size) {
			this.size = size;
		}

		public String getFilepath() {
			return this.filepath;
		}

		public void setFilepath(String filepath) {
			this.filepath = filepath;
		}

		public Integer getUsedByCount() {
			return this.usedByCount;
		}

		public void setUsedByCount(Integer usedByCount) {
			this.usedByCount = usedByCount;
		}

		public String getPath() {
			return this.path;
		}

		public void setPath(String path) {
			this.path = path;
		}

		public String getServerType() {
			return this.serverType;
		}

		public void setServerType(String serverType) {
			this.serverType = serverType;
		}

		public String getPort() {
			return this.port;
		}

		public void setPort(String port) {
			this.port = port;
		}

		public String getPid() {
			return this.pid;
		}

		public void setPid(String pid) {
			this.pid = pid;
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

		public String getProcessStartedTime() {
			return this.processStartedTime;
		}

		public void setProcessStartedTime(String processStartedTime) {
			this.processStartedTime = processStartedTime;
		}

		public String getWebPath() {
			return this.webPath;
		}

		public void setWebPath(String webPath) {
			this.webPath = webPath;
		}

		public String getDomain() {
			return this.domain;
		}

		public void setDomain(String domain) {
			this.domain = domain;
		}

		public String getUser() {
			return this.user;
		}

		public void setUser(String user) {
			this.user = user;
		}

		public String getPathMode() {
			return this.pathMode;
		}

		public void setPathMode(String pathMode) {
			this.pathMode = pathMode;
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

		public String getIp() {
			return this.ip;
		}

		public void setIp(String ip) {
			this.ip = ip;
		}

		public String getUuid() {
			return this.uuid;
		}

		public void setUuid(String uuid) {
			this.uuid = uuid;
		}

		public String getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public Long getCreateTimestamp() {
			return this.createTimestamp;
		}

		public void setCreateTimestamp(Long createTimestamp) {
			this.createTimestamp = createTimestamp;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getImageName() {
			return this.imageName;
		}

		public void setImageName(String imageName) {
			this.imageName = imageName;
		}

		public String getContainerName() {
			return this.containerName;
		}

		public void setContainerName(String containerName) {
			this.containerName = containerName;
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
	public GetAssetsPropertyDetailResponse getInstance(UnmarshallerContext context) {
		return	GetAssetsPropertyDetailResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
