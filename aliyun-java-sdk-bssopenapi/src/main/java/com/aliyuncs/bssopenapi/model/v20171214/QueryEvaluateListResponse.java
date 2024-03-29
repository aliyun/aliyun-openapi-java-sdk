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
import com.aliyuncs.AcsResponse;
import com.aliyuncs.bssopenapi.transform.v20171214.QueryEvaluateListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryEvaluateListResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private Boolean success;

	private Data data;

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer pageNum;

		private Long totalUnAppliedInvoiceAmount;

		private Integer pageSize;

		private Integer totalCount;

		private Long totalInvoiceAmount;

		private String hostId;

		private List<Evaluate> evaluateList;

		public Integer getPageNum() {
			return this.pageNum;
		}

		public void setPageNum(Integer pageNum) {
			this.pageNum = pageNum;
		}

		public Long getTotalUnAppliedInvoiceAmount() {
			return this.totalUnAppliedInvoiceAmount;
		}

		public void setTotalUnAppliedInvoiceAmount(Long totalUnAppliedInvoiceAmount) {
			this.totalUnAppliedInvoiceAmount = totalUnAppliedInvoiceAmount;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public Long getTotalInvoiceAmount() {
			return this.totalInvoiceAmount;
		}

		public void setTotalInvoiceAmount(Long totalInvoiceAmount) {
			this.totalInvoiceAmount = totalInvoiceAmount;
		}

		public String getHostId() {
			return this.hostId;
		}

		public void setHostId(String hostId) {
			this.hostId = hostId;
		}

		public List<Evaluate> getEvaluateList() {
			return this.evaluateList;
		}

		public void setEvaluateList(List<Evaluate> evaluateList) {
			this.evaluateList = evaluateList;
		}

		public static class Evaluate {

			private Integer type;

			private Integer status;

			private Long billId;

			private Long userId;

			private String billCycle;

			private Long canInvoiceAmount;

			private Long offsetAcceptAmount;

			private Long itemId;

			private String outBizId;

			private String userNick;

			private String gmtModified;

			private String opId;

			private String bizType;

			private Long originalAmount;

			private Long invoicedAmount;

			private String gmtCreate;

			private Long presentAmount;

			private String bizTime;

			private String name;

			private Long offsetCostAmount;

			private Long id;

			public Integer getType() {
				return this.type;
			}

			public void setType(Integer type) {
				this.type = type;
			}

			public Integer getStatus() {
				return this.status;
			}

			public void setStatus(Integer status) {
				this.status = status;
			}

			public Long getBillId() {
				return this.billId;
			}

			public void setBillId(Long billId) {
				this.billId = billId;
			}

			public Long getUserId() {
				return this.userId;
			}

			public void setUserId(Long userId) {
				this.userId = userId;
			}

			public String getBillCycle() {
				return this.billCycle;
			}

			public void setBillCycle(String billCycle) {
				this.billCycle = billCycle;
			}

			public Long getCanInvoiceAmount() {
				return this.canInvoiceAmount;
			}

			public void setCanInvoiceAmount(Long canInvoiceAmount) {
				this.canInvoiceAmount = canInvoiceAmount;
			}

			public Long getOffsetAcceptAmount() {
				return this.offsetAcceptAmount;
			}

			public void setOffsetAcceptAmount(Long offsetAcceptAmount) {
				this.offsetAcceptAmount = offsetAcceptAmount;
			}

			public Long getItemId() {
				return this.itemId;
			}

			public void setItemId(Long itemId) {
				this.itemId = itemId;
			}

			public String getOutBizId() {
				return this.outBizId;
			}

			public void setOutBizId(String outBizId) {
				this.outBizId = outBizId;
			}

			public String getUserNick() {
				return this.userNick;
			}

			public void setUserNick(String userNick) {
				this.userNick = userNick;
			}

			public String getGmtModified() {
				return this.gmtModified;
			}

			public void setGmtModified(String gmtModified) {
				this.gmtModified = gmtModified;
			}

			public String getOpId() {
				return this.opId;
			}

			public void setOpId(String opId) {
				this.opId = opId;
			}

			public String getBizType() {
				return this.bizType;
			}

			public void setBizType(String bizType) {
				this.bizType = bizType;
			}

			public Long getOriginalAmount() {
				return this.originalAmount;
			}

			public void setOriginalAmount(Long originalAmount) {
				this.originalAmount = originalAmount;
			}

			public Long getInvoicedAmount() {
				return this.invoicedAmount;
			}

			public void setInvoicedAmount(Long invoicedAmount) {
				this.invoicedAmount = invoicedAmount;
			}

			public String getGmtCreate() {
				return this.gmtCreate;
			}

			public void setGmtCreate(String gmtCreate) {
				this.gmtCreate = gmtCreate;
			}

			public Long getPresentAmount() {
				return this.presentAmount;
			}

			public void setPresentAmount(Long presentAmount) {
				this.presentAmount = presentAmount;
			}

			public String getBizTime() {
				return this.bizTime;
			}

			public void setBizTime(String bizTime) {
				this.bizTime = bizTime;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public Long getOffsetCostAmount() {
				return this.offsetCostAmount;
			}

			public void setOffsetCostAmount(Long offsetCostAmount) {
				this.offsetCostAmount = offsetCostAmount;
			}

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}
		}
	}

	@Override
	public QueryEvaluateListResponse getInstance(UnmarshallerContext context) {
		return	QueryEvaluateListResponseUnmarshaller.unmarshall(this, context);
	}
}
