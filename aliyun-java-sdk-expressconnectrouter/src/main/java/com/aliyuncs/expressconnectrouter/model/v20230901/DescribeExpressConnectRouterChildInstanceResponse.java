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

package com.aliyuncs.expressconnectrouter.model.v20230901;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.expressconnectrouter.transform.v20230901.DescribeExpressConnectRouterChildInstanceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeExpressConnectRouterChildInstanceResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer httpStatusCode;

	private String dynamicCode;

	private String dynamicMessage;

	private String accessDeniedDetail;

	private Integer totalCount;

	private Integer maxResults;

	private String nextToken;

	private List<ChildInstanceListItem> childInstanceList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getDynamicCode() {
		return this.dynamicCode;
	}

	public void setDynamicCode(String dynamicCode) {
		this.dynamicCode = dynamicCode;
	}

	public String getDynamicMessage() {
		return this.dynamicMessage;
	}

	public void setDynamicMessage(String dynamicMessage) {
		this.dynamicMessage = dynamicMessage;
	}

	public String getAccessDeniedDetail() {
		return this.accessDeniedDetail;
	}

	public void setAccessDeniedDetail(String accessDeniedDetail) {
		this.accessDeniedDetail = accessDeniedDetail;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public List<ChildInstanceListItem> getChildInstanceList() {
		return this.childInstanceList;
	}

	public void setChildInstanceList(List<ChildInstanceListItem> childInstanceList) {
		this.childInstanceList = childInstanceList;
	}

	public static class ChildInstanceListItem {

		private String associationId;

		private String regionId;

		private Long ownerId;

		private String gmtCreate;

		private String gmtModified;

		private String status;

		private String childInstanceId;

		private String childInstanceType;

		private String childInstanceRegionId;

		private Long childInstanceOwnerId;

		public String getAssociationId() {
			return this.associationId;
		}

		public void setAssociationId(String associationId) {
			this.associationId = associationId;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public Long getOwnerId() {
			return this.ownerId;
		}

		public void setOwnerId(Long ownerId) {
			this.ownerId = ownerId;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getChildInstanceId() {
			return this.childInstanceId;
		}

		public void setChildInstanceId(String childInstanceId) {
			this.childInstanceId = childInstanceId;
		}

		public String getChildInstanceType() {
			return this.childInstanceType;
		}

		public void setChildInstanceType(String childInstanceType) {
			this.childInstanceType = childInstanceType;
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
	}

	@Override
	public DescribeExpressConnectRouterChildInstanceResponse getInstance(UnmarshallerContext context) {
		return	DescribeExpressConnectRouterChildInstanceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
