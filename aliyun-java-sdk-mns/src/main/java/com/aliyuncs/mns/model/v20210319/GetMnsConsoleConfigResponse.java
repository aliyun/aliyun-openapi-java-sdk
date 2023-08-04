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

package com.aliyuncs.mns.model.v20210319;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.mns.transform.v20210319.GetMnsConsoleConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetMnsConsoleConfigResponse extends AcsResponse {

	private String requestId;

	private Long code;

	private String status;

	private String message;

	private Boolean success;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getCode() {
		return this.code;
	}

	public void setCode(Long code) {
		this.code = code;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String userId;

		private String bid;

		private String isJst;

		private String isJbp;

		private String loginLink;

		private String aCCOUNT_PROFILE_URL;

		private String buyUrl;

		private String buyUrlEn;

		private String buyOSSUrl;

		private String buyRAMUrl;

		private String buySLSUrl;

		private String mnsDescUrl;

		private String mnsDescUrlEn;

		private String mnsDescUrlJp;

		private String akUrl;

		private String isChineseUser;

		private String isJapanSite;

		private Boolean hasPretendPermission;

		private String pretendedUserId;

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getBid() {
			return this.bid;
		}

		public void setBid(String bid) {
			this.bid = bid;
		}

		public String getIsJst() {
			return this.isJst;
		}

		public void setIsJst(String isJst) {
			this.isJst = isJst;
		}

		public String getIsJbp() {
			return this.isJbp;
		}

		public void setIsJbp(String isJbp) {
			this.isJbp = isJbp;
		}

		public String getLoginLink() {
			return this.loginLink;
		}

		public void setLoginLink(String loginLink) {
			this.loginLink = loginLink;
		}

		public String getACCOUNT_PROFILE_URL() {
			return this.aCCOUNT_PROFILE_URL;
		}

		public void setACCOUNT_PROFILE_URL(String aCCOUNT_PROFILE_URL) {
			this.aCCOUNT_PROFILE_URL = aCCOUNT_PROFILE_URL;
		}

		public String getBuyUrl() {
			return this.buyUrl;
		}

		public void setBuyUrl(String buyUrl) {
			this.buyUrl = buyUrl;
		}

		public String getBuyUrlEn() {
			return this.buyUrlEn;
		}

		public void setBuyUrlEn(String buyUrlEn) {
			this.buyUrlEn = buyUrlEn;
		}

		public String getBuyOSSUrl() {
			return this.buyOSSUrl;
		}

		public void setBuyOSSUrl(String buyOSSUrl) {
			this.buyOSSUrl = buyOSSUrl;
		}

		public String getBuyRAMUrl() {
			return this.buyRAMUrl;
		}

		public void setBuyRAMUrl(String buyRAMUrl) {
			this.buyRAMUrl = buyRAMUrl;
		}

		public String getBuySLSUrl() {
			return this.buySLSUrl;
		}

		public void setBuySLSUrl(String buySLSUrl) {
			this.buySLSUrl = buySLSUrl;
		}

		public String getMnsDescUrl() {
			return this.mnsDescUrl;
		}

		public void setMnsDescUrl(String mnsDescUrl) {
			this.mnsDescUrl = mnsDescUrl;
		}

		public String getMnsDescUrlEn() {
			return this.mnsDescUrlEn;
		}

		public void setMnsDescUrlEn(String mnsDescUrlEn) {
			this.mnsDescUrlEn = mnsDescUrlEn;
		}

		public String getMnsDescUrlJp() {
			return this.mnsDescUrlJp;
		}

		public void setMnsDescUrlJp(String mnsDescUrlJp) {
			this.mnsDescUrlJp = mnsDescUrlJp;
		}

		public String getAkUrl() {
			return this.akUrl;
		}

		public void setAkUrl(String akUrl) {
			this.akUrl = akUrl;
		}

		public String getIsChineseUser() {
			return this.isChineseUser;
		}

		public void setIsChineseUser(String isChineseUser) {
			this.isChineseUser = isChineseUser;
		}

		public String getIsJapanSite() {
			return this.isJapanSite;
		}

		public void setIsJapanSite(String isJapanSite) {
			this.isJapanSite = isJapanSite;
		}

		public Boolean getHasPretendPermission() {
			return this.hasPretendPermission;
		}

		public void setHasPretendPermission(Boolean hasPretendPermission) {
			this.hasPretendPermission = hasPretendPermission;
		}

		public String getPretendedUserId() {
			return this.pretendedUserId;
		}

		public void setPretendedUserId(String pretendedUserId) {
			this.pretendedUserId = pretendedUserId;
		}
	}

	@Override
	public GetMnsConsoleConfigResponse getInstance(UnmarshallerContext context) {
		return	GetMnsConsoleConfigResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
