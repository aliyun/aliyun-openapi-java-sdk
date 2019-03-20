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

package com.aliyuncs.alidns.model.v20150109;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.alidns.transform.v20150109.DescribeGtmInstanceAddressPoolsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeGtmInstanceAddressPoolsResponse extends AcsResponse {

	private String requestId;

	private Integer totalItems;

	private Integer totalPages;

	private Integer pageNumber;

	private Integer pageSize;

	private List<AddrPool> addrPools;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalItems() {
		return this.totalItems;
	}

	public void setTotalItems(Integer totalItems) {
		this.totalItems = totalItems;
	}

	public Integer getTotalPages() {
		return this.totalPages;
	}

	public void setTotalPages(Integer totalPages) {
		this.totalPages = totalPages;
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

	public List<AddrPool> getAddrPools() {
		return this.addrPools;
	}

	public void setAddrPools(List<AddrPool> addrPools) {
		this.addrPools = addrPools;
	}

	public static class AddrPool {

		private String addrPoolId;

		private String createTime;

		private Long createTimestamp;

		private String updateTime;

		private Long updateTimestamp;

		private Integer addrCount;

		private Integer minAvailableAddrNum;

		private String monitorConfigId;

		private String monitorStatus;

		private String name;

		private String status;

		private String type;

		public String getAddrPoolId() {
			return this.addrPoolId;
		}

		public void setAddrPoolId(String addrPoolId) {
			this.addrPoolId = addrPoolId;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public Long getCreateTimestamp() {
			return this.createTimestamp;
		}

		public void setCreateTimestamp(Long createTimestamp) {
			this.createTimestamp = createTimestamp;
		}

		public String getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(String updateTime) {
			this.updateTime = updateTime;
		}

		public Long getUpdateTimestamp() {
			return this.updateTimestamp;
		}

		public void setUpdateTimestamp(Long updateTimestamp) {
			this.updateTimestamp = updateTimestamp;
		}

		public Integer getAddrCount() {
			return this.addrCount;
		}

		public void setAddrCount(Integer addrCount) {
			this.addrCount = addrCount;
		}

		public Integer getMinAvailableAddrNum() {
			return this.minAvailableAddrNum;
		}

		public void setMinAvailableAddrNum(Integer minAvailableAddrNum) {
			this.minAvailableAddrNum = minAvailableAddrNum;
		}

		public String getMonitorConfigId() {
			return this.monitorConfigId;
		}

		public void setMonitorConfigId(String monitorConfigId) {
			this.monitorConfigId = monitorConfigId;
		}

		public String getMonitorStatus() {
			return this.monitorStatus;
		}

		public void setMonitorStatus(String monitorStatus) {
			this.monitorStatus = monitorStatus;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}
	}

	@Override
	public DescribeGtmInstanceAddressPoolsResponse getInstance(UnmarshallerContext context) {
		return	DescribeGtmInstanceAddressPoolsResponseUnmarshaller.unmarshall(this, context);
	}
}
