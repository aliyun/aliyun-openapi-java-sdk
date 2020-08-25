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
public class QueryLinkeLinktIterationmeetingRequest extends RpcAcsRequest<QueryLinkeLinktIterationmeetingResponse> {
	   

	private String iterationMeetingId;
	public QueryLinkeLinktIterationmeetingRequest() {
		super("SOFA", "2019-08-15", "QueryLinkeLinktIterationmeeting", "sofa");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getIterationMeetingId() {
		return this.iterationMeetingId;
	}

	public void setIterationMeetingId(String iterationMeetingId) {
		this.iterationMeetingId = iterationMeetingId;
		if(iterationMeetingId != null){
			putBodyParameter("IterationMeetingId", iterationMeetingId);
		}
	}

	@Override
	public Class<QueryLinkeLinktIterationmeetingResponse> getResponseClass() {
		return QueryLinkeLinktIterationmeetingResponse.class;
	}

}
