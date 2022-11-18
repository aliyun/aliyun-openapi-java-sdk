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

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class SaveTransferItemRequest extends RpcAcsRequest<SaveTransferItemResponse> {
	   

	private Integer itemId;

	private String targetMobile;
	public SaveTransferItemRequest() {
		super("Copyright", "2019-01-23", "SaveTransferItem", "swcopyright");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public Integer getItemId() {
		return this.itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
		if(itemId != null){
			putBodyParameter("ItemId", itemId.toString());
		}
	}

	public String getTargetMobile() {
		return this.targetMobile;
	}

	public void setTargetMobile(String targetMobile) {
		this.targetMobile = targetMobile;
		if(targetMobile != null){
			putBodyParameter("TargetMobile", targetMobile);
		}
	}

	@Override
	public Class<SaveTransferItemResponse> getResponseClass() {
		return SaveTransferItemResponse.class;
	}

}
