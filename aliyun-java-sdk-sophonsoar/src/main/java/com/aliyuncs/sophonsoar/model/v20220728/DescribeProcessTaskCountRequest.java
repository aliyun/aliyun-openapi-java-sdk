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
import java.util.List;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DescribeProcessTaskCountRequest extends RpcAcsRequest<DescribeProcessTaskCountResponse> {
	   

	private List<String> entityUuidLists;

	private Long roleFor;

	private String roleType;

	private String lang;
	public DescribeProcessTaskCountRequest() {
		super("sophonsoar", "2022-07-28", "DescribeProcessTaskCount");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.GET);
	}

	public List<String> getEntityUuidLists() {
		return this.entityUuidLists;
	}

	public void setEntityUuidLists(List<String> entityUuidLists) {
		this.entityUuidLists = entityUuidLists;	
		if (entityUuidLists != null) {
			for (int i = 0; i < entityUuidLists.size(); i++) {
				putQueryParameter("EntityUuidList." + (i + 1) , entityUuidLists.get(i));
			}
		}	
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
	public Class<DescribeProcessTaskCountResponse> getResponseClass() {
		return DescribeProcessTaskCountResponse.class;
	}

}
