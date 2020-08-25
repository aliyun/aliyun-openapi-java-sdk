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

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetLinkeBahamutIterationsgetunitsRequest extends RpcAcsRequest<GetLinkeBahamutIterationsgetunitsResponse> {
	   

	private String withDeleted;

	private String current;

	private String pageSize;

	private String id;
	public GetLinkeBahamutIterationsgetunitsRequest() {
		super("SOFA", "2019-08-15", "GetLinkeBahamutIterationsgetunits", "sofa");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getWithDeleted() {
		return this.withDeleted;
	}

	public void setWithDeleted(String withDeleted) {
		this.withDeleted = withDeleted;
		if(withDeleted != null){
			putBodyParameter("WithDeleted", withDeleted);
		}
	}

	public String getCurrent() {
		return this.current;
	}

	public void setCurrent(String current) {
		this.current = current;
		if(current != null){
			putBodyParameter("Current", current);
		}
	}

	public String getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putBodyParameter("PageSize", pageSize);
		}
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
		if(id != null){
			putBodyParameter("Id", id);
		}
	}

	@Override
	public Class<GetLinkeBahamutIterationsgetunitsResponse> getResponseClass() {
		return GetLinkeBahamutIterationsgetunitsResponse.class;
	}

}
