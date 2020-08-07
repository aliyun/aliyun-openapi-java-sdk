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

package com.aliyuncs.csb.model.v20171118;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.csb.transform.v20171118.FindInstanceNodeListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class FindInstanceNodeListResponse extends AcsResponse {

	private Integer code;

	private String message;

	private String requestId;

	private Data data;

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer currentPage;

		private Integer pageNumber;

		private List<InstanceNode> instanceNodeList;

		public Integer getCurrentPage() {
			return this.currentPage;
		}

		public void setCurrentPage(Integer currentPage) {
			this.currentPage = currentPage;
		}

		public Integer getPageNumber() {
			return this.pageNumber;
		}

		public void setPageNumber(Integer pageNumber) {
			this.pageNumber = pageNumber;
		}

		public List<InstanceNode> getInstanceNodeList() {
			return this.instanceNodeList;
		}

		public void setInstanceNodeList(List<InstanceNode> instanceNodeList) {
			this.instanceNodeList = instanceNodeList;
		}

		public static class InstanceNode {

			private Long id;

			private String instanceName;

			private Boolean isImported;

			private String groupAddress;

			private String brokerAddress;

			private String edasTenantInfo;

			private String importedName;

			private Long csbId;

			private Integer deleted;

			private String ownerId;

			private String brokerCmdAddress;

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getInstanceName() {
				return this.instanceName;
			}

			public void setInstanceName(String instanceName) {
				this.instanceName = instanceName;
			}

			public Boolean getIsImported() {
				return this.isImported;
			}

			public void setIsImported(Boolean isImported) {
				this.isImported = isImported;
			}

			public String getGroupAddress() {
				return this.groupAddress;
			}

			public void setGroupAddress(String groupAddress) {
				this.groupAddress = groupAddress;
			}

			public String getBrokerAddress() {
				return this.brokerAddress;
			}

			public void setBrokerAddress(String brokerAddress) {
				this.brokerAddress = brokerAddress;
			}

			public String getEdasTenantInfo() {
				return this.edasTenantInfo;
			}

			public void setEdasTenantInfo(String edasTenantInfo) {
				this.edasTenantInfo = edasTenantInfo;
			}

			public String getImportedName() {
				return this.importedName;
			}

			public void setImportedName(String importedName) {
				this.importedName = importedName;
			}

			public Long getCsbId() {
				return this.csbId;
			}

			public void setCsbId(Long csbId) {
				this.csbId = csbId;
			}

			public Integer getDeleted() {
				return this.deleted;
			}

			public void setDeleted(Integer deleted) {
				this.deleted = deleted;
			}

			public String getOwnerId() {
				return this.ownerId;
			}

			public void setOwnerId(String ownerId) {
				this.ownerId = ownerId;
			}

			public String getBrokerCmdAddress() {
				return this.brokerCmdAddress;
			}

			public void setBrokerCmdAddress(String brokerCmdAddress) {
				this.brokerCmdAddress = brokerCmdAddress;
			}
		}
	}

	@Override
	public FindInstanceNodeListResponse getInstance(UnmarshallerContext context) {
		return	FindInstanceNodeListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
