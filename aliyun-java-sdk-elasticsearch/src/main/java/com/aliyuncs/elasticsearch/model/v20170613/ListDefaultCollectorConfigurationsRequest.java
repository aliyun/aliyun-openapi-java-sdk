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

package com.aliyuncs.elasticsearch.model.v20170613;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.elasticsearch.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListDefaultCollectorConfigurationsRequest extends RoaAcsRequest<ListDefaultCollectorConfigurationsResponse> {
	   

	private String resType;

	private String resVersion;

	private String sourceType;
	public ListDefaultCollectorConfigurationsRequest() {
		super("elasticsearch", "2017-06-13", "ListDefaultCollectorConfigurations", "elasticsearch");
		setUriPattern("/openapi/beats/default-configurations");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getResType() {
		return this.resType;
	}

	public void setResType(String resType) {
		this.resType = resType;
		if(resType != null){
			putQueryParameter("resType", resType);
		}
	}

	public String getResVersion() {
		return this.resVersion;
	}

	public void setResVersion(String resVersion) {
		this.resVersion = resVersion;
		if(resVersion != null){
			putQueryParameter("resVersion", resVersion);
		}
	}

	public String getSourceType() {
		return this.sourceType;
	}

	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
		if(sourceType != null){
			putQueryParameter("sourceType", sourceType);
		}
	}

	@Override
	public Class<ListDefaultCollectorConfigurationsResponse> getResponseClass() {
		return ListDefaultCollectorConfigurationsResponse.class;
	}

}
