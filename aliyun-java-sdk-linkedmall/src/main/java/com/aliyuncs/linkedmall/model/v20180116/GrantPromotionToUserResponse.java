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

package com.aliyuncs.linkedmall.model.v20180116;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.linkedmall.transform.v20180116.GrantPromotionToUserResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GrantPromotionToUserResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private Model model;

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

	public Model getModel() {
		return this.model;
	}

	public void setModel(Model model) {
		this.model = model;
	}

	public static class Model {

		private String promotionInstanceId;

		private Long effectiveStartTime;

		private Long effectiveEndTime;

		private String subBizCode;

		private Boolean success;

		public String getPromotionInstanceId() {
			return this.promotionInstanceId;
		}

		public void setPromotionInstanceId(String promotionInstanceId) {
			this.promotionInstanceId = promotionInstanceId;
		}

		public Long getEffectiveStartTime() {
			return this.effectiveStartTime;
		}

		public void setEffectiveStartTime(Long effectiveStartTime) {
			this.effectiveStartTime = effectiveStartTime;
		}

		public Long getEffectiveEndTime() {
			return this.effectiveEndTime;
		}

		public void setEffectiveEndTime(Long effectiveEndTime) {
			this.effectiveEndTime = effectiveEndTime;
		}

		public String getSubBizCode() {
			return this.subBizCode;
		}

		public void setSubBizCode(String subBizCode) {
			this.subBizCode = subBizCode;
		}

		public Boolean getSuccess() {
			return this.success;
		}

		public void setSuccess(Boolean success) {
			this.success = success;
		}
	}

	@Override
	public GrantPromotionToUserResponse getInstance(UnmarshallerContext context) {
		return	GrantPromotionToUserResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
