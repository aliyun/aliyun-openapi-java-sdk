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

package com.aliyuncs.webplus.model.v20190320;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.webplus.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeGatherLogResultRequest extends RoaAcsRequest<DescribeGatherLogResultResponse> {
	
	public DescribeGatherLogResultRequest() {
		super("WebPlus", "2019-03-20", "DescribeGatherLogResult", "webx");
		setUriPattern("/pop/v1/wam/appEnv/gatherLog");
		setMethod(MethodType.GET);
		try {
			this.getClass().getDeclaredField("ProductEndpointMap").set(this, Endpoint.endpointMap);
			this.getClass().getDeclaredField("ProductEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private String changeId;

	public String getChangeId() {
		return this.changeId;
	}

	public void setChangeId(String changeId) {
		this.changeId = changeId;
		if(changeId != null){
			putQueryParameter("ChangeId", changeId);
		}
	}

	@Override
	public Class<DescribeGatherLogResultResponse> getResponseClass() {
		return DescribeGatherLogResultResponse.class;
	}

}
