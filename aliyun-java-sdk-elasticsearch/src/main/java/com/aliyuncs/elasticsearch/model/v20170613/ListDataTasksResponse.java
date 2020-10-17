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

package com.aliyuncs.elasticsearch.model.v20170613;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.elasticsearch.transform.v20170613.ListDataTasksResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListDataTasksResponse extends AcsResponse {

	private String requestId;

	private List<ResultItem> result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ResultItem> getResult() {
		return this.result;
	}

	public void setResult(List<ResultItem> result) {
		this.result = result;
	}

	public static class ResultItem {

		private String createTime;

		private String status;

		private String taskId;

		private SinkCluster sinkCluster;

		private SourceCluster sourceCluster;

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getTaskId() {
			return this.taskId;
		}

		public void setTaskId(String taskId) {
			this.taskId = taskId;
		}

		public SinkCluster getSinkCluster() {
			return this.sinkCluster;
		}

		public void setSinkCluster(SinkCluster sinkCluster) {
			this.sinkCluster = sinkCluster;
		}

		public SourceCluster getSourceCluster() {
			return this.sourceCluster;
		}

		public void setSourceCluster(SourceCluster sourceCluster) {
			this.sourceCluster = sourceCluster;
		}

		public static class SinkCluster {

			private String dataSourceType;

			private String endpoint;

			private String index;

			private String type;

			private String vpcId;

			private String vpcInstanceId;

			private String vpcInstancePort;

			public String getDataSourceType() {
				return this.dataSourceType;
			}

			public void setDataSourceType(String dataSourceType) {
				this.dataSourceType = dataSourceType;
			}

			public String getEndpoint() {
				return this.endpoint;
			}

			public void setEndpoint(String endpoint) {
				this.endpoint = endpoint;
			}

			public String getIndex() {
				return this.index;
			}

			public void setIndex(String index) {
				this.index = index;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getVpcId() {
				return this.vpcId;
			}

			public void setVpcId(String vpcId) {
				this.vpcId = vpcId;
			}

			public String getVpcInstanceId() {
				return this.vpcInstanceId;
			}

			public void setVpcInstanceId(String vpcInstanceId) {
				this.vpcInstanceId = vpcInstanceId;
			}

			public String getVpcInstancePort() {
				return this.vpcInstancePort;
			}

			public void setVpcInstancePort(String vpcInstancePort) {
				this.vpcInstancePort = vpcInstancePort;
			}
		}

		public static class SourceCluster {

			private String dataSourceType;

			private String index;

			private String mapping;

			private String routing;

			private String settings;

			private String type;

			public String getDataSourceType() {
				return this.dataSourceType;
			}

			public void setDataSourceType(String dataSourceType) {
				this.dataSourceType = dataSourceType;
			}

			public String getIndex() {
				return this.index;
			}

			public void setIndex(String index) {
				this.index = index;
			}

			public String getMapping() {
				return this.mapping;
			}

			public void setMapping(String mapping) {
				this.mapping = mapping;
			}

			public String getRouting() {
				return this.routing;
			}

			public void setRouting(String routing) {
				this.routing = routing;
			}

			public String getSettings() {
				return this.settings;
			}

			public void setSettings(String settings) {
				this.settings = settings;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}
		}
	}

	@Override
	public ListDataTasksResponse getInstance(UnmarshallerContext context) {
		return	ListDataTasksResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
