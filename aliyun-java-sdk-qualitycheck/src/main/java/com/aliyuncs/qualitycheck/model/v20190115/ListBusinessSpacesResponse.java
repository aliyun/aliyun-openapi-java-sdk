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

package com.aliyuncs.qualitycheck.model.v20190115;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.qualitycheck.transform.v20190115.ListBusinessSpacesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListBusinessSpacesResponse extends AcsResponse {

	private Integer currentPage;

	private Integer pageSize;

	private Integer pageNumber;

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private List<DataItem> data;

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

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

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private Long id;

		private Long aliUid;

		private Long subAliUid;

		private String roleName;

		private Integer loginUserType;

		private String businessSpaceCode;

		private String businessSpaceName;

		private String orderInstanceId;

		private String xspaceProductCode;

		private String xspaceCommodityCode;

		private String productType;

		private String language;

		private String startTime;

		private String endTime;

		private Integer currentStatus;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Long getAliUid() {
			return this.aliUid;
		}

		public void setAliUid(Long aliUid) {
			this.aliUid = aliUid;
		}

		public Long getSubAliUid() {
			return this.subAliUid;
		}

		public void setSubAliUid(Long subAliUid) {
			this.subAliUid = subAliUid;
		}

		public String getRoleName() {
			return this.roleName;
		}

		public void setRoleName(String roleName) {
			this.roleName = roleName;
		}

		public Integer getLoginUserType() {
			return this.loginUserType;
		}

		public void setLoginUserType(Integer loginUserType) {
			this.loginUserType = loginUserType;
		}

		public String getBusinessSpaceCode() {
			return this.businessSpaceCode;
		}

		public void setBusinessSpaceCode(String businessSpaceCode) {
			this.businessSpaceCode = businessSpaceCode;
		}

		public String getBusinessSpaceName() {
			return this.businessSpaceName;
		}

		public void setBusinessSpaceName(String businessSpaceName) {
			this.businessSpaceName = businessSpaceName;
		}

		public String getOrderInstanceId() {
			return this.orderInstanceId;
		}

		public void setOrderInstanceId(String orderInstanceId) {
			this.orderInstanceId = orderInstanceId;
		}

		public String getXspaceProductCode() {
			return this.xspaceProductCode;
		}

		public void setXspaceProductCode(String xspaceProductCode) {
			this.xspaceProductCode = xspaceProductCode;
		}

		public String getXspaceCommodityCode() {
			return this.xspaceCommodityCode;
		}

		public void setXspaceCommodityCode(String xspaceCommodityCode) {
			this.xspaceCommodityCode = xspaceCommodityCode;
		}

		public String getProductType() {
			return this.productType;
		}

		public void setProductType(String productType) {
			this.productType = productType;
		}

		public String getLanguage() {
			return this.language;
		}

		public void setLanguage(String language) {
			this.language = language;
		}

		public String getStartTime() {
			return this.startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}

		public String getEndTime() {
			return this.endTime;
		}

		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}

		public Integer getCurrentStatus() {
			return this.currentStatus;
		}

		public void setCurrentStatus(Integer currentStatus) {
			this.currentStatus = currentStatus;
		}
	}

	@Override
	public ListBusinessSpacesResponse getInstance(UnmarshallerContext context) {
		return	ListBusinessSpacesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
