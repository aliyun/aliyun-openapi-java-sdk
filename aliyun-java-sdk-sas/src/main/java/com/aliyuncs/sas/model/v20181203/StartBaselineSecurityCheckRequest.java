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

package com.aliyuncs.sas.model.v20181203;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class StartBaselineSecurityCheckRequest extends RpcAcsRequest<StartBaselineSecurityCheckResponse> {
	   

	private Long resourceOwnerId;

	private List<Long> itemIdss;

	private String type;

	private List<String> assetss;

	private String sourceIp;

	private String lang;
	public StartBaselineSecurityCheckRequest() {
		super("Sas", "2018-12-03", "StartBaselineSecurityCheck", "sas");
		setMethod(MethodType.POST);
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public List<Long> getItemIdss() {
		return this.itemIdss;
	}

	public void setItemIdss(List<Long> itemIdss) {
		this.itemIdss = itemIdss;	
		if (itemIdss != null) {
			for (int i = 0; i < itemIdss.size(); i++) {
				putQueryParameter("ItemIds." + (i + 1) , itemIdss.get(i));
			}
		}	
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putQueryParameter("Type", type);
		}
	}

	public List<String> getAssetss() {
		return this.assetss;
	}

	public void setAssetss(List<String> assetss) {
		this.assetss = assetss;	
		if (assetss != null) {
			for (int i = 0; i < assetss.size(); i++) {
				putQueryParameter("Assets." + (i + 1) , assetss.get(i));
			}
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

	@Override
	public Class<StartBaselineSecurityCheckResponse> getResponseClass() {
		return StartBaselineSecurityCheckResponse.class;
	}

}
