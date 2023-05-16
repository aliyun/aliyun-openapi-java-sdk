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

package com.aliyuncs.agency.model.v20180328;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.agency.transform.v20180328.GetDistributionInfoByUidResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetDistributionInfoByUidResponse extends AcsResponse {

	private String code;

	private String message;

	private Boolean success;

	private FxDistributionInfoVO fxDistributionInfoVO;

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

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public FxDistributionInfoVO getFxDistributionInfoVO() {
		return this.fxDistributionInfoVO;
	}

	public void setFxDistributionInfoVO(FxDistributionInfoVO fxDistributionInfoVO) {
		this.fxDistributionInfoVO = fxDistributionInfoVO;
	}

	public static class FxDistributionInfoVO {

		private Integer distributionRebateType;

		private Integer level;

		private Long uid;

		private Integer bizType;

		public Integer getDistributionRebateType() {
			return this.distributionRebateType;
		}

		public void setDistributionRebateType(Integer distributionRebateType) {
			this.distributionRebateType = distributionRebateType;
		}

		public Integer getLevel() {
			return this.level;
		}

		public void setLevel(Integer level) {
			this.level = level;
		}

		public Long getUid() {
			return this.uid;
		}

		public void setUid(Long uid) {
			this.uid = uid;
		}

		public Integer getBizType() {
			return this.bizType;
		}

		public void setBizType(Integer bizType) {
			this.bizType = bizType;
		}
	}

	@Override
	public GetDistributionInfoByUidResponse getInstance(UnmarshallerContext context) {
		return	GetDistributionInfoByUidResponseUnmarshaller.unmarshall(this, context);
	}
}
