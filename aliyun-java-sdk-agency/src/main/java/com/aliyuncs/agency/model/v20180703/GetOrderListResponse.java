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
import com.aliyuncs.agency.transform.v20180703.GetOrderListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetOrderListResponse extends AcsResponse {

	private String code;

	private String message;

	private Boolean success;

	private List<PopOrderJson> data;

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

	public List<PopOrderJson> getData() {
		return this.data;
	}

	public void setData(List<PopOrderJson> data) {
		this.data = data;
	}

	public PageInfo getPageInfo() {
		return this.pageInfo;
	}

	public void setPageInfo(PageInfo pageInfo) {
		this.pageInfo = pageInfo;
	}

	public static class PopOrderJson {

		private Integer anotherPay;

		private Long orderStatus;

		private Long ramUid;

		private String orderTypeName;

		private String payTime;

		private String gmtCreate;

		private String payment;

		private Long orderId;

		private String fee;

		private String articleName;

		public Integer getAnotherPay() {
			return this.anotherPay;
		}

		public void setAnotherPay(Integer anotherPay) {
			this.anotherPay = anotherPay;
		}

		public Long getOrderStatus() {
			return this.orderStatus;
		}

		public void setOrderStatus(Long orderStatus) {
			this.orderStatus = orderStatus;
		}

		public Long getRamUid() {
			return this.ramUid;
		}

		public void setRamUid(Long ramUid) {
			this.ramUid = ramUid;
		}

		public String getOrderTypeName() {
			return this.orderTypeName;
		}

		public void setOrderTypeName(String orderTypeName) {
			this.orderTypeName = orderTypeName;
		}

		public String getPayTime() {
			return this.payTime;
		}

		public void setPayTime(String payTime) {
			this.payTime = payTime;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getPayment() {
			return this.payment;
		}

		public void setPayment(String payment) {
			this.payment = payment;
		}

		public Long getOrderId() {
			return this.orderId;
		}

		public void setOrderId(Long orderId) {
			this.orderId = orderId;
		}

		public String getFee() {
			return this.fee;
		}

		public void setFee(String fee) {
			this.fee = fee;
		}

		public String getArticleName() {
			return this.articleName;
		}

		public void setArticleName(String articleName) {
			this.articleName = articleName;
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
	public GetOrderListResponse getInstance(UnmarshallerContext context) {
		return	GetOrderListResponseUnmarshaller.unmarshall(this, context);
	}
}
