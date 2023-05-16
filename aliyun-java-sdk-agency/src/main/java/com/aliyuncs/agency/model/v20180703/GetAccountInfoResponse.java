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
import com.aliyuncs.agency.transform.v20180703.GetAccountInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetAccountInfoResponse extends AcsResponse {

	private String code;

	private String message;

	private Boolean success;

	private List<AccountInfo> accountInfoList;

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

	public List<AccountInfo> getAccountInfoList() {
		return this.accountInfoList;
	}

	public void setAccountInfoList(List<AccountInfo> accountInfoList) {
		this.accountInfoList = accountInfoList;
	}

	public PageInfo getPageInfo() {
		return this.pageInfo;
	}

	public void setPageInfo(PageInfo pageInfo) {
		this.pageInfo = pageInfo;
	}

	public static class AccountInfo {

		private Integer subAccountType;

		private String associationSuccessTime;

		private String accountNickname;

		private String email;

		private String remark;

		private String mobile;

		private String aliyunId;

		private Long uid;

		private Long cid;

		public Integer getSubAccountType() {
			return this.subAccountType;
		}

		public void setSubAccountType(Integer subAccountType) {
			this.subAccountType = subAccountType;
		}

		public String getAssociationSuccessTime() {
			return this.associationSuccessTime;
		}

		public void setAssociationSuccessTime(String associationSuccessTime) {
			this.associationSuccessTime = associationSuccessTime;
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

		public String getRemark() {
			return this.remark;
		}

		public void setRemark(String remark) {
			this.remark = remark;
		}

		public String getMobile() {
			return this.mobile;
		}

		public void setMobile(String mobile) {
			this.mobile = mobile;
		}

		public String getAliyunId() {
			return this.aliyunId;
		}

		public void setAliyunId(String aliyunId) {
			this.aliyunId = aliyunId;
		}

		public Long getUid() {
			return this.uid;
		}

		public void setUid(Long uid) {
			this.uid = uid;
		}

		public Long getCid() {
			return this.cid;
		}

		public void setCid(Long cid) {
			this.cid = cid;
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
	public GetAccountInfoResponse getInstance(UnmarshallerContext context) {
		return	GetAccountInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
