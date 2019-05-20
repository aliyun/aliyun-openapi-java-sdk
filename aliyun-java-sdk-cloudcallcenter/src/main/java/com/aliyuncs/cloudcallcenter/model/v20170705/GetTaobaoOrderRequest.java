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

package com.aliyuncs.cloudcallcenter.model.v20170705;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class GetTaobaoOrderRequest extends RpcAcsRequest<GetTaobaoOrderResponse> {
	
	public GetTaobaoOrderRequest() {
		super("CloudCallCenter", "2017-07-05", "GetTaobaoOrder", "CloudCallCenter", "innerAPI");
	}

	private String articleItemCode;

	private Long endTime;

	private Boolean expiredOnly;

	private Long startTime;

	private Long taobaoUid;

	private Integer type;

	private Boolean includeAll;

	private String articleCode;

	public String getArticleItemCode() {
		return this.articleItemCode;
	}

	public void setArticleItemCode(String articleItemCode) {
		this.articleItemCode = articleItemCode;
		if(articleItemCode != null){
			putQueryParameter("articleItemCode", articleItemCode);
		}
	}

	public Long getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Long endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putQueryParameter("endTime", endTime.toString());
		}
	}

	public Boolean getExpiredOnly() {
		return this.expiredOnly;
	}

	public void setExpiredOnly(Boolean expiredOnly) {
		this.expiredOnly = expiredOnly;
		if(expiredOnly != null){
			putQueryParameter("expiredOnly", expiredOnly.toString());
		}
	}

	public Long getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Long startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putQueryParameter("startTime", startTime.toString());
		}
	}

	public Long getTaobaoUid() {
		return this.taobaoUid;
	}

	public void setTaobaoUid(Long taobaoUid) {
		this.taobaoUid = taobaoUid;
		if(taobaoUid != null){
			putQueryParameter("TaobaoUid", taobaoUid.toString());
		}
	}

	public Integer getType() {
		return this.type;
	}

	public void setType(Integer type) {
		this.type = type;
		if(type != null){
			putQueryParameter("type", type.toString());
		}
	}

	public Boolean getIncludeAll() {
		return this.includeAll;
	}

	public void setIncludeAll(Boolean includeAll) {
		this.includeAll = includeAll;
		if(includeAll != null){
			putQueryParameter("includeAll", includeAll.toString());
		}
	}

	public String getArticleCode() {
		return this.articleCode;
	}

	public void setArticleCode(String articleCode) {
		this.articleCode = articleCode;
		if(articleCode != null){
			putQueryParameter("articleCode", articleCode);
		}
	}

	@Override
	public Class<GetTaobaoOrderResponse> getResponseClass() {
		return GetTaobaoOrderResponse.class;
	}

}
