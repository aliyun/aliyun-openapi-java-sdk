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

package com.aliyuncs.eds_aic.model.v20230930;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class OperateAppRequest extends RpcAcsRequest<OperateAppResponse> {
	   

	private List<String> instanceIdLists;

	private Integer appId;

	private String operateType;
	public OperateAppRequest() {
		super("eds-aic", "2023-09-30", "OperateApp");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public List<String> getInstanceIdLists() {
		return this.instanceIdLists;
	}

	public void setInstanceIdLists(List<String> instanceIdLists) {
		this.instanceIdLists = instanceIdLists;	
		if (instanceIdLists != null) {
			for (int i = 0; i < instanceIdLists.size(); i++) {
				putQueryParameter("InstanceIdList." + (i + 1) , instanceIdLists.get(i));
			}
		}	
	}

	public Integer getAppId() {
		return this.appId;
	}

	public void setAppId(Integer appId) {
		this.appId = appId;
		if(appId != null){
			putQueryParameter("AppId", appId.toString());
		}
	}

	public String getOperateType() {
		return this.operateType;
	}

	public void setOperateType(String operateType) {
		this.operateType = operateType;
		if(operateType != null){
			putQueryParameter("OperateType", operateType);
		}
	}

	@Override
	public Class<OperateAppResponse> getResponseClass() {
		return OperateAppResponse.class;
	}

}
