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

package com.aliyuncs.aegis.model.v20161111;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class DescribeAnalysisCurveRequest extends RpcAcsRequest<DescribeAnalysisCurveResponse> {
	
	public DescribeAnalysisCurveRequest() {
		super("aegis", "2016-11-11", "DescribeAnalysisCurve", "vipaegis");
	}

	private Long startTimeStamp;

	private Long endTimeStamp;

	public Long getStartTimeStamp() {
		return this.startTimeStamp;
	}

	public void setStartTimeStamp(Long startTimeStamp) {
		this.startTimeStamp = startTimeStamp;
		if(startTimeStamp != null){
			putQueryParameter("StartTimeStamp", startTimeStamp.toString());
		}
	}

	public Long getEndTimeStamp() {
		return this.endTimeStamp;
	}

	public void setEndTimeStamp(Long endTimeStamp) {
		this.endTimeStamp = endTimeStamp;
		if(endTimeStamp != null){
			putQueryParameter("EndTimeStamp", endTimeStamp.toString());
		}
	}

	@Override
	public Class<DescribeAnalysisCurveResponse> getResponseClass() {
		return DescribeAnalysisCurveResponse.class;
	}

}
