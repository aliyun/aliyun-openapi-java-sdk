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

package com.aliyuncs.ehpc.model.v20180412;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ehpc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SetSchedulerInfoRequest extends RpcAcsRequest<SetSchedulerInfoResponse> {
	   

	private List<SlurmInfo> slurmInfos;

	private String clusterId;

	private List<Scheduler> schedulers;

	private List<PbsInfo> pbsInfos;
	public SetSchedulerInfoRequest() {
		super("EHPC", "2018-04-12", "SetSchedulerInfo");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<SlurmInfo> getSlurmInfos() {
		return this.slurmInfos;
	}

	public void setSlurmInfos(List<SlurmInfo> slurmInfos) {
		this.slurmInfos = slurmInfos;	
		if (slurmInfos != null) {
			for (int depth1 = 0; depth1 < slurmInfos.size(); depth1++) {
				putQueryParameter("SlurmInfo." + (depth1 + 1) + ".SchedInterval" , slurmInfos.get(depth1).getSchedInterval());
				putQueryParameter("SlurmInfo." + (depth1 + 1) + ".BackfillInterval" , slurmInfos.get(depth1).getBackfillInterval());
			}
		}	
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		if(clusterId != null){
			putQueryParameter("ClusterId", clusterId);
		}
	}

	public List<Scheduler> getSchedulers() {
		return this.schedulers;
	}

	public void setSchedulers(List<Scheduler> schedulers) {
		this.schedulers = schedulers;	
		if (schedulers != null) {
			for (int depth1 = 0; depth1 < schedulers.size(); depth1++) {
				putQueryParameter("Scheduler." + (depth1 + 1) + ".SchedName" , schedulers.get(depth1).getSchedName());
			}
		}	
	}

	public List<PbsInfo> getPbsInfos() {
		return this.pbsInfos;
	}

	public void setPbsInfos(List<PbsInfo> pbsInfos) {
		this.pbsInfos = pbsInfos;	
		if (pbsInfos != null) {
			for (int depth1 = 0; depth1 < pbsInfos.size(); depth1++) {
				putQueryParameter("PbsInfo." + (depth1 + 1) + ".SchedInterval" , pbsInfos.get(depth1).getSchedInterval());
				if (pbsInfos.get(depth1).getResourceLimits() != null) {
					for (int depth2 = 0; depth2 < pbsInfos.get(depth1).getResourceLimits().size(); depth2++) {
						putQueryParameter("PbsInfo." + (depth1 + 1) + ".ResourceLimit." + (depth2 + 1) + ".Nodes" , pbsInfos.get(depth1).getResourceLimits().get(depth2).getNodes());
						putQueryParameter("PbsInfo." + (depth1 + 1) + ".ResourceLimit." + (depth2 + 1) + ".Mem" , pbsInfos.get(depth1).getResourceLimits().get(depth2).getMem());
						putQueryParameter("PbsInfo." + (depth1 + 1) + ".ResourceLimit." + (depth2 + 1) + ".Cpus" , pbsInfos.get(depth1).getResourceLimits().get(depth2).getCpus());
						putQueryParameter("PbsInfo." + (depth1 + 1) + ".ResourceLimit." + (depth2 + 1) + ".User" , pbsInfos.get(depth1).getResourceLimits().get(depth2).getUser());
						putQueryParameter("PbsInfo." + (depth1 + 1) + ".ResourceLimit." + (depth2 + 1) + ".Queue" , pbsInfos.get(depth1).getResourceLimits().get(depth2).getQueue());
					}
				}
				if (pbsInfos.get(depth1).getAclLimits() != null) {
					for (int depth2 = 0; depth2 < pbsInfos.get(depth1).getAclLimits().size(); depth2++) {
						putQueryParameter("PbsInfo." + (depth1 + 1) + ".AclLimit." + (depth2 + 1) + ".AclUsers" , pbsInfos.get(depth1).getAclLimits().get(depth2).getAclUsers());
						putQueryParameter("PbsInfo." + (depth1 + 1) + ".AclLimit." + (depth2 + 1) + ".Queue" , pbsInfos.get(depth1).getAclLimits().get(depth2).getQueue());
					}
				}
				putQueryParameter("PbsInfo." + (depth1 + 1) + ".JobHistoryDuration" , pbsInfos.get(depth1).getJobHistoryDuration());
			}
		}	
	}

	public static class SlurmInfo {

		private Integer schedInterval;

		private Integer backfillInterval;

		public Integer getSchedInterval() {
			return this.schedInterval;
		}

		public void setSchedInterval(Integer schedInterval) {
			this.schedInterval = schedInterval;
		}

		public Integer getBackfillInterval() {
			return this.backfillInterval;
		}

		public void setBackfillInterval(Integer backfillInterval) {
			this.backfillInterval = backfillInterval;
		}
	}

	public static class Scheduler {

		private String schedName;

		public String getSchedName() {
			return this.schedName;
		}

		public void setSchedName(String schedName) {
			this.schedName = schedName;
		}
	}

	public static class PbsInfo {

		private Integer schedInterval;

		private List<ResourceLimit> resourceLimits;

		private List<AclLimit> aclLimits;

		private Integer jobHistoryDuration;

		public Integer getSchedInterval() {
			return this.schedInterval;
		}

		public void setSchedInterval(Integer schedInterval) {
			this.schedInterval = schedInterval;
		}

		public List<ResourceLimit> getResourceLimits() {
			return this.resourceLimits;
		}

		public void setResourceLimits(List<ResourceLimit> resourceLimits) {
			this.resourceLimits = resourceLimits;
		}

		public List<AclLimit> getAclLimits() {
			return this.aclLimits;
		}

		public void setAclLimits(List<AclLimit> aclLimits) {
			this.aclLimits = aclLimits;
		}

		public Integer getJobHistoryDuration() {
			return this.jobHistoryDuration;
		}

		public void setJobHistoryDuration(Integer jobHistoryDuration) {
			this.jobHistoryDuration = jobHistoryDuration;
		}

		public static class ResourceLimit {

			private Integer nodes;

			private String mem;

			private Integer cpus;

			private String user;

			private String queue;

			public Integer getNodes() {
				return this.nodes;
			}

			public void setNodes(Integer nodes) {
				this.nodes = nodes;
			}

			public String getMem() {
				return this.mem;
			}

			public void setMem(String mem) {
				this.mem = mem;
			}

			public Integer getCpus() {
				return this.cpus;
			}

			public void setCpus(Integer cpus) {
				this.cpus = cpus;
			}

			public String getUser() {
				return this.user;
			}

			public void setUser(String user) {
				this.user = user;
			}

			public String getQueue() {
				return this.queue;
			}

			public void setQueue(String queue) {
				this.queue = queue;
			}
		}

		public static class AclLimit {

			private String aclUsers;

			private String queue;

			public String getAclUsers() {
				return this.aclUsers;
			}

			public void setAclUsers(String aclUsers) {
				this.aclUsers = aclUsers;
			}

			public String getQueue() {
				return this.queue;
			}

			public void setQueue(String queue) {
				this.queue = queue;
			}
		}
	}

	@Override
	public Class<SetSchedulerInfoResponse> getResponseClass() {
		return SetSchedulerInfoResponse.class;
	}

}
