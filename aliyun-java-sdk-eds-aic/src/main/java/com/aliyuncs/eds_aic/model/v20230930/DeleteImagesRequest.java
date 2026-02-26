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

package com.aliyuncs.eds_aic.model.v20230930;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DeleteImagesRequest extends RpcAcsRequest<DeleteImagesResponse> {
	   

	@SerializedName("imageIds")
	private List<String> imageIds;
	public DeleteImagesRequest() {
		super("eds-aic", "2023-09-30", "DeleteImages");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public List<String> getImageIds() {
		return this.imageIds;
	}

	public void setImageIds(List<String> imageIds) {
		this.imageIds = imageIds;	
		if (imageIds != null) {
			putBodyParameter("ImageIds" , new Gson().toJson(imageIds));
		}	
	}

	@Override
	public Class<DeleteImagesResponse> getResponseClass() {
		return DeleteImagesResponse.class;
	}

}
