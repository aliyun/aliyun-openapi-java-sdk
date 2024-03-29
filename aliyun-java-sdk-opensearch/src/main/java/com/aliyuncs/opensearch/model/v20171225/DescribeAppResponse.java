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

package com.aliyuncs.opensearch.model.v20171225;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.opensearch.transform.v20171225.DescribeAppResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAppResponse extends AcsResponse {

	private String requestId;

	private Result result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private Integer created;

		private String clusterName;

		private Boolean autoSwitch;

		private Integer algoDeploymentId;

		private String type;

		private String description;

		private String status;

		private Map<Object,Object> schema;

		private Integer progressPercent;

		private String id;

		private List<String> fetchFields;

		private Quota quota;

		private Domain domain;

		public Integer getCreated() {
			return this.created;
		}

		public void setCreated(Integer created) {
			this.created = created;
		}

		public String getClusterName() {
			return this.clusterName;
		}

		public void setClusterName(String clusterName) {
			this.clusterName = clusterName;
		}

		public Boolean getAutoSwitch() {
			return this.autoSwitch;
		}

		public void setAutoSwitch(Boolean autoSwitch) {
			this.autoSwitch = autoSwitch;
		}

		public Integer getAlgoDeploymentId() {
			return this.algoDeploymentId;
		}

		public void setAlgoDeploymentId(Integer algoDeploymentId) {
			this.algoDeploymentId = algoDeploymentId;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Map<Object,Object> getSchema() {
			return this.schema;
		}

		public void setSchema(Map<Object,Object> schema) {
			this.schema = schema;
		}

		public Integer getProgressPercent() {
			return this.progressPercent;
		}

		public void setProgressPercent(Integer progressPercent) {
			this.progressPercent = progressPercent;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public List<String> getFetchFields() {
			return this.fetchFields;
		}

		public void setFetchFields(List<String> fetchFields) {
			this.fetchFields = fetchFields;
		}

		public Quota getQuota() {
			return this.quota;
		}

		public void setQuota(Quota quota) {
			this.quota = quota;
		}

		public Domain getDomain() {
			return this.domain;
		}

		public void setDomain(Domain domain) {
			this.domain = domain;
		}

		public static class Quota {

			private String spec;

			private Integer qps;

			private Integer docSize;

			private Integer computeResource;

			public String getSpec() {
				return this.spec;
			}

			public void setSpec(String spec) {
				this.spec = spec;
			}

			public Integer getQps() {
				return this.qps;
			}

			public void setQps(Integer qps) {
				this.qps = qps;
			}

			public Integer getDocSize() {
				return this.docSize;
			}

			public void setDocSize(Integer docSize) {
				this.docSize = docSize;
			}

			public Integer getComputeResource() {
				return this.computeResource;
			}

			public void setComputeResource(Integer computeResource) {
				this.computeResource = computeResource;
			}
		}

		public static class Domain {

			private String category;

			private String name;

			private Functions functions;

			public String getCategory() {
				return this.category;
			}

			public void setCategory(String category) {
				this.category = category;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public Functions getFunctions() {
				return this.functions;
			}

			public void setFunctions(Functions functions) {
				this.functions = functions;
			}

			public static class Functions {

				private List<String> service;

				private List<String> qp;

				private List<String> algo;

				public List<String> getService() {
					return this.service;
				}

				public void setService(List<String> service) {
					this.service = service;
				}

				public List<String> getQp() {
					return this.qp;
				}

				public void setQp(List<String> qp) {
					this.qp = qp;
				}

				public List<String> getAlgo() {
					return this.algo;
				}

				public void setAlgo(List<String> algo) {
					this.algo = algo;
				}
			}
		}
	}

	@Override
	public DescribeAppResponse getInstance(UnmarshallerContext context) {
		return	DescribeAppResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
