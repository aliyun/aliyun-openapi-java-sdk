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

package com.aliyuncs.oam.model.v20170101;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UpdateTagByIdRequest extends RpcAcsRequest<UpdateTagByIdResponse> {
	   

	private String tagId;

	private List<RoleCellId> roleCellIds;

	private String name;

	private String description;

	private String userId;
	public UpdateTagByIdRequest() {
		super("Oam", "2017-01-01", "UpdateTagById");
		setMethod(MethodType.POST);
	}

	public String getTagId() {
		return this.tagId;
	}

	public void setTagId(String tagId) {
		this.tagId = tagId;
		if(tagId != null){
			putQueryParameter("TagId", tagId);
		}
	}

	public List<RoleCellId> getRoleCellIds() {
		return this.roleCellIds;
	}

	public void setRoleCellIds(List<RoleCellId> roleCellIds) {
		this.roleCellIds = roleCellIds;	
		if (roleCellIds != null) {
			for (int depth1 = 0; depth1 < roleCellIds.size(); depth1++) {
				putQueryParameter("RoleCellId." + (depth1 + 1) + ".NewId" , roleCellIds.get(depth1).getNewId());
				putQueryParameter("RoleCellId." + (depth1 + 1) + ".OldId" , roleCellIds.get(depth1).getOldId());
			}
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

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
		if(userId != null){
			putQueryParameter("UserId", userId);
		}
	}

	public static class RoleCellId {

		private String newId;

		private String oldId;

		public String getNewId() {
			return this.newId;
		}

		public void setNewId(String newId) {
			this.newId = newId;
		}

		public String getOldId() {
			return this.oldId;
		}

		public void setOldId(String oldId) {
			this.oldId = oldId;
		}
	}

	@Override
	public Class<UpdateTagByIdResponse> getResponseClass() {
		return UpdateTagByIdResponse.class;
	}

}
