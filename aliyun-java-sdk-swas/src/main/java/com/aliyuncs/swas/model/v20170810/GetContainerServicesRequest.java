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

package com.aliyuncs.swas.model.v20170810;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetContainerServicesRequest extends RpcAcsRequest<GetContainerServicesResponse> {
	   

	private String containerServiceIds;

	private Integer pageNumber;

	private String site;

	private Integer pageSize;
	public GetContainerServicesRequest() {
		super("SWAS", "2017-08-10", "GetContainerServices", "SWAS");
		setMethod(MethodType.POST);
	}

	public String getContainerServiceIds() {
		return this.containerServiceIds;
	}

	public void setContainerServiceIds(String containerServiceIds) {
		this.containerServiceIds = containerServiceIds;
		if(containerServiceIds != null){
			putQueryParameter("ContainerServiceIds", containerServiceIds);
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

	public String getSite() {
		return this.site;
	}

	public void setSite(String site) {
		this.site = site;
		if(site != null){
			putQueryParameter("Site", site);
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

	@Override
	public Class<GetContainerServicesResponse> getResponseClass() {
		return GetContainerServicesResponse.class;
	}

}
