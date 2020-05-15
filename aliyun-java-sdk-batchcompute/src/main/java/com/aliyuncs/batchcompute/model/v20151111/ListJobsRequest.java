/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.batchcompute.model.v20151111;

import com.aliyuncs.batchcompute.main.v20151111.BatchComputeRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListJobsRequest extends BatchComputeRequest<ListJobsResponse> {
	
	public ListJobsRequest() {
		super("BatchCompute", "2015-11-11", "ListJobs");
		setUriPattern("/jobs");
		setMethod(MethodType.GET);
	}


	private String marker;
	private int maxItemCount= 50;
	private String state;
	private boolean IsReverse;
	private String ClusterId;
	private String OrderBy;

	public String getMarker() {
		return marker;
	}

	public void setMarker(String marker) {
		this.marker = marker;
		if(marker!=null && !marker.equals("")) {
			this.putQueryParameter("Marker", marker);
		}
	}

	public int getMaxItemCount() {
		return maxItemCount;
	}

	public void setMaxItemCount(int maxItemCount) {
		this.maxItemCount = maxItemCount;
		this.putQueryParameter("MaxItemCount",maxItemCount);
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
		if(state!=null && !state.equals("")) {
			this.putQueryParameter("State", state);
		}
	}

	public String getClusterId() {
		return ClusterId;
	}

	public void setClusterId(String clusterId) {
		this.ClusterId = clusterId;
		this.putQueryParameter("ClusterId", clusterId);
	}



	public String getOrderBy() {
		return OrderBy;
	}

	public void setOrderBy(String orderBy) {
		this.OrderBy = orderBy;
		this.putQueryParameter("OrderBy", orderBy);
	}



	public boolean isReverse() {
		return this.IsReverse;
	}

	public void setReverse(boolean reverse) {
		this.IsReverse = reverse;
		this.putQueryParameter("IsReverse", reverse+"");
	}

	@Override
	public Class<ListJobsResponse> getResponseClass() {
		return ListJobsResponse.class;
	}

}
