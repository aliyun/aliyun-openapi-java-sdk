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

package com.aliyuncs.linkvisual.model.v20180120;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.linkvisual.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListModelsByPageRequest extends RpcAcsRequest<ListModelsByPageResponse> {
	   

	private String modelPackageStandard;

	private String namePattern;

	private Integer pageSize;

	private Long algorithmId;

	private String hardware;

	private Integer currentPage;

	private String sizeType;
	public ListModelsByPageRequest() {
		super("Linkvisual", "2018-01-20", "ListModelsByPage", "Linkvisual");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getModelPackageStandard() {
		return this.modelPackageStandard;
	}

	public void setModelPackageStandard(String modelPackageStandard) {
		this.modelPackageStandard = modelPackageStandard;
		if(modelPackageStandard != null){
			putQueryParameter("ModelPackageStandard", modelPackageStandard);
		}
	}

	public String getNamePattern() {
		return this.namePattern;
	}

	public void setNamePattern(String namePattern) {
		this.namePattern = namePattern;
		if(namePattern != null){
			putQueryParameter("NamePattern", namePattern);
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

	public Long getAlgorithmId() {
		return this.algorithmId;
	}

	public void setAlgorithmId(Long algorithmId) {
		this.algorithmId = algorithmId;
		if(algorithmId != null){
			putQueryParameter("AlgorithmId", algorithmId.toString());
		}
	}

	public String getHardware() {
		return this.hardware;
	}

	public void setHardware(String hardware) {
		this.hardware = hardware;
		if(hardware != null){
			putQueryParameter("Hardware", hardware);
		}
	}

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
		if(currentPage != null){
			putQueryParameter("CurrentPage", currentPage.toString());
		}
	}

	public String getSizeType() {
		return this.sizeType;
	}

	public void setSizeType(String sizeType) {
		this.sizeType = sizeType;
		if(sizeType != null){
			putQueryParameter("SizeType", sizeType);
		}
	}

	@Override
	public Class<ListModelsByPageResponse> getResponseClass() {
		return ListModelsByPageResponse.class;
	}

}
