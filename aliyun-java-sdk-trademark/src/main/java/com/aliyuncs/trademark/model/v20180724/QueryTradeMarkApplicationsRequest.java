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

package com.aliyuncs.trademark.model.v20180724;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.trademark.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class QueryTradeMarkApplicationsRequest extends RpcAcsRequest<QueryTradeMarkApplicationsResponse> {
	   

	private String materialName;

	private String classificationCode;

	private Integer hidden;

	private String intentionBizId;

	private Integer pageNum;

	private String type;

	private Integer productType;

	private Integer supplementStatus;

	private Integer pageSize;

	private String logisticsNo;

	private String sortOrder;

	private String tmName;

	private String orderId;

	private String tmNumber;

	private String sortFiled;

	private String bizId;

	private Integer status;
	public QueryTradeMarkApplicationsRequest() {
		super("Trademark", "2018-07-24", "QueryTradeMarkApplications");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getMaterialName() {
		return this.materialName;
	}

	public void setMaterialName(String materialName) {
		this.materialName = materialName;
		if(materialName != null){
			putQueryParameter("MaterialName", materialName);
		}
	}

	public String getClassificationCode() {
		return this.classificationCode;
	}

	public void setClassificationCode(String classificationCode) {
		this.classificationCode = classificationCode;
		if(classificationCode != null){
			putQueryParameter("ClassificationCode", classificationCode);
		}
	}

	public Integer getHidden() {
		return this.hidden;
	}

	public void setHidden(Integer hidden) {
		this.hidden = hidden;
		if(hidden != null){
			putQueryParameter("Hidden", hidden.toString());
		}
	}

	public String getIntentionBizId() {
		return this.intentionBizId;
	}

	public void setIntentionBizId(String intentionBizId) {
		this.intentionBizId = intentionBizId;
		if(intentionBizId != null){
			putQueryParameter("IntentionBizId", intentionBizId);
		}
	}

	public Integer getPageNum() {
		return this.pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
		if(pageNum != null){
			putQueryParameter("PageNum", pageNum.toString());
		}
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putQueryParameter("Type", type);
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

	public String getLogisticsNo() {
		return this.logisticsNo;
	}

	public void setLogisticsNo(String logisticsNo) {
		this.logisticsNo = logisticsNo;
		if(logisticsNo != null){
			putQueryParameter("LogisticsNo", logisticsNo);
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

	public String getTmName() {
		return this.tmName;
	}

	public void setTmName(String tmName) {
		this.tmName = tmName;
		if(tmName != null){
			putQueryParameter("TmName", tmName);
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

	public String getTmNumber() {
		return this.tmNumber;
	}

	public void setTmNumber(String tmNumber) {
		this.tmNumber = tmNumber;
		if(tmNumber != null){
			putQueryParameter("TmNumber", tmNumber);
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

	public String getBizId() {
		return this.bizId;
	}

	public void setBizId(String bizId) {
		this.bizId = bizId;
		if(bizId != null){
			putQueryParameter("BizId", bizId);
		}
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
		if(status != null){
			putQueryParameter("Status", status.toString());
		}
	}

	@Override
	public Class<QueryTradeMarkApplicationsResponse> getResponseClass() {
		return QueryTradeMarkApplicationsResponse.class;
	}

}
