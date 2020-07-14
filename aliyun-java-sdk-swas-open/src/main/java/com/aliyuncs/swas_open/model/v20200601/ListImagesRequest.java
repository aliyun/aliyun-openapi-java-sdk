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

package com.aliyuncs.swas_open.model.v20200601;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListImagesRequest extends RpcAcsRequest<ListImagesResponse> {
	   

	private String imageType;

	private Boolean custom;

	private String imageIds;
	public ListImagesRequest() {
		super("SWAS-OPEN", "2020-06-01", "ListImages");
		setMethod(MethodType.POST);
	}

	public String getImageType() {
		return this.imageType;
	}

	public void setImageType(String imageType) {
		this.imageType = imageType;
		if(imageType != null){
			putQueryParameter("ImageType", imageType);
		}
	}

	public Boolean getCustom() {
		return this.custom;
	}

	public void setCustom(Boolean custom) {
		this.custom = custom;
		if(custom != null){
			putQueryParameter("Custom", custom.toString());
		}
	}

	public String getImageIds() {
		return this.imageIds;
	}

	public void setImageIds(String imageIds) {
		this.imageIds = imageIds;
		if(imageIds != null){
			putQueryParameter("ImageIds", imageIds);
		}
	}

	@Override
	public Class<ListImagesResponse> getResponseClass() {
		return ListImagesResponse.class;
	}

}
