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

package com.aliyuncs.smartag_inner.model.v20180313;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class InnerListAccessGatewayLocationsRequest extends RpcAcsRequest<InnerListAccessGatewayLocationsResponse> {
	
	public InnerListAccessGatewayLocationsRequest() {
		super("Smartag-inner", "2018-03-13", "InnerListAccessGatewayLocations", "smartag", "innerAPI");
	}

	private String access_key_id;

	private String accessGatewayInstanceId;

	private String locationId;

	private String pageSize;

	private String pageNumber;

	public String getAccess_key_id() {
		return this.access_key_id;
	}

	public void setAccess_key_id(String access_key_id) {
		this.access_key_id = access_key_id;
		if(access_key_id != null){
			putQueryParameter("access_key_id", access_key_id);
		}
	}

	public String getAccessGatewayInstanceId() {
		return this.accessGatewayInstanceId;
	}

	public void setAccessGatewayInstanceId(String accessGatewayInstanceId) {
		this.accessGatewayInstanceId = accessGatewayInstanceId;
		if(accessGatewayInstanceId != null){
			putQueryParameter("AccessGatewayInstanceId", accessGatewayInstanceId);
		}
	}

	public String getLocationId() {
		return this.locationId;
	}

	public void setLocationId(String locationId) {
		this.locationId = locationId;
		if(locationId != null){
			putQueryParameter("LocationId", locationId);
		}
	}

	public String getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize);
		}
	}

	public String getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(String pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber);
		}
	}

	@Override
	public Class<InnerListAccessGatewayLocationsResponse> getResponseClass() {
		return InnerListAccessGatewayLocationsResponse.class;
	}

}
