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
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListGroupTagRequest extends RpcAcsRequest<ListGroupTagResponse> {
	   

	private String groupTagId;

	private String name;

	private String userId;
	public ListGroupTagRequest() {
		super("Oam", "2017-01-01", "ListGroupTag");
		setMethod(MethodType.POST);
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

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
		if(userId != null){
			putQueryParameter("UserId", userId);
		}
	}

	@Override
	public Class<ListGroupTagResponse> getResponseClass() {
		return ListGroupTagResponse.class;
	}

}
