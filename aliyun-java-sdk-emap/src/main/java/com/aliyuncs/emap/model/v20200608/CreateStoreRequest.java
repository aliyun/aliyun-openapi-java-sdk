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

package com.aliyuncs.emap.model.v20200608;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateStoreRequest extends RpcAcsRequest<CreateStoreResponse> {
	   

	private Float height;

	private String address;

	private String center;

	private String name;

	private Float width;

	private String extId;

	private String desc;
	public CreateStoreRequest() {
		super("emap", "2020-06-08", "CreateStore");
		setMethod(MethodType.POST);
	}

	public Float getHeight() {
		return this.height;
	}

	public void setHeight(Float height) {
		this.height = height;
		if(height != null){
			putBodyParameter("Height", height.toString());
		}
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
		if(address != null){
			putBodyParameter("Address", address);
		}
	}

	public String getCenter() {
		return this.center;
	}

	public void setCenter(String center) {
		this.center = center;
		if(center != null){
			putBodyParameter("Center", center);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putBodyParameter("Name", name);
		}
	}

	public Float getWidth() {
		return this.width;
	}

	public void setWidth(Float width) {
		this.width = width;
		if(width != null){
			putBodyParameter("Width", width.toString());
		}
	}

	public String getExtId() {
		return this.extId;
	}

	public void setExtId(String extId) {
		this.extId = extId;
		if(extId != null){
			putBodyParameter("ExtId", extId);
		}
	}

	public String getDesc() {
		return this.desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
		if(desc != null){
			putBodyParameter("Desc", desc);
		}
	}

	@Override
	public Class<CreateStoreResponse> getResponseClass() {
		return CreateStoreResponse.class;
	}

}
