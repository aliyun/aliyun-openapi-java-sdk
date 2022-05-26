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

package com.aliyuncs.amp.model.v20200708;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateAPIRequest extends RoaAcsRequest<CreateAPIResponse> {
	   

	private String customize_config;
	public CreateAPIRequest() {
		super("amp", "2020-07-08", "CreateAPI", "jeepproduct001");
		setUriPattern("/[acd]");
		setMethod(MethodType.GET);
	}

	public String getCustomize_config() {
		return this.customize_config;
	}

	public void setCustomize_config(String customize_config) {
		this.customize_config = customize_config;
		if(customize_config != null){
			putBodyParameter("customize_config", customize_config);
		}
	}

	@Override
	public Class<CreateAPIResponse> getResponseClass() {
		return CreateAPIResponse.class;
	}

}
