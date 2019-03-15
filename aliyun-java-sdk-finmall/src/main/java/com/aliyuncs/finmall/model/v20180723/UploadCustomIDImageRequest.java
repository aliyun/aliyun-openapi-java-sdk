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

package com.aliyuncs.finmall.model.v20180723;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UploadCustomIDImageRequest extends RpcAcsRequest<UploadCustomIDImageResponse> {
	
	public UploadCustomIDImageRequest() {
		super("finmall", "2018-07-23", "UploadCustomIDImage", "finmall");
		setMethod(MethodType.POST);
	}

	private String imageType;

	private String side;

	private String imageFile;

	private String userId;

	public String getImageType() {
		return this.imageType;
	}

	public void setImageType(String imageType) {
		this.imageType = imageType;
		if(imageType != null){
			putBodyParameter("ImageType", imageType);
		}
	}

	public String getSide() {
		return this.side;
	}

	public void setSide(String side) {
		this.side = side;
		if(side != null){
			putBodyParameter("Side", side);
		}
	}

	public String getImageFile() {
		return this.imageFile;
	}

	public void setImageFile(String imageFile) {
		this.imageFile = imageFile;
		if(imageFile != null){
			putBodyParameter("ImageFile", imageFile);
		}
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
		if(userId != null){
			putBodyParameter("UserId", userId);
		}
	}

	@Override
	public Class<UploadCustomIDImageResponse> getResponseClass() {
		return UploadCustomIDImageResponse.class;
	}

}
