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

package com.aliyuncs.alidns.model.v20150109;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DeleteCustomLinesRequest extends RpcAcsRequest<DeleteCustomLinesResponse> {
	   

	private String lineIds;

	private String lang;
	public DeleteCustomLinesRequest() {
		super("Alidns", "2015-01-09", "DeleteCustomLines", "alidns");
		setMethod(MethodType.POST);
	}

	public String getLineIds() {
		return this.lineIds;
	}

	public void setLineIds(String lineIds) {
		this.lineIds = lineIds;
		if(lineIds != null){
			putQueryParameter("LineIds", lineIds);
		}
	}

	public String getLang() {
		return this.lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
		if(lang != null){
			putQueryParameter("Lang", lang);
		}
	}

	@Override
	public Class<DeleteCustomLinesResponse> getResponseClass() {
		return DeleteCustomLinesResponse.class;
	}

}
