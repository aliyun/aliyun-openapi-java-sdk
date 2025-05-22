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
import com.aliyuncs.rds.transform.v20140815.DescribeKmsAssociateResourcesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeKmsAssociateResourcesResponse extends AcsResponse {

	private Boolean associateStatus;

	private String requestId;

	private List<DBInstance> associateDBInstances;

	public Boolean getAssociateStatus() {
		return this.associateStatus;
	}

	public void setAssociateStatus(Boolean associateStatus) {
		this.associateStatus = associateStatus;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DBInstance> getAssociateDBInstances() {
		return this.associateDBInstances;
	}

	public void setAssociateDBInstances(List<DBInstance> associateDBInstances) {
		this.associateDBInstances = associateDBInstances;
	}

	public static class DBInstance {

		private String dBInstanceName;

		private String engine;

		private String keyUsedBy;

		private String status;

		public String getDBInstanceName() {
			return this.dBInstanceName;
		}

		public void setDBInstanceName(String dBInstanceName) {
			this.dBInstanceName = dBInstanceName;
		}

		public String getEngine() {
			return this.engine;
		}

		public void setEngine(String engine) {
			this.engine = engine;
		}

		public String getKeyUsedBy() {
			return this.keyUsedBy;
		}

		public void setKeyUsedBy(String keyUsedBy) {
			this.keyUsedBy = keyUsedBy;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}
	}

	@Override
	public DescribeKmsAssociateResourcesResponse getInstance(UnmarshallerContext context) {
		return	DescribeKmsAssociateResourcesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
