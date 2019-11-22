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

package com.aliyuncs.imagerecog.model.v20190930;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.imagerecog.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class RecognizeImageColorRequest extends RpcAcsRequest<RecognizeImageColorResponse> {
	   

	private String url;

	private Integer colorCount;
	public RecognizeImageColorRequest() {
		super("imagerecog", "2019-09-30", "RecognizeImageColor", "imagerecog");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public Integer getColorCount() {
		return this.colorCount;
	}

	public void setColorCount(Integer colorCount) {
		this.colorCount = colorCount;
		if(colorCount != null){
			putBodyParameter("ColorCount", colorCount.toString());
		}
	}

	@Override
	public Class<RecognizeImageColorResponse> getResponseClass() {
		return RecognizeImageColorResponse.class;
	}

}
