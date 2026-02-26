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

package com.aliyuncs.advisor_share.model.v20180608;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListCostTrendRequest extends RpcAcsRequest<ListCostTrendResponse> {
	   

	private String queryGroupType;

	private String queryGroupId;
	public ListCostTrendRequest() {
		super("Advisor-Share", "2018-06-08", "ListCostTrend", "advisor");
		setMethod(MethodType.POST);
	}

	public String getQueryGroupType() {
		return this.queryGroupType;
	}

	public void setQueryGroupType(String queryGroupType) {
		this.queryGroupType = queryGroupType;
		if(queryGroupType != null){
			putQueryParameter("QueryGroupType", queryGroupType);
		}
	}

	public String getQueryGroupId() {
		return this.queryGroupId;
	}

	public void setQueryGroupId(String queryGroupId) {
		this.queryGroupId = queryGroupId;
		if(queryGroupId != null){
			putQueryParameter("QueryGroupId", queryGroupId);
		}
	}

	@Override
	public Class<ListCostTrendResponse> getResponseClass() {
		return ListCostTrendResponse.class;
	}

}
