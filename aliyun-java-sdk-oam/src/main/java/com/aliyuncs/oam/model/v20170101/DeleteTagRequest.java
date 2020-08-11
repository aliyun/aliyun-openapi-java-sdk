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
public class DeleteTagRequest extends RpcAcsRequest<DeleteTagResponse> {
	   

	private List<String> tagIds;
	public DeleteTagRequest() {
		super("Oam", "2017-01-01", "DeleteTag");
		setMethod(MethodType.POST);
	}

	public List<String> getTagIds() {
		return this.tagIds;
	}

	public void setTagIds(List<String> tagIds) {
		this.tagIds = tagIds;	
		if (tagIds != null) {
			for (int i = 0; i < tagIds.size(); i++) {
				putQueryParameter("TagId." + (i + 1) , tagIds.get(i));
			}
		}	
	}

	@Override
	public Class<DeleteTagResponse> getResponseClass() {
		return DeleteTagResponse.class;
	}

}
