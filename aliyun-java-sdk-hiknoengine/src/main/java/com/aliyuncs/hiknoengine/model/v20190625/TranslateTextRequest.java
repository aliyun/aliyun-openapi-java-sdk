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

package com.aliyuncs.hiknoengine.model.v20190625;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class TranslateTextRequest extends RpcAcsRequest<TranslateTextResponse> {
	   

	private String fromLang;

	private String toLang;

	private String text;
	public TranslateTextRequest() {
		super("hiknoengine", "2019-06-25", "TranslateText", "hiknoengine");
		setMethod(MethodType.POST);
	}

	public String getFromLang() {
		return this.fromLang;
	}

	public void setFromLang(String fromLang) {
		this.fromLang = fromLang;
		if(fromLang != null){
			putBodyParameter("FromLang", fromLang);
		}
	}

	public String getToLang() {
		return this.toLang;
	}

	public void setToLang(String toLang) {
		this.toLang = toLang;
		if(toLang != null){
			putBodyParameter("ToLang", toLang);
		}
	}

	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
		if(text != null){
			putBodyParameter("Text", text);
		}
	}

	@Override
	public Class<TranslateTextResponse> getResponseClass() {
		return TranslateTextResponse.class;
	}

}
