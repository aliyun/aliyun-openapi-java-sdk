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
public class IntersectTrajectoryRequest extends RpcAcsRequest<IntersectTrajectoryResponse> {
	   

	private String corpId;

	private String endTime;

	private Integer deltaDistance;

	private String startTime;

	private Integer deltaTime;

	private List<IdList> idLists;
	public IntersectTrajectoryRequest() {
		super("CDRS", "2020-11-01", "IntersectTrajectory");
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

	public Integer getDeltaDistance() {
		return this.deltaDistance;
	}

	public void setDeltaDistance(Integer deltaDistance) {
		this.deltaDistance = deltaDistance;
		if(deltaDistance != null){
			putBodyParameter("DeltaDistance", deltaDistance.toString());
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

	public Integer getDeltaTime() {
		return this.deltaTime;
	}

	public void setDeltaTime(Integer deltaTime) {
		this.deltaTime = deltaTime;
		if(deltaTime != null){
			putBodyParameter("DeltaTime", deltaTime.toString());
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
	public Class<IntersectTrajectoryResponse> getResponseClass() {
		return IntersectTrajectoryResponse.class;
	}

}
