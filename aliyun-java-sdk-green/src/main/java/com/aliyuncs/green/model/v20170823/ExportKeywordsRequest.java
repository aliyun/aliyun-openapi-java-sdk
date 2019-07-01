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

package com.aliyuncs.green.model.v20170823;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ExportKeywordsRequest extends RpcAcsRequest<ExportKeywordsResponse> {
	
	public ExportKeywordsRequest() {
		super("Green", "2017-08-23", "ExportKeywords", "green");
		setMethod(MethodType.POST);
	}

	private Long keywordLibId;

	public Long getKeywordLibId() {
		return this.keywordLibId;
	}

	public void setKeywordLibId(Long keywordLibId) {
		this.keywordLibId = keywordLibId;
		if(keywordLibId != null){
			putQueryParameter("KeywordLibId", keywordLibId.toString());
		}
	}

	@Override
	public Class<ExportKeywordsResponse> getResponseClass() {
		return ExportKeywordsResponse.class;
	}

}
