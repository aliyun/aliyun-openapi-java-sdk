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

package com.aliyuncs.lrg.model.v20191010;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class AddFailMachineToBlackListRequest extends RoaAcsRequest<AddFailMachineToBlackListResponse> {
	   

	private Long processId;

	private String ipList;
	public AddFailMachineToBlackListRequest() {
		super("LRG", "2019-10-10", "AddFailMachineToBlackList");
		setUriPattern("/api/v2/addfailmachinetoblacklist");
		setMethod(MethodType.POST);
	}

	public Long getProcessId() {
		return this.processId;
	}

	public void setProcessId(Long processId) {
		this.processId = processId;
		if(processId != null){
			putBodyParameter("ProcessId", processId.toString());
		}
	}

	public String getIpList() {
		return this.ipList;
	}

	public void setIpList(String ipList) {
		this.ipList = ipList;
		if(ipList != null){
			putBodyParameter("IpList", ipList);
		}
	}

	@Override
	public Class<AddFailMachineToBlackListResponse> getResponseClass() {
		return AddFailMachineToBlackListResponse.class;
	}

}
