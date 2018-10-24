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

package com.aliyuncs.crm.model.v20150408;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.crm.transform.v20150408.QueryCustomerLabelResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryCustomerLabelResponse extends AcsResponse {

	private Boolean success;

	private String code;

	private String message;

	private List<CustomerLabel> data;

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

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

	public List<CustomerLabel> getData() {
		return this.data;
	}

	public void setData(List<CustomerLabel> data) {
		this.data = data;
	}

	public static class CustomerLabel {

		private String label;

		private String labelSeries;

		public String getLabel() {
			return this.label;
		}

		public void setLabel(String label) {
			this.label = label;
		}

		public String getLabelSeries() {
			return this.labelSeries;
		}

		public void setLabelSeries(String labelSeries) {
			this.labelSeries = labelSeries;
		}
	}

	@Override
	public QueryCustomerLabelResponse getInstance(UnmarshallerContext context) {
		return	QueryCustomerLabelResponseUnmarshaller.unmarshall(this, context);
	}
}
