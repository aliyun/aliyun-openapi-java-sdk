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

package com.aliyuncs.sas.model.v20181203;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ChangeCheckConfigRequest extends RpcAcsRequest<ChangeCheckConfigResponse> {
	   

	private List<Long> standardIdss;

	private Integer startTime;

	private Integer endTime;
	public ChangeCheckConfigRequest() {
		super("Sas", "2018-12-03", "ChangeCheckConfig");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<Long> getStandardIdss() {
		return this.standardIdss;
	}

	public void setStandardIdss(List<Long> standardIdss) {
		this.standardIdss = standardIdss;	
		if (standardIdss != null) {
			for (int i = 0; i < standardIdss.size(); i++) {
				putQueryParameter("StandardIds." + (i + 1) , standardIdss.get(i));
			}
		}	
	}

	public Integer getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Integer startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putQueryParameter("StartTime", startTime.toString());
		}
	}

	public Integer getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Integer endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putQueryParameter("EndTime", endTime.toString());
		}
	}

	@Override
	public Class<ChangeCheckConfigResponse> getResponseClass() {
		return ChangeCheckConfigResponse.class;
	}

}
