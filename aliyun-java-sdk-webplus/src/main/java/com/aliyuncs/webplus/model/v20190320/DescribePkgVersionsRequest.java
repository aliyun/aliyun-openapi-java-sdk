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

package com.aliyuncs.webplus.model.v20190320;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.webplus.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribePkgVersionsRequest extends RoaAcsRequest<DescribePkgVersionsResponse> {
	
	public DescribePkgVersionsRequest() {
		super("WebPlus", "2019-03-20", "DescribePkgVersions", "webx");
		setUriPattern("/pop/v1/wam/pkgVersion");
		setMethod(MethodType.GET);
		try {
			this.getClass().getDeclaredField("ProductEndpointMap").set(this, Endpoint.endpointMap);
			this.getClass().getDeclaredField("ProductEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private String pkgVersionLabel;

	private String appId;

	private Integer pageSize;

	private String pkgVersionSearch;

	private Integer pageNumber;

	public String getPkgVersionLabel() {
		return this.pkgVersionLabel;
	}

	public void setPkgVersionLabel(String pkgVersionLabel) {
		this.pkgVersionLabel = pkgVersionLabel;
		if(pkgVersionLabel != null){
			putQueryParameter("PkgVersionLabel", pkgVersionLabel);
		}
	}

	public String getAppId() {
		return this.appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
		if(appId != null){
			putQueryParameter("AppId", appId);
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public String getPkgVersionSearch() {
		return this.pkgVersionSearch;
	}

	public void setPkgVersionSearch(String pkgVersionSearch) {
		this.pkgVersionSearch = pkgVersionSearch;
		if(pkgVersionSearch != null){
			putQueryParameter("PkgVersionSearch", pkgVersionSearch);
		}
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
		}
	}

	@Override
	public Class<DescribePkgVersionsResponse> getResponseClass() {
		return DescribePkgVersionsResponse.class;
	}

}
