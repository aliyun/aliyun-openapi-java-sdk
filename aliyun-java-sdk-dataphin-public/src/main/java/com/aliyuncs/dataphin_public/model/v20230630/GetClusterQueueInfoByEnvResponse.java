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

package com.aliyuncs.dataphin_public.model.v20230630;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataphin_public.transform.v20230630.GetClusterQueueInfoByEnvResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetClusterQueueInfoByEnvResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Integer httpStatusCode;

	private String code;

	private String message;

	private List<DataItem> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String clusterId;

		private String queueName;

		private String maxVcore;

		private String namespace;

		private String createAt;

		private String modifiedAt;

		private String annotations;

		private String labels;

		private String resourceVersion;

		private String spec;

		private String vvpClusterType;

		private String flinkVersion;

		private String flinkImageRegistry;

		private String flinkImageRepository;

		private String flinkImageTag;

		public String getClusterId() {
			return this.clusterId;
		}

		public void setClusterId(String clusterId) {
			this.clusterId = clusterId;
		}

		public String getQueueName() {
			return this.queueName;
		}

		public void setQueueName(String queueName) {
			this.queueName = queueName;
		}

		public String getMaxVcore() {
			return this.maxVcore;
		}

		public void setMaxVcore(String maxVcore) {
			this.maxVcore = maxVcore;
		}

		public String getNamespace() {
			return this.namespace;
		}

		public void setNamespace(String namespace) {
			this.namespace = namespace;
		}

		public String getCreateAt() {
			return this.createAt;
		}

		public void setCreateAt(String createAt) {
			this.createAt = createAt;
		}

		public String getModifiedAt() {
			return this.modifiedAt;
		}

		public void setModifiedAt(String modifiedAt) {
			this.modifiedAt = modifiedAt;
		}

		public String getAnnotations() {
			return this.annotations;
		}

		public void setAnnotations(String annotations) {
			this.annotations = annotations;
		}

		public String getLabels() {
			return this.labels;
		}

		public void setLabels(String labels) {
			this.labels = labels;
		}

		public String getResourceVersion() {
			return this.resourceVersion;
		}

		public void setResourceVersion(String resourceVersion) {
			this.resourceVersion = resourceVersion;
		}

		public String getSpec() {
			return this.spec;
		}

		public void setSpec(String spec) {
			this.spec = spec;
		}

		public String getVvpClusterType() {
			return this.vvpClusterType;
		}

		public void setVvpClusterType(String vvpClusterType) {
			this.vvpClusterType = vvpClusterType;
		}

		public String getFlinkVersion() {
			return this.flinkVersion;
		}

		public void setFlinkVersion(String flinkVersion) {
			this.flinkVersion = flinkVersion;
		}

		public String getFlinkImageRegistry() {
			return this.flinkImageRegistry;
		}

		public void setFlinkImageRegistry(String flinkImageRegistry) {
			this.flinkImageRegistry = flinkImageRegistry;
		}

		public String getFlinkImageRepository() {
			return this.flinkImageRepository;
		}

		public void setFlinkImageRepository(String flinkImageRepository) {
			this.flinkImageRepository = flinkImageRepository;
		}

		public String getFlinkImageTag() {
			return this.flinkImageTag;
		}

		public void setFlinkImageTag(String flinkImageTag) {
			this.flinkImageTag = flinkImageTag;
		}
	}

	@Override
	public GetClusterQueueInfoByEnvResponse getInstance(UnmarshallerContext context) {
		return	GetClusterQueueInfoByEnvResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
