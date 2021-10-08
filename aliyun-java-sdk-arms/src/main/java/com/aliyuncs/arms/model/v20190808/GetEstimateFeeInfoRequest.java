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

package com.aliyuncs.arms.model.v20190808;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.arms.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetEstimateFeeInfoRequest extends RpcAcsRequest<GetEstimateFeeInfoResponse> {
	   

	private Long usageCn;

	private Long usageFn;

	private String targetUserId;
	public GetEstimateFeeInfoRequest() {
		super("ARMS", "2019-08-08", "GetEstimateFeeInfo", "arms");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getUsageCn() {
		return this.usageCn;
	}

	public void setUsageCn(Long usageCn) {
		this.usageCn = usageCn;
		if(usageCn != null){
			putQueryParameter("UsageCn", usageCn.toString());
		}
	}

	public Long getUsageFn() {
		return this.usageFn;
	}

	public void setUsageFn(Long usageFn) {
		this.usageFn = usageFn;
		if(usageFn != null){
			putQueryParameter("UsageFn", usageFn.toString());
		}
	}

	public String getTargetUserId() {
		return this.targetUserId;
	}

	public void setTargetUserId(String targetUserId) {
		this.targetUserId = targetUserId;
		if(targetUserId != null){
			putQueryParameter("TargetUserId", targetUserId);
		}
	}

	@Override
	public Class<GetEstimateFeeInfoResponse> getResponseClass() {
		return GetEstimateFeeInfoResponse.class;
	}

}
