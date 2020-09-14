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

package com.aliyuncs.xingzhen.model.v20191121;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class AddAppOrgItemRequest extends RpcAcsRequest<AddAppOrgItemResponse> {
	   

	private String appOrgItem;
	public AddAppOrgItemRequest() {
		super("Xingzhen", "2019-11-21", "AddAppOrgItem");
		setMethod(MethodType.POST);
	}

	public String getAppOrgItem() {
		return this.appOrgItem;
	}

	public void setAppOrgItem(String appOrgItem) {
		this.appOrgItem = appOrgItem;
		if(appOrgItem != null){
			putBodyParameter("AppOrgItem", appOrgItem);
		}
	}

	@Override
	public Class<AddAppOrgItemResponse> getResponseClass() {
		return AddAppOrgItemResponse.class;
	}

}
