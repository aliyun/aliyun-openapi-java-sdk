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
public class QueryItemDetailInnerRequest extends RpcAcsRequest<QueryItemDetailInnerResponse> {
	   

	private String divisionCode;

	private String bizUid;

	private String ip;

	private Boolean useAnonymousTbAccount;

	private String lmItemId;

	private Long itemId;

	private String thirdPartyUserId;

	private String bizId;
	public QueryItemDetailInnerRequest() {
		super("linkedmall", "2018-01-16", "QueryItemDetailInner");
		setMethod(MethodType.POST);
	}

	public String getDivisionCode() {
		return this.divisionCode;
	}

	public void setDivisionCode(String divisionCode) {
		this.divisionCode = divisionCode;
		if(divisionCode != null){
			putQueryParameter("DivisionCode", divisionCode);
		}
	}

	public String getBizUid() {
		return this.bizUid;
	}

	public void setBizUid(String bizUid) {
		this.bizUid = bizUid;
		if(bizUid != null){
			putQueryParameter("BizUid", bizUid);
		}
	}

	public String getIp() {
		return this.ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
		if(ip != null){
			putQueryParameter("Ip", ip);
		}
	}

	public Boolean getUseAnonymousTbAccount() {
		return this.useAnonymousTbAccount;
	}

	public void setUseAnonymousTbAccount(Boolean useAnonymousTbAccount) {
		this.useAnonymousTbAccount = useAnonymousTbAccount;
		if(useAnonymousTbAccount != null){
			putQueryParameter("UseAnonymousTbAccount", useAnonymousTbAccount.toString());
		}
	}

	public String getLmItemId() {
		return this.lmItemId;
	}

	public void setLmItemId(String lmItemId) {
		this.lmItemId = lmItemId;
		if(lmItemId != null){
			putQueryParameter("LmItemId", lmItemId);
		}
	}

	public Long getItemId() {
		return this.itemId;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
		if(itemId != null){
			putQueryParameter("ItemId", itemId.toString());
		}
	}

	public String getThirdPartyUserId() {
		return this.thirdPartyUserId;
	}

	public void setThirdPartyUserId(String thirdPartyUserId) {
		this.thirdPartyUserId = thirdPartyUserId;
		if(thirdPartyUserId != null){
			putQueryParameter("ThirdPartyUserId", thirdPartyUserId);
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

	@Override
	public Class<QueryItemDetailInnerResponse> getResponseClass() {
		return QueryItemDetailInnerResponse.class;
	}

}
