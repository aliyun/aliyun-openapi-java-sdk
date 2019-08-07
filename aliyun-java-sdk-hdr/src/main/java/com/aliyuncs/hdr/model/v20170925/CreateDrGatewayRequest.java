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

package com.aliyuncs.hdr.model.v20170925;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.hdr.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateDrGatewayRequest extends RpcAcsRequest<CreateDrGatewayResponse> {
	
	public CreateDrGatewayRequest() {
		super("hdr", "2017-09-25", "CreateDrGateway", "hdr");
		try {
			this.getClass().getDeclaredField("ProductEndpointMap").set(this, Endpoint.endpointMap);
			this.getClass().getDeclaredField("ProductEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private String imageType;

	private String name;

	private String siteId;

	private String description;

	public String getImageType() {
		return this.imageType;
	}

	public void setImageType(String imageType) {
		this.imageType = imageType;
		if(imageType != null){
			putQueryParameter("ImageType", imageType);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public String getSiteId() {
		return this.siteId;
	}

	public void setSiteId(String siteId) {
		this.siteId = siteId;
		if(siteId != null){
			putQueryParameter("SiteId", siteId);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	@Override
	public Class<CreateDrGatewayResponse> getResponseClass() {
		return CreateDrGatewayResponse.class;
	}

}
