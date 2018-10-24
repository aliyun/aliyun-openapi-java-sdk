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

package com.aliyuncs.smartag_inner.model.v20180313;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.smartag_inner.transform.v20180313.InnerListCloudConnectNetworksResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class InnerListCloudConnectNetworksResponse extends AcsResponse {

	private String requestId;

	private Integer total;

	private Integer pageNumber;

	private Integer pageSize;

	private Long aliUid;

	private String bid;

	private List<CloudConnectNetwork> cloudConnectNetworks;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Long getAliUid() {
		return this.aliUid;
	}

	public void setAliUid(Long aliUid) {
		this.aliUid = aliUid;
	}

	public String getBid() {
		return this.bid;
	}

	public void setBid(String bid) {
		this.bid = bid;
	}

	public List<CloudConnectNetwork> getCloudConnectNetworks() {
		return this.cloudConnectNetworks;
	}

	public void setCloudConnectNetworks(List<CloudConnectNetwork> cloudConnectNetworks) {
		this.cloudConnectNetworks = cloudConnectNetworks;
	}

	public static class CloudConnectNetwork {

		private String instanceId;

		private String name;

		private Integer associatedCloudBoxCount;

		private Integer availableCloudBoxCount;

		private String associatedCenId;

		private Long associatedCenOwnerId;

		private String description;

		private Long createTime;

		private Boolean isDefault;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Integer getAssociatedCloudBoxCount() {
			return this.associatedCloudBoxCount;
		}

		public void setAssociatedCloudBoxCount(Integer associatedCloudBoxCount) {
			this.associatedCloudBoxCount = associatedCloudBoxCount;
		}

		public Integer getAvailableCloudBoxCount() {
			return this.availableCloudBoxCount;
		}

		public void setAvailableCloudBoxCount(Integer availableCloudBoxCount) {
			this.availableCloudBoxCount = availableCloudBoxCount;
		}

		public String getAssociatedCenId() {
			return this.associatedCenId;
		}

		public void setAssociatedCenId(String associatedCenId) {
			this.associatedCenId = associatedCenId;
		}

		public Long getAssociatedCenOwnerId() {
			return this.associatedCenOwnerId;
		}

		public void setAssociatedCenOwnerId(Long associatedCenOwnerId) {
			this.associatedCenOwnerId = associatedCenOwnerId;
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

		public Boolean getIsDefault() {
			return this.isDefault;
		}

		public void setIsDefault(Boolean isDefault) {
			this.isDefault = isDefault;
		}
	}

	@Override
	public InnerListCloudConnectNetworksResponse getInstance(UnmarshallerContext context) {
		return	InnerListCloudConnectNetworksResponseUnmarshaller.unmarshall(this, context);
	}
}
