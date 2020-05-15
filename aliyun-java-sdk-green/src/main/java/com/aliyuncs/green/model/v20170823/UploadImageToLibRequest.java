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
import com.aliyuncs.green.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UploadImageToLibRequest extends RpcAcsRequest<UploadImageToLibResponse> {
	   

	private String images;

	private String urls;

	private String sourceIp;

	private Integer imageLibId;
	public UploadImageToLibRequest() {
		super("Green", "2017-08-23", "UploadImageToLib", "green");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getImages() {
		return this.images;
	}

	public void setImages(String images) {
		this.images = images;
		if(images != null){
			putQueryParameter("Images", images);
		}
	}

	public String getUrls() {
		return this.urls;
	}

	public void setUrls(String urls) {
		this.urls = urls;
		if(urls != null){
			putQueryParameter("Urls", urls);
		}
	}

	public String getSourceIp() {
		return this.sourceIp;
	}

	public void setSourceIp(String sourceIp) {
		this.sourceIp = sourceIp;
		if(sourceIp != null){
			putQueryParameter("SourceIp", sourceIp);
		}
	}

	public Integer getImageLibId() {
		return this.imageLibId;
	}

	public void setImageLibId(Integer imageLibId) {
		this.imageLibId = imageLibId;
		if(imageLibId != null){
			putQueryParameter("ImageLibId", imageLibId.toString());
		}
	}

	@Override
	public Class<UploadImageToLibResponse> getResponseClass() {
		return UploadImageToLibResponse.class;
	}

}
