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

package com.aliyuncs.companyreg.model.v20201022;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.companyreg.transform.v20201022.ListLastMonthInvoiceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListLastMonthInvoiceResponse extends AcsResponse {

	private String amount;

	private String requestId;

	private Integer count;

	private List<DataItem> data;

	public String getAmount() {
		return this.amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String type;

		private String amount;

		private String taxAndAmount;

		private String productName;

		private String date;

		private String url;

		private String orgName;

		private Long id;

		private String tax;

		private Boolean isSaveVoucher;

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getAmount() {
			return this.amount;
		}

		public void setAmount(String amount) {
			this.amount = amount;
		}

		public String getTaxAndAmount() {
			return this.taxAndAmount;
		}

		public void setTaxAndAmount(String taxAndAmount) {
			this.taxAndAmount = taxAndAmount;
		}

		public String getProductName() {
			return this.productName;
		}

		public void setProductName(String productName) {
			this.productName = productName;
		}

		public String getDate() {
			return this.date;
		}

		public void setDate(String date) {
			this.date = date;
		}

		public String getUrl() {
			return this.url;
		}

		public void setUrl(String url) {
			this.url = url;
		}

		public String getOrgName() {
			return this.orgName;
		}

		public void setOrgName(String orgName) {
			this.orgName = orgName;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getTax() {
			return this.tax;
		}

		public void setTax(String tax) {
			this.tax = tax;
		}

		public Boolean getIsSaveVoucher() {
			return this.isSaveVoucher;
		}

		public void setIsSaveVoucher(Boolean isSaveVoucher) {
			this.isSaveVoucher = isSaveVoucher;
		}
	}

	@Override
	public ListLastMonthInvoiceResponse getInstance(UnmarshallerContext context) {
		return	ListLastMonthInvoiceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
