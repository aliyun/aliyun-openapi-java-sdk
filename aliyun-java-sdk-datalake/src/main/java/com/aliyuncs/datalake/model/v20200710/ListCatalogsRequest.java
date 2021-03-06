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

package com.aliyuncs.datalake.model.v20200710;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.datalake.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListCatalogsRequest extends RoaAcsRequest<ListCatalogsResponse> {
	   

	private String nextPageToken;

	private Integer pageSize;

	private String idPattern;
	public ListCatalogsRequest() {
		super("DataLake", "2020-07-10", "ListCatalogs");
		setUriPattern("/api/metastore/catalogs/list");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getNextPageToken() {
		return this.nextPageToken;
	}

	public void setNextPageToken(String nextPageToken) {
		this.nextPageToken = nextPageToken;
		if(nextPageToken != null){
			putQueryParameter("NextPageToken", nextPageToken);
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

	public String getIdPattern() {
		return this.idPattern;
	}

	public void setIdPattern(String idPattern) {
		this.idPattern = idPattern;
		if(idPattern != null){
			putQueryParameter("IdPattern", idPattern);
		}
	}

	@Override
	public Class<ListCatalogsResponse> getResponseClass() {
		return ListCatalogsResponse.class;
	}

}
