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

package com.aliyuncs.vcs.model.v20200515;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.vcs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class RecognizeImageRequest extends RpcAcsRequest<RecognizeImageResponse> {
	   

	private String corpId;

	private String picUrl;

	private String picContent;

	private String picFormat;
	public RecognizeImageRequest() {
		super("Vcs", "2020-05-15", "RecognizeImage", "vcs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getCorpId() {
		return this.corpId;
	}

	public void setCorpId(String corpId) {
		this.corpId = corpId;
		if(corpId != null){
			putBodyParameter("CorpId", corpId);
		}
	}

	public String getPicUrl() {
		return this.picUrl;
	}

	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
		if(picUrl != null){
			putBodyParameter("PicUrl", picUrl);
		}
	}

	public String getPicContent() {
		return this.picContent;
	}

	public void setPicContent(String picContent) {
		this.picContent = picContent;
		if(picContent != null){
			putBodyParameter("PicContent", picContent);
		}
	}

	public String getPicFormat() {
		return this.picFormat;
	}

	public void setPicFormat(String picFormat) {
		this.picFormat = picFormat;
		if(picFormat != null){
			putBodyParameter("PicFormat", picFormat);
		}
	}

	@Override
	public Class<RecognizeImageResponse> getResponseClass() {
		return RecognizeImageResponse.class;
	}

}
