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

package com.aliyuncs.arms.model.v20190219;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class GetTagKeyRequest extends RpcAcsRequest<GetTagKeyResponse> {
	
	public GetTagKeyRequest() {
		super("ARMS", "2019-02-19", "GetTagKey", "arms");
	}

	private Long endTime;

	private String serviceName;

	private Long startTime;

	private String spanName;

	public Long getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Long endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putQueryParameter("EndTime", endTime.toString());
		}
	}

	public String getServiceName() {
		return this.serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
		if(serviceName != null){
			putQueryParameter("ServiceName", serviceName);
		}
	}

	public Long getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Long startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putQueryParameter("StartTime", startTime.toString());
		}
	}

	public String getSpanName() {
		return this.spanName;
	}

	public void setSpanName(String spanName) {
		this.spanName = spanName;
		if(spanName != null){
			putQueryParameter("SpanName", spanName);
		}
	}

	@Override
	public Class<GetTagKeyResponse> getResponseClass() {
		return GetTagKeyResponse.class;
	}

}
