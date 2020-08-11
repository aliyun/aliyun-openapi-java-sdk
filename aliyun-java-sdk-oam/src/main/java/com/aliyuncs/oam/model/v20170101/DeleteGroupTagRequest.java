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
public class DeleteGroupTagRequest extends RpcAcsRequest<DeleteGroupTagResponse> {
	   

	private List<String> groupTagIds;
	public DeleteGroupTagRequest() {
		super("Oam", "2017-01-01", "DeleteGroupTag");
		setMethod(MethodType.POST);
	}

	public List<String> getGroupTagIds() {
		return this.groupTagIds;
	}

	public void setGroupTagIds(List<String> groupTagIds) {
		this.groupTagIds = groupTagIds;	
		if (groupTagIds != null) {
			for (int i = 0; i < groupTagIds.size(); i++) {
				putQueryParameter("GroupTagId." + (i + 1) , groupTagIds.get(i));
			}
		}	
	}

	@Override
	public Class<DeleteGroupTagResponse> getResponseClass() {
		return DeleteGroupTagResponse.class;
	}

}
