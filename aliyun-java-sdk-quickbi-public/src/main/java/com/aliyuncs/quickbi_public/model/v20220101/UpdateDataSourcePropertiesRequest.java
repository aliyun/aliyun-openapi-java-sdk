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

package com.aliyuncs.quickbi_public.model.v20220101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UpdateDataSourcePropertiesRequest extends RpcAcsRequest<UpdateDataSourcePropertiesResponse> {
	   

	private String dsId;

	private String description;

	private String showName;

	private String quickBIOwnerId;
	public UpdateDataSourcePropertiesRequest() {
		super("quickbi-public", "2022-01-01", "UpdateDataSourceProperties", "QuickBI");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public String getDsId() {
		return this.dsId;
	}

	public void setDsId(String dsId) {
		this.dsId = dsId;
		if(dsId != null){
			putQueryParameter("DsId", dsId);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public String getShowName() {
		return this.showName;
	}

	public void setShowName(String showName) {
		this.showName = showName;
		if(showName != null){
			putQueryParameter("ShowName", showName);
		}
	}

	public String getQuickBIOwnerId() {
		return this.quickBIOwnerId;
	}

	public void setQuickBIOwnerId(String quickBIOwnerId) {
		this.quickBIOwnerId = quickBIOwnerId;
		if(quickBIOwnerId != null){
			putQueryParameter("QuickBIOwnerId", quickBIOwnerId);
		}
	}

	@Override
	public Class<UpdateDataSourcePropertiesResponse> getResponseClass() {
		return UpdateDataSourcePropertiesResponse.class;
	}

}
