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

package com.aliyuncs.copyright.model.v20190123;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.copyright.transform.v20190123.GetPatentTicketsInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetPatentTicketsInfoResponse extends AcsResponse {

	private Boolean success;

	private String requestId;

	private List<DataItem> data;

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String invoiceUrl;

		private String patentNo;

		private String fee;

		private String remark;

		public String getInvoiceUrl() {
			return this.invoiceUrl;
		}

		public void setInvoiceUrl(String invoiceUrl) {
			this.invoiceUrl = invoiceUrl;
		}

		public String getPatentNo() {
			return this.patentNo;
		}

		public void setPatentNo(String patentNo) {
			this.patentNo = patentNo;
		}

		public String getFee() {
			return this.fee;
		}

		public void setFee(String fee) {
			this.fee = fee;
		}

		public String getRemark() {
			return this.remark;
		}

		public void setRemark(String remark) {
			this.remark = remark;
		}
	}

	@Override
	public GetPatentTicketsInfoResponse getInstance(UnmarshallerContext context) {
		return	GetPatentTicketsInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
