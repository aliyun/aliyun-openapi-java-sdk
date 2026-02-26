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

package com.aliyuncs.ens.model.v20171110;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ModifyHaVipAttributeRequest extends RpcAcsRequest<ModifyHaVipAttributeResponse> {
	   

	private String haVipId;

	private String name;
	public ModifyHaVipAttributeRequest() {
		super("Ens", "2017-11-10", "ModifyHaVipAttribute", "ens");
		setMethod(MethodType.POST);
	}

	public String getHaVipId() {
		return this.haVipId;
	}

	public void setHaVipId(String haVipId) {
		this.haVipId = haVipId;
		if(haVipId != null){
			putQueryParameter("HaVipId", haVipId);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	@Override
	public Class<ModifyHaVipAttributeResponse> getResponseClass() {
		return ModifyHaVipAttributeResponse.class;
	}

}
