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

package com.aliyuncs.cms.model.v20190101;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class DeleteMetricRulesRequest extends RpcAcsRequest<DeleteMetricRulesResponse> {
	
	public DeleteMetricRulesRequest() {
		super("Cms", "2019-01-01", "DeleteMetricRules", "cms");
	}

	private List<String> ids;

	public List<String> getIds() {
		return this.ids;
	}

	public void setIds(List<String> ids) {
		this.ids = ids;	
		if (ids != null) {
			for (int i = 0; i < ids.size(); i++) {
				putQueryParameter("Id." + (i + 1) , ids.get(i));
			}
		}	
	}

	@Override
	public Class<DeleteMetricRulesResponse> getResponseClass() {
		return DeleteMetricRulesResponse.class;
	}

}
