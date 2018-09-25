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

package com.aliyuncs.ccs.model.v20171001;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class GetHotlineRecordRequest extends RpcAcsRequest<GetHotlineRecordResponse> {
	
	public GetHotlineRecordRequest() {
		super("Ccs", "2017-10-01", "GetHotlineRecord", "ccs");
	}

	private String id;

	private String ccsInstanceId;

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
		if(id != null){
			putQueryParameter("Id", id);
		}
	}

	public String getCcsInstanceId() {
		return this.ccsInstanceId;
	}

	public void setCcsInstanceId(String ccsInstanceId) {
		this.ccsInstanceId = ccsInstanceId;
		if(ccsInstanceId != null){
			putQueryParameter("CcsInstanceId", ccsInstanceId);
		}
	}

	@Override
	public Class<GetHotlineRecordResponse> getResponseClass() {
		return GetHotlineRecordResponse.class;
	}

}
