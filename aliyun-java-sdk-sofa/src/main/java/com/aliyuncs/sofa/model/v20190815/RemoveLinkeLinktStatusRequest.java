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
public class RemoveLinkeLinktStatusRequest extends RpcAcsRequest<RemoveLinkeLinktStatusResponse> {
	   

	private Long statusId;

	private String statusConvertMap;
	public RemoveLinkeLinktStatusRequest() {
		super("SOFA", "2019-08-15", "RemoveLinkeLinktStatus", "ApplySidecarCert");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getStatusId() {
		return this.statusId;
	}

	public void setStatusId(Long statusId) {
		this.statusId = statusId;
		if(statusId != null){
			putBodyParameter("StatusId", statusId.toString());
		}
	}

	public String getStatusConvertMap() {
		return this.statusConvertMap;
	}

	public void setStatusConvertMap(String statusConvertMap) {
		this.statusConvertMap = statusConvertMap;
		if(statusConvertMap != null){
			putBodyParameter("StatusConvertMap", statusConvertMap);
		}
	}

	@Override
	public Class<RemoveLinkeLinktStatusResponse> getResponseClass() {
		return RemoveLinkeLinktStatusResponse.class;
	}

}
