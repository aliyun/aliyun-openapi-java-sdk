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

package com.aliyuncs.brinekingdom.model.v20190627;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.brinekingdom.transform.v20190627.GetSecondaryProdByPrimaryProdResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetSecondaryProdByPrimaryProdResponse extends AcsResponse {

	private String _class;

	private String errorMessage;

	private Boolean success;

	private String resultCode;

	private String requestId;

	private List<ResultItem> result;

	public String get_Class() {
		return this._class;
	}

	public void set_Class(String _class) {
		this._class = _class;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ResultItem> getResult() {
		return this.result;
	}

	public void setResult(List<ResultItem> result) {
		this.result = result;
	}

	public static class ResultItem {

		private String aoneId;

		private String aoneName;

		private String _class;

		private String productClass;

		private String productClassCN;

		private String productCode;

		private String productEnName;

		private String productLineCN;

		private String productLineEN;

		private String productName;

		public String getAoneId() {
			return this.aoneId;
		}

		public void setAoneId(String aoneId) {
			this.aoneId = aoneId;
		}

		public String getAoneName() {
			return this.aoneName;
		}

		public void setAoneName(String aoneName) {
			this.aoneName = aoneName;
		}

		public String get_Class() {
			return this._class;
		}

		public void set_Class(String _class) {
			this._class = _class;
		}

		public String getProductClass() {
			return this.productClass;
		}

		public void setProductClass(String productClass) {
			this.productClass = productClass;
		}

		public String getProductClassCN() {
			return this.productClassCN;
		}

		public void setProductClassCN(String productClassCN) {
			this.productClassCN = productClassCN;
		}

		public String getProductCode() {
			return this.productCode;
		}

		public void setProductCode(String productCode) {
			this.productCode = productCode;
		}

		public String getProductEnName() {
			return this.productEnName;
		}

		public void setProductEnName(String productEnName) {
			this.productEnName = productEnName;
		}

		public String getProductLineCN() {
			return this.productLineCN;
		}

		public void setProductLineCN(String productLineCN) {
			this.productLineCN = productLineCN;
		}

		public String getProductLineEN() {
			return this.productLineEN;
		}

		public void setProductLineEN(String productLineEN) {
			this.productLineEN = productLineEN;
		}

		public String getProductName() {
			return this.productName;
		}

		public void setProductName(String productName) {
			this.productName = productName;
		}
	}

	@Override
	public GetSecondaryProdByPrimaryProdResponse getInstance(UnmarshallerContext context) {
		return	GetSecondaryProdByPrimaryProdResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
