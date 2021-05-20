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
public class DescribeEnsRegionIdIpv6InfoRequest extends RpcAcsRequest<DescribeEnsRegionIdIpv6InfoResponse> {
	   

	private String ensRegionId;
	public DescribeEnsRegionIdIpv6InfoRequest() {
		super("Ens", "2017-11-10", "DescribeEnsRegionIdIpv6Info", "ens");
		setMethod(MethodType.POST);
	}

	public String getEnsRegionId() {
		return this.ensRegionId;
	}

	public void setEnsRegionId(String ensRegionId) {
		this.ensRegionId = ensRegionId;
		if(ensRegionId != null){
			putQueryParameter("EnsRegionId", ensRegionId);
		}
	}

	@Override
	public Class<DescribeEnsRegionIdIpv6InfoResponse> getResponseClass() {
		return DescribeEnsRegionIdIpv6InfoResponse.class;
	}

}
