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

package com.aliyuncs.brain_industrial.model.v20200920;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.brain_industrial.transform.v20200920.ListAivppResourcesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListAivppResourcesResponse extends AcsResponse {

	private String requestId;

	private String success;

	private String code;

	private String message;

	private Integer maxResults;

	private String nextToken;

	private Integer totalCount;

	private List<AivppResource> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSuccess() {
		return this.success;
	}

	public void setSuccess(String success) {
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

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<AivppResource> getData() {
		return this.data;
	}

	public void setData(List<AivppResource> data) {
		this.data = data;
	}

	public static class AivppResource {

		private Long id;

		private String instanceId;

		private String specification;

		private String orderId;

		private String userId;

		private String quantity;

		private String leftQuantity;

		private String status;

		private String startTime;

		private String expireTime;

		private String gmtCreate;

		private String gmtModified;

		private Integer isDeleted;

		private String instanceType;

		private String detail;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getSpecification() {
			return this.specification;
		}

		public void setSpecification(String specification) {
			this.specification = specification;
		}

		public String getOrderId() {
			return this.orderId;
		}

		public void setOrderId(String orderId) {
			this.orderId = orderId;
		}

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getQuantity() {
			return this.quantity;
		}

		public void setQuantity(String quantity) {
			this.quantity = quantity;
		}

		public String getLeftQuantity() {
			return this.leftQuantity;
		}

		public void setLeftQuantity(String leftQuantity) {
			this.leftQuantity = leftQuantity;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getStartTime() {
			return this.startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}

		public String getExpireTime() {
			return this.expireTime;
		}

		public void setExpireTime(String expireTime) {
			this.expireTime = expireTime;
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

		public Integer getIsDeleted() {
			return this.isDeleted;
		}

		public void setIsDeleted(Integer isDeleted) {
			this.isDeleted = isDeleted;
		}

		public String getInstanceType() {
			return this.instanceType;
		}

		public void setInstanceType(String instanceType) {
			this.instanceType = instanceType;
		}

		public String getDetail() {
			return this.detail;
		}

		public void setDetail(String detail) {
			this.detail = detail;
		}
	}

	@Override
	public ListAivppResourcesResponse getInstance(UnmarshallerContext context) {
		return	ListAivppResourcesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
