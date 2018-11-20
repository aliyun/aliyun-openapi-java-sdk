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

/**
 * @author auto create
 * @version 
 */
public class UploadImageToLibRequest extends RpcAcsRequest<UploadImageToLibResponse> {
	
	public UploadImageToLibRequest() {
		super("Green", "2017-08-23", "UploadImageToLib", "green");
	}

	private String images;

	private String sourceIp;

	private Integer imageLibId;

	public String getImages() {
		return this.images;
	}

	public void setImages(String images) {
		this.images = images;
		if(images != null){
			putQueryParameter("Images", images);
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
