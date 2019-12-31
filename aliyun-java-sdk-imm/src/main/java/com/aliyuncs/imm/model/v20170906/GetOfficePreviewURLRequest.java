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
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetOfficePreviewURLRequest extends RpcAcsRequest<GetOfficePreviewURLResponse> {
	   

	private String srcType;

	private Integer expires;

	private String project;

	private Boolean useHTTPS;

	private String srcUri;
	public GetOfficePreviewURLRequest() {
		super("imm", "2017-09-06", "GetOfficePreviewURL", "imm");
		setMethod(MethodType.POST);
	}

	public String getSrcType() {
		return this.srcType;
	}

	public void setSrcType(String srcType) {
		this.srcType = srcType;
		if(srcType != null){
			putQueryParameter("SrcType", srcType);
		}
	}

	public Integer getExpires() {
		return this.expires;
	}

	public void setExpires(Integer expires) {
		this.expires = expires;
		if(expires != null){
			putQueryParameter("Expires", expires.toString());
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

	public Boolean getUseHTTPS() {
		return this.useHTTPS;
	}

	public void setUseHTTPS(Boolean useHTTPS) {
		this.useHTTPS = useHTTPS;
		if(useHTTPS != null){
			putQueryParameter("UseHTTPS", useHTTPS.toString());
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

	@Override
	public Class<GetOfficePreviewURLResponse> getResponseClass() {
		return GetOfficePreviewURLResponse.class;
	}

}
