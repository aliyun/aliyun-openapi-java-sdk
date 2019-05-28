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

package com.aliyuncs.ccc.model.v20170705;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class PickOutboundNumbersByTagsRequest extends RpcAcsRequest<PickOutboundNumbersByTagsResponse> {
	
	public PickOutboundNumbersByTagsRequest() {
		super("CCC", "2017-07-05", "PickOutboundNumbersByTags");
	}

	private List<String> prioritizedCallerAreas;

	private String instanceId;

	private List<String> serviceTags;

	private List<String> skillGroupIds;

	private Integer count;

	private String calleeNumber;

	public List<String> getPrioritizedCallerAreas() {
		return this.prioritizedCallerAreas;
	}

	public void setPrioritizedCallerAreas(List<String> prioritizedCallerAreas) {
		this.prioritizedCallerAreas = prioritizedCallerAreas;	
		if (prioritizedCallerAreas != null) {
			for (int i = 0; i < prioritizedCallerAreas.size(); i++) {
				putQueryParameter("PrioritizedCallerArea." + (i + 1) , prioritizedCallerAreas.get(i));
			}
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

	public List<String> getServiceTags() {
		return this.serviceTags;
	}

	public void setServiceTags(List<String> serviceTags) {
		this.serviceTags = serviceTags;	
		if (serviceTags != null) {
			for (int i = 0; i < serviceTags.size(); i++) {
				putQueryParameter("ServiceTag." + (i + 1) , serviceTags.get(i));
			}
		}	
	}

	public List<String> getSkillGroupIds() {
		return this.skillGroupIds;
	}

	public void setSkillGroupIds(List<String> skillGroupIds) {
		this.skillGroupIds = skillGroupIds;	
		if (skillGroupIds != null) {
			for (int i = 0; i < skillGroupIds.size(); i++) {
				putQueryParameter("SkillGroupId." + (i + 1) , skillGroupIds.get(i));
			}
		}	
	}

	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
		if(count != null){
			putQueryParameter("Count", count.toString());
		}
	}

	public String getCalleeNumber() {
		return this.calleeNumber;
	}

	public void setCalleeNumber(String calleeNumber) {
		this.calleeNumber = calleeNumber;
		if(calleeNumber != null){
			putQueryParameter("CalleeNumber", calleeNumber);
		}
	}

	@Override
	public Class<PickOutboundNumbersByTagsResponse> getResponseClass() {
		return PickOutboundNumbersByTagsResponse.class;
	}

}
