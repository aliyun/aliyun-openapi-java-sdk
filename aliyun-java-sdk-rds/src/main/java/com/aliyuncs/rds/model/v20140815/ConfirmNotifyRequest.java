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

package com.aliyuncs.rds.model.v20140815;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.rds.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ConfirmNotifyRequest extends RpcAcsRequest<ConfirmNotifyResponse> {
	   

	@SerializedName("notifyIdList")
	private List<Long> notifyIdList;

	private Long confirmor;
	public ConfirmNotifyRequest() {
		super("Rds", "2014-08-15", "ConfirmNotify", "rds");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<Long> getNotifyIdList() {
		return this.notifyIdList;
	}

	public void setNotifyIdList(List<Long> notifyIdList) {
		this.notifyIdList = notifyIdList;	
		if (notifyIdList != null) {
			putBodyParameter("NotifyIdList" , new Gson().toJson(notifyIdList));
		}	
	}

	public Long getConfirmor() {
		return this.confirmor;
	}

	public void setConfirmor(Long confirmor) {
		this.confirmor = confirmor;
		if(confirmor != null){
			putBodyParameter("Confirmor", confirmor.toString());
		}
	}

	@Override
	public Class<ConfirmNotifyResponse> getResponseClass() {
		return ConfirmNotifyResponse.class;
	}

}
