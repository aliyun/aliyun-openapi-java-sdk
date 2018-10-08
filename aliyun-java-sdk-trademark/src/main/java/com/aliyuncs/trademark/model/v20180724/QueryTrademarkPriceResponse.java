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
import com.aliyuncs.trademark.transform.v20180724.QueryTrademarkPriceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryTrademarkPriceResponse extends AcsResponse {

	private String requestId;

	private Float discountPrice;

	private Float originalPrice;

	private Float tradePrice;

	private String currency;

	private List<PricesItem> prices;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Float getDiscountPrice() {
		return this.discountPrice;
	}

	public void setDiscountPrice(Float discountPrice) {
		this.discountPrice = discountPrice;
	}

	public Float getOriginalPrice() {
		return this.originalPrice;
	}

	public void setOriginalPrice(Float originalPrice) {
		this.originalPrice = originalPrice;
	}

	public Float getTradePrice() {
		return this.tradePrice;
	}

	public void setTradePrice(Float tradePrice) {
		this.tradePrice = tradePrice;
	}

	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public List<PricesItem> getPrices() {
		return this.prices;
	}

	public void setPrices(List<PricesItem> prices) {
		this.prices = prices;
	}

	public static class PricesItem {

		private String classificationCode;

		private Float discountPrice;

		private Float originalPrice;

		private Float tradePrice;

		private String currency;

		public String getClassificationCode() {
			return this.classificationCode;
		}

		public void setClassificationCode(String classificationCode) {
			this.classificationCode = classificationCode;
		}

		public Float getDiscountPrice() {
			return this.discountPrice;
		}

		public void setDiscountPrice(Float discountPrice) {
			this.discountPrice = discountPrice;
		}

		public Float getOriginalPrice() {
			return this.originalPrice;
		}

		public void setOriginalPrice(Float originalPrice) {
			this.originalPrice = originalPrice;
		}

		public Float getTradePrice() {
			return this.tradePrice;
		}

		public void setTradePrice(Float tradePrice) {
			this.tradePrice = tradePrice;
		}

		public String getCurrency() {
			return this.currency;
		}

		public void setCurrency(String currency) {
			this.currency = currency;
		}
	}

	@Override
	public QueryTrademarkPriceResponse getInstance(UnmarshallerContext context) {
		return	QueryTrademarkPriceResponseUnmarshaller.unmarshall(this, context);
	}
}
