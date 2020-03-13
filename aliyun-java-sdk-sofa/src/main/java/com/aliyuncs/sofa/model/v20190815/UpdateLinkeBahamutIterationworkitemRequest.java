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

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateLinkeBahamutIterationworkitemRequest extends RpcAcsRequest<UpdateLinkeBahamutIterationworkitemResponse> {
	   

	private List<WorkItems> workItemss;

	private String iterationExternalId;
	public UpdateLinkeBahamutIterationworkitemRequest() {
		super("SOFA", "2019-08-15", "UpdateLinkeBahamutIterationworkitem", "ApplySidecarCert");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<WorkItems> getWorkItemss() {
		return this.workItemss;
	}

	public void setWorkItemss(List<WorkItems> workItemss) {
		this.workItemss = workItemss;	
		if (workItemss != null) {
			for (int depth1 = 0; depth1 < workItemss.size(); depth1++) {
				putBodyParameter("WorkItems." + (depth1 + 1) + ".Creator" , workItemss.get(depth1).getCreator());
				putBodyParameter("WorkItems." + (depth1 + 1) + ".MergeRequestId" , workItemss.get(depth1).getMergeRequestId());
				putBodyParameter("WorkItems." + (depth1 + 1) + ".Created" , workItemss.get(depth1).getCreated());
				putBodyParameter("WorkItems." + (depth1 + 1) + ".Subject" , workItemss.get(depth1).getSubject());
				putBodyParameter("WorkItems." + (depth1 + 1) + ".Link" , workItemss.get(depth1).getLink());
				putBodyParameter("WorkItems." + (depth1 + 1) + ".ExternalId" , workItemss.get(depth1).getExternalId());
				putBodyParameter("WorkItems." + (depth1 + 1) + ".Stamp" , workItemss.get(depth1).getStamp());
				putBodyParameter("WorkItems." + (depth1 + 1) + ".AcHour" , workItemss.get(depth1).getAcHour());
				putBodyParameter("WorkItems." + (depth1 + 1) + ".EsHour" , workItemss.get(depth1).getEsHour());
				putBodyParameter("WorkItems." + (depth1 + 1) + ".Priority" , workItemss.get(depth1).getPriority());
				putBodyParameter("WorkItems." + (depth1 + 1) + ".Sys" , workItemss.get(depth1).getSys());
				putBodyParameter("WorkItems." + (depth1 + 1) + ".AssignedTo" , workItemss.get(depth1).getAssignedTo());
				putBodyParameter("WorkItems." + (depth1 + 1) + ".Url" , workItemss.get(depth1).getUrl());
				putBodyParameter("WorkItems." + (depth1 + 1) + ".PriorityId" , workItemss.get(depth1).getPriorityId());
				putBodyParameter("WorkItems." + (depth1 + 1) + ".IterationExternalId" , workItemss.get(depth1).getIterationExternalId());
				putBodyParameter("WorkItems." + (depth1 + 1) + ".Deleted" , workItemss.get(depth1).getDeleted());
				putBodyParameter("WorkItems." + (depth1 + 1) + ".StatusId" , workItemss.get(depth1).getStatusId());
				putBodyParameter("WorkItems." + (depth1 + 1) + ".CreatorStaffId" , workItemss.get(depth1).getCreatorStaffId());
				putBodyParameter("WorkItems." + (depth1 + 1) + ".LastModified" , workItemss.get(depth1).getLastModified());
				putBodyParameter("WorkItems." + (depth1 + 1) + ".StatusStage" , workItemss.get(depth1).getStatusStage());
				putBodyParameter("WorkItems." + (depth1 + 1) + ".Progress" , workItemss.get(depth1).getProgress());
				putBodyParameter("WorkItems." + (depth1 + 1) + ".Id" , workItemss.get(depth1).getId());
				putBodyParameter("WorkItems." + (depth1 + 1) + ".AssignedToStaffId" , workItemss.get(depth1).getAssignedToStaffId());
				putBodyParameter("WorkItems." + (depth1 + 1) + ".Status" , workItemss.get(depth1).getStatus());
			}
		}	
	}

	public String getIterationExternalId() {
		return this.iterationExternalId;
	}

	public void setIterationExternalId(String iterationExternalId) {
		this.iterationExternalId = iterationExternalId;
		if(iterationExternalId != null){
			putBodyParameter("IterationExternalId", iterationExternalId);
		}
	}

	public static class WorkItems {

		private String creator;

		private String mergeRequestId;

		private Long created;

		private String subject;

		private String link;

		private String externalId;

		private String stamp;

		private String acHour;

		private String esHour;

		private String priority;

		private String sys;

		private String assignedTo;

		private String url;

		private String priorityId;

		private String iterationExternalId;

		private Boolean deleted;

		private String statusId;

		private String creatorStaffId;

		private Long lastModified;

		private String statusStage;

		private String progress;

		private String id;

		private String assignedToStaffId;

		private String status;

		public String getCreator() {
			return this.creator;
		}

		public void setCreator(String creator) {
			this.creator = creator;
		}

		public String getMergeRequestId() {
			return this.mergeRequestId;
		}

		public void setMergeRequestId(String mergeRequestId) {
			this.mergeRequestId = mergeRequestId;
		}

		public Long getCreated() {
			return this.created;
		}

		public void setCreated(Long created) {
			this.created = created;
		}

		public String getSubject() {
			return this.subject;
		}

		public void setSubject(String subject) {
			this.subject = subject;
		}

		public String getLink() {
			return this.link;
		}

		public void setLink(String link) {
			this.link = link;
		}

		public String getExternalId() {
			return this.externalId;
		}

		public void setExternalId(String externalId) {
			this.externalId = externalId;
		}

		public String getStamp() {
			return this.stamp;
		}

		public void setStamp(String stamp) {
			this.stamp = stamp;
		}

		public String getAcHour() {
			return this.acHour;
		}

		public void setAcHour(String acHour) {
			this.acHour = acHour;
		}

		public String getEsHour() {
			return this.esHour;
		}

		public void setEsHour(String esHour) {
			this.esHour = esHour;
		}

		public String getPriority() {
			return this.priority;
		}

		public void setPriority(String priority) {
			this.priority = priority;
		}

		public String getSys() {
			return this.sys;
		}

		public void setSys(String sys) {
			this.sys = sys;
		}

		public String getAssignedTo() {
			return this.assignedTo;
		}

		public void setAssignedTo(String assignedTo) {
			this.assignedTo = assignedTo;
		}

		public String getUrl() {
			return this.url;
		}

		public void setUrl(String url) {
			this.url = url;
		}

		public String getPriorityId() {
			return this.priorityId;
		}

		public void setPriorityId(String priorityId) {
			this.priorityId = priorityId;
		}

		public String getIterationExternalId() {
			return this.iterationExternalId;
		}

		public void setIterationExternalId(String iterationExternalId) {
			this.iterationExternalId = iterationExternalId;
		}

		public Boolean getDeleted() {
			return this.deleted;
		}

		public void setDeleted(Boolean deleted) {
			this.deleted = deleted;
		}

		public String getStatusId() {
			return this.statusId;
		}

		public void setStatusId(String statusId) {
			this.statusId = statusId;
		}

		public String getCreatorStaffId() {
			return this.creatorStaffId;
		}

		public void setCreatorStaffId(String creatorStaffId) {
			this.creatorStaffId = creatorStaffId;
		}

		public Long getLastModified() {
			return this.lastModified;
		}

		public void setLastModified(Long lastModified) {
			this.lastModified = lastModified;
		}

		public String getStatusStage() {
			return this.statusStage;
		}

		public void setStatusStage(String statusStage) {
			this.statusStage = statusStage;
		}

		public String getProgress() {
			return this.progress;
		}

		public void setProgress(String progress) {
			this.progress = progress;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getAssignedToStaffId() {
			return this.assignedToStaffId;
		}

		public void setAssignedToStaffId(String assignedToStaffId) {
			this.assignedToStaffId = assignedToStaffId;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}
	}

	@Override
	public Class<UpdateLinkeBahamutIterationworkitemResponse> getResponseClass() {
		return UpdateLinkeBahamutIterationworkitemResponse.class;
	}

}
