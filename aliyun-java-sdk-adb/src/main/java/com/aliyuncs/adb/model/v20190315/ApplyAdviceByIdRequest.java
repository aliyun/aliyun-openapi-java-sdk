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

package com.aliyuncs.adb.model.v20190315;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.adb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ApplyAdviceByIdRequest extends RpcAcsRequest<ApplyAdviceByIdResponse> {
	   

	private String adviceId;

	private String dBClusterId;

	private Long adviceDate;
	public ApplyAdviceByIdRequest() {
		super("adb", "2019-03-15", "ApplyAdviceById", "ads");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getAdviceId() {
		return this.adviceId;
	}

	public void setAdviceId(String adviceId) {
		this.adviceId = adviceId;
		if(adviceId != null){
			putQueryParameter("AdviceId", adviceId);
		}
	}

	public String getDBClusterId() {
		return this.dBClusterId;
	}

	public void setDBClusterId(String dBClusterId) {
		this.dBClusterId = dBClusterId;
		if(dBClusterId != null){
			putQueryParameter("DBClusterId", dBClusterId);
		}
	}

	public Long getAdviceDate() {
		return this.adviceDate;
	}

	public void setAdviceDate(Long adviceDate) {
		this.adviceDate = adviceDate;
		if(adviceDate != null){
			putQueryParameter("AdviceDate", adviceDate.toString());
		}
	}

	@Override
	public Class<ApplyAdviceByIdResponse> getResponseClass() {
		return ApplyAdviceByIdResponse.class;
	}

}
