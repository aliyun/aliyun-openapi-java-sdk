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

package com.aliyuncs.chatbot.model.v20171011;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class AddSynonymRequest extends RpcAcsRequest<AddSynonymResponse> {
	
	public AddSynonymRequest() {
		super("Chatbot", "2017-10-11", "AddSynonym", "beebot");
	}

	private String synonym;

	private String coreWordName;

	public String getSynonym() {
		return this.synonym;
	}

	public void setSynonym(String synonym) {
		this.synonym = synonym;
		if(synonym != null){
			putQueryParameter("Synonym", synonym);
		}
	}

	public String getCoreWordName() {
		return this.coreWordName;
	}

	public void setCoreWordName(String coreWordName) {
		this.coreWordName = coreWordName;
		if(coreWordName != null){
			putQueryParameter("CoreWordName", coreWordName);
		}
	}

	@Override
	public Class<AddSynonymResponse> getResponseClass() {
		return AddSynonymResponse.class;
	}

}
