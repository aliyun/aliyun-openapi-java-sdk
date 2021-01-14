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
public class RecallTrajectoryByCoordinateRequest extends RpcAcsRequest<RecallTrajectoryByCoordinateResponse> {
	   

	private String corpId;

	private List<PointList> pointLists;

	private String endTime;

	private Integer deltaDistance;

	private String startTime;

	private List<String> outputIdTypeLists;

	private Integer deltaTime;

	private Integer outputIdCount;
	public RecallTrajectoryByCoordinateRequest() {
		super("CDRS", "2020-11-01", "RecallTrajectoryByCoordinate");
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

	public List<PointList> getPointLists() {
		return this.pointLists;
	}

	public void setPointLists(List<PointList> pointLists) {
		this.pointLists = pointLists;	
		if (pointLists != null) {
			for (int depth1 = 0; depth1 < pointLists.size(); depth1++) {
				putBodyParameter("PointList." + (depth1 + 1) + ".Latitude" , pointLists.get(depth1).getLatitude());
				putBodyParameter("PointList." + (depth1 + 1) + ".Longitude" , pointLists.get(depth1).getLongitude());
			}
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

	public static class PointList {

		private Float latitude;

		private Float longitude;

		public Float getLatitude() {
			return this.latitude;
		}

		public void setLatitude(Float latitude) {
			this.latitude = latitude;
		}

		public Float getLongitude() {
			return this.longitude;
		}

		public void setLongitude(Float longitude) {
			this.longitude = longitude;
		}
	}

	@Override
	public Class<RecallTrajectoryByCoordinateResponse> getResponseClass() {
		return RecallTrajectoryByCoordinateResponse.class;
	}

}
