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
public class UpdateGroupTagByIdRequest extends RpcAcsRequest<UpdateGroupTagByIdResponse> {
	   

	private List<TagId> tagIds;

	private String groupTagId;

	private String name;

	private String description;

	private String userId;
	public UpdateGroupTagByIdRequest() {
		super("Oam", "2017-01-01", "UpdateGroupTagById");
		setMethod(MethodType.POST);
	}

	public List<TagId> getTagIds() {
		return this.tagIds;
	}

	public void setTagIds(List<TagId> tagIds) {
		this.tagIds = tagIds;	
		if (tagIds != null) {
			for (int depth1 = 0; depth1 < tagIds.size(); depth1++) {
				putQueryParameter("TagId." + (depth1 + 1) + ".NewId" , tagIds.get(depth1).getNewId());
				putQueryParameter("TagId." + (depth1 + 1) + ".OldId" , tagIds.get(depth1).getOldId());
			}
		}	
	}

	public String getGroupTagId() {
		return this.groupTagId;
	}

	public void setGroupTagId(String groupTagId) {
		this.groupTagId = groupTagId;
		if(groupTagId != null){
			putQueryParameter("GroupTagId", groupTagId);
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

	public static class TagId {

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
	public Class<UpdateGroupTagByIdResponse> getResponseClass() {
		return UpdateGroupTagByIdResponse.class;
	}

}
