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

package com.aliyuncs.openanalytics_open.model.v20180619;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.openanalytics_open.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetEndPointRequest extends RpcAcsRequest<GetEndPointResponse> {
	   

	private String endPointID;
	public GetEndPointRequest() {
		super("openanalytics-open", "2018-06-19", "GetEndPoint", "openanalytics");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getEndPointID() {
		return this.endPointID;
	}

	public void setEndPointID(String endPointID) {
		this.endPointID = endPointID;
		if(endPointID != null){
			putBodyParameter("EndPointID", endPointID);
		}
	}

	@Override
	public Class<GetEndPointResponse> getResponseClass() {
		return GetEndPointResponse.class;
	}

}
