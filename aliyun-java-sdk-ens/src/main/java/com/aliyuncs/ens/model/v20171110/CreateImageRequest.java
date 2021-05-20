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

package com.aliyuncs.ens.model.v20171110;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateImageRequest extends RpcAcsRequest<CreateImageResponse> {
	   

	private String instanceId;

	private String deleteAfterImageUpload;

	private String imageName;

	private String product;
	public CreateImageRequest() {
		super("Ens", "2017-11-10", "CreateImage", "ens");
		setMethod(MethodType.POST);
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public String getDeleteAfterImageUpload() {
		return this.deleteAfterImageUpload;
	}

	public void setDeleteAfterImageUpload(String deleteAfterImageUpload) {
		this.deleteAfterImageUpload = deleteAfterImageUpload;
		if(deleteAfterImageUpload != null){
			putQueryParameter("DeleteAfterImageUpload", deleteAfterImageUpload);
		}
	}

	public String getImageName() {
		return this.imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
		if(imageName != null){
			putQueryParameter("ImageName", imageName);
		}
	}

	public String getProduct() {
		return this.product;
	}

	public void setProduct(String product) {
		this.product = product;
		if(product != null){
			putQueryParameter("product", product);
		}
	}

	@Override
	public Class<CreateImageResponse> getResponseClass() {
		return CreateImageResponse.class;
	}

}
