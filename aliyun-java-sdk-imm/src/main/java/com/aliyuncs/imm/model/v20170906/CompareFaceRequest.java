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
public class CompareFaceRequest extends RpcAcsRequest<CompareFaceResponse> {
	
	public CompareFaceRequest() {
		super("imm", "2017-09-06", "CompareFace", "2017-09-06");
	}

	private String srcUriB;

	private String srcUriA;

	private String project;

	public String getSrcUriB() {
		return this.srcUriB;
	}

	public void setSrcUriB(String srcUriB) {
		this.srcUriB = srcUriB;
		if(srcUriB != null){
			putQueryParameter("SrcUriB", srcUriB);
		}
	}

	public String getSrcUriA() {
		return this.srcUriA;
	}

	public void setSrcUriA(String srcUriA) {
		this.srcUriA = srcUriA;
		if(srcUriA != null){
			putQueryParameter("SrcUriA", srcUriA);
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

	@Override
	public Class<CompareFaceResponse> getResponseClass() {
		return CompareFaceResponse.class;
	}

}
