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
public class QueryTouchListRequest extends RpcAcsRequest<QueryTouchListResponse> {
	   

	private Long firstTimeEnd;

	private List<Integer> evaluationStatuss;

	private Long firstTimeStart;

	private List<Long> queueIds;

	private List<Integer> touchTypes;

	private List<Long> touchIds;

	private List<Long> servicerIds;

	private Integer currentPage;

	private Long closeTimeStart;

	private List<Integer> evaluationLevels;

	private List<Integer> evaluationScores;

	private String instanceId;

	private List<String> servicerNames;

	private List<Integer> channelTypes;

	private Integer pageSize;

	private Long closeTimeEnd;

	private List<String> channelIds;

	private List<String> memberNames;

	private List<Long> memberIds;
	public QueryTouchListRequest() {
		super("aiccs", "2019-10-15", "QueryTouchList", "aiccs-service");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getFirstTimeEnd() {
		return this.firstTimeEnd;
	}

	public void setFirstTimeEnd(Long firstTimeEnd) {
		this.firstTimeEnd = firstTimeEnd;
		if(firstTimeEnd != null){
			putBodyParameter("FirstTimeEnd", firstTimeEnd.toString());
		}
	}

	public List<Integer> getEvaluationStatuss() {
		return this.evaluationStatuss;
	}

	public void setEvaluationStatuss(List<Integer> evaluationStatuss) {
		this.evaluationStatuss = evaluationStatuss;	
		if (evaluationStatuss != null) {
			for (int i = 0; i < evaluationStatuss.size(); i++) {
				putBodyParameter("EvaluationStatus." + (i + 1) , evaluationStatuss.get(i));
			}
		}	
	}

	public Long getFirstTimeStart() {
		return this.firstTimeStart;
	}

	public void setFirstTimeStart(Long firstTimeStart) {
		this.firstTimeStart = firstTimeStart;
		if(firstTimeStart != null){
			putBodyParameter("FirstTimeStart", firstTimeStart.toString());
		}
	}

	public List<Long> getQueueIds() {
		return this.queueIds;
	}

	public void setQueueIds(List<Long> queueIds) {
		this.queueIds = queueIds;	
		if (queueIds != null) {
			for (int i = 0; i < queueIds.size(); i++) {
				putBodyParameter("QueueId." + (i + 1) , queueIds.get(i));
			}
		}	
	}

	public List<Integer> getTouchTypes() {
		return this.touchTypes;
	}

	public void setTouchTypes(List<Integer> touchTypes) {
		this.touchTypes = touchTypes;	
		if (touchTypes != null) {
			for (int i = 0; i < touchTypes.size(); i++) {
				putBodyParameter("TouchType." + (i + 1) , touchTypes.get(i));
			}
		}	
	}

	public List<Long> getTouchIds() {
		return this.touchIds;
	}

	public void setTouchIds(List<Long> touchIds) {
		this.touchIds = touchIds;	
		if (touchIds != null) {
			for (int i = 0; i < touchIds.size(); i++) {
				putBodyParameter("TouchId." + (i + 1) , touchIds.get(i));
			}
		}	
	}

	public List<Long> getServicerIds() {
		return this.servicerIds;
	}

	public void setServicerIds(List<Long> servicerIds) {
		this.servicerIds = servicerIds;	
		if (servicerIds != null) {
			for (int i = 0; i < servicerIds.size(); i++) {
				putBodyParameter("ServicerId." + (i + 1) , servicerIds.get(i));
			}
		}	
	}

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
		if(currentPage != null){
			putBodyParameter("CurrentPage", currentPage.toString());
		}
	}

	public Long getCloseTimeStart() {
		return this.closeTimeStart;
	}

	public void setCloseTimeStart(Long closeTimeStart) {
		this.closeTimeStart = closeTimeStart;
		if(closeTimeStart != null){
			putBodyParameter("CloseTimeStart", closeTimeStart.toString());
		}
	}

	public List<Integer> getEvaluationLevels() {
		return this.evaluationLevels;
	}

	public void setEvaluationLevels(List<Integer> evaluationLevels) {
		this.evaluationLevels = evaluationLevels;	
		if (evaluationLevels != null) {
			for (int i = 0; i < evaluationLevels.size(); i++) {
				putBodyParameter("EvaluationLevel." + (i + 1) , evaluationLevels.get(i));
			}
		}	
	}

	public List<Integer> getEvaluationScores() {
		return this.evaluationScores;
	}

	public void setEvaluationScores(List<Integer> evaluationScores) {
		this.evaluationScores = evaluationScores;	
		if (evaluationScores != null) {
			for (int i = 0; i < evaluationScores.size(); i++) {
				putBodyParameter("EvaluationScore." + (i + 1) , evaluationScores.get(i));
			}
		}	
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putBodyParameter("InstanceId", instanceId);
		}
	}

	public List<String> getServicerNames() {
		return this.servicerNames;
	}

	public void setServicerNames(List<String> servicerNames) {
		this.servicerNames = servicerNames;	
		if (servicerNames != null) {
			for (int i = 0; i < servicerNames.size(); i++) {
				putBodyParameter("ServicerName." + (i + 1) , servicerNames.get(i));
			}
		}	
	}

	public List<Integer> getChannelTypes() {
		return this.channelTypes;
	}

	public void setChannelTypes(List<Integer> channelTypes) {
		this.channelTypes = channelTypes;	
		if (channelTypes != null) {
			for (int i = 0; i < channelTypes.size(); i++) {
				putBodyParameter("ChannelType." + (i + 1) , channelTypes.get(i));
			}
		}	
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putBodyParameter("PageSize", pageSize.toString());
		}
	}

	public Long getCloseTimeEnd() {
		return this.closeTimeEnd;
	}

	public void setCloseTimeEnd(Long closeTimeEnd) {
		this.closeTimeEnd = closeTimeEnd;
		if(closeTimeEnd != null){
			putBodyParameter("CloseTimeEnd", closeTimeEnd.toString());
		}
	}

	public List<String> getChannelIds() {
		return this.channelIds;
	}

	public void setChannelIds(List<String> channelIds) {
		this.channelIds = channelIds;	
		if (channelIds != null) {
			for (int i = 0; i < channelIds.size(); i++) {
				putBodyParameter("ChannelId." + (i + 1) , channelIds.get(i));
			}
		}	
	}

	public List<String> getMemberNames() {
		return this.memberNames;
	}

	public void setMemberNames(List<String> memberNames) {
		this.memberNames = memberNames;	
		if (memberNames != null) {
			for (int i = 0; i < memberNames.size(); i++) {
				putBodyParameter("MemberName." + (i + 1) , memberNames.get(i));
			}
		}	
	}

	public List<Long> getMemberIds() {
		return this.memberIds;
	}

	public void setMemberIds(List<Long> memberIds) {
		this.memberIds = memberIds;	
		if (memberIds != null) {
			for (int i = 0; i < memberIds.size(); i++) {
				putBodyParameter("MemberId." + (i + 1) , memberIds.get(i));
			}
		}	
	}

	@Override
	public Class<QueryTouchListResponse> getResponseClass() {
		return QueryTouchListResponse.class;
	}

}
