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

package com.aliyuncs.sas.model.v20181203;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ChangeCheckConfigRequest extends RpcAcsRequest<ChangeCheckConfigResponse> {
	   

	private List<Long> standardIdss;

	private List<Integer> cycleDayss;

	private Integer startTime;

	private List<RemovedCheck> removedCheck;

	private Boolean enableAddCheck;

	private Boolean enableAutoCheck;

	private Integer endTime;

	private List<AddedCheck> addedCheck;
	public ChangeCheckConfigRequest() {
		super("Sas", "2018-12-03", "ChangeCheckConfig");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<Long> getStandardIdss() {
		return this.standardIdss;
	}

	public void setStandardIdss(List<Long> standardIdss) {
		this.standardIdss = standardIdss;	
		if (standardIdss != null) {
			for (int i = 0; i < standardIdss.size(); i++) {
				putQueryParameter("StandardIds." + (i + 1) , standardIdss.get(i));
			}
		}	
	}

	public List<Integer> getCycleDayss() {
		return this.cycleDayss;
	}

	public void setCycleDayss(List<Integer> cycleDayss) {
		this.cycleDayss = cycleDayss;	
		if (cycleDayss != null) {
			for (int i = 0; i < cycleDayss.size(); i++) {
				putQueryParameter("CycleDays." + (i + 1) , cycleDayss.get(i));
			}
		}	
	}

	public Integer getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Integer startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putQueryParameter("StartTime", startTime.toString());
		}
	}

	public List<RemovedCheck> getRemovedCheck() {
		return this.removedCheck;
	}

	public void setRemovedCheck(List<RemovedCheck> removedCheck) {
		this.removedCheck = removedCheck;	
		if (removedCheck != null) {
			for (int depth1 = 0; depth1 < removedCheck.size(); depth1++) {
				if (removedCheck.get(depth1) != null) {
					
						putQueryParameter("RemovedCheck." + (depth1 + 1) + ".SectionId" , removedCheck.get(depth1).getSectionId());
						putQueryParameter("RemovedCheck." + (depth1 + 1) + ".CheckId" , removedCheck.get(depth1).getCheckId());
				}
			}
		}	
	}

	public Boolean getEnableAddCheck() {
		return this.enableAddCheck;
	}

	public void setEnableAddCheck(Boolean enableAddCheck) {
		this.enableAddCheck = enableAddCheck;
		if(enableAddCheck != null){
			putQueryParameter("EnableAddCheck", enableAddCheck.toString());
		}
	}

	public Boolean getEnableAutoCheck() {
		return this.enableAutoCheck;
	}

	public void setEnableAutoCheck(Boolean enableAutoCheck) {
		this.enableAutoCheck = enableAutoCheck;
		if(enableAutoCheck != null){
			putQueryParameter("EnableAutoCheck", enableAutoCheck.toString());
		}
	}

	public Integer getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Integer endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putQueryParameter("EndTime", endTime.toString());
		}
	}

	public List<AddedCheck> getAddedCheck() {
		return this.addedCheck;
	}

	public void setAddedCheck(List<AddedCheck> addedCheck) {
		this.addedCheck = addedCheck;	
		if (addedCheck != null) {
			for (int depth1 = 0; depth1 < addedCheck.size(); depth1++) {
				if (addedCheck.get(depth1) != null) {
					
						putQueryParameter("AddedCheck." + (depth1 + 1) + ".SectionId" , addedCheck.get(depth1).getSectionId());
						putQueryParameter("AddedCheck." + (depth1 + 1) + ".CheckId" , addedCheck.get(depth1).getCheckId());
				}
			}
		}	
	}

	public static class RemovedCheck {

		private Long sectionId;

		private Long checkId;

		public Long getSectionId() {
			return this.sectionId;
		}

		public void setSectionId(Long sectionId) {
			this.sectionId = sectionId;
		}

		public Long getCheckId() {
			return this.checkId;
		}

		public void setCheckId(Long checkId) {
			this.checkId = checkId;
		}
	}

	public static class AddedCheck {

		private Long sectionId;

		private Long checkId;

		public Long getSectionId() {
			return this.sectionId;
		}

		public void setSectionId(Long sectionId) {
			this.sectionId = sectionId;
		}

		public Long getCheckId() {
			return this.checkId;
		}

		public void setCheckId(Long checkId) {
			this.checkId = checkId;
		}
	}

	@Override
	public Class<ChangeCheckConfigResponse> getResponseClass() {
		return ChangeCheckConfigResponse.class;
	}

}
