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

package com.aliyuncs.imm.model.v20170906;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class DeleteDocIndexRequest extends RpcAcsRequest<DeleteDocIndexResponse> {
	
	public DeleteDocIndexRequest() {
		super("imm", "2017-09-06", "DeleteDocIndex", "imm");
	}

	private String set;

	private String project;

	private String uniqueId;

	public String getSet() {
		return this.set;
	}

	public void setSet(String set) {
		this.set = set;
		if(set != null){
			putQueryParameter("Set", set);
		}
	}

	public String getProject() {
		return this.project;
	}

	public void setProject(String project) {
		this.project = project;
		if(project != null){
			putQueryParameter("Project", project);
		}
	}

	public String getUniqueId() {
		return this.uniqueId;
	}

	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
		if(uniqueId != null){
			putQueryParameter("UniqueId", uniqueId);
		}
	}

	@Override
	public Class<DeleteDocIndexResponse> getResponseClass() {
		return DeleteDocIndexResponse.class;
	}

}
