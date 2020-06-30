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

package com.aliyuncs.sls.model.v20180613;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sls.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class AnalyzeProductLogRequest extends RpcAcsRequest<AnalyzeProductLogResponse> {
	   

	private String project;

	private String cloudProduct;

	private String resourceQuota;

	private Integer tTL;

	private String region;

	private String lang;

	private String logstore;

	private Boolean overwrite;
	public AnalyzeProductLogRequest() {
		super("Sls", "2018-06-13", "AnalyzeProductLog");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getProject() {
		return this.project;
	}

	public void setProject(String project) {
		this.project = project;
		if(project != null){
			putQueryParameter("Project", project);
		}
	}

	public String getCloudProduct() {
		return this.cloudProduct;
	}

	public void setCloudProduct(String cloudProduct) {
		this.cloudProduct = cloudProduct;
		if(cloudProduct != null){
			putQueryParameter("CloudProduct", cloudProduct);
		}
	}

	public String getResourceQuota() {
		return this.resourceQuota;
	}

	public void setResourceQuota(String resourceQuota) {
		this.resourceQuota = resourceQuota;
		if(resourceQuota != null){
			putQueryParameter("ResourceQuota", resourceQuota);
		}
	}

	public Integer getTTL() {
		return this.tTL;
	}

	public void setTTL(Integer tTL) {
		this.tTL = tTL;
		if(tTL != null){
			putQueryParameter("TTL", tTL.toString());
		}
	}

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
		if(region != null){
			putQueryParameter("Region", region);
		}
	}

	public String getLang() {
		return this.lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
		if(lang != null){
			putQueryParameter("Lang", lang);
		}
	}

	public String getLogstore() {
		return this.logstore;
	}

	public void setLogstore(String logstore) {
		this.logstore = logstore;
		if(logstore != null){
			putQueryParameter("Logstore", logstore);
		}
	}

	public Boolean getOverwrite() {
		return this.overwrite;
	}

	public void setOverwrite(Boolean overwrite) {
		this.overwrite = overwrite;
		if(overwrite != null){
			putQueryParameter("Overwrite", overwrite.toString());
		}
	}

	@Override
	public Class<AnalyzeProductLogResponse> getResponseClass() {
		return AnalyzeProductLogResponse.class;
	}

}
