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
import com.aliyuncs.agency.transform.v20180328.GetFxCustomerRelationByUidResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetFxCustomerRelationByUidResponse extends AcsResponse {

	private String code;

	private String message;

	private Boolean success;

	private FxCustomerRelationVO fxCustomerRelationVO;

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

	public FxCustomerRelationVO getFxCustomerRelationVO() {
		return this.fxCustomerRelationVO;
	}

	public void setFxCustomerRelationVO(FxCustomerRelationVO fxCustomerRelationVO) {
		this.fxCustomerRelationVO = fxCustomerRelationVO;
	}

	public static class FxCustomerRelationVO {

		private Long parentId;

		private Long parentId1;

		private Integer customerRebateType;

		private Integer isDistribution;

		private Long id;

		private Integer level;

		private Long uid;

		public Long getParentId() {
			return this.parentId;
		}

		public void setParentId(Long parentId) {
			this.parentId = parentId;
		}

		public Long getParentId1() {
			return this.parentId1;
		}

		public void setParentId1(Long parentId1) {
			this.parentId1 = parentId1;
		}

		public Integer getCustomerRebateType() {
			return this.customerRebateType;
		}

		public void setCustomerRebateType(Integer customerRebateType) {
			this.customerRebateType = customerRebateType;
		}

		public Integer getIsDistribution() {
			return this.isDistribution;
		}

		public void setIsDistribution(Integer isDistribution) {
			this.isDistribution = isDistribution;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
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
	}

	@Override
	public GetFxCustomerRelationByUidResponse getInstance(UnmarshallerContext context) {
		return	GetFxCustomerRelationByUidResponseUnmarshaller.unmarshall(this, context);
	}
}
