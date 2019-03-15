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

package com.aliyuncs.openanalytics.model.v20180301;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class GetRegionStatusRequest extends RpcAcsRequest<GetRegionStatusResponse> {
	
	public GetRegionStatusRequest() {
		super("openanalytics", "2018-03-01", "GetRegionStatus", "openanalytics");
	}

	private Long targetUid;

	public Long getTargetUid() {
		return this.targetUid;
	}

	public void setTargetUid(Long targetUid) {
		this.targetUid = targetUid;
		if(targetUid != null){
			putBodyParameter("TargetUid", targetUid.toString());
		}
	}

	@Override
	public Class<GetRegionStatusResponse> getResponseClass() {
		return GetRegionStatusResponse.class;
	}

}
