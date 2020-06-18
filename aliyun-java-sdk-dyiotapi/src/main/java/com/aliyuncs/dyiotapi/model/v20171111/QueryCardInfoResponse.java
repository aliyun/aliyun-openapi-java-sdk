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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.dyiotapi.transform.v20171111.QueryCardInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryCardInfoResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private CardInfo cardInfo;

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

	public CardInfo getCardInfo() {
		return this.cardInfo;
	}

	public void setCardInfo(CardInfo cardInfo) {
		this.cardInfo = cardInfo;
	}

	public static class CardInfo {

		private String iccid;

		private String openTime;

		private String firstActiveTime;

		private String imsi;

		private String msisdn;

		private String gprsStatus;

		private String voiceStatus;

		private String smsStatus;

		public String getIccid() {
			return this.iccid;
		}

		public void setIccid(String iccid) {
			this.iccid = iccid;
		}

		public String getOpenTime() {
			return this.openTime;
		}

		public void setOpenTime(String openTime) {
			this.openTime = openTime;
		}

		public String getFirstActiveTime() {
			return this.firstActiveTime;
		}

		public void setFirstActiveTime(String firstActiveTime) {
			this.firstActiveTime = firstActiveTime;
		}

		public String getImsi() {
			return this.imsi;
		}

		public void setImsi(String imsi) {
			this.imsi = imsi;
		}

		public String getMsisdn() {
			return this.msisdn;
		}

		public void setMsisdn(String msisdn) {
			this.msisdn = msisdn;
		}

		public String getGprsStatus() {
			return this.gprsStatus;
		}

		public void setGprsStatus(String gprsStatus) {
			this.gprsStatus = gprsStatus;
		}

		public String getVoiceStatus() {
			return this.voiceStatus;
		}

		public void setVoiceStatus(String voiceStatus) {
			this.voiceStatus = voiceStatus;
		}

		public String getSmsStatus() {
			return this.smsStatus;
		}

		public void setSmsStatus(String smsStatus) {
			this.smsStatus = smsStatus;
		}
	}

	@Override
	public QueryCardInfoResponse getInstance(UnmarshallerContext context) {
		return	QueryCardInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
