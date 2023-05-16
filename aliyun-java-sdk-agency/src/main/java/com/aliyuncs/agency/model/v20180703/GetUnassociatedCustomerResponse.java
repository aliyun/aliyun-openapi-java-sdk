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
import com.aliyuncs.agency.transform.v20180703.GetUnassociatedCustomerResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetUnassociatedCustomerResponse extends AcsResponse {

	private String code;

	private String message;

	private Boolean success;

	private List<InviteInfo> inviteInfoList;

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

	public List<InviteInfo> getInviteInfoList() {
		return this.inviteInfoList;
	}

	public void setInviteInfoList(List<InviteInfo> inviteInfoList) {
		this.inviteInfoList = inviteInfoList;
	}

	public PageInfo getPageInfo() {
		return this.pageInfo;
	}

	public void setPageInfo(PageInfo pageInfo) {
		this.pageInfo = pageInfo;
	}

	public static class InviteInfo {

		private Integer status;

		private String gmtCreate;

		private String accountNickname;

		private String email;

		private Long inviteId;

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getAccountNickname() {
			return this.accountNickname;
		}

		public void setAccountNickname(String accountNickname) {
			this.accountNickname = accountNickname;
		}

		public String getEmail() {
			return this.email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public Long getInviteId() {
			return this.inviteId;
		}

		public void setInviteId(Long inviteId) {
			this.inviteId = inviteId;
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
	public GetUnassociatedCustomerResponse getInstance(UnmarshallerContext context) {
		return	GetUnassociatedCustomerResponseUnmarshaller.unmarshall(this, context);
	}
}
