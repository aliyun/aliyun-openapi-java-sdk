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
import com.aliyuncs.cloudcallcenter.transform.v20170705.QueryNumberPriceLevelResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryNumberPriceLevelResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer httpStatusCode;

	private NumberPrice numberPrice;

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

	public NumberPrice getNumberPrice() {
		return this.numberPrice;
	}

	public void setNumberPrice(NumberPrice numberPrice) {
		this.numberPrice = numberPrice;
	}

	public static class NumberPrice {

		private List<CommonNumberPrice> commonNumberPrices;

		private List<PrettyNumberPrice> prettyNumberPrices;

		public List<CommonNumberPrice> getCommonNumberPrices() {
			return this.commonNumberPrices;
		}

		public void setCommonNumberPrices(List<CommonNumberPrice> commonNumberPrices) {
			this.commonNumberPrices = commonNumberPrices;
		}

		public List<PrettyNumberPrice> getPrettyNumberPrices() {
			return this.prettyNumberPrices;
		}

		public void setPrettyNumberPrices(List<PrettyNumberPrice> prettyNumberPrices) {
			this.prettyNumberPrices = prettyNumberPrices;
		}

		public static class CommonNumberPrice {

			private Integer price;

			private String description;

			public Integer getPrice() {
				return this.price;
			}

			public void setPrice(Integer price) {
				this.price = price;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}
		}

		public static class PrettyNumberPrice {

			private Integer price;

			private String description;

			public Integer getPrice() {
				return this.price;
			}

			public void setPrice(Integer price) {
				this.price = price;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}
		}
	}

	@Override
	public QueryNumberPriceLevelResponse getInstance(UnmarshallerContext context) {
		return	QueryNumberPriceLevelResponseUnmarshaller.unmarshall(this, context);
	}
}
