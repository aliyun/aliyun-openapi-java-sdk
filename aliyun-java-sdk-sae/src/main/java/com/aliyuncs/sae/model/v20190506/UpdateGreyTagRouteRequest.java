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

package com.aliyuncs.sae.model.v20190506;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sae.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateGreyTagRouteRequest extends RoaAcsRequest<UpdateGreyTagRouteResponse> {
	   

	private Long greyTagRouteId;

	private String description;

	private String dubboRules;

	private String albRules;

	private String scRules;
	public UpdateGreyTagRouteRequest() {
		super("sae", "2019-05-06", "UpdateGreyTagRoute", "serverless");
		setUriPattern("/pop/v1/sam/tagroute/greyTagRoute");
		setMethod(MethodType.PUT);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getGreyTagRouteId() {
		return this.greyTagRouteId;
	}

	public void setGreyTagRouteId(Long greyTagRouteId) {
		this.greyTagRouteId = greyTagRouteId;
		if(greyTagRouteId != null){
			putQueryParameter("GreyTagRouteId", greyTagRouteId.toString());
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

	public String getDubboRules() {
		return this.dubboRules;
	}

	public void setDubboRules(String dubboRules) {
		this.dubboRules = dubboRules;
		if(dubboRules != null){
			putQueryParameter("DubboRules", dubboRules);
		}
	}

	public String getAlbRules() {
		return this.albRules;
	}

	public void setAlbRules(String albRules) {
		this.albRules = albRules;
		if(albRules != null){
			putQueryParameter("AlbRules", albRules);
		}
	}

	public String getScRules() {
		return this.scRules;
	}

	public void setScRules(String scRules) {
		this.scRules = scRules;
		if(scRules != null){
			putQueryParameter("ScRules", scRules);
		}
	}

	@Override
	public Class<UpdateGreyTagRouteResponse> getResponseClass() {
		return UpdateGreyTagRouteResponse.class;
	}

}
