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

package com.aliyuncs.linkwan.model.v20181230;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class CreateLocalJoinPermissionRequest extends RpcAcsRequest<CreateLocalJoinPermissionResponse> {
	
	public CreateLocalJoinPermissionRequest() {
		super("LinkWAN", "2018-12-30", "CreateLocalJoinPermission", "linkwan");
	}

	private String classMode;

	private Long freqBandPlanGroupId;

	public String getClassMode() {
		return this.classMode;
	}

	public void setClassMode(String classMode) {
		this.classMode = classMode;
		if(classMode != null){
			putBodyParameter("ClassMode", classMode);
		}
	}

	public Long getFreqBandPlanGroupId() {
		return this.freqBandPlanGroupId;
	}

	public void setFreqBandPlanGroupId(Long freqBandPlanGroupId) {
		this.freqBandPlanGroupId = freqBandPlanGroupId;
		if(freqBandPlanGroupId != null){
			putBodyParameter("FreqBandPlanGroupId", freqBandPlanGroupId.toString());
		}
	}

	@Override
	public Class<CreateLocalJoinPermissionResponse> getResponseClass() {
		return CreateLocalJoinPermissionResponse.class;
	}

}
