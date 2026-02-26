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

package com.aliyuncs.eds_aic.model.v20230930;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DescribeInvocationsRequest extends RpcAcsRequest<DescribeInvocationsResponse> {
	   

	private String invocationId;

	private List<String> instanceIdss;
	public DescribeInvocationsRequest() {
		super("eds-aic", "2023-09-30", "DescribeInvocations");
		setMethod(MethodType.POST);
	}

	public String getInvocationId() {
		return this.invocationId;
	}

	public void setInvocationId(String invocationId) {
		this.invocationId = invocationId;
		if(invocationId != null){
			putQueryParameter("InvocationId", invocationId);
		}
	}

	public List<String> getInstanceIdss() {
		return this.instanceIdss;
	}

	public void setInstanceIdss(List<String> instanceIdss) {
		this.instanceIdss = instanceIdss;	
		if (instanceIdss != null) {
			for (int i = 0; i < instanceIdss.size(); i++) {
				putQueryParameter("InstanceIds." + (i + 1) , instanceIdss.get(i));
			}
		}	
	}

	@Override
	public Class<DescribeInvocationsResponse> getResponseClass() {
		return DescribeInvocationsResponse.class;
	}

}
