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

package com.aliyuncs.eas.model.v20180522;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ModifyServiceVersionRequest extends RoaAcsRequest<ModifyServiceVersionResponse> {
	   

	private String service_name;

	private String region;
	public ModifyServiceVersionRequest() {
		super("eas", "2018-05-22", "ModifyServiceVersion");
		setUriPattern("/api/services/[region]/[service_name]/version");
		setMethod(MethodType.POST);
	}

	public String getService_name() {
		return this.service_name;
	}

	public void setService_name(String service_name) {
		this.service_name = service_name;
		if(service_name != null){
			putPathParameter("service_name", service_name);
		}
	}

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
		if(region != null){
			putPathParameter("region", region);
		}
	}

	@Override
	public Class<ModifyServiceVersionResponse> getResponseClass() {
		return ModifyServiceVersionResponse.class;
	}

}
