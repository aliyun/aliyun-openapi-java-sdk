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

package com.aliyuncs.cdrs.model.v20201101;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class QueryTrajectoryByIdRequest extends RpcAcsRequest<QueryTrajectoryByIdResponse> {
	   

	private String corpId;

	private String endTime;

	private String startTime;

	private List<DeviceList> deviceLists;

	private List<IdList> idLists;
	public QueryTrajectoryByIdRequest() {
		super("CDRS", "2020-11-01", "QueryTrajectoryById");
		setMethod(MethodType.POST);
	}

	public String getCorpId() {
		return this.corpId;
	}

	public void setCorpId(String corpId) {
		this.corpId = corpId;
		if(corpId != null){
			putBodyParameter("CorpId", corpId);
		}
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putBodyParameter("EndTime", endTime);
		}
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putBodyParameter("StartTime", startTime);
		}
	}

	public List<DeviceList> getDeviceLists() {
		return this.deviceLists;
	}

	public void setDeviceLists(List<DeviceList> deviceLists) {
		this.deviceLists = deviceLists;	
		if (deviceLists != null) {
			for (int depth1 = 0; depth1 < deviceLists.size(); depth1++) {
				putBodyParameter("DeviceList." + (depth1 + 1) + ".DeviceId" , deviceLists.get(depth1).getDeviceId());
			}
		}	
	}

	public List<IdList> getIdLists() {
		return this.idLists;
	}

	public void setIdLists(List<IdList> idLists) {
		this.idLists = idLists;	
		if (idLists != null) {
			for (int depth1 = 0; depth1 < idLists.size(); depth1++) {
				putBodyParameter("IdList." + (depth1 + 1) + ".IdType" , idLists.get(depth1).getIdType());
				putBodyParameter("IdList." + (depth1 + 1) + ".IdValue" , idLists.get(depth1).getIdValue());
			}
		}	
	}

	public static class DeviceList {

		private String deviceId;

		public String getDeviceId() {
			return this.deviceId;
		}

		public void setDeviceId(String deviceId) {
			this.deviceId = deviceId;
		}
	}

	public static class IdList {

		private String idType;

		private String idValue;

		public String getIdType() {
			return this.idType;
		}

		public void setIdType(String idType) {
			this.idType = idType;
		}

		public String getIdValue() {
			return this.idValue;
		}

		public void setIdValue(String idValue) {
			this.idValue = idValue;
		}
	}

	@Override
	public Class<QueryTrajectoryByIdResponse> getResponseClass() {
		return QueryTrajectoryByIdResponse.class;
	}

}
