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

package com.aliyuncs.drds.model.v20171016;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.drds.transform.v20171016.DescribeRdsListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeRdsListResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private List<RdsInstance> data;

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

	public List<RdsInstance> getData() {
		return this.data;
	}

	public void setData(List<RdsInstance> data) {
		this.data = data;
	}

	public static class RdsInstance {

		private Integer instanceId;

		private String instanceName;

		private String connectUrl;

		private Integer port;

		private String instanceStatus;

		private String dbType;

		private Integer readWeight;

		private List<Child> readOnlyChildren;

		public Integer getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(Integer instanceId) {
			this.instanceId = instanceId;
		}

		public String getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}

		public String getConnectUrl() {
			return this.connectUrl;
		}

		public void setConnectUrl(String connectUrl) {
			this.connectUrl = connectUrl;
		}

		public Integer getPort() {
			return this.port;
		}

		public void setPort(Integer port) {
			this.port = port;
		}

		public String getInstanceStatus() {
			return this.instanceStatus;
		}

		public void setInstanceStatus(String instanceStatus) {
			this.instanceStatus = instanceStatus;
		}

		public String getDbType() {
			return this.dbType;
		}

		public void setDbType(String dbType) {
			this.dbType = dbType;
		}

		public Integer getReadWeight() {
			return this.readWeight;
		}

		public void setReadWeight(Integer readWeight) {
			this.readWeight = readWeight;
		}

		public List<Child> getReadOnlyChildren() {
			return this.readOnlyChildren;
		}

		public void setReadOnlyChildren(List<Child> readOnlyChildren) {
			this.readOnlyChildren = readOnlyChildren;
		}

		public static class Child {

			private String instanceId;

			private String instanceName;

			private String connectUrl;

			private Integer port;

			private String instanceStatus;

			private String dbType;

			private Integer readWeight;

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public String getInstanceName() {
				return this.instanceName;
			}

			public void setInstanceName(String instanceName) {
				this.instanceName = instanceName;
			}

			public String getConnectUrl() {
				return this.connectUrl;
			}

			public void setConnectUrl(String connectUrl) {
				this.connectUrl = connectUrl;
			}

			public Integer getPort() {
				return this.port;
			}

			public void setPort(Integer port) {
				this.port = port;
			}

			public String getInstanceStatus() {
				return this.instanceStatus;
			}

			public void setInstanceStatus(String instanceStatus) {
				this.instanceStatus = instanceStatus;
			}

			public String getDbType() {
				return this.dbType;
			}

			public void setDbType(String dbType) {
				this.dbType = dbType;
			}

			public Integer getReadWeight() {
				return this.readWeight;
			}

			public void setReadWeight(Integer readWeight) {
				this.readWeight = readWeight;
			}
		}
	}

	@Override
	public DescribeRdsListResponse getInstance(UnmarshallerContext context) {
		return	DescribeRdsListResponseUnmarshaller.unmarshall(this, context);
	}
}
