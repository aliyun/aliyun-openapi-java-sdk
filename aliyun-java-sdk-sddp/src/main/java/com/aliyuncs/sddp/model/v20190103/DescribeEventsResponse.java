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

package com.aliyuncs.sddp.model.v20190103;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sddp.transform.v20190103.DescribeEventsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeEventsResponse extends AcsResponse {

	private String requestId;

	private Integer pageSize;

	private Integer currentPage;

	private Integer totalCount;

	private List<Event> items;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<Event> getItems() {
		return this.items;
	}

	public void setItems(List<Event> items) {
		this.items = items;
	}

	public static class Event {

		private Long id;

		private Long userId;

		private String loginName;

		private String displayName;

		private String productCode;

		private String targetProductCode;

		private String typeCode;

		private String typeName;

		private String subTypeCode;

		private String subTypeName;

		private Long alertTime;

		private Long eventTime;

		private Integer status;

		private String statusName;

		private Long dealUserId;

		private String dealLoginName;

		private String dealDisplayName;

		private Long dealTime;

		private String departName;

		private Boolean backed;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Long getUserId() {
			return this.userId;
		}

		public void setUserId(Long userId) {
			this.userId = userId;
		}

		public String getLoginName() {
			return this.loginName;
		}

		public void setLoginName(String loginName) {
			this.loginName = loginName;
		}

		public String getDisplayName() {
			return this.displayName;
		}

		public void setDisplayName(String displayName) {
			this.displayName = displayName;
		}

		public String getProductCode() {
			return this.productCode;
		}

		public void setProductCode(String productCode) {
			this.productCode = productCode;
		}

		public String getTargetProductCode() {
			return this.targetProductCode;
		}

		public void setTargetProductCode(String targetProductCode) {
			this.targetProductCode = targetProductCode;
		}

		public String getTypeCode() {
			return this.typeCode;
		}

		public void setTypeCode(String typeCode) {
			this.typeCode = typeCode;
		}

		public String getTypeName() {
			return this.typeName;
		}

		public void setTypeName(String typeName) {
			this.typeName = typeName;
		}

		public String getSubTypeCode() {
			return this.subTypeCode;
		}

		public void setSubTypeCode(String subTypeCode) {
			this.subTypeCode = subTypeCode;
		}

		public String getSubTypeName() {
			return this.subTypeName;
		}

		public void setSubTypeName(String subTypeName) {
			this.subTypeName = subTypeName;
		}

		public Long getAlertTime() {
			return this.alertTime;
		}

		public void setAlertTime(Long alertTime) {
			this.alertTime = alertTime;
		}

		public Long getEventTime() {
			return this.eventTime;
		}

		public void setEventTime(Long eventTime) {
			this.eventTime = eventTime;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public String getStatusName() {
			return this.statusName;
		}

		public void setStatusName(String statusName) {
			this.statusName = statusName;
		}

		public Long getDealUserId() {
			return this.dealUserId;
		}

		public void setDealUserId(Long dealUserId) {
			this.dealUserId = dealUserId;
		}

		public String getDealLoginName() {
			return this.dealLoginName;
		}

		public void setDealLoginName(String dealLoginName) {
			this.dealLoginName = dealLoginName;
		}

		public String getDealDisplayName() {
			return this.dealDisplayName;
		}

		public void setDealDisplayName(String dealDisplayName) {
			this.dealDisplayName = dealDisplayName;
		}

		public Long getDealTime() {
			return this.dealTime;
		}

		public void setDealTime(Long dealTime) {
			this.dealTime = dealTime;
		}

		public String getDepartName() {
			return this.departName;
		}

		public void setDepartName(String departName) {
			this.departName = departName;
		}

		public Boolean getBacked() {
			return this.backed;
		}

		public void setBacked(Boolean backed) {
			this.backed = backed;
		}
	}

	@Override
	public DescribeEventsResponse getInstance(UnmarshallerContext context) {
		return	DescribeEventsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
