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

package com.aliyuncs.baas.model.v20181221;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UpdateAntChainContractContentRequest extends RpcAcsRequest<UpdateAntChainContractContentResponse> {
	   

	private String content;

	private String parentContentId;

	private String contentName;

	private String contentId;
	public UpdateAntChainContractContentRequest() {
		super("Baas", "2018-12-21", "UpdateAntChainContractContent", "baas");
		setMethod(MethodType.PUT);
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
		if(content != null){
			putBodyParameter("Content", content);
		}
	}

	public String getParentContentId() {
		return this.parentContentId;
	}

	public void setParentContentId(String parentContentId) {
		this.parentContentId = parentContentId;
		if(parentContentId != null){
			putBodyParameter("ParentContentId", parentContentId);
		}
	}

	public String getContentName() {
		return this.contentName;
	}

	public void setContentName(String contentName) {
		this.contentName = contentName;
		if(contentName != null){
			putBodyParameter("ContentName", contentName);
		}
	}

	public String getContentId() {
		return this.contentId;
	}

	public void setContentId(String contentId) {
		this.contentId = contentId;
		if(contentId != null){
			putBodyParameter("ContentId", contentId);
		}
	}

	@Override
	public Class<UpdateAntChainContractContentResponse> getResponseClass() {
		return UpdateAntChainContractContentResponse.class;
	}

}
