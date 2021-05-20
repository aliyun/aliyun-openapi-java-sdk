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

package com.aliyuncs.ens.model.v20171110;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DescribeEnsResourceUsageRequest extends RpcAcsRequest<DescribeEnsResourceUsageResponse> {
	   

	private String expiredStartTime;

	private String expiredEndTime;
	public DescribeEnsResourceUsageRequest() {
		super("Ens", "2017-11-10", "DescribeEnsResourceUsage", "ens");
		setMethod(MethodType.GET);
	}

	public String getExpiredStartTime() {
		return this.expiredStartTime;
	}

	public void setExpiredStartTime(String expiredStartTime) {
		this.expiredStartTime = expiredStartTime;
		if(expiredStartTime != null){
			putQueryParameter("ExpiredStartTime", expiredStartTime);
		}
	}

	public String getExpiredEndTime() {
		return this.expiredEndTime;
	}

	public void setExpiredEndTime(String expiredEndTime) {
		this.expiredEndTime = expiredEndTime;
		if(expiredEndTime != null){
			putQueryParameter("ExpiredEndTime", expiredEndTime);
		}
	}

	@Override
	public Class<DescribeEnsResourceUsageResponse> getResponseClass() {
		return DescribeEnsResourceUsageResponse.class;
	}

}
