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

package com.aliyuncs.sae.model.v20190506;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sae.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeConfigMapRequest extends RoaAcsRequest<DescribeConfigMapResponse> {
	   

	private Long configMapId;
	public DescribeConfigMapRequest() {
		super("sae", "2019-05-06", "DescribeConfigMap", "serverless");
		setUriPattern("/pop/v1/sam/configmap/configMap");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getConfigMapId() {
		return this.configMapId;
	}

	public void setConfigMapId(Long configMapId) {
		this.configMapId = configMapId;
		if(configMapId != null){
			putQueryParameter("ConfigMapId", configMapId.toString());
		}
	}

	@Override
	public Class<DescribeConfigMapResponse> getResponseClass() {
		return DescribeConfigMapResponse.class;
	}

}
