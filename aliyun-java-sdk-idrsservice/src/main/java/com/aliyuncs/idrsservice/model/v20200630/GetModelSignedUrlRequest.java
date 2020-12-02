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

package com.aliyuncs.idrsservice.model.v20200630;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.idrsservice.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetModelSignedUrlRequest extends RpcAcsRequest<GetModelSignedUrlResponse> {
	   

	private List<String> modelPaths;
	public GetModelSignedUrlRequest() {
		super("idrsservice", "2020-06-30", "GetModelSignedUrl", "idrsservice");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getModelPaths() {
		return this.modelPaths;
	}

	public void setModelPaths(List<String> modelPaths) {
		this.modelPaths = modelPaths;	
		if (modelPaths != null) {
			for (int i = 0; i < modelPaths.size(); i++) {
				putBodyParameter("ModelPath." + (i + 1) , modelPaths.get(i));
			}
		}	
	}

	@Override
	public Class<GetModelSignedUrlResponse> getResponseClass() {
		return GetModelSignedUrlResponse.class;
	}

}
