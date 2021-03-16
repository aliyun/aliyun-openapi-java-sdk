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
import com.aliyuncs.ecsops.transform.v20160401.OpsDescribeResourceReconciliationsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsDescribeResourceReconciliationsResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<ResourceReconciliation> resourceReconciliations;

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

	public List<ResourceReconciliation> getResourceReconciliations() {
		return this.resourceReconciliations;
	}

	public void setResourceReconciliations(List<ResourceReconciliation> resourceReconciliations) {
		this.resourceReconciliations = resourceReconciliations;
	}

	public static class ResourceReconciliation {

		private Long id;

		private Long gmtCreate;

		private Long gmtModified;

		private String resourceId;

		private String resourceType;

		private String regionId;

		private String hyInfo;

		private String vpcInfo;

		private Boolean done;

		private String errorCode;

		private String errorMessage;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Long getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(Long gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public Long getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(Long gmtModified) {
			this.gmtModified = gmtModified;
		}

		public String getResourceId() {
			return this.resourceId;
		}

		public void setResourceId(String resourceId) {
			this.resourceId = resourceId;
		}

		public String getResourceType() {
			return this.resourceType;
		}

		public void setResourceType(String resourceType) {
			this.resourceType = resourceType;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getHyInfo() {
			return this.hyInfo;
		}

		public void setHyInfo(String hyInfo) {
			this.hyInfo = hyInfo;
		}

		public String getVpcInfo() {
			return this.vpcInfo;
		}

		public void setVpcInfo(String vpcInfo) {
			this.vpcInfo = vpcInfo;
		}

		public Boolean getDone() {
			return this.done;
		}

		public void setDone(Boolean done) {
			this.done = done;
		}

		public String getErrorCode() {
			return this.errorCode;
		}

		public void setErrorCode(String errorCode) {
			this.errorCode = errorCode;
		}

		public String getErrorMessage() {
			return this.errorMessage;
		}

		public void setErrorMessage(String errorMessage) {
			this.errorMessage = errorMessage;
		}
	}

	@Override
	public OpsDescribeResourceReconciliationsResponse getInstance(UnmarshallerContext context) {
		return	OpsDescribeResourceReconciliationsResponseUnmarshaller.unmarshall(this, context);
	}
}
