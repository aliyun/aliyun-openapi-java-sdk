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

package com.aliyuncs.arms.model.v20190808;

import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.arms.transform.v20190808.GetCommercialStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetCommercialStatusResponse extends AcsResponse {

	private String requestId;

	private UserAndCommodityStatus userAndCommodityStatus;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public UserAndCommodityStatus getUserAndCommodityStatus() {
		return this.userAndCommodityStatus;
	}

	public void setUserAndCommodityStatus(UserAndCommodityStatus userAndCommodityStatus) {
		this.userAndCommodityStatus = userAndCommodityStatus;
	}

	public static class UserAndCommodityStatus {

		private String status;

		private Long freeDays;

		private Boolean basic;

		private String chargeType;

		private String lable;

		private Map<Object,Object> extraInfo;

		private Boolean enable;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Long getFreeDays() {
			return this.freeDays;
		}

		public void setFreeDays(Long freeDays) {
			this.freeDays = freeDays;
		}

		public Boolean getBasic() {
			return this.basic;
		}

		public void setBasic(Boolean basic) {
			this.basic = basic;
		}

		public String getChargeType() {
			return this.chargeType;
		}

		public void setChargeType(String chargeType) {
			this.chargeType = chargeType;
		}

		public String getLable() {
			return this.lable;
		}

		public void setLable(String lable) {
			this.lable = lable;
		}

		public Map<Object,Object> getExtraInfo() {
			return this.extraInfo;
		}

		public void setExtraInfo(Map<Object,Object> extraInfo) {
			this.extraInfo = extraInfo;
		}

		public Boolean getEnable() {
			return this.enable;
		}

		public void setEnable(Boolean enable) {
			this.enable = enable;
		}
	}

	@Override
	public GetCommercialStatusResponse getInstance(UnmarshallerContext context) {
		return	GetCommercialStatusResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
