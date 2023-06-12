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

package com.aliyuncs.csas.model.v20230120;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateUserGroupRequest extends RpcAcsRequest<CreateUserGroupResponse> {
	   

	private String description;

	private String name;

	private List<Attributes> attributes;
	public CreateUserGroupRequest() {
		super("csas", "2023-01-20", "CreateUserGroup");
		setMethod(MethodType.POST);
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putBodyParameter("Description", description);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putBodyParameter("Name", name);
		}
	}

	public List<Attributes> getAttributes() {
		return this.attributes;
	}

	public void setAttributes(List<Attributes> attributes) {
		this.attributes = attributes;	
		if (attributes != null) {
			for (int depth1 = 0; depth1 < attributes.size(); depth1++) {
				if (attributes.get(depth1) != null) {
					
						putBodyParameter("Attributes." + (depth1 + 1) + ".UserGroupType" , attributes.get(depth1).getUserGroupType());
						putBodyParameter("Attributes." + (depth1 + 1) + ".IdpId" , attributes.get(depth1).getIdpId());
						putBodyParameter("Attributes." + (depth1 + 1) + ".Value" , attributes.get(depth1).getValue());
						putBodyParameter("Attributes." + (depth1 + 1) + ".Relation" , attributes.get(depth1).getRelation());
				}
			}
		}	
	}

	public static class Attributes {

		private String userGroupType;

		private Integer idpId;

		private String value;

		private String relation;

		public String getUserGroupType() {
			return this.userGroupType;
		}

		public void setUserGroupType(String userGroupType) {
			this.userGroupType = userGroupType;
		}

		public Integer getIdpId() {
			return this.idpId;
		}

		public void setIdpId(Integer idpId) {
			this.idpId = idpId;
		}

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getRelation() {
			return this.relation;
		}

		public void setRelation(String relation) {
			this.relation = relation;
		}
	}

	@Override
	public Class<CreateUserGroupResponse> getResponseClass() {
		return CreateUserGroupResponse.class;
	}

}
