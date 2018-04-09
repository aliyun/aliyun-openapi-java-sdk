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

package com.aliyuncs.cms.model.v20180308;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class TaskConfigEnableRequest extends RpcAcsRequest<TaskConfigEnableResponse> {
	
	public TaskConfigEnableRequest() {
		super("Cms", "2018-03-08", "TaskConfigEnable", "cms");
	}

	private List<Long> idLists;

	private Boolean enabled;

	public List<Long> getIdLists() {
		return this.idLists;
	}

	public void setIdLists(List<Long> idLists) {
		this.idLists = idLists;	
		if (idLists != null) {
			for (int i = 0; i < idLists.size(); i++) {
				putQueryParameter("IdList." + (i + 1) , idLists.get(i));
			}
		}	
	}

	public Boolean getEnabled() {
		return this.enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
		if(enabled != null){
			putQueryParameter("Enabled", enabled.toString());
		}
	}

	@Override
	public Class<TaskConfigEnableResponse> getResponseClass() {
		return TaskConfigEnableResponse.class;
	}

}
