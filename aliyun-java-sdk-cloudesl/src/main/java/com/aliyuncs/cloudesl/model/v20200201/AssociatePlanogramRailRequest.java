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

package com.aliyuncs.cloudesl.model.v20200201;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cloudesl.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class AssociatePlanogramRailRequest extends RpcAcsRequest<AssociatePlanogramRailResponse> {
	   

	private String storeId;

	private Integer layer;

	private String shelf;

	private String railCode;
	public AssociatePlanogramRailRequest() {
		super("cloudesl", "2020-02-01", "AssociatePlanogramRail", "cloudesl");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getStoreId() {
		return this.storeId;
	}

	public void setStoreId(String storeId) {
		this.storeId = storeId;
		if(storeId != null){
			putBodyParameter("StoreId", storeId);
		}
	}

	public Integer getLayer() {
		return this.layer;
	}

	public void setLayer(Integer layer) {
		this.layer = layer;
		if(layer != null){
			putBodyParameter("Layer", layer.toString());
		}
	}

	public String getShelf() {
		return this.shelf;
	}

	public void setShelf(String shelf) {
		this.shelf = shelf;
		if(shelf != null){
			putBodyParameter("Shelf", shelf);
		}
	}

	public String getRailCode() {
		return this.railCode;
	}

	public void setRailCode(String railCode) {
		this.railCode = railCode;
		if(railCode != null){
			putBodyParameter("RailCode", railCode);
		}
	}

	@Override
	public Class<AssociatePlanogramRailResponse> getResponseClass() {
		return AssociatePlanogramRailResponse.class;
	}

}
