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

package com.aliyuncs.arms.model.v20190808;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.arms.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListIntegrationRequest extends RpcAcsRequest<ListIntegrationResponse> {
	   

	private Long size;

	private String integrationName;

	private Boolean isDetail;

	private Long page;

	private String integrationProductType;
	public ListIntegrationRequest() {
		super("ARMS", "2019-08-08", "ListIntegration", "arms");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getSize() {
		return this.size;
	}

	public void setSize(Long size) {
		this.size = size;
		if(size != null){
			putQueryParameter("Size", size.toString());
		}
	}

	public String getIntegrationName() {
		return this.integrationName;
	}

	public void setIntegrationName(String integrationName) {
		this.integrationName = integrationName;
		if(integrationName != null){
			putQueryParameter("IntegrationName", integrationName);
		}
	}

	public Boolean getIsDetail() {
		return this.isDetail;
	}

	public void setIsDetail(Boolean isDetail) {
		this.isDetail = isDetail;
		if(isDetail != null){
			putQueryParameter("IsDetail", isDetail.toString());
		}
	}

	public Long getPage() {
		return this.page;
	}

	public void setPage(Long page) {
		this.page = page;
		if(page != null){
			putQueryParameter("Page", page.toString());
		}
	}

	public String getIntegrationProductType() {
		return this.integrationProductType;
	}

	public void setIntegrationProductType(String integrationProductType) {
		this.integrationProductType = integrationProductType;
		if(integrationProductType != null){
			putQueryParameter("IntegrationProductType", integrationProductType);
		}
	}

	@Override
	public Class<ListIntegrationResponse> getResponseClass() {
		return ListIntegrationResponse.class;
	}

}
