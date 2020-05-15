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

package com.aliyuncs.agency.model.v20200324;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.agency.transform.v20200324.GetCustomerRebateTypeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetCustomerRebateTypeResponse extends AcsResponse {

	private String code;

	private Boolean success;

	private String requestId;

	private FxUserInfoExt fxUserInfoExt;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public FxUserInfoExt getFxUserInfoExt() {
		return this.fxUserInfoExt;
	}

	public void setFxUserInfoExt(FxUserInfoExt fxUserInfoExt) {
		this.fxUserInfoExt = fxUserInfoExt;
	}

	public static class FxUserInfoExt {

		private Long kpId;

		private Integer isSub;

		private Long parentUid;

		private Integer level;

		private Integer customerRebateType;

		private Integer distributionRebateType;

		private Integer subUserCount;

		public Long getKpId() {
			return this.kpId;
		}

		public void setKpId(Long kpId) {
			this.kpId = kpId;
		}

		public Integer getIsSub() {
			return this.isSub;
		}

		public void setIsSub(Integer isSub) {
			this.isSub = isSub;
		}

		public Long getParentUid() {
			return this.parentUid;
		}

		public void setParentUid(Long parentUid) {
			this.parentUid = parentUid;
		}

		public Integer getLevel() {
			return this.level;
		}

		public void setLevel(Integer level) {
			this.level = level;
		}

		public Integer getCustomerRebateType() {
			return this.customerRebateType;
		}

		public void setCustomerRebateType(Integer customerRebateType) {
			this.customerRebateType = customerRebateType;
		}

		public Integer getDistributionRebateType() {
			return this.distributionRebateType;
		}

		public void setDistributionRebateType(Integer distributionRebateType) {
			this.distributionRebateType = distributionRebateType;
		}

		public Integer getSubUserCount() {
			return this.subUserCount;
		}

		public void setSubUserCount(Integer subUserCount) {
			this.subUserCount = subUserCount;
		}
	}

	@Override
	public GetCustomerRebateTypeResponse getInstance(UnmarshallerContext context) {
		return	GetCustomerRebateTypeResponseUnmarshaller.unmarshall(this, context);
	}
}
