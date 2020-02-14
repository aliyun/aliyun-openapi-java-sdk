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

package com.aliyuncs.cloudesl.model.v20190801;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cloudesl.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribePlanogramRailsRequest extends RpcAcsRequest<DescribePlanogramRailsResponse> {
	   

	private String storeId;

	private String layer;

	private Integer pageNumber;

	private String shelf;

	private String railCode;

	private Integer pageSize;
	public DescribePlanogramRailsRequest() {
		super("cloudesl", "2019-08-01", "DescribePlanogramRails", "cloudesl");
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

	public String getLayer() {
		return this.layer;
	}

	public void setLayer(String layer) {
		this.layer = layer;
		if(layer != null){
			putBodyParameter("Layer", layer);
		}
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putBodyParameter("PageNumber", pageNumber.toString());
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

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putBodyParameter("PageSize", pageSize.toString());
		}
	}

	@Override
	public Class<DescribePlanogramRailsResponse> getResponseClass() {
		return DescribePlanogramRailsResponse.class;
	}

}
