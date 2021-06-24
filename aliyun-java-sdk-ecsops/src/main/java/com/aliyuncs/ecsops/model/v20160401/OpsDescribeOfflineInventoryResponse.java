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

package com.aliyuncs.ecsops.model.v20160401;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsDescribeOfflineInventoryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsDescribeOfflineInventoryResponse extends AcsResponse {

	private Integer totalCount;

	private String nextToken;

	private Integer pageSize;

	private String requestId;

	private Integer pageNumber;

	private List<OfflineInventoryModel> offlineInventoryModels;

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

	public List<OfflineInventoryModel> getOfflineInventoryModels() {
		return this.offlineInventoryModels;
	}

	public void setOfflineInventoryModels(List<OfflineInventoryModel> offlineInventoryModels) {
		this.offlineInventoryModels = offlineInventoryModels;
	}

	public static class OfflineInventoryModel {

		private Integer capacity;

		private Integer rackCnt;

		private String regionNo;

		private Integer vmCnt;

		private String networkArch;

		private String ncType;

		private Integer periodDay;

		private String idc;

		private String instanceType;

		private String izNo;

		public Integer getCapacity() {
			return this.capacity;
		}

		public void setCapacity(Integer capacity) {
			this.capacity = capacity;
		}

		public Integer getRackCnt() {
			return this.rackCnt;
		}

		public void setRackCnt(Integer rackCnt) {
			this.rackCnt = rackCnt;
		}

		public String getRegionNo() {
			return this.regionNo;
		}

		public void setRegionNo(String regionNo) {
			this.regionNo = regionNo;
		}

		public Integer getVmCnt() {
			return this.vmCnt;
		}

		public void setVmCnt(Integer vmCnt) {
			this.vmCnt = vmCnt;
		}

		public String getNetworkArch() {
			return this.networkArch;
		}

		public void setNetworkArch(String networkArch) {
			this.networkArch = networkArch;
		}

		public String getNcType() {
			return this.ncType;
		}

		public void setNcType(String ncType) {
			this.ncType = ncType;
		}

		public Integer getPeriodDay() {
			return this.periodDay;
		}

		public void setPeriodDay(Integer periodDay) {
			this.periodDay = periodDay;
		}

		public String getIdc() {
			return this.idc;
		}

		public void setIdc(String idc) {
			this.idc = idc;
		}

		public String getInstanceType() {
			return this.instanceType;
		}

		public void setInstanceType(String instanceType) {
			this.instanceType = instanceType;
		}

		public String getIzNo() {
			return this.izNo;
		}

		public void setIzNo(String izNo) {
			this.izNo = izNo;
		}
	}

	@Override
	public OpsDescribeOfflineInventoryResponse getInstance(UnmarshallerContext context) {
		return	OpsDescribeOfflineInventoryResponseUnmarshaller.unmarshall(this, context);
	}
}
