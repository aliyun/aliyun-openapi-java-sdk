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

package com.aliyuncs.cloudcallcenter.model.v20170705;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class ExportVnConversationDetailsRequest extends RpcAcsRequest<ExportVnConversationDetailsResponse> {
	
	public ExportVnConversationDetailsRequest() {
		super("CloudCallCenter", "2017-07-05", "ExportVnConversationDetails", "CloudCallCenter", "innerAPI");
	}

	private String callingNumber;

	private String instanceId;

	private Long beginTimeRightRange;

	private Long beginTimeLeftRange;

	public String getCallingNumber() {
		return this.callingNumber;
	}

	public void setCallingNumber(String callingNumber) {
		this.callingNumber = callingNumber;
		if(callingNumber != null){
			putQueryParameter("CallingNumber", callingNumber);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public Long getBeginTimeRightRange() {
		return this.beginTimeRightRange;
	}

	public void setBeginTimeRightRange(Long beginTimeRightRange) {
		this.beginTimeRightRange = beginTimeRightRange;
		if(beginTimeRightRange != null){
			putQueryParameter("BeginTimeRightRange", beginTimeRightRange.toString());
		}
	}

	public Long getBeginTimeLeftRange() {
		return this.beginTimeLeftRange;
	}

	public void setBeginTimeLeftRange(Long beginTimeLeftRange) {
		this.beginTimeLeftRange = beginTimeLeftRange;
		if(beginTimeLeftRange != null){
			putQueryParameter("BeginTimeLeftRange", beginTimeLeftRange.toString());
		}
	}

	@Override
	public Class<ExportVnConversationDetailsResponse> getResponseClass() {
		return ExportVnConversationDetailsResponse.class;
	}

}
