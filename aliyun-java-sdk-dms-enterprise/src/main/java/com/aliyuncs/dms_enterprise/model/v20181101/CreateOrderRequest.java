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
import java.util.Map;
import com.google.gson.Gson;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dms_enterprise.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateOrderRequest extends RpcAcsRequest<CreateOrderResponse> {
	   

	private String pluginType;

	private String comment;

	private Long tid;

	private Map<Object,Object> pluginParam;

	private String relatedUserList;
	public CreateOrderRequest() {
		super("dms-enterprise", "2018-11-01", "CreateOrder");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
		if(comment != null){
			putQueryParameter("Comment", comment);
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

	public Map<Object,Object> getPluginParam() {
		return this.pluginParam;
	}

	public void setPluginParam(Map<Object,Object> pluginParam) {
		this.pluginParam = pluginParam;
		if(pluginParam != null){
			putQueryParameter("PluginParam", new Gson().toJson(pluginParam));
		}
	}

	public String getRelatedUserList() {
		return this.relatedUserList;
	}

	public void setRelatedUserList(String relatedUserList) {
		this.relatedUserList = relatedUserList;
		if(relatedUserList != null){
			putQueryParameter("RelatedUserList", relatedUserList);
		}
	}

	@Override
	public Class<CreateOrderResponse> getResponseClass() {
		return CreateOrderResponse.class;
	}

}
