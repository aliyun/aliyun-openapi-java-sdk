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

package com.aliyuncs.green.model.v20170823;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.green.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateWebsiteInstanceRequest extends RpcAcsRequest<UpdateWebsiteInstanceResponse> {
	   

	private String indexPage;

	private String sourceIp;

	private String lang;

	private Integer websiteScanInterval;

	private String siteProtocol;

	private String instanceId;

	private String domain;

	private Integer indexPageScanInterval;
	public UpdateWebsiteInstanceRequest() {
		super("Green", "2017-08-23", "UpdateWebsiteInstance", "green");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getIndexPage() {
		return this.indexPage;
	}

	public void setIndexPage(String indexPage) {
		this.indexPage = indexPage;
		if(indexPage != null){
			putQueryParameter("IndexPage", indexPage);
		}
	}

	public String getSourceIp() {
		return this.sourceIp;
	}

	public void setSourceIp(String sourceIp) {
		this.sourceIp = sourceIp;
		if(sourceIp != null){
			putQueryParameter("SourceIp", sourceIp);
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

	public Integer getWebsiteScanInterval() {
		return this.websiteScanInterval;
	}

	public void setWebsiteScanInterval(Integer websiteScanInterval) {
		this.websiteScanInterval = websiteScanInterval;
		if(websiteScanInterval != null){
			putQueryParameter("WebsiteScanInterval", websiteScanInterval.toString());
		}
	}

	public String getSiteProtocol() {
		return this.siteProtocol;
	}

	public void setSiteProtocol(String siteProtocol) {
		this.siteProtocol = siteProtocol;
		if(siteProtocol != null){
			putQueryParameter("SiteProtocol", siteProtocol);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public String getBizDomain() {
		return this.domain;
	}

	public void setBizDomain(String domain) {
		this.domain = domain;
		if(domain != null){
			putQueryParameter("Domain", domain);
		}
	}

	/**
	 * @deprecated use getBizDomain instead of this.
	 */
	@Deprecated
	public String getDomain() {
		return this.domain;
	}

	/**
	 * @deprecated use setBizDomain instead of this.
	 */
	@Deprecated
	public void setDomain(String domain) {
		this.domain = domain;
		if(domain != null){
			putQueryParameter("Domain", domain);
		}
	}

	public Integer getIndexPageScanInterval() {
		return this.indexPageScanInterval;
	}

	public void setIndexPageScanInterval(Integer indexPageScanInterval) {
		this.indexPageScanInterval = indexPageScanInterval;
		if(indexPageScanInterval != null){
			putQueryParameter("IndexPageScanInterval", indexPageScanInterval.toString());
		}
	}

	@Override
	public Class<UpdateWebsiteInstanceResponse> getResponseClass() {
		return UpdateWebsiteInstanceResponse.class;
	}

}
