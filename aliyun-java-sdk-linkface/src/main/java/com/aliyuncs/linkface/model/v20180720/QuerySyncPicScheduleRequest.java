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

package com.aliyuncs.linkface.model.v20180720;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class QuerySyncPicScheduleRequest extends RpcAcsRequest<QuerySyncPicScheduleResponse> {
	
	public QuerySyncPicScheduleRequest() {
		super("LinkFace", "2018-07-20", "QuerySyncPicSchedule");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	private String iotId;

	public String getIotId() {
		return this.iotId;
	}

	public void setIotId(String iotId) {
		this.iotId = iotId;
		if(iotId != null){
			putBodyParameter("IotId", iotId);
		}
	}

	@Override
	public Class<QuerySyncPicScheduleResponse> getResponseClass() {
		return QuerySyncPicScheduleResponse.class;
	}

}
