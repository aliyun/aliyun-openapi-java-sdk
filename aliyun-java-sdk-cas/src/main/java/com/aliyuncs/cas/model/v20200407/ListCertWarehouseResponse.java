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

package com.aliyuncs.cas.model.v20200407;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cas.transform.v20200407.ListCertWarehouseResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListCertWarehouseResponse extends AcsResponse {

	private Long showSize;

	private Long currentPage;

	private Long totalCount;

	private String requestId;

	private List<CertWarehouse> certWarehouseList;

	public Long getShowSize() {
		return this.showSize;
	}

	public void setShowSize(Long showSize) {
		this.showSize = showSize;
	}

	public Long getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Long currentPage) {
		this.currentPage = currentPage;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<CertWarehouse> getCertWarehouseList() {
		return this.certWarehouseList;
	}

	public void setCertWarehouseList(List<CertWarehouse> certWarehouseList) {
		this.certWarehouseList = certWarehouseList;
	}

	public static class CertWarehouse {

		private Long whId;

		private String instanceId;

		private String name;

		private String pcaInstanceId;

		private Long qps;

		private String type;

		private Long endTime;

		private Boolean isExpired;

		public Long getWhId() {
			return this.whId;
		}

		public void setWhId(Long whId) {
			this.whId = whId;
		}

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

		public String getPcaInstanceId() {
			return this.pcaInstanceId;
		}

		public void setPcaInstanceId(String pcaInstanceId) {
			this.pcaInstanceId = pcaInstanceId;
		}

		public Long getQps() {
			return this.qps;
		}

		public void setQps(Long qps) {
			this.qps = qps;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public Long getEndTime() {
			return this.endTime;
		}

		public void setEndTime(Long endTime) {
			this.endTime = endTime;
		}

		public Boolean getIsExpired() {
			return this.isExpired;
		}

		public void setIsExpired(Boolean isExpired) {
			this.isExpired = isExpired;
		}
	}

	@Override
	public ListCertWarehouseResponse getInstance(UnmarshallerContext context) {
		return	ListCertWarehouseResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
