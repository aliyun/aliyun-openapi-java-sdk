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

package com.aliyuncs.agency.model.v20180701;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.agency.transform.v20180701.GetDailyBillResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetDailyBillResponse extends AcsResponse {

	private String code;

	private String message;

	private Boolean success;

	private Data data;

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String billLinkCSV;

		private String spendingTime;

		private String billType;

		private String billOwner;

		private String billLinkXLSX;

		public String getBillLinkCSV() {
			return this.billLinkCSV;
		}

		public void setBillLinkCSV(String billLinkCSV) {
			this.billLinkCSV = billLinkCSV;
		}

		public String getSpendingTime() {
			return this.spendingTime;
		}

		public void setSpendingTime(String spendingTime) {
			this.spendingTime = spendingTime;
		}

		public String getBillType() {
			return this.billType;
		}

		public void setBillType(String billType) {
			this.billType = billType;
		}

		public String getBillOwner() {
			return this.billOwner;
		}

		public void setBillOwner(String billOwner) {
			this.billOwner = billOwner;
		}

		public String getBillLinkXLSX() {
			return this.billLinkXLSX;
		}

		public void setBillLinkXLSX(String billLinkXLSX) {
			this.billLinkXLSX = billLinkXLSX;
		}
	}

	@Override
	public GetDailyBillResponse getInstance(UnmarshallerContext context) {
		return	GetDailyBillResponseUnmarshaller.unmarshall(this, context);
	}
}
