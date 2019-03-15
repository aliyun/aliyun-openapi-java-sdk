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

package com.aliyuncs.vpc.model.v20160428;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vpc.transform.v20160428.DescribeIPv6TranslatorsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeIPv6TranslatorsResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<Ipv6Translator> ipv6Translators;

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

	public List<Ipv6Translator> getIpv6Translators() {
		return this.ipv6Translators;
	}

	public void setIpv6Translators(List<Ipv6Translator> ipv6Translators) {
		this.ipv6Translators = ipv6Translators;
	}

	public static class Ipv6Translator {

		private String ipv6TranslatorId;

		private Long createTime;

		private Long endTime;

		private String spec;

		private String name;

		private String description;

		private String status;

		private String businessStatus;

		private String payType;

		private Integer bandwidth;

		private String allocateIpv6Addr;

		private String allocateIpv4Addr;

		private String availableBandwidth;

		private String regionId;

		private List<String> ipv6TranslatorEntryIds;

		public String getIpv6TranslatorId() {
			return this.ipv6TranslatorId;
		}

		public void setIpv6TranslatorId(String ipv6TranslatorId) {
			this.ipv6TranslatorId = ipv6TranslatorId;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public Long getEndTime() {
			return this.endTime;
		}

		public void setEndTime(Long endTime) {
			this.endTime = endTime;
		}

		public String getSpec() {
			return this.spec;
		}

		public void setSpec(String spec) {
			this.spec = spec;
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

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getBusinessStatus() {
			return this.businessStatus;
		}

		public void setBusinessStatus(String businessStatus) {
			this.businessStatus = businessStatus;
		}

		public String getPayType() {
			return this.payType;
		}

		public void setPayType(String payType) {
			this.payType = payType;
		}

		public Integer getBandwidth() {
			return this.bandwidth;
		}

		public void setBandwidth(Integer bandwidth) {
			this.bandwidth = bandwidth;
		}

		public String getAllocateIpv6Addr() {
			return this.allocateIpv6Addr;
		}

		public void setAllocateIpv6Addr(String allocateIpv6Addr) {
			this.allocateIpv6Addr = allocateIpv6Addr;
		}

		public String getAllocateIpv4Addr() {
			return this.allocateIpv4Addr;
		}

		public void setAllocateIpv4Addr(String allocateIpv4Addr) {
			this.allocateIpv4Addr = allocateIpv4Addr;
		}

		public String getAvailableBandwidth() {
			return this.availableBandwidth;
		}

		public void setAvailableBandwidth(String availableBandwidth) {
			this.availableBandwidth = availableBandwidth;
		}

		public String getBizRegionId() {
			return this.regionId;
		}

		public void setBizRegionId(String regionId) {
			this.regionId = regionId;
		}

		/**
		 * @deprecated use getBizRegionId instead of this.
		 */
		@Deprecated
		public String getRegionId() {
			return this.regionId;
		}

		/**
		 * @deprecated use setBizRegionId instead of this.
		 */
		@Deprecated
		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public List<String> getIpv6TranslatorEntryIds() {
			return this.ipv6TranslatorEntryIds;
		}

		public void setIpv6TranslatorEntryIds(List<String> ipv6TranslatorEntryIds) {
			this.ipv6TranslatorEntryIds = ipv6TranslatorEntryIds;
		}
	}

	@Override
	public DescribeIPv6TranslatorsResponse getInstance(UnmarshallerContext context) {
		return	DescribeIPv6TranslatorsResponseUnmarshaller.unmarshall(this, context);
	}
}
