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
public class CreateDocIndexTaskRequest extends RpcAcsRequest<CreateDocIndexTaskResponse> {
	
	public CreateDocIndexTaskRequest() {
		super("imm", "2017-09-06", "CreateDocIndexTask", "imm");
	}

	private String customKey1;

	private String set;

	private String customKey5;

	private String customKey4;

	private String customKey3;

	private String customKey2;

	private String project;

	private String customKey6;

	private String contentType;

	private String name;

	private String srcUri;

	private String uniqueId;

	public String getCustomKey1() {
		return this.customKey1;
	}

	public void setCustomKey1(String customKey1) {
		this.customKey1 = customKey1;
		if(customKey1 != null){
			putQueryParameter("CustomKey1", customKey1);
		}
	}

	public String getSet() {
		return this.set;
	}

	public void setSet(String set) {
		this.set = set;
		if(set != null){
			putQueryParameter("Set", set);
		}
	}

	public String getCustomKey5() {
		return this.customKey5;
	}

	public void setCustomKey5(String customKey5) {
		this.customKey5 = customKey5;
		if(customKey5 != null){
			putQueryParameter("CustomKey5", customKey5);
		}
	}

	public String getCustomKey4() {
		return this.customKey4;
	}

	public void setCustomKey4(String customKey4) {
		this.customKey4 = customKey4;
		if(customKey4 != null){
			putQueryParameter("CustomKey4", customKey4);
		}
	}

	public String getCustomKey3() {
		return this.customKey3;
	}

	public void setCustomKey3(String customKey3) {
		this.customKey3 = customKey3;
		if(customKey3 != null){
			putQueryParameter("CustomKey3", customKey3);
		}
	}

	public String getCustomKey2() {
		return this.customKey2;
	}

	public void setCustomKey2(String customKey2) {
		this.customKey2 = customKey2;
		if(customKey2 != null){
			putQueryParameter("CustomKey2", customKey2);
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

	public String getCustomKey6() {
		return this.customKey6;
	}

	public void setCustomKey6(String customKey6) {
		this.customKey6 = customKey6;
		if(customKey6 != null){
			putQueryParameter("CustomKey6", customKey6);
		}
	}

	public String getContentType() {
		return this.contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
		if(contentType != null){
			putQueryParameter("ContentType", contentType);
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

	public String getSrcUri() {
		return this.srcUri;
	}

	public void setSrcUri(String srcUri) {
		this.srcUri = srcUri;
		if(srcUri != null){
			putQueryParameter("SrcUri", srcUri);
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
	public Class<CreateDocIndexTaskResponse> getResponseClass() {
		return CreateDocIndexTaskResponse.class;
	}

}
