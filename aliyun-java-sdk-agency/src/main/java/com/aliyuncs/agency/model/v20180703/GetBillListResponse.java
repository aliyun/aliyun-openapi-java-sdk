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
import com.aliyuncs.agency.transform.v20180703.GetBillListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetBillListResponse extends AcsResponse {

	private String code;

	private String message;

	private Boolean success;

	private List<PopBillJson> data;

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

	public List<PopBillJson> getData() {
		return this.data;
	}

	public void setData(List<PopBillJson> data) {
		this.data = data;
	}

	public PageInfo getPageInfo() {
		return this.pageInfo;
	}

	public void setPageInfo(PageInfo pageInfo) {
		this.pageInfo = pageInfo;
	}

	public static class PopBillJson {

		private Long billId;

		private String productName;

		private Long payStatus;

		private String postpayBillDetail;

		private Long ramUid;

		private String gmtPay;

		private String cloudAccount;

		private String fee;

		public Long getBillId() {
			return this.billId;
		}

		public void setBillId(Long billId) {
			this.billId = billId;
		}

		public String getProductName() {
			return this.productName;
		}

		public void setProductName(String productName) {
			this.productName = productName;
		}

		public Long getPayStatus() {
			return this.payStatus;
		}

		public void setPayStatus(Long payStatus) {
			this.payStatus = payStatus;
		}

		public String getPostpayBillDetail() {
			return this.postpayBillDetail;
		}

		public void setPostpayBillDetail(String postpayBillDetail) {
			this.postpayBillDetail = postpayBillDetail;
		}

		public Long getRamUid() {
			return this.ramUid;
		}

		public void setRamUid(Long ramUid) {
			this.ramUid = ramUid;
		}

		public String getGmtPay() {
			return this.gmtPay;
		}

		public void setGmtPay(String gmtPay) {
			this.gmtPay = gmtPay;
		}

		public String getCloudAccount() {
			return this.cloudAccount;
		}

		public void setCloudAccount(String cloudAccount) {
			this.cloudAccount = cloudAccount;
		}

		public String getFee() {
			return this.fee;
		}

		public void setFee(String fee) {
			this.fee = fee;
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
	public GetBillListResponse getInstance(UnmarshallerContext context) {
		return	GetBillListResponseUnmarshaller.unmarshall(this, context);
	}
}
