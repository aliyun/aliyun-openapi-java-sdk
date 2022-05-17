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

package com.aliyuncs.retailbot.model.v20210224;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.retailbot.transform.v20210224.QueryOutboundJobDetailRecordResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryOutboundJobDetailRecordResponse extends AcsResponse {

	private String code;

	private String message;

	private Integer currentPage;

	private Integer totalItems;

	private Map<Object,Object> extData;

	private List<DataItem> data;

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

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public Integer getTotalItems() {
		return this.totalItems;
	}

	public void setTotalItems(Integer totalItems) {
		this.totalItems = totalItems;
	}

	public Map<Object,Object> getExtData() {
		return this.extData;
	}

	public void setExtData(Map<Object,Object> extData) {
		this.extData = extData;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private Long id;

		private String gmtCreate;

		private String gmtModified;

		private Long tenantId;

		private String bizId;

		private String bizType;

		private String batchNo;

		private String mobileNo;

		private Long buyerId;

		private Integer status;

		private Integer duration;

		private String callTime;

		private Integer dataType;

		private Long bizOrderId;

		private Long subBizOrder;

		private String storeName;

		private String productName;

		private Long jobId;

		private String yunTaskId;

		private Integer reserve1;

		private Long reserve2;

		private String referenceId;

		private String reserve4;

		private Integer playComplete;

		private String extraParams;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public Long getTenantId() {
			return this.tenantId;
		}

		public void setTenantId(Long tenantId) {
			this.tenantId = tenantId;
		}

		public String getBizId() {
			return this.bizId;
		}

		public void setBizId(String bizId) {
			this.bizId = bizId;
		}

		public String getBizType() {
			return this.bizType;
		}

		public void setBizType(String bizType) {
			this.bizType = bizType;
		}

		public String getBatchNo() {
			return this.batchNo;
		}

		public void setBatchNo(String batchNo) {
			this.batchNo = batchNo;
		}

		public String getMobileNo() {
			return this.mobileNo;
		}

		public void setMobileNo(String mobileNo) {
			this.mobileNo = mobileNo;
		}

		public Long getBuyerId() {
			return this.buyerId;
		}

		public void setBuyerId(Long buyerId) {
			this.buyerId = buyerId;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public Integer getDuration() {
			return this.duration;
		}

		public void setDuration(Integer duration) {
			this.duration = duration;
		}

		public String getCallTime() {
			return this.callTime;
		}

		public void setCallTime(String callTime) {
			this.callTime = callTime;
		}

		public Integer getDataType() {
			return this.dataType;
		}

		public void setDataType(Integer dataType) {
			this.dataType = dataType;
		}

		public Long getBizOrderId() {
			return this.bizOrderId;
		}

		public void setBizOrderId(Long bizOrderId) {
			this.bizOrderId = bizOrderId;
		}

		public Long getSubBizOrder() {
			return this.subBizOrder;
		}

		public void setSubBizOrder(Long subBizOrder) {
			this.subBizOrder = subBizOrder;
		}

		public String getStoreName() {
			return this.storeName;
		}

		public void setStoreName(String storeName) {
			this.storeName = storeName;
		}

		public String getProductName() {
			return this.productName;
		}

		public void setProductName(String productName) {
			this.productName = productName;
		}

		public Long getJobId() {
			return this.jobId;
		}

		public void setJobId(Long jobId) {
			this.jobId = jobId;
		}

		public String getYunTaskId() {
			return this.yunTaskId;
		}

		public void setYunTaskId(String yunTaskId) {
			this.yunTaskId = yunTaskId;
		}

		public Integer getReserve1() {
			return this.reserve1;
		}

		public void setReserve1(Integer reserve1) {
			this.reserve1 = reserve1;
		}

		public Long getReserve2() {
			return this.reserve2;
		}

		public void setReserve2(Long reserve2) {
			this.reserve2 = reserve2;
		}

		public String getReferenceId() {
			return this.referenceId;
		}

		public void setReferenceId(String referenceId) {
			this.referenceId = referenceId;
		}

		public String getReserve4() {
			return this.reserve4;
		}

		public void setReserve4(String reserve4) {
			this.reserve4 = reserve4;
		}

		public Integer getPlayComplete() {
			return this.playComplete;
		}

		public void setPlayComplete(Integer playComplete) {
			this.playComplete = playComplete;
		}

		public String getExtraParams() {
			return this.extraParams;
		}

		public void setExtraParams(String extraParams) {
			this.extraParams = extraParams;
		}
	}

	@Override
	public QueryOutboundJobDetailRecordResponse getInstance(UnmarshallerContext context) {
		return	QueryOutboundJobDetailRecordResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
