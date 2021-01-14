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
public class RecallTrajectoryByIdRequest extends RpcAcsRequest<RecallTrajectoryByIdResponse> {
	   

	private String corpId;

	private String endTime;

	private String idValue;

	private Integer deltaDistance;

	private String startTime;

	private String idType;

	private List<String> outputIdTypeLists;

	private Integer deltaTime;

	private Integer outputIdCount;
	public RecallTrajectoryByIdRequest() {
		super("CDRS", "2020-11-01", "RecallTrajectoryById");
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

	public String getIdValue() {
		return this.idValue;
	}

	public void setIdValue(String idValue) {
		this.idValue = idValue;
		if(idValue != null){
			putBodyParameter("IdValue", idValue);
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

	public String getIdType() {
		return this.idType;
	}

	public void setIdType(String idType) {
		this.idType = idType;
		if(idType != null){
			putBodyParameter("IdType", idType);
		}
	}

	public List<String> getOutputIdTypeLists() {
		return this.outputIdTypeLists;
	}

	public void setOutputIdTypeLists(List<String> outputIdTypeLists) {
		this.outputIdTypeLists = outputIdTypeLists;	
		if (outputIdTypeLists != null) {
			for (int i = 0; i < outputIdTypeLists.size(); i++) {
				putBodyParameter("OutputIdTypeList." + (i + 1) , outputIdTypeLists.get(i));
			}
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

	public Integer getOutputIdCount() {
		return this.outputIdCount;
	}

	public void setOutputIdCount(Integer outputIdCount) {
		this.outputIdCount = outputIdCount;
		if(outputIdCount != null){
			putBodyParameter("OutputIdCount", outputIdCount.toString());
		}
	}

	@Override
	public Class<RecallTrajectoryByIdResponse> getResponseClass() {
		return RecallTrajectoryByIdResponse.class;
	}

}
