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
public class GetSchedulerInfoRequest extends RpcAcsRequest<GetSchedulerInfoResponse> {
	   

	private String clusterId;

	private List<Scheduler> schedulers;
	public GetSchedulerInfoRequest() {
		super("EHPC", "2018-04-12", "GetSchedulerInfo");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public static class Scheduler {

		private String schedName;

		public String getSchedName() {
			return this.schedName;
		}

		public void setSchedName(String schedName) {
			this.schedName = schedName;
		}
	}

	@Override
	public Class<GetSchedulerInfoResponse> getResponseClass() {
		return GetSchedulerInfoResponse.class;
	}

}
