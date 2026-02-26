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

package com.aliyuncs.dataphin_public.model.v20230630;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetQualityWatchByObjectIdRequest extends RpcAcsRequest<GetQualityWatchByObjectIdResponse> {
	   

	private Long opTenantId;

	private String watchObjectId;

	private String watchType;
	public GetQualityWatchByObjectIdRequest() {
		super("dataphin-public", "2023-06-30", "GetQualityWatchByObjectId");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public Long getOpTenantId() {
		return this.opTenantId;
	}

	public void setOpTenantId(Long opTenantId) {
		this.opTenantId = opTenantId;
		if(opTenantId != null){
			putQueryParameter("OpTenantId", opTenantId.toString());
		}
	}

	public String getWatchObjectId() {
		return this.watchObjectId;
	}

	public void setWatchObjectId(String watchObjectId) {
		this.watchObjectId = watchObjectId;
		if(watchObjectId != null){
			putQueryParameter("WatchObjectId", watchObjectId);
		}
	}

	public String getWatchType() {
		return this.watchType;
	}

	public void setWatchType(String watchType) {
		this.watchType = watchType;
		if(watchType != null){
			putQueryParameter("WatchType", watchType);
		}
	}

	@Override
	public Class<GetQualityWatchByObjectIdResponse> getResponseClass() {
		return GetQualityWatchByObjectIdResponse.class;
	}

}
