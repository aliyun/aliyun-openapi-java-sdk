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
public class UpdateTrademarkNameRequest extends RpcAcsRequest<UpdateTrademarkNameResponse> {
	   

	private String tmName;

	private String clientToken;

	private Long type;

	private String tmComment;

	private String tmIcon;

	private String bizId;
	public UpdateTrademarkNameRequest() {
		super("Trademark", "2018-07-24", "UpdateTrademarkName");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getTmName() {
		return this.tmName;
	}

	public void setTmName(String tmName) {
		this.tmName = tmName;
		if(tmName != null){
			putBodyParameter("TmName", tmName);
		}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public Long getType() {
		return this.type;
	}

	public void setType(Long type) {
		this.type = type;
		if(type != null){
			putBodyParameter("Type", type.toString());
		}
	}

	public String getTmComment() {
		return this.tmComment;
	}

	public void setTmComment(String tmComment) {
		this.tmComment = tmComment;
		if(tmComment != null){
			putBodyParameter("TmComment", tmComment);
		}
	}

	public String getTmIcon() {
		return this.tmIcon;
	}

	public void setTmIcon(String tmIcon) {
		this.tmIcon = tmIcon;
		if(tmIcon != null){
			putBodyParameter("TmIcon", tmIcon);
		}
	}

	public String getBizId() {
		return this.bizId;
	}

	public void setBizId(String bizId) {
		this.bizId = bizId;
		if(bizId != null){
			putBodyParameter("BizId", bizId);
		}
	}

	@Override
	public Class<UpdateTrademarkNameResponse> getResponseClass() {
		return UpdateTrademarkNameResponse.class;
	}

}
