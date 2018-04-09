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

package com.aliyuncs.emr.model.v20160408;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.emr.transform.v20160408.QueryPriceForModifyConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryPriceForModifyConfigResponse extends AcsResponse {

	private String requestId;

	private String ecsId;

	private EmrPriceDO emrPriceDO;

	private EcsPriceDO ecsPriceDO;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getEcsId() {
		return this.ecsId;
	}

	public void setEcsId(String ecsId) {
		this.ecsId = ecsId;
	}

	public EmrPriceDO getEmrPriceDO() {
		return this.emrPriceDO;
	}

	public void setEmrPriceDO(EmrPriceDO emrPriceDO) {
		this.emrPriceDO = emrPriceDO;
	}

	public EcsPriceDO getEcsPriceDO() {
		return this.ecsPriceDO;
	}

	public void setEcsPriceDO(EcsPriceDO ecsPriceDO) {
		this.ecsPriceDO = ecsPriceDO;
	}

	public static class EmrPriceDO {

		private String originalPrice;

		private String discountPrice;

		private String tradePrice;

		private String taxPrice;

		private String currency;

		public String getOriginalPrice() {
			return this.originalPrice;
		}

		public void setOriginalPrice(String originalPrice) {
			this.originalPrice = originalPrice;
		}

		public String getDiscountPrice() {
			return this.discountPrice;
		}

		public void setDiscountPrice(String discountPrice) {
			this.discountPrice = discountPrice;
		}

		public String getTradePrice() {
			return this.tradePrice;
		}

		public void setTradePrice(String tradePrice) {
			this.tradePrice = tradePrice;
		}

		public String getTaxPrice() {
			return this.taxPrice;
		}

		public void setTaxPrice(String taxPrice) {
			this.taxPrice = taxPrice;
		}

		public String getCurrency() {
			return this.currency;
		}

		public void setCurrency(String currency) {
			this.currency = currency;
		}
	}

	public static class EcsPriceDO {

		private String originalPrice;

		private String discountPrice;

		private String tradePrice;

		private String taxPrice;

		private String currency;

		public String getOriginalPrice() {
			return this.originalPrice;
		}

		public void setOriginalPrice(String originalPrice) {
			this.originalPrice = originalPrice;
		}

		public String getDiscountPrice() {
			return this.discountPrice;
		}

		public void setDiscountPrice(String discountPrice) {
			this.discountPrice = discountPrice;
		}

		public String getTradePrice() {
			return this.tradePrice;
		}

		public void setTradePrice(String tradePrice) {
			this.tradePrice = tradePrice;
		}

		public String getTaxPrice() {
			return this.taxPrice;
		}

		public void setTaxPrice(String taxPrice) {
			this.taxPrice = taxPrice;
		}

		public String getCurrency() {
			return this.currency;
		}

		public void setCurrency(String currency) {
			this.currency = currency;
		}
	}

	@Override
	public QueryPriceForModifyConfigResponse getInstance(UnmarshallerContext context) {
		return	QueryPriceForModifyConfigResponseUnmarshaller.unmarshall(this, context);
	}
}
