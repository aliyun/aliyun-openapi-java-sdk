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

package com.aliyuncs.zhuque.model.v20160701;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class CopyProjectVersion4PimsRequest extends RpcAcsRequest<CopyProjectVersion4PimsResponse> {
	
	public CopyProjectVersion4PimsRequest() {
		super("Zhuque", "2016-07-01", "CopyProjectVersion4Pims");
	}

	private String businessProjectId;

	private String toVersion;

	private String fromVersion;

	public String getBusinessProjectId() {
		return this.businessProjectId;
	}

	public void setBusinessProjectId(String businessProjectId) {
		this.businessProjectId = businessProjectId;
		if(businessProjectId != null){
			putQueryParameter("BusinessProjectId", businessProjectId);
		}
	}

	public String getToVersion() {
		return this.toVersion;
	}

	public void setToVersion(String toVersion) {
		this.toVersion = toVersion;
		if(toVersion != null){
			putQueryParameter("ToVersion", toVersion);
		}
	}

	public String getFromVersion() {
		return this.fromVersion;
	}

	public void setFromVersion(String fromVersion) {
		this.fromVersion = fromVersion;
		if(fromVersion != null){
			putQueryParameter("FromVersion", fromVersion);
		}
	}

	@Override
	public Class<CopyProjectVersion4PimsResponse> getResponseClass() {
		return CopyProjectVersion4PimsResponse.class;
	}

}
