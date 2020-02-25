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
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DeleteBizItemsRequest extends RpcAcsRequest<DeleteBizItemsResponse> {
	   

	private String bizId;

	private List<Long> itemIdLists;

	private String subBizId;
	public DeleteBizItemsRequest() {
		super("linkedmall", "2018-01-16", "DeleteBizItems");
		setMethod(MethodType.POST);
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

	public List<Long> getItemIdLists() {
		return this.itemIdLists;
	}

	public void setItemIdLists(List<Long> itemIdLists) {
		this.itemIdLists = itemIdLists;	
		if (itemIdLists != null) {
			for (int i = 0; i < itemIdLists.size(); i++) {
				putQueryParameter("ItemIdList." + (i + 1) , itemIdLists.get(i));
			}
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
	public Class<DeleteBizItemsResponse> getResponseClass() {
		return DeleteBizItemsResponse.class;
	}

}
