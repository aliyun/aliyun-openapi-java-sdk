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

package com.aliyuncs.rsimganalys.model.v20190801;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateImageRequest extends RpcAcsRequest<CreateImageResponse> {
	   

	private String imageList;
	public CreateImageRequest() {
		super("rsimganalys", "2019-08-01", "CreateImage");
		setMethod(MethodType.POST);
	}

	public String getImageList() {
		return this.imageList;
	}

	public void setImageList(String imageList) {
		this.imageList = imageList;
		if(imageList != null){
			putBodyParameter("ImageList", imageList);
		}
	}

	@Override
	public Class<CreateImageResponse> getResponseClass() {
		return CreateImageResponse.class;
	}

}
