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

package com.aliyuncs.ccc.model.v20170705;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class EncryptRequest extends RpcAcsRequest<EncryptResponse> {
	
	public EncryptRequest() {
		super("CCC", "2017-07-05", "Encrypt", "ccc");
	}

	private String publicKey;

	private List<String> plainTexts;

	public String getPublicKey() {
		return this.publicKey;
	}

	public void setPublicKey(String publicKey) {
		this.publicKey = publicKey;
		if(publicKey != null){
			putQueryParameter("PublicKey", publicKey);
		}
	}

	public List<String> getPlainTexts() {
		return this.plainTexts;
	}

	public void setPlainTexts(List<String> plainTexts) {
		this.plainTexts = plainTexts;	
		if (plainTexts != null) {
			for (int i = 0; i < plainTexts.size(); i++) {
				putQueryParameter("PlainText." + (i + 1) , plainTexts.get(i));
			}
		}	
	}

	@Override
	public Class<EncryptResponse> getResponseClass() {
		return EncryptResponse.class;
	}

}
