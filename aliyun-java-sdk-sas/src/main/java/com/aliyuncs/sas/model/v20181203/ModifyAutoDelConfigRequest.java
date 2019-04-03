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

package com.aliyuncs.sas.model.v20181203;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class ModifyAutoDelConfigRequest extends RpcAcsRequest<ModifyAutoDelConfigResponse> {
	
	public ModifyAutoDelConfigRequest() {
		super("Sas", "2018-12-03", "ModifyAutoDelConfig", "sas");
	}

	private Integer days;

	public Integer getDays() {
		return this.days;
	}

	public void setDays(Integer days) {
		this.days = days;
		if(days != null){
			putQueryParameter("Days", days.toString());
		}
	}

	@Override
	public Class<ModifyAutoDelConfigResponse> getResponseClass() {
		return ModifyAutoDelConfigResponse.class;
	}

}
