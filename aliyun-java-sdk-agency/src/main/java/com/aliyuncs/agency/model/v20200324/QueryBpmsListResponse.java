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

package com.aliyuncs.agency.model.v20200324;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.agency.transform.v20200324.QueryBpmsListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryBpmsListResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private Integer pageNo;

	private Integer pageSize;

	private Integer total;

	private List<ListItem> list;

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

	public Integer getPageNo() {
		return this.pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}

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

	public List<ListItem> getList() {
		return this.list;
	}

	public void setList(List<ListItem> list) {
		this.list = list;
	}

	public static class ListItem {

		private String expireTime;

		private Long partnerPk;

		private String customerName;

		private Integer customerRptType;

		private String applyRemarks;

		private Long id;

		private Integer auditStatus;

		private String applyTime;

		public String getExpireTime() {
			return this.expireTime;
		}

		public void setExpireTime(String expireTime) {
			this.expireTime = expireTime;
		}

		public Long getPartnerPk() {
			return this.partnerPk;
		}

		public void setPartnerPk(Long partnerPk) {
			this.partnerPk = partnerPk;
		}

		public String getCustomerName() {
			return this.customerName;
		}

		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}

		public Integer getCustomerRptType() {
			return this.customerRptType;
		}

		public void setCustomerRptType(Integer customerRptType) {
			this.customerRptType = customerRptType;
		}

		public String getApplyRemarks() {
			return this.applyRemarks;
		}

		public void setApplyRemarks(String applyRemarks) {
			this.applyRemarks = applyRemarks;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Integer getAuditStatus() {
			return this.auditStatus;
		}

		public void setAuditStatus(Integer auditStatus) {
			this.auditStatus = auditStatus;
		}

		public String getApplyTime() {
			return this.applyTime;
		}

		public void setApplyTime(String applyTime) {
			this.applyTime = applyTime;
		}
	}

	@Override
	public QueryBpmsListResponse getInstance(UnmarshallerContext context) {
		return	QueryBpmsListResponseUnmarshaller.unmarshall(this, context);
	}
}
