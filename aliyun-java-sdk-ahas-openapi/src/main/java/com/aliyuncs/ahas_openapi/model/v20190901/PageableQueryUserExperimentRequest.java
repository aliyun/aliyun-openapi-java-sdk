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

package com.aliyuncs.ahas_openapi.model.v20190901;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ahas_openapi.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class PageableQueryUserExperimentRequest extends RpcAcsRequest<PageableQueryUserExperimentResponse> {
	   

	private String searchKey;

	private String ahasRegionId;

	private List<String> tagss;

	private Integer size;

	private String namespace;

	private String state;

	private Integer page;

	private List<String> resultss;

	private String workspaceId;
	public PageableQueryUserExperimentRequest() {
		super("ahas-openapi", "2019-09-01", "PageableQueryUserExperiment", "ahas");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSearchKey() {
		return this.searchKey;
	}

	public void setSearchKey(String searchKey) {
		this.searchKey = searchKey;
		if(searchKey != null){
			putQueryParameter("SearchKey", searchKey);
		}
	}

	public String getAhasRegionId() {
		return this.ahasRegionId;
	}

	public void setAhasRegionId(String ahasRegionId) {
		this.ahasRegionId = ahasRegionId;
		if(ahasRegionId != null){
			putQueryParameter("AhasRegionId", ahasRegionId);
		}
	}

	public List<String> getTagss() {
		return this.tagss;
	}

	public void setTagss(List<String> tagss) {
		this.tagss = tagss;	
		if (tagss != null) {
			for (int i = 0; i < tagss.size(); i++) {
				putQueryParameter("Tags." + (i + 1) , tagss.get(i));
			}
		}	
	}

	public Integer getSize() {
		return this.size;
	}

	public void setSize(Integer size) {
		this.size = size;
		if(size != null){
			putQueryParameter("Size", size.toString());
		}
	}

	public String getNamespace() {
		return this.namespace;
	}

	public void setNamespace(String namespace) {
		this.namespace = namespace;
		if(namespace != null){
			putQueryParameter("Namespace", namespace);
		}
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
		if(state != null){
			putQueryParameter("State", state);
		}
	}

	public Integer getPage() {
		return this.page;
	}

	public void setPage(Integer page) {
		this.page = page;
		if(page != null){
			putQueryParameter("Page", page.toString());
		}
	}

	public List<String> getResultss() {
		return this.resultss;
	}

	public void setResultss(List<String> resultss) {
		this.resultss = resultss;	
		if (resultss != null) {
			for (int i = 0; i < resultss.size(); i++) {
				putQueryParameter("Results." + (i + 1) , resultss.get(i));
			}
		}	
	}

	public String getWorkspaceId() {
		return this.workspaceId;
	}

	public void setWorkspaceId(String workspaceId) {
		this.workspaceId = workspaceId;
		if(workspaceId != null){
			putQueryParameter("WorkspaceId", workspaceId);
		}
	}

	@Override
	public Class<PageableQueryUserExperimentResponse> getResponseClass() {
		return PageableQueryUserExperimentResponse.class;
	}

}
