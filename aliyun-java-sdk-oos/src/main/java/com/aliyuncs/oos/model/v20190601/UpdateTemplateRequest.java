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

package com.aliyuncs.oos.model.v20190601;

import com.aliyuncs.RpcAcsRequest;
import java.util.Map;
import com.google.gson.Gson;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UpdateTemplateRequest extends RpcAcsRequest<UpdateTemplateResponse> {
	   

	private String content;

	private Map<Object,Object> tags;

	private String templateName;
	public UpdateTemplateRequest() {
		super("oos", "2019-06-01", "UpdateTemplate", "oos");
		setMethod(MethodType.POST);
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
		if(content != null){
			putQueryParameter("Content", content);
		}
	}

	public Map<Object,Object> getTags() {
		return this.tags;
	}

	public void setTags(Map<Object,Object> tags) {
		this.tags = tags;
		if(tags != null){
			putQueryParameter("Tags", new Gson().toJson(tags));
		}
	}

	public String getTemplateName() {
		return this.templateName;
	}

	public void setTemplateName(String templateName) {
		this.templateName = templateName;
		if(templateName != null){
			putQueryParameter("TemplateName", templateName);
		}
	}

	@Override
	public Class<UpdateTemplateResponse> getResponseClass() {
		return UpdateTemplateResponse.class;
	}

}
