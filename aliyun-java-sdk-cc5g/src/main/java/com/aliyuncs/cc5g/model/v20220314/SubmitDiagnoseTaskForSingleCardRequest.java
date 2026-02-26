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

package com.aliyuncs.cc5g.model.v20220314;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class SubmitDiagnoseTaskForSingleCardRequest extends RpcAcsRequest<SubmitDiagnoseTaskForSingleCardResponse> {
	   

	private String destination;

	private String source;

	private Long resourceUid;

	private Long endTime;

	private Long beginTime;

	private String regionNo;

	private String wirelessCloudConnectorId;
	public SubmitDiagnoseTaskForSingleCardRequest() {
		super("CC5G", "2022-03-14", "SubmitDiagnoseTaskForSingleCard", "fivegcc");
		setMethod(MethodType.POST);
	}

	public String getDestination() {
		return this.destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
		if(destination != null){
			putQueryParameter("Destination", destination);
		}
	}

	public String getSource() {
		return this.source;
	}

	public void setSource(String source) {
		this.source = source;
		if(source != null){
			putQueryParameter("Source", source);
		}
	}

	public Long getResourceUid() {
		return this.resourceUid;
	}

	public void setResourceUid(Long resourceUid) {
		this.resourceUid = resourceUid;
		if(resourceUid != null){
			putQueryParameter("ResourceUid", resourceUid.toString());
		}
	}

	public Long getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Long endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putQueryParameter("EndTime", endTime.toString());
		}
	}

	public Long getBeginTime() {
		return this.beginTime;
	}

	public void setBeginTime(Long beginTime) {
		this.beginTime = beginTime;
		if(beginTime != null){
			putQueryParameter("BeginTime", beginTime.toString());
		}
	}

	public String getRegionNo() {
		return this.regionNo;
	}

	public void setRegionNo(String regionNo) {
		this.regionNo = regionNo;
		if(regionNo != null){
			putQueryParameter("RegionNo", regionNo);
		}
	}

	public String getWirelessCloudConnectorId() {
		return this.wirelessCloudConnectorId;
	}

	public void setWirelessCloudConnectorId(String wirelessCloudConnectorId) {
		this.wirelessCloudConnectorId = wirelessCloudConnectorId;
		if(wirelessCloudConnectorId != null){
			putQueryParameter("WirelessCloudConnectorId", wirelessCloudConnectorId);
		}
	}

	@Override
	public Class<SubmitDiagnoseTaskForSingleCardResponse> getResponseClass() {
		return SubmitDiagnoseTaskForSingleCardResponse.class;
	}

}
