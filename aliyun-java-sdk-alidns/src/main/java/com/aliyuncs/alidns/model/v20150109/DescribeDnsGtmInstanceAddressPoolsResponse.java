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
import com.aliyuncs.alidns.transform.v20150109.DescribeDnsGtmInstanceAddressPoolsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDnsGtmInstanceAddressPoolsResponse extends AcsResponse {

	private Integer pageSize;

	private String requestId;

	private Integer pageNumber;

	private Integer totalPages;

	private Integer totalItems;

	private List<AddrPool> addrPools;

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

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getTotalPages() {
		return this.totalPages;
	}

	public void setTotalPages(Integer totalPages) {
		this.totalPages = totalPages;
	}

	public Integer getTotalItems() {
		return this.totalItems;
	}

	public void setTotalItems(Integer totalItems) {
		this.totalItems = totalItems;
	}

	public List<AddrPool> getAddrPools() {
		return this.addrPools;
	}

	public void setAddrPools(List<AddrPool> addrPools) {
		this.addrPools = addrPools;
	}

	public static class AddrPool {

		private String type;

		private Long updateTimestamp;

		private String monitorStatus;

		private String updateTime;

		private String createTime;

		private String addrPoolId;

		private String lbaStrategy;

		private String name;

		private Integer addrCount;

		private String monitorConfigId;

		private Long createTimestamp;

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public Long getUpdateTimestamp() {
			return this.updateTimestamp;
		}

		public void setUpdateTimestamp(Long updateTimestamp) {
			this.updateTimestamp = updateTimestamp;
		}

		public String getMonitorStatus() {
			return this.monitorStatus;
		}

		public void setMonitorStatus(String monitorStatus) {
			this.monitorStatus = monitorStatus;
		}

		public String getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(String updateTime) {
			this.updateTime = updateTime;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getAddrPoolId() {
			return this.addrPoolId;
		}

		public void setAddrPoolId(String addrPoolId) {
			this.addrPoolId = addrPoolId;
		}

		public String getLbaStrategy() {
			return this.lbaStrategy;
		}

		public void setLbaStrategy(String lbaStrategy) {
			this.lbaStrategy = lbaStrategy;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Integer getAddrCount() {
			return this.addrCount;
		}

		public void setAddrCount(Integer addrCount) {
			this.addrCount = addrCount;
		}

		public String getMonitorConfigId() {
			return this.monitorConfigId;
		}

		public void setMonitorConfigId(String monitorConfigId) {
			this.monitorConfigId = monitorConfigId;
		}

		public Long getCreateTimestamp() {
			return this.createTimestamp;
		}

		public void setCreateTimestamp(Long createTimestamp) {
			this.createTimestamp = createTimestamp;
		}
	}

	@Override
	public DescribeDnsGtmInstanceAddressPoolsResponse getInstance(UnmarshallerContext context) {
		return	DescribeDnsGtmInstanceAddressPoolsResponseUnmarshaller.unmarshall(this, context);
	}
}
