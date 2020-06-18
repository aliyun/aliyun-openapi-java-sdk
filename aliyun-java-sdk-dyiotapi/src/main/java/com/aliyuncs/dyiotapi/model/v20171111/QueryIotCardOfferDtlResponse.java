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

package com.aliyuncs.dyiotapi.model.v20171111;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dyiotapi.transform.v20171111.QueryIotCardOfferDtlResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryIotCardOfferDtlResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private List<Detail> cardOfferDetail;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

	public List<Detail> getCardOfferDetail() {
		return this.cardOfferDetail;
	}

	public void setCardOfferDetail(List<Detail> cardOfferDetail) {
		this.cardOfferDetail = cardOfferDetail;
	}

	public static class Detail {

		private String expireTime;

		private String effectiveTime;

		private String orderTime;

		private String offerName;

		private String offerId;

		public String getExpireTime() {
			return this.expireTime;
		}

		public void setExpireTime(String expireTime) {
			this.expireTime = expireTime;
		}

		public String getEffectiveTime() {
			return this.effectiveTime;
		}

		public void setEffectiveTime(String effectiveTime) {
			this.effectiveTime = effectiveTime;
		}

		public String getOrderTime() {
			return this.orderTime;
		}

		public void setOrderTime(String orderTime) {
			this.orderTime = orderTime;
		}

		public String getOfferName() {
			return this.offerName;
		}

		public void setOfferName(String offerName) {
			this.offerName = offerName;
		}

		public String getOfferId() {
			return this.offerId;
		}

		public void setOfferId(String offerId) {
			this.offerId = offerId;
		}
	}

	@Override
	public QueryIotCardOfferDtlResponse getInstance(UnmarshallerContext context) {
		return	QueryIotCardOfferDtlResponseUnmarshaller.unmarshall(this, context);
	}
}
