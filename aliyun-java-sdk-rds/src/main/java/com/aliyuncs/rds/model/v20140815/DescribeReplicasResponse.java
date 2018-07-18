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

package com.aliyuncs.rds.model.v20140815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.rds.transform.v20140815.DescribeReplicasResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeReplicasResponse extends AcsResponse {

	private String requestId;

	private String pageNumber;

	private Integer totalRecordCount;

	private Integer pageRecordCount;

	private List<Items> replicas;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(String pageNumber) {
		this.pageNumber = pageNumber;
	}

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

	public List<Items> getReplicas() {
		return this.replicas;
	}

	public void setReplicas(List<Items> replicas) {
		this.replicas = replicas;
	}

	public static class Items {

		private String replicaId;

		private String replicaDescription;

		private String replicaStatus;

		private String replicaMode;

		private String domainMode;

		private List<Items1> dBInstances;

		public String getReplicaId() {
			return this.replicaId;
		}

		public void setReplicaId(String replicaId) {
			this.replicaId = replicaId;
		}

		public String getReplicaDescription() {
			return this.replicaDescription;
		}

		public void setReplicaDescription(String replicaDescription) {
			this.replicaDescription = replicaDescription;
		}

		public String getReplicaStatus() {
			return this.replicaStatus;
		}

		public void setReplicaStatus(String replicaStatus) {
			this.replicaStatus = replicaStatus;
		}

		public String getReplicaMode() {
			return this.replicaMode;
		}

		public void setReplicaMode(String replicaMode) {
			this.replicaMode = replicaMode;
		}

		public String getDomainMode() {
			return this.domainMode;
		}

		public void setDomainMode(String domainMode) {
			this.domainMode = domainMode;
		}

		public List<Items1> getDBInstances() {
			return this.dBInstances;
		}

		public void setDBInstances(List<Items1> dBInstances) {
			this.dBInstances = dBInstances;
		}

		public static class Items1 {

			private String dBInstanceId;

			private String role;

			private String readWriteType;

			private String instanceNetworkType;

			private String dBInstanceDescription;

			private String dBInstanceStatus;

			private String engine;

			private String regionId;

			public String getDBInstanceId() {
				return this.dBInstanceId;
			}

			public void setDBInstanceId(String dBInstanceId) {
				this.dBInstanceId = dBInstanceId;
			}

			public String getRole() {
				return this.role;
			}

			public void setRole(String role) {
				this.role = role;
			}

			public String getReadWriteType() {
				return this.readWriteType;
			}

			public void setReadWriteType(String readWriteType) {
				this.readWriteType = readWriteType;
			}

			public String getInstanceNetworkType() {
				return this.instanceNetworkType;
			}

			public void setInstanceNetworkType(String instanceNetworkType) {
				this.instanceNetworkType = instanceNetworkType;
			}

			public String getDBInstanceDescription() {
				return this.dBInstanceDescription;
			}

			public void setDBInstanceDescription(String dBInstanceDescription) {
				this.dBInstanceDescription = dBInstanceDescription;
			}

			public String getDBInstanceStatus() {
				return this.dBInstanceStatus;
			}

			public void setDBInstanceStatus(String dBInstanceStatus) {
				this.dBInstanceStatus = dBInstanceStatus;
			}

			public String getEngine() {
				return this.engine;
			}

			public void setEngine(String engine) {
				this.engine = engine;
			}

			public String getRegionId() {
				return this.regionId;
			}

			public void setRegionId(String regionId) {
				this.regionId = regionId;
			}
		}
	}

	@Override
	public DescribeReplicasResponse getInstance(UnmarshallerContext context) {
		return	DescribeReplicasResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
