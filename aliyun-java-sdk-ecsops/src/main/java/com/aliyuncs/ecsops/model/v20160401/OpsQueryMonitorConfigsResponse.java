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
import com.aliyuncs.ecsops.transform.v20160401.OpsQueryMonitorConfigsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsQueryMonitorConfigsResponse extends AcsResponse {

	private String requestId;

	private List<MonitorConfig> monitorConfigList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<MonitorConfig> getMonitorConfigList() {
		return this.monitorConfigList;
	}

	public void setMonitorConfigList(List<MonitorConfig> monitorConfigList) {
		this.monitorConfigList = monitorConfigList;
	}

	public static class MonitorConfig {

		private Integer timeout;

		private String monitorCodeFile;

		private String trigger;

		private String owner;

		private String monitorItem;

		private String executor;

		private String description;

		private Integer totalSeconds;

		private String category;

		private Boolean enable;

		private List<MonitorResultKey> monitorResultKeys;

		private List<String> monitorResultFiles;

		private Inclusion inclusion;

		private Exclusion exclusion;

		public Integer getTimeout() {
			return this.timeout;
		}

		public void setTimeout(Integer timeout) {
			this.timeout = timeout;
		}

		public String getMonitorCodeFile() {
			return this.monitorCodeFile;
		}

		public void setMonitorCodeFile(String monitorCodeFile) {
			this.monitorCodeFile = monitorCodeFile;
		}

		public String getTrigger() {
			return this.trigger;
		}

		public void setTrigger(String trigger) {
			this.trigger = trigger;
		}

		public String getOwner() {
			return this.owner;
		}

		public void setOwner(String owner) {
			this.owner = owner;
		}

		public String getMonitorItem() {
			return this.monitorItem;
		}

		public void setMonitorItem(String monitorItem) {
			this.monitorItem = monitorItem;
		}

		public String getExecutor() {
			return this.executor;
		}

		public void setExecutor(String executor) {
			this.executor = executor;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Integer getTotalSeconds() {
			return this.totalSeconds;
		}

		public void setTotalSeconds(Integer totalSeconds) {
			this.totalSeconds = totalSeconds;
		}

		public String getCategory() {
			return this.category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public Boolean getEnable() {
			return this.enable;
		}

		public void setEnable(Boolean enable) {
			this.enable = enable;
		}

		public List<MonitorResultKey> getMonitorResultKeys() {
			return this.monitorResultKeys;
		}

		public void setMonitorResultKeys(List<MonitorResultKey> monitorResultKeys) {
			this.monitorResultKeys = monitorResultKeys;
		}

		public List<String> getMonitorResultFiles() {
			return this.monitorResultFiles;
		}

		public void setMonitorResultFiles(List<String> monitorResultFiles) {
			this.monitorResultFiles = monitorResultFiles;
		}

		public Inclusion getInclusion() {
			return this.inclusion;
		}

		public void setInclusion(Inclusion inclusion) {
			this.inclusion = inclusion;
		}

		public Exclusion getExclusion() {
			return this.exclusion;
		}

		public void setExclusion(Exclusion exclusion) {
			this.exclusion = exclusion;
		}

		public static class MonitorResultKey {

			private String resultFile;

			private List<String> resultKeys;

			public String getResultFile() {
				return this.resultFile;
			}

			public void setResultFile(String resultFile) {
				this.resultFile = resultFile;
			}

			public List<String> getResultKeys() {
				return this.resultKeys;
			}

			public void setResultKeys(List<String> resultKeys) {
				this.resultKeys = resultKeys;
			}
		}

		public static class Inclusion {

			private String ext;

			private List<String> nc;

			private List<String> cluster;

			public String getExt() {
				return this.ext;
			}

			public void setExt(String ext) {
				this.ext = ext;
			}

			public List<String> getNc() {
				return this.nc;
			}

			public void setNc(List<String> nc) {
				this.nc = nc;
			}

			public List<String> getCluster() {
				return this.cluster;
			}

			public void setCluster(List<String> cluster) {
				this.cluster = cluster;
			}
		}

		public static class Exclusion {

			private String ext;

			private List<String> nc1;

			private List<String> cluster2;

			public String getExt() {
				return this.ext;
			}

			public void setExt(String ext) {
				this.ext = ext;
			}

			public List<String> getNc1() {
				return this.nc1;
			}

			public void setNc1(List<String> nc1) {
				this.nc1 = nc1;
			}

			public List<String> getCluster2() {
				return this.cluster2;
			}

			public void setCluster2(List<String> cluster2) {
				this.cluster2 = cluster2;
			}
		}
	}

	@Override
	public OpsQueryMonitorConfigsResponse getInstance(UnmarshallerContext context) {
		return	OpsQueryMonitorConfigsResponseUnmarshaller.unmarshall(this, context);
	}
}
