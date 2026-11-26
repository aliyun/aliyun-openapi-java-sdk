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

package com.aliyuncs.gpdb.model.v20160503;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.gpdb.transform.v20160503.ListModelServicesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListModelServicesResponse extends AcsResponse {

	private Integer totalRecordCount;

	private Integer pageRecordCount;

	private String requestId;

	private Integer pageNumber;

	private List<ModelServiceInfos> modelServices;

	public Integer getTotalRecordCount() {
		return this.totalRecordCount;
	}

	public void setTotalRecordCount(Integer totalRecordCount) {
		this.totalRecordCount = totalRecordCount;
	}

	public Integer getPageRecordCount() {
		return this.pageRecordCount;
	}

	public void setPageRecordCount(Integer pageRecordCount) {
		this.pageRecordCount = pageRecordCount;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public List<ModelServiceInfos> getModelServices() {
		return this.modelServices;
	}

	public void setModelServices(List<ModelServiceInfos> modelServices) {
		this.modelServices = modelServices;
	}

	public static class ModelServiceInfos {

		private String status;

		private String description;

		private String modelName;

		private String apiKey;

		private String securityIPList;

		private String publicConnUrl;

		private String createTime;

		private String modelServiceId;

		private String privateConnUrl;

		private Map<Object,Object> modelParams;

		private List<String> aiNodes;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getModelName() {
			return this.modelName;
		}

		public void setModelName(String modelName) {
			this.modelName = modelName;
		}

		public String getApiKey() {
			return this.apiKey;
		}

		public void setApiKey(String apiKey) {
			this.apiKey = apiKey;
		}

		public String getSecurityIPList() {
			return this.securityIPList;
		}

		public void setSecurityIPList(String securityIPList) {
			this.securityIPList = securityIPList;
		}

		public String getPublicConnUrl() {
			return this.publicConnUrl;
		}

		public void setPublicConnUrl(String publicConnUrl) {
			this.publicConnUrl = publicConnUrl;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getModelServiceId() {
			return this.modelServiceId;
		}

		public void setModelServiceId(String modelServiceId) {
			this.modelServiceId = modelServiceId;
		}

		public String getPrivateConnUrl() {
			return this.privateConnUrl;
		}

		public void setPrivateConnUrl(String privateConnUrl) {
			this.privateConnUrl = privateConnUrl;
		}

		public Map<Object,Object> getModelParams() {
			return this.modelParams;
		}

		public void setModelParams(Map<Object,Object> modelParams) {
			this.modelParams = modelParams;
		}

		public List<String> getAiNodes() {
			return this.aiNodes;
		}

		public void setAiNodes(List<String> aiNodes) {
			this.aiNodes = aiNodes;
		}
	}

	@Override
	public ListModelServicesResponse getInstance(UnmarshallerContext context) {
		return	ListModelServicesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
