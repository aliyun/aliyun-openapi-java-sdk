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

package com.aliyuncs.bssopenapi.model.v20171214;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.bssopenapi.transform.v20171214.QueryRedeemResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryRedeemResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Data data;

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long pageNum;

		private Long pageSize;

		private Long totalCount;

		private List<RedeemItem> redeem;

		public Long getPageNum() {
			return this.pageNum;
		}

		public void setPageNum(Long pageNum) {
			this.pageNum = pageNum;
		}

		public Long getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Long pageSize) {
			this.pageSize = pageSize;
		}

		public Long getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Long totalCount) {
			this.totalCount = totalCount;
		}

		public List<RedeemItem> getRedeem() {
			return this.redeem;
		}

		public void setRedeem(List<RedeemItem> redeem) {
			this.redeem = redeem;
		}

		public static class RedeemItem {

			private String redeemId;

			private String redeemNo;

			private String status;

			private String grantedTime;

			private String effectiveTime;

			private String expiryTime;

			private String nominalValue;

			private String balance;

			private String applicableProducts;

			private String specification;

			public String getRedeemId() {
				return this.redeemId;
			}

			public void setRedeemId(String redeemId) {
				this.redeemId = redeemId;
			}

			public String getRedeemNo() {
				return this.redeemNo;
			}

			public void setRedeemNo(String redeemNo) {
				this.redeemNo = redeemNo;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getGrantedTime() {
				return this.grantedTime;
			}

			public void setGrantedTime(String grantedTime) {
				this.grantedTime = grantedTime;
			}

			public String getEffectiveTime() {
				return this.effectiveTime;
			}

			public void setEffectiveTime(String effectiveTime) {
				this.effectiveTime = effectiveTime;
			}

			public String getExpiryTime() {
				return this.expiryTime;
			}

			public void setExpiryTime(String expiryTime) {
				this.expiryTime = expiryTime;
			}

			public String getNominalValue() {
				return this.nominalValue;
			}

			public void setNominalValue(String nominalValue) {
				this.nominalValue = nominalValue;
			}

			public String getBalance() {
				return this.balance;
			}

			public void setBalance(String balance) {
				this.balance = balance;
			}

			public String getApplicableProducts() {
				return this.applicableProducts;
			}

			public void setApplicableProducts(String applicableProducts) {
				this.applicableProducts = applicableProducts;
			}

			public String getSpecification() {
				return this.specification;
			}

			public void setSpecification(String specification) {
				this.specification = specification;
			}
		}
	}

	@Override
	public QueryRedeemResponse getInstance(UnmarshallerContext context) {
		return	QueryRedeemResponseUnmarshaller.unmarshall(this, context);
	}
}
