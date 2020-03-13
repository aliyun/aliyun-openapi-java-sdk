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

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SaveLinkeBahamutFlagcabinetRequest extends RpcAcsRequest<SaveLinkeBahamutFlagcabinetResponse> {
	   

	private String configKey;

	private String configVal;

	private String keyColumn;

	private String keyVal;
	public SaveLinkeBahamutFlagcabinetRequest() {
		super("SOFA", "2019-08-15", "SaveLinkeBahamutFlagcabinet", "ApplySidecarCert");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getConfigKey() {
		return this.configKey;
	}

	public void setConfigKey(String configKey) {
		this.configKey = configKey;
		if(configKey != null){
			putBodyParameter("ConfigKey", configKey);
		}
	}

	public String getConfigVal() {
		return this.configVal;
	}

	public void setConfigVal(String configVal) {
		this.configVal = configVal;
		if(configVal != null){
			putBodyParameter("ConfigVal", configVal);
		}
	}

	public String getKeyColumn() {
		return this.keyColumn;
	}

	public void setKeyColumn(String keyColumn) {
		this.keyColumn = keyColumn;
		if(keyColumn != null){
			putBodyParameter("KeyColumn", keyColumn);
		}
	}

	public String getKeyVal() {
		return this.keyVal;
	}

	public void setKeyVal(String keyVal) {
		this.keyVal = keyVal;
		if(keyVal != null){
			putBodyParameter("KeyVal", keyVal);
		}
	}

	@Override
	public Class<SaveLinkeBahamutFlagcabinetResponse> getResponseClass() {
		return SaveLinkeBahamutFlagcabinetResponse.class;
	}

}
