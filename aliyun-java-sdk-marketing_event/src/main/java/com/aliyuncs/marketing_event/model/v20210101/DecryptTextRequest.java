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

package com.aliyuncs.marketing_event.model.v20210101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DecryptTextRequest extends RpcAcsRequest<DecryptTextResponse> {
	   

	private String plainText;
	public DecryptTextRequest() {
		super("marketing_event", "2021-01-01", "DecryptText");
		setMethod(MethodType.GET);
	}

	public String getPlainText() {
		return this.plainText;
	}

	public void setPlainText(String plainText) {
		this.plainText = plainText;
		if(plainText != null){
			putQueryParameter("PlainText", plainText);
		}
	}

	@Override
	public Class<DecryptTextResponse> getResponseClass() {
		return DecryptTextResponse.class;
	}

}
