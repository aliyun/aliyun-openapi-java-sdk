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

package com.aliyuncs.agency.model.v20180703;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.agency.transform.v20180703.GetShareAccountListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetShareAccountListResponse extends AcsResponse {

	private String code;

	private String message;

	private Boolean success;

	private List<Data> dataList;

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

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<Data> getDataList() {
		return this.dataList;
	}

	public void setDataList(List<Data> dataList) {
		this.dataList = dataList;
	}

	public PageInfo getPageInfo() {
		return this.pageInfo;
	}

	public void setPageInfo(PageInfo pageInfo) {
		this.pageInfo = pageInfo;
	}

	public static class Data {

		private String customerAccount;

		private Long cid;

		private String customerPhone;

		private String customerName;

		private Long parentUid;

		private String cloudAccount;

		private Long uid;

		public String getCustomerAccount() {
			return this.customerAccount;
		}

		public void setCustomerAccount(String customerAccount) {
			this.customerAccount = customerAccount;
		}

		public Long getCid() {
			return this.cid;
		}

		public void setCid(Long cid) {
			this.cid = cid;
		}

		public String getCustomerPhone() {
			return this.customerPhone;
		}

		public void setCustomerPhone(String customerPhone) {
			this.customerPhone = customerPhone;
		}

		public String getCustomerName() {
			return this.customerName;
		}

		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}

		public Long getParentUid() {
			return this.parentUid;
		}

		public void setParentUid(Long parentUid) {
			this.parentUid = parentUid;
		}

		public String getCloudAccount() {
			return this.cloudAccount;
		}

		public void setCloudAccount(String cloudAccount) {
			this.cloudAccount = cloudAccount;
		}

		public Long getUid() {
			return this.uid;
		}

		public void setUid(Long uid) {
			this.uid = uid;
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
	public GetShareAccountListResponse getInstance(UnmarshallerContext context) {
		return	GetShareAccountListResponseUnmarshaller.unmarshall(this, context);
	}
}
