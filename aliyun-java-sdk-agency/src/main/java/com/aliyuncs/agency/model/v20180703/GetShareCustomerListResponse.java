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
import com.aliyuncs.agency.transform.v20180703.GetShareCustomerListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetShareCustomerListResponse extends AcsResponse {

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

		private String customerName;

		private Long parentUid;

		private String exitOnGoingProject;

		private Integer customerType;

		private Long cid;

		private List<String> customerAccounts;

		private List<String> customerUids;

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

		public String getExitOnGoingProject() {
			return this.exitOnGoingProject;
		}

		public void setExitOnGoingProject(String exitOnGoingProject) {
			this.exitOnGoingProject = exitOnGoingProject;
		}

		public Integer getCustomerType() {
			return this.customerType;
		}

		public void setCustomerType(Integer customerType) {
			this.customerType = customerType;
		}

		public Long getCid() {
			return this.cid;
		}

		public void setCid(Long cid) {
			this.cid = cid;
		}

		public List<String> getCustomerAccounts() {
			return this.customerAccounts;
		}

		public void setCustomerAccounts(List<String> customerAccounts) {
			this.customerAccounts = customerAccounts;
		}

		public List<String> getCustomerUids() {
			return this.customerUids;
		}

		public void setCustomerUids(List<String> customerUids) {
			this.customerUids = customerUids;
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
	public GetShareCustomerListResponse getInstance(UnmarshallerContext context) {
		return	GetShareCustomerListResponseUnmarshaller.unmarshall(this, context);
	}
}
