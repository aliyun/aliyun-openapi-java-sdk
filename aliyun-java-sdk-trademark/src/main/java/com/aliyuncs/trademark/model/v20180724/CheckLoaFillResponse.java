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

package com.aliyuncs.trademark.model.v20180724;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.trademark.transform.v20180724.CheckLoaFillResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CheckLoaFillResponse extends AcsResponse {

	private String requestId;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Boolean stampFill;

		private Boolean addressFill;

		private Boolean tradeMarkNameFill;

		private Boolean countryFill;

		private Boolean nationalityFill;

		private Boolean materialNameFill;

		private String templateUrl;

		private List<String> errorMsgs;

		public Boolean getStampFill() {
			return this.stampFill;
		}

		public void setStampFill(Boolean stampFill) {
			this.stampFill = stampFill;
		}

		public Boolean getAddressFill() {
			return this.addressFill;
		}

		public void setAddressFill(Boolean addressFill) {
			this.addressFill = addressFill;
		}

		public Boolean getTradeMarkNameFill() {
			return this.tradeMarkNameFill;
		}

		public void setTradeMarkNameFill(Boolean tradeMarkNameFill) {
			this.tradeMarkNameFill = tradeMarkNameFill;
		}

		public Boolean getCountryFill() {
			return this.countryFill;
		}

		public void setCountryFill(Boolean countryFill) {
			this.countryFill = countryFill;
		}

		public Boolean getNationalityFill() {
			return this.nationalityFill;
		}

		public void setNationalityFill(Boolean nationalityFill) {
			this.nationalityFill = nationalityFill;
		}

		public Boolean getMaterialNameFill() {
			return this.materialNameFill;
		}

		public void setMaterialNameFill(Boolean materialNameFill) {
			this.materialNameFill = materialNameFill;
		}

		public String getTemplateUrl() {
			return this.templateUrl;
		}

		public void setTemplateUrl(String templateUrl) {
			this.templateUrl = templateUrl;
		}

		public List<String> getErrorMsgs() {
			return this.errorMsgs;
		}

		public void setErrorMsgs(List<String> errorMsgs) {
			this.errorMsgs = errorMsgs;
		}
	}

	@Override
	public CheckLoaFillResponse getInstance(UnmarshallerContext context) {
		return	CheckLoaFillResponseUnmarshaller.unmarshall(this, context);
	}
}
