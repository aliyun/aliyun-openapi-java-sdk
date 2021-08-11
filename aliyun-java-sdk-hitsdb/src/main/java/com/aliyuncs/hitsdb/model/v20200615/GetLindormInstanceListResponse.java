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

package com.aliyuncs.hitsdb.model.v20200615;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.hitsdb.transform.v20200615.GetLindormInstanceListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetLindormInstanceListResponse extends AcsResponse {

	private String requestId;

	private Integer pageNumber;

	private Integer pageSize;

	private Integer total;

	private List<LindormInstanceSummary> instanceList;

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

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public List<LindormInstanceSummary> getInstanceList() {
		return this.instanceList;
	}

	public void setInstanceList(List<LindormInstanceSummary> instanceList) {
		this.instanceList = instanceList;
	}

	public static class LindormInstanceSummary {

		private String instanceId;

		private String instanceAlias;

		private String regionId;

		private String zoneId;

		private String instanceStatus;

		private String payType;

		private String networkType;

		private String createTime;

		private String expireTime;

		private String instanceStorage;

		private String serviceType;

		private String engineType;

		private Long aliUid;

		private String vpcId;

		private Long createMilliseconds;

		private Long expiredMilliseconds;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getInstanceAlias() {
			return this.instanceAlias;
		}

		public void setInstanceAlias(String instanceAlias) {
			this.instanceAlias = instanceAlias;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public String getInstanceStatus() {
			return this.instanceStatus;
		}

		public void setInstanceStatus(String instanceStatus) {
			this.instanceStatus = instanceStatus;
		}

		public String getPayType() {
			return this.payType;
		}

		public void setPayType(String payType) {
			this.payType = payType;
		}

		public String getNetworkType() {
			return this.networkType;
		}

		public void setNetworkType(String networkType) {
			this.networkType = networkType;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getExpireTime() {
			return this.expireTime;
		}

		public void setExpireTime(String expireTime) {
			this.expireTime = expireTime;
		}

		public String getInstanceStorage() {
			return this.instanceStorage;
		}

		public void setInstanceStorage(String instanceStorage) {
			this.instanceStorage = instanceStorage;
		}

		public String getServiceType() {
			return this.serviceType;
		}

		public void setServiceType(String serviceType) {
			this.serviceType = serviceType;
		}

		public String getEngineType() {
			return this.engineType;
		}

		public void setEngineType(String engineType) {
			this.engineType = engineType;
		}

		public Long getAliUid() {
			return this.aliUid;
		}

		public void setAliUid(Long aliUid) {
			this.aliUid = aliUid;
		}

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public Long getCreateMilliseconds() {
			return this.createMilliseconds;
		}

		public void setCreateMilliseconds(Long createMilliseconds) {
			this.createMilliseconds = createMilliseconds;
		}

		public Long getExpiredMilliseconds() {
			return this.expiredMilliseconds;
		}

		public void setExpiredMilliseconds(Long expiredMilliseconds) {
			this.expiredMilliseconds = expiredMilliseconds;
		}
	}

	@Override
	public GetLindormInstanceListResponse getInstance(UnmarshallerContext context) {
		return	GetLindormInstanceListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
