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

package com.aliyuncs.opensearch.model.v20171225;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.opensearch.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListInterventionDictionaryEntriesRequest extends RoaAcsRequest<ListInterventionDictionaryEntriesResponse> {
	   

	private String name;

	private String word;
	public ListInterventionDictionaryEntriesRequest() {
		super("OpenSearch", "2017-12-25", "ListInterventionDictionaryEntries", "opensearch");
		setUriPattern("/v4/openapi/intervention-dictionaries/[name]/entries");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putPathParameter("name", name);
		}
	}

	public String getWord() {
		return this.word;
	}

	public void setWord(String word) {
		this.word = word;
		if(word != null){
			putQueryParameter("word", word);
		}
	}

	@Override
	public Class<ListInterventionDictionaryEntriesResponse> getResponseClass() {
		return ListInterventionDictionaryEntriesResponse.class;
	}

}
