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
public class ListApplicationsForPrivateAccessTagRequest extends RpcAcsRequest<ListApplicationsForPrivateAccessTagResponse> {
	   

	private List<String> tagIds;
	public ListApplicationsForPrivateAccessTagRequest() {
		super("csas", "2023-01-20", "ListApplicationsForPrivateAccessTag");
		setMethod(MethodType.GET);
	}

	public List<String> getTagIds() {
		return this.tagIds;
	}

	public void setTagIds(List<String> tagIds) {
		this.tagIds = tagIds;	
		if (tagIds != null) {
			for (int depth1 = 0; depth1 < tagIds.size(); depth1++) {
				putQueryParameter("TagIds." + (depth1 + 1) , tagIds.get(depth1));
			}
		}	
	}

	@Override
	public Class<ListApplicationsForPrivateAccessTagResponse> getResponseClass() {
		return ListApplicationsForPrivateAccessTagResponse.class;
	}

}
