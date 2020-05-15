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

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateLinkeLinktIterationmeetingRequest extends RpcAcsRequest<CreateLinkeLinktIterationmeetingResponse> {
	   

	private String title;

	private String content;

	private Long id;

	private String iterationSign;

	private List<Long> attachmentIdsRepeatLists;
	public CreateLinkeLinktIterationmeetingRequest() {
		super("SOFA", "2019-08-15", "CreateLinkeLinktIterationmeeting", "ApplySidecarCert");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
		if(title != null){
			putBodyParameter("Title", title);
		}
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

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
		if(id != null){
			putBodyParameter("Id", id.toString());
		}
	}

	public String getIterationSign() {
		return this.iterationSign;
	}

	public void setIterationSign(String iterationSign) {
		this.iterationSign = iterationSign;
		if(iterationSign != null){
			putBodyParameter("IterationSign", iterationSign);
		}
	}

	public List<Long> getAttachmentIdsRepeatLists() {
		return this.attachmentIdsRepeatLists;
	}

	public void setAttachmentIdsRepeatLists(List<Long> attachmentIdsRepeatLists) {
		this.attachmentIdsRepeatLists = attachmentIdsRepeatLists;	
		if (attachmentIdsRepeatLists != null) {
			for (int i = 0; i < attachmentIdsRepeatLists.size(); i++) {
				putBodyParameter("AttachmentIdsRepeatList." + (i + 1) , attachmentIdsRepeatLists.get(i));
			}
		}	
	}

	@Override
	public Class<CreateLinkeLinktIterationmeetingResponse> getResponseClass() {
		return CreateLinkeLinktIterationmeetingResponse.class;
	}

}
