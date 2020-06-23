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

package com.aliyuncs.domain.model.v20180129;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.domain.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateDomainToDomainGroupRequest extends RpcAcsRequest<UpdateDomainToDomainGroupResponse> {
	   

	private String fileToUpload;

	private List<String> domainNames;

	private Boolean replace;

	private Long domainGroupId;

	private Integer dataSource;

	private String userClientIp;

	private String lang;
	public UpdateDomainToDomainGroupRequest() {
		super("Domain", "2018-01-29", "UpdateDomainToDomainGroup", "domain");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getFileToUpload() {
		return this.fileToUpload;
	}

	public void setFileToUpload(String fileToUpload) {
		this.fileToUpload = fileToUpload;
		if(fileToUpload != null){
			putBodyParameter("FileToUpload", fileToUpload);
		}
	}

	public List<String> getDomainNames() {
		return this.domainNames;
	}

	public void setDomainNames(List<String> domainNames) {
		this.domainNames = domainNames;	
		if (domainNames != null) {
			for (int i = 0; i < domainNames.size(); i++) {
				putQueryParameter("DomainName." + (i + 1) , domainNames.get(i));
			}
		}	
	}

	public Boolean getReplace() {
		return this.replace;
	}

	public void setReplace(Boolean replace) {
		this.replace = replace;
		if(replace != null){
			putQueryParameter("Replace", replace.toString());
		}
	}

	public Long getDomainGroupId() {
		return this.domainGroupId;
	}

	public void setDomainGroupId(Long domainGroupId) {
		this.domainGroupId = domainGroupId;
		if(domainGroupId != null){
			putQueryParameter("DomainGroupId", domainGroupId.toString());
		}
	}

	public Integer getDataSource() {
		return this.dataSource;
	}

	public void setDataSource(Integer dataSource) {
		this.dataSource = dataSource;
		if(dataSource != null){
			putQueryParameter("DataSource", dataSource.toString());
		}
	}

	public String getUserClientIp() {
		return this.userClientIp;
	}

	public void setUserClientIp(String userClientIp) {
		this.userClientIp = userClientIp;
		if(userClientIp != null){
			putQueryParameter("UserClientIp", userClientIp);
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

	@Override
	public Class<UpdateDomainToDomainGroupResponse> getResponseClass() {
		return UpdateDomainToDomainGroupResponse.class;
	}

}
