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

package com.aliyuncs.retailbot.model.v20210224;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class AppGrayListBatchRemoveRequest extends RpcAcsRequest<AppGrayListBatchRemoveResponse> {
	   

	private String instanceId;

	private Long tenantId;

	private String appCode;

	private List<String> content;
	public AppGrayListBatchRemoveRequest() {
		super("RetailBot", "2021-02-24", "AppGrayListBatchRemove");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public Long getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(Long tenantId) {
		this.tenantId = tenantId;
		if(tenantId != null){
			putQueryParameter("TenantId", tenantId.toString());
		}
	}

	public String getAppCode() {
		return this.appCode;
	}

	public void setAppCode(String appCode) {
		this.appCode = appCode;
		if(appCode != null){
			putQueryParameter("AppCode", appCode);
		}
	}

	public List<String> getContent() {
		return this.content;
	}

	public void setContent(List<String> content) {
		this.content = content;	
		if (content != null) {
			for (int depth1 = 0; depth1 < content.size(); depth1++) {
				putQueryParameter("Content." + (depth1 + 1) , content.get(depth1));
			}
		}	
	}

	@Override
	public Class<AppGrayListBatchRemoveResponse> getResponseClass() {
		return AppGrayListBatchRemoveResponse.class;
	}

}
