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

package com.aliyuncs.imagesearch.model.v20190325;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DeleteImageRequest extends RoaAcsRequest<DeleteImageResponse> {
	
	public DeleteImageRequest() {
		super("ImageSearch", "2019-03-25", "DeleteImage", "imagesearch");
		setUriPattern("/v2/image/delete");
		setMethod(MethodType.POST);
	}

	private String instanceName;

	private String productId;

	private String picName;

	public String getInstanceName() {
		return this.instanceName;
	}

	public void setInstanceName(String instanceName) {
		this.instanceName = instanceName;
		if(instanceName != null){
			putBodyParameter("InstanceName", instanceName);
		}
	}

	public String getProductId() {
		return this.productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
		if(productId != null){
			putBodyParameter("ProductId", productId);
		}
	}

	public String getPicName() {
		return this.picName;
	}

	public void setPicName(String picName) {
		this.picName = picName;
		if(picName != null){
			putBodyParameter("PicName", picName);
		}
	}

	@Override
	public Class<DeleteImageResponse> getResponseClass() {
		return DeleteImageResponse.class;
	}

}
