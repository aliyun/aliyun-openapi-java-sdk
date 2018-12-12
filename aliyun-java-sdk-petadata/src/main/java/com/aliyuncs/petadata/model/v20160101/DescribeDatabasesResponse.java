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

package com.aliyuncs.petadata.model.v20160101;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.petadata.transform.v20160101.DescribeDatabasesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDatabasesResponse extends AcsResponse {

	private String requestId;

	private String instanceId;

	private List<Database> databases;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}

	public List<Database> getDatabases() {
		return this.databases;
	}

	public void setDatabases(List<Database> databases) {
		this.databases = databases;
	}

	public static class Database {

		private String instanceId;

		private String dBName;

		private String dBStatus;

		private String nodeSpec;

		private Integer nodeNumber;

		private String chargeType;

		private String createTime;

		private String endTime;

		private String dBType;

		private String sourceInstanceId;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getDBName() {
			return this.dBName;
		}

		public void setDBName(String dBName) {
			this.dBName = dBName;
		}

		public String getDBStatus() {
			return this.dBStatus;
		}

		public void setDBStatus(String dBStatus) {
			this.dBStatus = dBStatus;
		}

		public String getNodeSpec() {
			return this.nodeSpec;
		}

		public void setNodeSpec(String nodeSpec) {
			this.nodeSpec = nodeSpec;
		}

		public Integer getNodeNumber() {
			return this.nodeNumber;
		}

		public void setNodeNumber(Integer nodeNumber) {
			this.nodeNumber = nodeNumber;
		}

		public String getChargeType() {
			return this.chargeType;
		}

		public void setChargeType(String chargeType) {
			this.chargeType = chargeType;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getEndTime() {
			return this.endTime;
		}

		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}

		public String getDBType() {
			return this.dBType;
		}

		public void setDBType(String dBType) {
			this.dBType = dBType;
		}

		public String getSourceInstanceId() {
			return this.sourceInstanceId;
		}

		public void setSourceInstanceId(String sourceInstanceId) {
			this.sourceInstanceId = sourceInstanceId;
		}
	}

	@Override
	public DescribeDatabasesResponse getInstance(UnmarshallerContext context) {
		return	DescribeDatabasesResponseUnmarshaller.unmarshall(this, context);
	}
}
