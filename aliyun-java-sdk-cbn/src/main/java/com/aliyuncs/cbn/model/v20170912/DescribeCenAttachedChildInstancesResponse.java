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

package com.aliyuncs.cbn.model.v20170912;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cbn.transform.v20170912.DescribeCenAttachedChildInstancesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCenAttachedChildInstancesResponse extends AcsResponse {

	private Integer pageSize;

	private String requestId;

	private Integer pageNumber;

	private Integer totalCount;

	private List<ChildInstance> childInstances;

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

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<ChildInstance> getChildInstances() {
		return this.childInstances;
	}

	public void setChildInstances(List<ChildInstance> childInstances) {
		this.childInstances = childInstances;
	}

	public static class ChildInstance {

		private String childInstanceType;

		private String status;

		private String childInstanceRegionId;

		private Long childInstanceOwnerId;

		private String childInstanceId;

		private String managedService;

		private String childInstanceAttachTime;

		private String cenId;

		public String getChildInstanceType() {
			return this.childInstanceType;
		}

		public void setChildInstanceType(String childInstanceType) {
			this.childInstanceType = childInstanceType;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getChildInstanceRegionId() {
			return this.childInstanceRegionId;
		}

		public void setChildInstanceRegionId(String childInstanceRegionId) {
			this.childInstanceRegionId = childInstanceRegionId;
		}

		public Long getChildInstanceOwnerId() {
			return this.childInstanceOwnerId;
		}

		public void setChildInstanceOwnerId(Long childInstanceOwnerId) {
			this.childInstanceOwnerId = childInstanceOwnerId;
		}

		public String getChildInstanceId() {
			return this.childInstanceId;
		}

		public void setChildInstanceId(String childInstanceId) {
			this.childInstanceId = childInstanceId;
		}

		public String getManagedService() {
			return this.managedService;
		}

		public void setManagedService(String managedService) {
			this.managedService = managedService;
		}

		public String getChildInstanceAttachTime() {
			return this.childInstanceAttachTime;
		}

		public void setChildInstanceAttachTime(String childInstanceAttachTime) {
			this.childInstanceAttachTime = childInstanceAttachTime;
		}

		public String getCenId() {
			return this.cenId;
		}

		public void setCenId(String cenId) {
			this.cenId = cenId;
		}
	}

	@Override
	public DescribeCenAttachedChildInstancesResponse getInstance(UnmarshallerContext context) {
		return	DescribeCenAttachedChildInstancesResponseUnmarshaller.unmarshall(this, context);
	}
}
