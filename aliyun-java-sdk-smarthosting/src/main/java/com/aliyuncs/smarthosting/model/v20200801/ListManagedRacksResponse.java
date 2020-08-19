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

package com.aliyuncs.smarthosting.model.v20200801;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.smarthosting.transform.v20200801.ListManagedRacksResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListManagedRacksResponse extends AcsResponse {

	private String nextToken;

	private Integer pageSize;

	private String requestId;

	private Integer totalCount;

	private List<ManagedRacksSet> managedRacksSets;

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<ManagedRacksSet> getManagedRacksSets() {
		return this.managedRacksSets;
	}

	public void setManagedRacksSets(List<ManagedRacksSet> managedRacksSets) {
		this.managedRacksSets = managedRacksSets;
	}

	public static class ManagedRacksSet {

		private String managedRackId;

		private String zoneId;

		private List<ManagedHostSet> managedHostSets;

		public String getManagedRackId() {
			return this.managedRackId;
		}

		public void setManagedRackId(String managedRackId) {
			this.managedRackId = managedRackId;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public List<ManagedHostSet> getManagedHostSets() {
			return this.managedHostSets;
		}

		public void setManagedHostSets(List<ManagedHostSet> managedHostSets) {
			this.managedHostSets = managedHostSets;
		}

		public static class ManagedHostSet {

			private String description;

			private String managedHostId;

			private String status;

			private HostAttribute hostAttribute;

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getManagedHostId() {
				return this.managedHostId;
			}

			public void setManagedHostId(String managedHostId) {
				this.managedHostId = managedHostId;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public HostAttribute getHostAttribute() {
				return this.hostAttribute;
			}

			public void setHostAttribute(HostAttribute hostAttribute) {
				this.hostAttribute = hostAttribute;
			}

			public static class HostAttribute {

				private String cpuModelName;

				private String hostType;

				public String getCpuModelName() {
					return this.cpuModelName;
				}

				public void setCpuModelName(String cpuModelName) {
					this.cpuModelName = cpuModelName;
				}

				public String getHostType() {
					return this.hostType;
				}

				public void setHostType(String hostType) {
					this.hostType = hostType;
				}
			}
		}
	}

	@Override
	public ListManagedRacksResponse getInstance(UnmarshallerContext context) {
		return	ListManagedRacksResponseUnmarshaller.unmarshall(this, context);
	}
}
