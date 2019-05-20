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

package com.aliyuncs.cloudcallcenter.model.v20170705;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudcallcenter.transform.v20170705.QueryNumber400ListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryNumber400ListResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer httpStatusCode;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

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

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer monthlyPrice;

		private List<Number> numbers;

		public Integer getMonthlyPrice() {
			return this.monthlyPrice;
		}

		public void setMonthlyPrice(Integer monthlyPrice) {
			this.monthlyPrice = monthlyPrice;
		}

		public List<Number> getNumbers() {
			return this.numbers;
		}

		public void setNumbers(List<Number> numbers) {
			this.numbers = numbers;
		}

		public static class Number {

			private String number;

			private String signature;

			public String getNumber() {
				return this.number;
			}

			public void setNumber(String number) {
				this.number = number;
			}

			public String getSignature() {
				return this.signature;
			}

			public void setSignature(String signature) {
				this.signature = signature;
			}
		}
	}

	@Override
	public QueryNumber400ListResponse getInstance(UnmarshallerContext context) {
		return	QueryNumber400ListResponseUnmarshaller.unmarshall(this, context);
	}
}
