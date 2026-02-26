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

package com.aliyuncs.dms_enterprise.model.v20181101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dms_enterprise.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetDataArchiveCountRequest extends RpcAcsRequest<GetDataArchiveCountResponse> {
	   

	private String searchDateType;

	private Long tid;

	private String pluginType;

	private String orderResultType;
	public GetDataArchiveCountRequest() {
		super("dms-enterprise", "2018-11-01", "GetDataArchiveCount", "dms-enterprise");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSearchDateType() {
		return this.searchDateType;
	}

	public void setSearchDateType(String searchDateType) {
		this.searchDateType = searchDateType;
		if(searchDateType != null){
			putQueryParameter("SearchDateType", searchDateType);
		}
	}

	public Long getTid() {
		return this.tid;
	}

	public void setTid(Long tid) {
		this.tid = tid;
		if(tid != null){
			putQueryParameter("Tid", tid.toString());
		}
	}

	public String getPluginType() {
		return this.pluginType;
	}

	public void setPluginType(String pluginType) {
		this.pluginType = pluginType;
		if(pluginType != null){
			putQueryParameter("PluginType", pluginType);
		}
	}

	public String getOrderResultType() {
		return this.orderResultType;
	}

	public void setOrderResultType(String orderResultType) {
		this.orderResultType = orderResultType;
		if(orderResultType != null){
			putQueryParameter("OrderResultType", orderResultType);
		}
	}

	@Override
	public Class<GetDataArchiveCountResponse> getResponseClass() {
		return GetDataArchiveCountResponse.class;
	}

}
