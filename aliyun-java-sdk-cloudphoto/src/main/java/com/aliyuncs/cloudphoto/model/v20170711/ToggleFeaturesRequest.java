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

package com.aliyuncs.cloudphoto.model.v20170711;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.ProtocolType;

/**
 * @author auto create
 * @version 
 */
public class ToggleFeaturesRequest extends RpcAcsRequest<ToggleFeaturesResponse> {
	
	public ToggleFeaturesRequest() {
		super("CloudPhoto", "2017-07-11", "ToggleFeatures", "cloudphoto");
		setProtocol(ProtocolType.HTTPS);
	}

	private List<String> disabledFeaturess;

	private String storeName;

	private List<String> enabledFeaturess;

	public List<String> getDisabledFeaturess() {
		return this.disabledFeaturess;
	}

	public void setDisabledFeaturess(List<String> disabledFeaturess) {
		this.disabledFeaturess = disabledFeaturess;	
		if (disabledFeaturess != null) {
			for (int i = 0; i < disabledFeaturess.size(); i++) {
				putQueryParameter("DisabledFeatures." + (i + 1) , disabledFeaturess.get(i));
			}
		}	
	}

	public String getStoreName() {
		return this.storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
		if(storeName != null){
			putQueryParameter("StoreName", storeName);
		}
	}

	public List<String> getEnabledFeaturess() {
		return this.enabledFeaturess;
	}

	public void setEnabledFeaturess(List<String> enabledFeaturess) {
		this.enabledFeaturess = enabledFeaturess;	
		if (enabledFeaturess != null) {
			for (int i = 0; i < enabledFeaturess.size(); i++) {
				putQueryParameter("EnabledFeatures." + (i + 1) , enabledFeaturess.get(i));
			}
		}	
	}

	@Override
	public Class<ToggleFeaturesResponse> getResponseClass() {
		return ToggleFeaturesResponse.class;
	}

}
