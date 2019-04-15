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

package com.aliyuncs.ecsinc.model.v20160314;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsinc.transform.v20160314.QueryResourceTransitResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryResourceTransitResponse extends AcsResponse {

	private String requestId;

	private Integer pageNumber;

	private Integer pageSize;

	private Integer totalCount;

	private List<EcsResourceTransit> ecsResourceTransits;

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

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<EcsResourceTransit> getEcsResourceTransits() {
		return this.ecsResourceTransits;
	}

	public void setEcsResourceTransits(List<EcsResourceTransit> ecsResourceTransits) {
		this.ecsResourceTransits = ecsResourceTransits;
	}

	public static class EcsResourceTransit {

		private Long dbId;

		private String resourceTransitId;

		private String resourceType;

		private String resourceId;

		private String resourceName;

		private String description;

		private String metaData;

		private String fromRegionNo;

		private Long aliUid;

		private String gmtCreated;

		private String gmtModified;

		private Integer status;

		public Long getDbId() {
			return this.dbId;
		}

		public void setDbId(Long dbId) {
			this.dbId = dbId;
		}

		public String getResourceTransitId() {
			return this.resourceTransitId;
		}

		public void setResourceTransitId(String resourceTransitId) {
			this.resourceTransitId = resourceTransitId;
		}

		public String getResourceType() {
			return this.resourceType;
		}

		public void setResourceType(String resourceType) {
			this.resourceType = resourceType;
		}

		public String getResourceId() {
			return this.resourceId;
		}

		public void setResourceId(String resourceId) {
			this.resourceId = resourceId;
		}

		public String getResourceName() {
			return this.resourceName;
		}

		public void setResourceName(String resourceName) {
			this.resourceName = resourceName;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getMetaData() {
			return this.metaData;
		}

		public void setMetaData(String metaData) {
			this.metaData = metaData;
		}

		public String getFromRegionNo() {
			return this.fromRegionNo;
		}

		public void setFromRegionNo(String fromRegionNo) {
			this.fromRegionNo = fromRegionNo;
		}

		public Long getAliUid() {
			return this.aliUid;
		}

		public void setAliUid(Long aliUid) {
			this.aliUid = aliUid;
		}

		public String getGmtCreated() {
			return this.gmtCreated;
		}

		public void setGmtCreated(String gmtCreated) {
			this.gmtCreated = gmtCreated;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}
	}

	@Override
	public QueryResourceTransitResponse getInstance(UnmarshallerContext context) {
		return	QueryResourceTransitResponseUnmarshaller.unmarshall(this, context);
	}
}
