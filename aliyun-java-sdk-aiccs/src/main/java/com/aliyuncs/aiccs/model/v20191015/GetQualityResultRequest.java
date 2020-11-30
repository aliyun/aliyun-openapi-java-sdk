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

package com.aliyuncs.aiccs.model.v20191015;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.aiccs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetQualityResultRequest extends RpcAcsRequest<GetQualityResultResponse> {
	   

	private String touchEndTime;

	private List<Long> projectIdss;

	private List<Long> qualityRuleIdss;

	private Integer hitStatus;

	private String instanceId;

	private Integer pageNo;

	private List<Long> groupIdss;

	private Integer pageSize;

	private String channelType;

	private String touchStartTime;
	public GetQualityResultRequest() {
		super("aiccs", "2019-10-15", "GetQualityResult", "aiccs-service");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getTouchEndTime() {
		return this.touchEndTime;
	}

	public void setTouchEndTime(String touchEndTime) {
		this.touchEndTime = touchEndTime;
		if(touchEndTime != null){
			putQueryParameter("TouchEndTime", touchEndTime);
		}
	}

	public List<Long> getProjectIdss() {
		return this.projectIdss;
	}

	public void setProjectIdss(List<Long> projectIdss) {
		this.projectIdss = projectIdss;	
		if (projectIdss != null) {
			for (int i = 0; i < projectIdss.size(); i++) {
				putQueryParameter("ProjectIds." + (i + 1) , projectIdss.get(i));
			}
		}	
	}

	public List<Long> getQualityRuleIdss() {
		return this.qualityRuleIdss;
	}

	public void setQualityRuleIdss(List<Long> qualityRuleIdss) {
		this.qualityRuleIdss = qualityRuleIdss;	
		if (qualityRuleIdss != null) {
			for (int i = 0; i < qualityRuleIdss.size(); i++) {
				putQueryParameter("QualityRuleIds." + (i + 1) , qualityRuleIdss.get(i));
			}
		}	
	}

	public Integer getHitStatus() {
		return this.hitStatus;
	}

	public void setHitStatus(Integer hitStatus) {
		this.hitStatus = hitStatus;
		if(hitStatus != null){
			putQueryParameter("HitStatus", hitStatus.toString());
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public Integer getPageNo() {
		return this.pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
		if(pageNo != null){
			putQueryParameter("PageNo", pageNo.toString());
		}
	}

	public List<Long> getGroupIdss() {
		return this.groupIdss;
	}

	public void setGroupIdss(List<Long> groupIdss) {
		this.groupIdss = groupIdss;	
		if (groupIdss != null) {
			for (int i = 0; i < groupIdss.size(); i++) {
				putQueryParameter("GroupIds." + (i + 1) , groupIdss.get(i));
			}
		}	
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public String getChannelType() {
		return this.channelType;
	}

	public void setChannelType(String channelType) {
		this.channelType = channelType;
		if(channelType != null){
			putQueryParameter("ChannelType", channelType);
		}
	}

	public String getTouchStartTime() {
		return this.touchStartTime;
	}

	public void setTouchStartTime(String touchStartTime) {
		this.touchStartTime = touchStartTime;
		if(touchStartTime != null){
			putQueryParameter("TouchStartTime", touchStartTime);
		}
	}

	@Override
	public Class<GetQualityResultResponse> getResponseClass() {
		return GetQualityResultResponse.class;
	}

}
