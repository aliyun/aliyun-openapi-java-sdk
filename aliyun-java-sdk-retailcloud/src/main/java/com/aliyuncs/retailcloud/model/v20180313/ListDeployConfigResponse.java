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

	private Integer code;

	private String errorMsg;

	private Integer pageNumber;

	private Integer pageSize;

	private String requestId;

	private Long totalCount;

	private List<DeployConfigInstance> data;

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

	public List<DeployConfigInstance> getData() {
		return this.data;
	}

	public void setData(List<DeployConfigInstance> data) {
		this.data = data;
	}

	public static class DeployConfigInstance {

		private Long id;

		private String name;

		private Long appId;

		private String envType;

		private ContainerCodePath containerCodePath;

		private ContainerYamlConf containerYamlConf;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
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

			private String deployment;

			private String configMap;

			private String statefulSet;

			private List<String> configMapList;

			public String getDeployment() {
				return this.deployment;
			}

			public void setDeployment(String deployment) {
				this.deployment = deployment;
			}

			public String getConfigMap() {
				return this.configMap;
			}

			public void setConfigMap(String configMap) {
				this.configMap = configMap;
			}

			public String getStatefulSet() {
				return this.statefulSet;
			}

			public void setStatefulSet(String statefulSet) {
				this.statefulSet = statefulSet;
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
