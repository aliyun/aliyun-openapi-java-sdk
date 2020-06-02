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

package com.aliyuncs.datav_outer.model.v20190402;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.datav_outer.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class BatchGetTemplateDataSourcesRequest extends RpcAcsRequest<BatchGetTemplateDataSourcesResponse> {
	   

	private String product;

	private List<Integer> templateIdss;

	private String domain;

	private String version;
	public BatchGetTemplateDataSourcesRequest() {
		super("datav-outer", "2019-04-02", "BatchGetTemplateDataSources", "datav");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getProduct() {
		return this.product;
	}

	public void setProduct(String product) {
		this.product = product;
		if(product != null){
			putBodyParameter("Product", product);
		}
	}

	public List<Integer> getTemplateIdss() {
		return this.templateIdss;
	}

	public void setTemplateIdss(List<Integer> templateIdss) {
		this.templateIdss = templateIdss;	
		if (templateIdss != null) {
			for (int i = 0; i < templateIdss.size(); i++) {
				putBodyParameter("TemplateIds." + (i + 1) , templateIdss.get(i));
			}
		}	
	}

	public String getDomain() {
		return this.domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
		if(domain != null){
			putBodyParameter("Domain", domain);
		}
	}

	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
		if(version != null){
			putBodyParameter("Version", version);
		}
	}

	@Override
	public Class<BatchGetTemplateDataSourcesResponse> getResponseClass() {
		return BatchGetTemplateDataSourcesResponse.class;
	}

}
