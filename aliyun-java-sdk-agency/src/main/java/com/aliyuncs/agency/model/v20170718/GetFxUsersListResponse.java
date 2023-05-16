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

package com.aliyuncs.agency.model.v20170718;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.agency.transform.v20170718.GetFxUsersListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetFxUsersListResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private Boolean success;

	private List<FxUserInfo> data;

	private PageInfo pageInfo;

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

	public List<FxUserInfo> getData() {
		return this.data;
	}

	public void setData(List<FxUserInfo> data) {
		this.data = data;
	}

	public PageInfo getPageInfo() {
		return this.pageInfo;
	}

	public void setPageInfo(PageInfo pageInfo) {
		this.pageInfo = pageInfo;
	}

	public static class FxUserInfo {

		private Long distributionRebateType;

		private Long kpId;

		private Long customerRebateType;

		private Long parentUid;

		private Integer isSub;

		private Integer level;

		public Long getDistributionRebateType() {
			return this.distributionRebateType;
		}

		public void setDistributionRebateType(Long distributionRebateType) {
			this.distributionRebateType = distributionRebateType;
		}

		public Long getKpId() {
			return this.kpId;
		}

		public void setKpId(Long kpId) {
			this.kpId = kpId;
		}

		public Long getCustomerRebateType() {
			return this.customerRebateType;
		}

		public void setCustomerRebateType(Long customerRebateType) {
			this.customerRebateType = customerRebateType;
		}

		public Long getParentUid() {
			return this.parentUid;
		}

		public void setParentUid(Long parentUid) {
			this.parentUid = parentUid;
		}

		public Integer getIsSub() {
			return this.isSub;
		}

		public void setIsSub(Integer isSub) {
			this.isSub = isSub;
		}

		public Integer getLevel() {
			return this.level;
		}

		public void setLevel(Integer level) {
			this.level = level;
		}
	}

	public static class PageInfo {

		private Integer pageSize;

		private Integer total;

		private Integer page;

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

		public Integer getPage() {
			return this.page;
		}

		public void setPage(Integer page) {
			this.page = page;
		}
	}

	@Override
	public GetFxUsersListResponse getInstance(UnmarshallerContext context) {
		return	GetFxUsersListResponseUnmarshaller.unmarshall(this, context);
	}
}
