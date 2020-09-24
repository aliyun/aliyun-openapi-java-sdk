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

package com.aliyuncs.sales_leads.model.v20200907;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateStrategyRequest extends RpcAcsRequest<CreateStrategyResponse> {
	   

	private String creator;

	private Integer contentSource;

	private String name;

	private String newCustRoute;

	private Integer producerId;

	private Integer type;

	private String domainCodes;

	private Integer status;
	public CreateStrategyRequest() {
		super("sales-leads", "2020-09-07", "CreateStrategy");
		setMethod(MethodType.POST);
	}

	public String getCreator() {
		return this.creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
		if(creator != null){
			putQueryParameter("Creator", creator);
		}
	}

	public Integer getContentSource() {
		return this.contentSource;
	}

	public void setContentSource(Integer contentSource) {
		this.contentSource = contentSource;
		if(contentSource != null){
			putQueryParameter("ContentSource", contentSource.toString());
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

	public String getNewCustRoute() {
		return this.newCustRoute;
	}

	public void setNewCustRoute(String newCustRoute) {
		this.newCustRoute = newCustRoute;
		if(newCustRoute != null){
			putQueryParameter("NewCustRoute", newCustRoute);
		}
	}

	public Integer getProducerId() {
		return this.producerId;
	}

	public void setProducerId(Integer producerId) {
		this.producerId = producerId;
		if(producerId != null){
			putQueryParameter("ProducerId", producerId.toString());
		}
	}

	public Integer getType() {
		return this.type;
	}

	public void setType(Integer type) {
		this.type = type;
		if(type != null){
			putQueryParameter("Type", type.toString());
		}
	}

	public String getDomainCodes() {
		return this.domainCodes;
	}

	public void setDomainCodes(String domainCodes) {
		this.domainCodes = domainCodes;
		if(domainCodes != null){
			putQueryParameter("DomainCodes", domainCodes);
		}
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
		if(status != null){
			putQueryParameter("Status", status.toString());
		}
	}

	@Override
	public Class<CreateStrategyResponse> getResponseClass() {
		return CreateStrategyResponse.class;
	}

}
