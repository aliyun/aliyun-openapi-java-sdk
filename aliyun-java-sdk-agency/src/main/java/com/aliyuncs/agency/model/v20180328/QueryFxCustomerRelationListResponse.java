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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.agency.transform.v20180328.QueryFxCustomerRelationListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryFxCustomerRelationListResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer totalNum;

	private Integer count;

	private List<FxCustomerRelationVO> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
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

	public Integer getTotalNum() {
		return this.totalNum;
	}

	public void setTotalNum(Integer totalNum) {
		this.totalNum = totalNum;
	}

	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public List<FxCustomerRelationVO> getData() {
		return this.data;
	}

	public void setData(List<FxCustomerRelationVO> data) {
		this.data = data;
	}

	public static class FxCustomerRelationVO {

		private Long parentId;

		private Long parentId1;

		private Integer customerRebateType;

		private Long parentId3;

		private Integer isDistribution;

		private Integer isRebateAgent;

		private Long parentId2;

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

		public Long getParentId3() {
			return this.parentId3;
		}

		public void setParentId3(Long parentId3) {
			this.parentId3 = parentId3;
		}

		public Integer getIsDistribution() {
			return this.isDistribution;
		}

		public void setIsDistribution(Integer isDistribution) {
			this.isDistribution = isDistribution;
		}

		public Integer getIsRebateAgent() {
			return this.isRebateAgent;
		}

		public void setIsRebateAgent(Integer isRebateAgent) {
			this.isRebateAgent = isRebateAgent;
		}

		public Long getParentId2() {
			return this.parentId2;
		}

		public void setParentId2(Long parentId2) {
			this.parentId2 = parentId2;
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
	public QueryFxCustomerRelationListResponse getInstance(UnmarshallerContext context) {
		return	QueryFxCustomerRelationListResponseUnmarshaller.unmarshall(this, context);
	}
}
