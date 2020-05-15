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

package com.aliyuncs.visionai_poc.model.v20200408;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class RecognizeFlowerRequest extends RpcAcsRequest<RecognizeFlowerResponse> {
	   

	private String url;
	public RecognizeFlowerRequest() {
		super("visionai-poc", "2020-04-08", "RecognizeFlower");
		setMethod(MethodType.POST);
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
		if(url != null){
			putBodyParameter("Url", url);
		}
	}

	@Override
	public Class<RecognizeFlowerResponse> getResponseClass() {
		return RecognizeFlowerResponse.class;
	}

}
