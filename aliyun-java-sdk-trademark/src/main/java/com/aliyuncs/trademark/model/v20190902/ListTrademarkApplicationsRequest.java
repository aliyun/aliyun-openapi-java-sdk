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

package com.aliyuncs.trademark.model.v20190902;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.trademark.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListTrademarkApplicationsRequest extends RpcAcsRequest<ListTrademarkApplicationsResponse> {
	   

	private Integer flag;

	private Boolean queryVoucherOrderDoneFlag;

	private Long createTimeLeft;

	private Integer pageNumber;

	private Integer applicationStatus;

	private Integer productType;

	private Integer supplementStatus;

	private Integer pageSize;

	private String applicantName;

	private String sortOrder;

	private Long createTimeRight;

	private String orderId;

	private String sortFiled;

	private String trademarkName;

	private Boolean queryVoucherOrderFlag;

	private String bizId;

	private String trademarkNumber;

	private String applicationType;
	public ListTrademarkApplicationsRequest() {
		super("Trademark", "2019-09-02", "ListTrademarkApplications");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getFlag() {
		return this.flag;
	}

	public void setFlag(Integer flag) {
		this.flag = flag;
		if(flag != null){
			putQueryParameter("Flag", flag.toString());
		}
	}

	public Boolean getQueryVoucherOrderDoneFlag() {
		return this.queryVoucherOrderDoneFlag;
	}

	public void setQueryVoucherOrderDoneFlag(Boolean queryVoucherOrderDoneFlag) {
		this.queryVoucherOrderDoneFlag = queryVoucherOrderDoneFlag;
		if(queryVoucherOrderDoneFlag != null){
			putQueryParameter("QueryVoucherOrderDoneFlag", queryVoucherOrderDoneFlag.toString());
		}
	}

	public Long getCreateTimeLeft() {
		return this.createTimeLeft;
	}

	public void setCreateTimeLeft(Long createTimeLeft) {
		this.createTimeLeft = createTimeLeft;
		if(createTimeLeft != null){
			putQueryParameter("CreateTimeLeft", createTimeLeft.toString());
		}
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
		}
	}

	public Integer getApplicationStatus() {
		return this.applicationStatus;
	}

	public void setApplicationStatus(Integer applicationStatus) {
		this.applicationStatus = applicationStatus;
		if(applicationStatus != null){
			putQueryParameter("ApplicationStatus", applicationStatus.toString());
		}
	}

	public Integer getProductType() {
		return this.productType;
	}

	public void setProductType(Integer productType) {
		this.productType = productType;
		if(productType != null){
			putQueryParameter("ProductType", productType.toString());
		}
	}

	public Integer getSupplementStatus() {
		return this.supplementStatus;
	}

	public void setSupplementStatus(Integer supplementStatus) {
		this.supplementStatus = supplementStatus;
		if(supplementStatus != null){
			putQueryParameter("SupplementStatus", supplementStatus.toString());
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public String getApplicantName() {
		return this.applicantName;
	}

	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
		if(applicantName != null){
			putQueryParameter("ApplicantName", applicantName);
		}
	}

	public String getSortOrder() {
		return this.sortOrder;
	}

	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
		if(sortOrder != null){
			putQueryParameter("SortOrder", sortOrder);
		}
	}

	public Long getCreateTimeRight() {
		return this.createTimeRight;
	}

	public void setCreateTimeRight(Long createTimeRight) {
		this.createTimeRight = createTimeRight;
		if(createTimeRight != null){
			putQueryParameter("CreateTimeRight", createTimeRight.toString());
		}
	}

	public String getOrderId() {
		return this.orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
		if(orderId != null){
			putQueryParameter("OrderId", orderId);
		}
	}

	public String getSortFiled() {
		return this.sortFiled;
	}

	public void setSortFiled(String sortFiled) {
		this.sortFiled = sortFiled;
		if(sortFiled != null){
			putQueryParameter("SortFiled", sortFiled);
		}
	}

	public String getTrademarkName() {
		return this.trademarkName;
	}

	public void setTrademarkName(String trademarkName) {
		this.trademarkName = trademarkName;
		if(trademarkName != null){
			putQueryParameter("TrademarkName", trademarkName);
		}
	}

	public Boolean getQueryVoucherOrderFlag() {
		return this.queryVoucherOrderFlag;
	}

	public void setQueryVoucherOrderFlag(Boolean queryVoucherOrderFlag) {
		this.queryVoucherOrderFlag = queryVoucherOrderFlag;
		if(queryVoucherOrderFlag != null){
			putQueryParameter("QueryVoucherOrderFlag", queryVoucherOrderFlag.toString());
		}
	}

	public String getBizId() {
		return this.bizId;
	}

	public void setBizId(String bizId) {
		this.bizId = bizId;
		if(bizId != null){
			putQueryParameter("BizId", bizId);
		}
	}

	public String getTrademarkNumber() {
		return this.trademarkNumber;
	}

	public void setTrademarkNumber(String trademarkNumber) {
		this.trademarkNumber = trademarkNumber;
		if(trademarkNumber != null){
			putQueryParameter("TrademarkNumber", trademarkNumber);
		}
	}

	public String getApplicationType() {
		return this.applicationType;
	}

	public void setApplicationType(String applicationType) {
		this.applicationType = applicationType;
		if(applicationType != null){
			putQueryParameter("ApplicationType", applicationType);
		}
	}

	@Override
	public Class<ListTrademarkApplicationsResponse> getResponseClass() {
		return ListTrademarkApplicationsResponse.class;
	}

}
