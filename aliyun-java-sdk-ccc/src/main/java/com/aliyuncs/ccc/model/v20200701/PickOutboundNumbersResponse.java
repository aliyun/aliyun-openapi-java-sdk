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

package com.aliyuncs.ccc.model.v20200701;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ccc.transform.v20200701.PickOutboundNumbersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class PickOutboundNumbersResponse extends AcsResponse {

	private String code;

	private Integer httpStatusCode;

	private String message;

	private String requestId;

	private List<NumberPair> data;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<NumberPair> getData() {
		return this.data;
	}

	public void setData(List<NumberPair> data) {
		this.data = data;
	}

	public static class NumberPair {

		private Callee callee;

		private Caller caller;

		public Callee getCallee() {
			return this.callee;
		}

		public void setCallee(Callee callee) {
			this.callee = callee;
		}

		public Caller getCaller() {
			return this.caller;
		}

		public void setCaller(Caller caller) {
			this.caller = caller;
		}

		public static class Callee {

			private String city;

			private String number;

			private String province;

			public String getCity() {
				return this.city;
			}

			public void setCity(String city) {
				this.city = city;
			}

			public String getNumber() {
				return this.number;
			}

			public void setNumber(String number) {
				this.number = number;
			}

			public String getProvince() {
				return this.province;
			}

			public void setProvince(String province) {
				this.province = province;
			}
		}

		public static class Caller {

			private String city;

			private String number;

			private String province;

			public String getCity() {
				return this.city;
			}

			public void setCity(String city) {
				this.city = city;
			}

			public String getNumber() {
				return this.number;
			}

			public void setNumber(String number) {
				this.number = number;
			}

			public String getProvince() {
				return this.province;
			}

			public void setProvince(String province) {
				this.province = province;
			}
		}
	}

	@Override
	public PickOutboundNumbersResponse getInstance(UnmarshallerContext context) {
		return	PickOutboundNumbersResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
