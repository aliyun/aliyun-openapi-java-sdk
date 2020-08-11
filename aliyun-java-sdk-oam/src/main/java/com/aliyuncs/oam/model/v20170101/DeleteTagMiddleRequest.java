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
public class DeleteTagMiddleRequest extends RpcAcsRequest<DeleteTagMiddleResponse> {
	   

	private List<String> roleCellIds;

	private String tagId;
	public DeleteTagMiddleRequest() {
		super("Oam", "2017-01-01", "DeleteTagMiddle");
		setMethod(MethodType.POST);
	}

	public List<String> getRoleCellIds() {
		return this.roleCellIds;
	}

	public void setRoleCellIds(List<String> roleCellIds) {
		this.roleCellIds = roleCellIds;	
		if (roleCellIds != null) {
			for (int i = 0; i < roleCellIds.size(); i++) {
				putQueryParameter("RoleCellId." + (i + 1) , roleCellIds.get(i));
			}
		}	
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

	@Override
	public Class<DeleteTagMiddleResponse> getResponseClass() {
		return DeleteTagMiddleResponse.class;
	}

}
