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

package com.aliyuncs.ecsops.model.v20160401;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsListAxtPluginsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsListAxtPluginsResponse extends AcsResponse {

	private String requestId;

	private Long totalCount;

	private Long pageNumber;

	private Long pageSize;

	private List<Plugin> pluginList;

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

	public Long getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public List<Plugin> getPluginList() {
		return this.pluginList;
	}

	public void setPluginList(List<Plugin> pluginList) {
		this.pluginList = pluginList;
	}

	public static class Plugin {

		private String pluginId;

		private String name;

		private String publisher;

		private String url;

		private String md5;

		private String runPath;

		private Boolean preInstalled;

		private String pluginVersion;

		private String arch;

		private String osType;

		private String distro;

		private Long timeout;

		public String getPluginId() {
			return this.pluginId;
		}

		public void setPluginId(String pluginId) {
			this.pluginId = pluginId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getPublisher() {
			return this.publisher;
		}

		public void setPublisher(String publisher) {
			this.publisher = publisher;
		}

		public String getUrl() {
			return this.url;
		}

		public void setUrl(String url) {
			this.url = url;
		}

		public String getMd5() {
			return this.md5;
		}

		public void setMd5(String md5) {
			this.md5 = md5;
		}

		public String getRunPath() {
			return this.runPath;
		}

		public void setRunPath(String runPath) {
			this.runPath = runPath;
		}

		public Boolean getPreInstalled() {
			return this.preInstalled;
		}

		public void setPreInstalled(Boolean preInstalled) {
			this.preInstalled = preInstalled;
		}

		public String getPluginVersion() {
			return this.pluginVersion;
		}

		public void setPluginVersion(String pluginVersion) {
			this.pluginVersion = pluginVersion;
		}

		public String getArch() {
			return this.arch;
		}

		public void setArch(String arch) {
			this.arch = arch;
		}

		public String getOsType() {
			return this.osType;
		}

		public void setOsType(String osType) {
			this.osType = osType;
		}

		public String getDistro() {
			return this.distro;
		}

		public void setDistro(String distro) {
			this.distro = distro;
		}

		public Long getTimeout() {
			return this.timeout;
		}

		public void setTimeout(Long timeout) {
			this.timeout = timeout;
		}
	}

	@Override
	public OpsListAxtPluginsResponse getInstance(UnmarshallerContext context) {
		return	OpsListAxtPluginsResponseUnmarshaller.unmarshall(this, context);
	}
}
