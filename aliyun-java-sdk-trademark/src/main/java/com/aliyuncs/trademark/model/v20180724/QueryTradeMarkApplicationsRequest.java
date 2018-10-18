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

/**
 * @author auto create
 * @version 
 */
public class QueryTradeMarkApplicationsRequest extends RpcAcsRequest<QueryTradeMarkApplicationsResponse> {
	
	public QueryTradeMarkApplicationsRequest() {
		super("Trademark", "2018-07-24", "QueryTradeMarkApplications", "Trademark");
	}

	private String tmName;

	private String materialName;

	private String orderId;

	private String bizId;

	private Integer pageSize;

	private String tmNumber;

	private Long createTimeLeft;

	private String keyword;

	private Integer pageNum;

	private Long createTimeRight;

	private String userId;

	private Integer status;

	public String getTmName() {
		return this.tmName;
	}

	public void setTmName(String tmName) {
		this.tmName = tmName;
		if(tmName != null){
			putQueryParameter("TmName", tmName);
		}
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

	public String getOrderId() {
		return this.orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
		if(orderId != null){
			putQueryParameter("OrderId", orderId);
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

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
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

	public Long getCreateTimeLeft() {
		return this.createTimeLeft;
	}

	public void setCreateTimeLeft(Long createTimeLeft) {
		this.createTimeLeft = createTimeLeft;
		if(createTimeLeft != null){
			putQueryParameter("CreateTimeLeft", createTimeLeft.toString());
		}
	}

	public String getKeyword() {
		return this.keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
		if(keyword != null){
			putQueryParameter("Keyword", keyword);
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

	public Long getCreateTimeRight() {
		return this.createTimeRight;
	}

	public void setCreateTimeRight(Long createTimeRight) {
		this.createTimeRight = createTimeRight;
		if(createTimeRight != null){
			putQueryParameter("CreateTimeRight", createTimeRight.toString());
		}
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
		if(userId != null){
			putQueryParameter("UserId", userId);
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
