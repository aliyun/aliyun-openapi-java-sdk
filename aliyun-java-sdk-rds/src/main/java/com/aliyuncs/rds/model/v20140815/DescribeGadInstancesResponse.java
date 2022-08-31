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
import com.aliyuncs.rds.transform.v20140815.DescribeGadInstancesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeGadInstancesResponse extends AcsResponse {

	private String requestId;

	private List<GadInstancesItem> gadInstances;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<GadInstancesItem> getGadInstances() {
		return this.gadInstances;
	}

	public void setGadInstances(List<GadInstancesItem> gadInstances) {
		this.gadInstances = gadInstances;
	}

	public static class GadInstancesItem {

		private String gadInstanceName;

		private String description;

		private String status;

		private String creationTime;

		private String modificationTime;

		private String service;

		private List<GadInstanceMembersItem> gadInstanceMembers;

		public String getGadInstanceName() {
			return this.gadInstanceName;
		}

		public void setGadInstanceName(String gadInstanceName) {
			this.gadInstanceName = gadInstanceName;
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

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getModificationTime() {
			return this.modificationTime;
		}

		public void setModificationTime(String modificationTime) {
			this.modificationTime = modificationTime;
		}

		public String getService() {
			return this.service;
		}

		public void setService(String service) {
			this.service = service;
		}

		public List<GadInstanceMembersItem> getGadInstanceMembers() {
			return this.gadInstanceMembers;
		}

		public void setGadInstanceMembers(List<GadInstanceMembersItem> gadInstanceMembers) {
			this.gadInstanceMembers = gadInstanceMembers;
		}

		public static class GadInstanceMembersItem {

			private String dBInstanceID;

			private String engine;

			private String engineVersion;

			private String regionId;

			private String role;

			private String status;

			private String dtsInstance;

			private String resourceGroupId;

			public String getDBInstanceID() {
				return this.dBInstanceID;
			}

			public void setDBInstanceID(String dBInstanceID) {
				this.dBInstanceID = dBInstanceID;
			}

			public String getEngine() {
				return this.engine;
			}

			public void setEngine(String engine) {
				this.engine = engine;
			}

			public String getEngineVersion() {
				return this.engineVersion;
			}

			public void setEngineVersion(String engineVersion) {
				this.engineVersion = engineVersion;
			}

			public String getRegionId() {
				return this.regionId;
			}

			public void setRegionId(String regionId) {
				this.regionId = regionId;
			}

			public String getRole() {
				return this.role;
			}

			public void setRole(String role) {
				this.role = role;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getDtsInstance() {
				return this.dtsInstance;
			}

			public void setDtsInstance(String dtsInstance) {
				this.dtsInstance = dtsInstance;
			}

			public String getResourceGroupId() {
				return this.resourceGroupId;
			}

			public void setResourceGroupId(String resourceGroupId) {
				this.resourceGroupId = resourceGroupId;
			}
		}
	}

	@Override
	public DescribeGadInstancesResponse getInstance(UnmarshallerContext context) {
		return	DescribeGadInstancesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
