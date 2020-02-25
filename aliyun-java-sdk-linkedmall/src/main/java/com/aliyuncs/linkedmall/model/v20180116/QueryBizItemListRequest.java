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

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class QueryBizItemListRequest extends RpcAcsRequest<QueryBizItemListResponse> {
	   

	private List<Object> lmItemIds;

	private List<Object> itemIds;

	private String userId;

	private Integer pageNumber;

	private String bizId;

	private Integer pageSize;

	private Long categoryId;

	private String subBizId;
	public QueryBizItemListRequest() {
		super("linkedmall", "2018-01-16", "QueryBizItemList");
		setMethod(MethodType.POST);
	}

	public List<Object> getLmItemIds() {
		return this.lmItemIds;
	}

	public void setLmItemIds(List<Object> lmItemIds) {
		this.lmItemIds = lmItemIds;
		if(lmItemIds != null){
			putQueryParameter("LmItemIds", new Gson().toJson(lmItemIds));
		}
	}

	public List<Object> getItemIds() {
		return this.itemIds;
	}

	public void setItemIds(List<Object> itemIds) {
		this.itemIds = itemIds;
		if(itemIds != null){
			putQueryParameter("ItemIds", new Gson().toJson(itemIds));
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

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
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

	public Long getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
		if(categoryId != null){
			putQueryParameter("CategoryId", categoryId.toString());
		}
	}

	public String getSubBizId() {
		return this.subBizId;
	}

	public void setSubBizId(String subBizId) {
		this.subBizId = subBizId;
		if(subBizId != null){
			putQueryParameter("SubBizId", subBizId);
		}
	}

	@Override
	public Class<QueryBizItemListResponse> getResponseClass() {
		return QueryBizItemListResponse.class;
	}

}
