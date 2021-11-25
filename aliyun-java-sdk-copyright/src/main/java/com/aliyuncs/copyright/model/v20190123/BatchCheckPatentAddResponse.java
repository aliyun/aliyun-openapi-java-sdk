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

package com.aliyuncs.copyright.model.v20190123;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.copyright.transform.v20190123.BatchCheckPatentAddResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class BatchCheckPatentAddResponse extends AcsResponse {

	private String cacheKey;

	private Integer canAddCount;

	private Integer existCount;

	private String requestId;

	private Boolean success;

	private Integer totalCount;

	private List<ErrorDetailItem> errorDetail;

	private List<TradeListItem> tradeList;

	public String getCacheKey() {
		return this.cacheKey;
	}

	public void setCacheKey(String cacheKey) {
		this.cacheKey = cacheKey;
	}

	public Integer getCanAddCount() {
		return this.canAddCount;
	}

	public void setCanAddCount(Integer canAddCount) {
		this.canAddCount = canAddCount;
	}

	public Integer getExistCount() {
		return this.existCount;
	}

	public void setExistCount(Integer existCount) {
		this.existCount = existCount;
	}

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

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<ErrorDetailItem> getErrorDetail() {
		return this.errorDetail;
	}

	public void setErrorDetail(List<ErrorDetailItem> errorDetail) {
		this.errorDetail = errorDetail;
	}

	public List<TradeListItem> getTradeList() {
		return this.tradeList;
	}

	public void setTradeList(List<TradeListItem> tradeList) {
		this.tradeList = tradeList;
	}

	public static class ErrorDetailItem {

		private String applyNumber;

		private String message;

		private Boolean success;

		public String getApplyNumber() {
			return this.applyNumber;
		}

		public void setApplyNumber(String applyNumber) {
			this.applyNumber = applyNumber;
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
	}

	public static class TradeListItem {

		private String age;

		private String discount;

		private Long existCount;

		private Integer needCount;

		private Float needFee;

		private Long totalCount;

		private String type;

		private String overduePenalty;

		public String getAge() {
			return this.age;
		}

		public void setAge(String age) {
			this.age = age;
		}

		public String getDiscount() {
			return this.discount;
		}

		public void setDiscount(String discount) {
			this.discount = discount;
		}

		public Long getExistCount() {
			return this.existCount;
		}

		public void setExistCount(Long existCount) {
			this.existCount = existCount;
		}

		public Integer getNeedCount() {
			return this.needCount;
		}

		public void setNeedCount(Integer needCount) {
			this.needCount = needCount;
		}

		public Float getNeedFee() {
			return this.needFee;
		}

		public void setNeedFee(Float needFee) {
			this.needFee = needFee;
		}

		public Long getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Long totalCount) {
			this.totalCount = totalCount;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getOverduePenalty() {
			return this.overduePenalty;
		}

		public void setOverduePenalty(String overduePenalty) {
			this.overduePenalty = overduePenalty;
		}
	}

	@Override
	public BatchCheckPatentAddResponse getInstance(UnmarshallerContext context) {
		return	BatchCheckPatentAddResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
