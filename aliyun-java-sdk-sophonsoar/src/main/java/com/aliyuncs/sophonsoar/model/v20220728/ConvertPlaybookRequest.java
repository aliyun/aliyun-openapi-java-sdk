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

package com.aliyuncs.sophonsoar.model.v20220728;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ConvertPlaybookRequest extends RpcAcsRequest<ConvertPlaybookResponse> {
	   

	private Long roleFor;

	private String taskflow;

	private String roleType;

	private String lang;
	public ConvertPlaybookRequest() {
		super("sophonsoar", "2022-07-28", "ConvertPlaybook");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public Long getRoleFor() {
		return this.roleFor;
	}

	public void setRoleFor(Long roleFor) {
		this.roleFor = roleFor;
		if(roleFor != null){
			putQueryParameter("RoleFor", roleFor.toString());
		}
	}

	public String getTaskflow() {
		return this.taskflow;
	}

	public void setTaskflow(String taskflow) {
		this.taskflow = taskflow;
		if(taskflow != null){
			putBodyParameter("Taskflow", taskflow);
		}
	}

	public String getRoleType() {
		return this.roleType;
	}

	public void setRoleType(String roleType) {
		this.roleType = roleType;
		if(roleType != null){
			putQueryParameter("RoleType", roleType);
		}
	}

	public String getLang() {
		return this.lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
		if(lang != null){
			putQueryParameter("Lang", lang);
		}
	}

	@Override
	public Class<ConvertPlaybookResponse> getResponseClass() {
		return ConvertPlaybookResponse.class;
	}

}
