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

package com.aliyuncs.retailcloud.model.v20180313;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.retailcloud.transform.v20180313.ListDeployConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListDeployConfigResponse extends AcsResponse {

	private String requestId;

	private Integer code;

	private String errorMsg;

	private Integer pageNumber;

	private Integer pageSize;

	private Long totalCount;

	private List<DeployConfigInstance> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getErrorMsg() {
		return this.errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public List<DeployConfigInstance> getData() {
		return this.data;
	}

	public void setData(List<DeployConfigInstance> data) {
		this.data = data;
	}

	public static class DeployConfigInstance {

		private String name;

		private Long id;

		private Long appId;

		private String envType;

		private ContainerCodePath containerCodePath;

		private ContainerYamlConf containerYamlConf;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Long getAppId() {
			return this.appId;
		}

		public void setAppId(Long appId) {
			this.appId = appId;
		}

		public String getEnvType() {
			return this.envType;
		}

		public void setEnvType(String envType) {
			this.envType = envType;
		}

		public ContainerCodePath getContainerCodePath() {
			return this.containerCodePath;
		}

		public void setContainerCodePath(ContainerCodePath containerCodePath) {
			this.containerCodePath = containerCodePath;
		}

		public ContainerYamlConf getContainerYamlConf() {
			return this.containerYamlConf;
		}

		public void setContainerYamlConf(ContainerYamlConf containerYamlConf) {
			this.containerYamlConf = containerYamlConf;
		}

		public static class ContainerCodePath {

			private String codePath;

			public String getCodePath() {
				return this.codePath;
			}

			public void setCodePath(String codePath) {
				this.codePath = codePath;
			}
		}

		public static class ContainerYamlConf {

			private String statefulSet;

			private String deployment;

			private String cronJob;

			private String configMap;

			private List<String> secretList;

			private List<String> configMapList;

			public String getStatefulSet() {
				return this.statefulSet;
			}

			public void setStatefulSet(String statefulSet) {
				this.statefulSet = statefulSet;
			}

			public String getDeployment() {
				return this.deployment;
			}

			public void setDeployment(String deployment) {
				this.deployment = deployment;
			}

			public String getCronJob() {
				return this.cronJob;
			}

			public void setCronJob(String cronJob) {
				this.cronJob = cronJob;
			}

			public String getConfigMap() {
				return this.configMap;
			}

			public void setConfigMap(String configMap) {
				this.configMap = configMap;
			}

			public List<String> getSecretList() {
				return this.secretList;
			}

			public void setSecretList(List<String> secretList) {
				this.secretList = secretList;
			}

			public List<String> getConfigMapList() {
				return this.configMapList;
			}

			public void setConfigMapList(List<String> configMapList) {
				this.configMapList = configMapList;
			}
		}
	}

	@Override
	public ListDeployConfigResponse getInstance(UnmarshallerContext context) {
		return	ListDeployConfigResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
