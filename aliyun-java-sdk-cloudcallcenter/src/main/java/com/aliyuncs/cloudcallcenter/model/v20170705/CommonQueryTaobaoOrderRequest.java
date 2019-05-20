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
public class CommonQueryTaobaoOrderRequest extends RpcAcsRequest<CommonQueryTaobaoOrderResponse> {
	
	public CommonQueryTaobaoOrderRequest() {
		super("CloudCallCenter", "2017-07-05", "CommonQueryTaobaoOrder", "CloudCallCenter", "innerAPI");
	}

	private String statusList;

	private String typeList;

	private Long endTime;

	private Long startTime;

	private Long taobaoUid;

	private String articleItemCodeList;

	private String articleCodeList;

	public String getStatusList() {
		return this.statusList;
	}

	public void setStatusList(String statusList) {
		this.statusList = statusList;
		if(statusList != null){
			putQueryParameter("StatusList", statusList);
		}
	}

	public String getTypeList() {
		return this.typeList;
	}

	public void setTypeList(String typeList) {
		this.typeList = typeList;
		if(typeList != null){
			putQueryParameter("typeList", typeList);
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

	public String getArticleItemCodeList() {
		return this.articleItemCodeList;
	}

	public void setArticleItemCodeList(String articleItemCodeList) {
		this.articleItemCodeList = articleItemCodeList;
		if(articleItemCodeList != null){
			putQueryParameter("articleItemCodeList", articleItemCodeList);
		}
	}

	public String getArticleCodeList() {
		return this.articleCodeList;
	}

	public void setArticleCodeList(String articleCodeList) {
		this.articleCodeList = articleCodeList;
		if(articleCodeList != null){
			putQueryParameter("articleCodeList", articleCodeList);
		}
	}

	@Override
	public Class<CommonQueryTaobaoOrderResponse> getResponseClass() {
		return CommonQueryTaobaoOrderResponse.class;
	}

}
