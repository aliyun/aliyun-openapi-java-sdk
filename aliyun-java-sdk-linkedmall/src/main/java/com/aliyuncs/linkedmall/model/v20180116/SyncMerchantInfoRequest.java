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
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class SyncMerchantInfoRequest extends RpcAcsRequest<SyncMerchantInfoResponse> {
	   

	private String sellerNick;

	private String bizId;

	private String itemList;

	private String taskId;

	private Long timeStamp;
	public SyncMerchantInfoRequest() {
		super("linkedmall", "2018-01-16", "SyncMerchantInfo");
		setMethod(MethodType.POST);
	}

	public String getSellerNick() {
		return this.sellerNick;
	}

	public void setSellerNick(String sellerNick) {
		this.sellerNick = sellerNick;
		if(sellerNick != null){
			putQueryParameter("SellerNick", sellerNick);
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

	public String getItemList() {
		return this.itemList;
	}

	public void setItemList(String itemList) {
		this.itemList = itemList;
		if(itemList != null){
			putBodyParameter("ItemList", itemList);
		}
	}

	public String getTaskId() {
		return this.taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
		if(taskId != null){
			putQueryParameter("TaskId", taskId);
		}
	}

	public Long getTimeStamp() {
		return this.timeStamp;
	}

	public void setTimeStamp(Long timeStamp) {
		this.timeStamp = timeStamp;
		if(timeStamp != null){
			putQueryParameter("TimeStamp", timeStamp.toString());
		}
	}

	@Override
	public Class<SyncMerchantInfoResponse> getResponseClass() {
		return SyncMerchantInfoResponse.class;
	}

}
