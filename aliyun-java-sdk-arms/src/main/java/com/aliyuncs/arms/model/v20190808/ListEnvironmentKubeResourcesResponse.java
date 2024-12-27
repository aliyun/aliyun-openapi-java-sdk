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

package com.aliyuncs.arms.model.v20190808;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.arms.transform.v20190808.ListEnvironmentKubeResourcesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListEnvironmentKubeResourcesResponse extends AcsResponse {

	private String requestId;

	private Integer code;

	private Boolean success;

	private String message;

	private List<DataItem> data;

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

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
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

		private String apiVersion;

		private String kind;

		private Object spec;

		private Object status;

		private Metadata metadata;

		public String getApiVersion() {
			return this.apiVersion;
		}

		public void setApiVersion(String apiVersion) {
			this.apiVersion = apiVersion;
		}

		public String getKind() {
			return this.kind;
		}

		public void setKind(String kind) {
			this.kind = kind;
		}

		public Object getSpec() {
			return this.spec;
		}

		public void setSpec(Object spec) {
			this.spec = spec;
		}

		public Object getStatus() {
			return this.status;
		}

		public void setStatus(Object status) {
			this.status = status;
		}

		public Metadata getMetadata() {
			return this.metadata;
		}

		public void setMetadata(Metadata metadata) {
			this.metadata = metadata;
		}

		public static class Metadata {

			private Map<Object,Object> annotations;

			private Map<Object,Object> labels;

			private String name;

			private String namespace;

			public Map<Object,Object> getAnnotations() {
				return this.annotations;
			}

			public void setAnnotations(Map<Object,Object> annotations) {
				this.annotations = annotations;
			}

			public Map<Object,Object> getLabels() {
				return this.labels;
			}

			public void setLabels(Map<Object,Object> labels) {
				this.labels = labels;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getNamespace() {
				return this.namespace;
			}

			public void setNamespace(String namespace) {
				this.namespace = namespace;
			}
		}
	}

	@Override
	public ListEnvironmentKubeResourcesResponse getInstance(UnmarshallerContext context) {
		return	ListEnvironmentKubeResourcesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
