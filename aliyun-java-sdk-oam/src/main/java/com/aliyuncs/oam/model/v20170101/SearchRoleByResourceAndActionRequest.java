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
public class SearchRoleByResourceAndActionRequest extends RpcAcsRequest<SearchRoleByResourceAndActionResponse> {
	   

	private List<ResourceAction> resourceActions;
	public SearchRoleByResourceAndActionRequest() {
		super("Oam", "2017-01-01", "SearchRoleByResourceAndAction");
		setMethod(MethodType.POST);
	}

	public List<ResourceAction> getResourceActions() {
		return this.resourceActions;
	}

	public void setResourceActions(List<ResourceAction> resourceActions) {
		this.resourceActions = resourceActions;	
		if (resourceActions != null) {
			for (int depth1 = 0; depth1 < resourceActions.size(); depth1++) {
				putQueryParameter("ResourceAction." + (depth1 + 1) + ".Resource" , resourceActions.get(depth1).getResource());
				putQueryParameter("ResourceAction." + (depth1 + 1) + ".ActionField" , resourceActions.get(depth1).getActionField());
			}
		}	
	}

	public static class ResourceAction {

		private String resource;

		private String actionField;

		public String getResource() {
			return this.resource;
		}

		public void setResource(String resource) {
			this.resource = resource;
		}

		public String getActionField() {
			return this.actionField;
		}

		public void setActionField(String actionField) {
			this.actionField = actionField;
		}
	}

	@Override
	public Class<SearchRoleByResourceAndActionResponse> getResponseClass() {
		return SearchRoleByResourceAndActionResponse.class;
	}

}
