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

package com.aliyuncs.arms.model.v20190808;

import com.aliyuncs.RpcAcsRequest;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.arms.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetSyntheticMonitorsRequest extends RpcAcsRequest<GetSyntheticMonitorsResponse> {
	   

	@SerializedName("filter")
	private Filter filter;
	public GetSyntheticMonitorsRequest() {
		super("ARMS", "2019-08-08", "GetSyntheticMonitors", "arms");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Filter getFilter() {
		return this.filter;
	}

	public void setFilter(Filter filter) {
		this.filter = filter;	
		if (filter != null) {
			putQueryParameter("Filter" , new Gson().toJson(filter));
		}	
	}

	public static class Filter {

		@SerializedName("TaskType")
		private Integer taskType;

		@SerializedName("MonitorCategory")
		private Integer monitorCategory;

		@SerializedName("Network")
		private Integer network;

		public Integer getTaskType() {
			return this.taskType;
		}

		public void setTaskType(Integer taskType) {
			this.taskType = taskType;
		}

		public Integer getMonitorCategory() {
			return this.monitorCategory;
		}

		public void setMonitorCategory(Integer monitorCategory) {
			this.monitorCategory = monitorCategory;
		}

		public Integer getNetwork() {
			return this.network;
		}

		public void setNetwork(Integer network) {
			this.network = network;
		}
	}

	@Override
	public Class<GetSyntheticMonitorsResponse> getResponseClass() {
		return GetSyntheticMonitorsResponse.class;
	}

}
