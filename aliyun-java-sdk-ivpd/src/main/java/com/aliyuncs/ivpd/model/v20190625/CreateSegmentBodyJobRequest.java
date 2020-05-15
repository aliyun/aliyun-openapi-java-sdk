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

package com.aliyuncs.ivpd.model.v20190625;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ivpd.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateSegmentBodyJobRequest extends RpcAcsRequest<CreateSegmentBodyJobResponse> {
	   

	private List<DataList> dataLists;

	private String jobId;

	private Integer timeToLive;
	public CreateSegmentBodyJobRequest() {
		super("ivpd", "2019-06-25", "CreateSegmentBodyJob");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<DataList> getDataLists() {
		return this.dataLists;
	}

	public void setDataLists(List<DataList> dataLists) {
		this.dataLists = dataLists;	
		if (dataLists != null) {
			for (int depth1 = 0; depth1 < dataLists.size(); depth1++) {
				putBodyParameter("DataList." + (depth1 + 1) + ".DataId" , dataLists.get(depth1).getDataId());
				putBodyParameter("DataList." + (depth1 + 1) + ".ImageUrl" , dataLists.get(depth1).getImageUrl());
			}
		}	
	}

	public String getJobId() {
		return this.jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
		if(jobId != null){
			putBodyParameter("JobId", jobId);
		}
	}

	public Integer getTimeToLive() {
		return this.timeToLive;
	}

	public void setTimeToLive(Integer timeToLive) {
		this.timeToLive = timeToLive;
		if(timeToLive != null){
			putBodyParameter("TimeToLive", timeToLive.toString());
		}
	}

	public static class DataList {

		private String dataId;

		private String imageUrl;

		public String getDataId() {
			return this.dataId;
		}

		public void setDataId(String dataId) {
			this.dataId = dataId;
		}

		public String getImageUrl() {
			return this.imageUrl;
		}

		public void setImageUrl(String imageUrl) {
			this.imageUrl = imageUrl;
		}
	}

	@Override
	public Class<CreateSegmentBodyJobResponse> getResponseClass() {
		return CreateSegmentBodyJobResponse.class;
	}

}
