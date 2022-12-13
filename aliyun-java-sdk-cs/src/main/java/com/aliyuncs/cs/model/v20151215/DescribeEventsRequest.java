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

package com.aliyuncs.cs.model.v20151215;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeEventsRequest extends RoaAcsRequest<DescribeEventsResponse> {
	   

	private String cluster_id;

	private Long page_number;

	private String type;

	private Long page_size;
	public DescribeEventsRequest() {
		super("CS", "2015-12-15", "DescribeEvents");
		setUriPattern("/events");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getCluster_id() {
		return this.cluster_id;
	}

	public void setCluster_id(String cluster_id) {
		this.cluster_id = cluster_id;
		if(cluster_id != null){
			putQueryParameter("cluster_id", cluster_id);
		}
	}

	public Long getPage_number() {
		return this.page_number;
	}

	public void setPage_number(Long page_number) {
		this.page_number = page_number;
		if(page_number != null){
			putQueryParameter("page_number", page_number.toString());
		}
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putQueryParameter("type", type);
		}
	}

	public Long getPage_size() {
		return this.page_size;
	}

	public void setPage_size(Long page_size) {
		this.page_size = page_size;
		if(page_size != null){
			putQueryParameter("page_size", page_size.toString());
		}
	}

	@Override
	public Class<DescribeEventsResponse> getResponseClass() {
		return DescribeEventsResponse.class;
	}

}
