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

package com.aliyuncs.iotcc.model.v20210513;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.iotcc.transform.v20210513.ListIoTCloudConnectorGroupsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListIoTCloudConnectorGroupsResponse extends AcsResponse {

	private Integer totalCount;

	private String nextToken;

	private Integer maxResults;

	private String requestId;

	private List<IoTCloudConnectorGroupsItem> ioTCloudConnectorGroups;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<IoTCloudConnectorGroupsItem> getIoTCloudConnectorGroups() {
		return this.ioTCloudConnectorGroups;
	}

	public void setIoTCloudConnectorGroups(List<IoTCloudConnectorGroupsItem> ioTCloudConnectorGroups) {
		this.ioTCloudConnectorGroups = ioTCloudConnectorGroups;
	}

	public static class IoTCloudConnectorGroupsItem {

		private String ioTCloudConnectorGroupId;

		private String ioTCloudConnectorGroupStatus;

		private String name;

		private String description;

		private Long createTime;

		private String type;

		private List<IoTCloudConnectorsItem> ioTCloudConnectors;

		public String getIoTCloudConnectorGroupId() {
			return this.ioTCloudConnectorGroupId;
		}

		public void setIoTCloudConnectorGroupId(String ioTCloudConnectorGroupId) {
			this.ioTCloudConnectorGroupId = ioTCloudConnectorGroupId;
		}

		public String getIoTCloudConnectorGroupStatus() {
			return this.ioTCloudConnectorGroupStatus;
		}

		public void setIoTCloudConnectorGroupStatus(String ioTCloudConnectorGroupStatus) {
			this.ioTCloudConnectorGroupStatus = ioTCloudConnectorGroupStatus;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public List<IoTCloudConnectorsItem> getIoTCloudConnectors() {
			return this.ioTCloudConnectors;
		}

		public void setIoTCloudConnectors(List<IoTCloudConnectorsItem> ioTCloudConnectors) {
			this.ioTCloudConnectors = ioTCloudConnectors;
		}

		public static class IoTCloudConnectorsItem {

			private String ioTCloudConnectorId;

			private String ioTCloudConnectorStatus;

			private String ioTCloudConnectorName;

			private String ioTCloudConnectorDescription;

			private Long createTime;

			private String iSP;

			private String aPN;

			public String getIoTCloudConnectorId() {
				return this.ioTCloudConnectorId;
			}

			public void setIoTCloudConnectorId(String ioTCloudConnectorId) {
				this.ioTCloudConnectorId = ioTCloudConnectorId;
			}

			public String getIoTCloudConnectorStatus() {
				return this.ioTCloudConnectorStatus;
			}

			public void setIoTCloudConnectorStatus(String ioTCloudConnectorStatus) {
				this.ioTCloudConnectorStatus = ioTCloudConnectorStatus;
			}

			public String getIoTCloudConnectorName() {
				return this.ioTCloudConnectorName;
			}

			public void setIoTCloudConnectorName(String ioTCloudConnectorName) {
				this.ioTCloudConnectorName = ioTCloudConnectorName;
			}

			public String getIoTCloudConnectorDescription() {
				return this.ioTCloudConnectorDescription;
			}

			public void setIoTCloudConnectorDescription(String ioTCloudConnectorDescription) {
				this.ioTCloudConnectorDescription = ioTCloudConnectorDescription;
			}

			public Long getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(Long createTime) {
				this.createTime = createTime;
			}

			public String getISP() {
				return this.iSP;
			}

			public void setISP(String iSP) {
				this.iSP = iSP;
			}

			public String getAPN() {
				return this.aPN;
			}

			public void setAPN(String aPN) {
				this.aPN = aPN;
			}
		}
	}

	@Override
	public ListIoTCloudConnectorGroupsResponse getInstance(UnmarshallerContext context) {
		return	ListIoTCloudConnectorGroupsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
