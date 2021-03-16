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

package com.aliyuncs.cccxspaceinner.model.v20191227;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListGroupByIdRequest extends RpcAcsRequest<ListGroupByIdResponse> {
	   

	private String groupIds;
	public ListGroupByIdRequest() {
		super("CCCXSpaceInner", "2019-12-27", "ListGroupById");
		setMethod(MethodType.POST);
	}

	public String getGroupIds() {
		return this.groupIds;
	}

	public void setGroupIds(String groupIds) {
		this.groupIds = groupIds;
		if(groupIds != null){
			putQueryParameter("GroupIds", groupIds);
		}
	}

	@Override
	public Class<ListGroupByIdResponse> getResponseClass() {
		return ListGroupByIdResponse.class;
	}

}
