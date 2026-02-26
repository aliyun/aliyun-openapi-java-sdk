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
public class DescribeEdgeMachinesRequest extends RoaAcsRequest<DescribeEdgeMachinesResponse> {
	   

	private String hostname;

	private String online_state;

	private Long page_number;

	private String model;

	private String life_state;

	private Long page_size;
	public DescribeEdgeMachinesRequest() {
		super("CS", "2015-12-15", "DescribeEdgeMachines");
		setUriPattern("/edge_machines");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getHostname() {
		return this.hostname;
	}

	public void setHostname(String hostname) {
		this.hostname = hostname;
		if(hostname != null){
			putQueryParameter("hostname", hostname);
		}
	}

	public String getOnline_state() {
		return this.online_state;
	}

	public void setOnline_state(String online_state) {
		this.online_state = online_state;
		if(online_state != null){
			putQueryParameter("online_state", online_state);
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

	public String getModel() {
		return this.model;
	}

	public void setModel(String model) {
		this.model = model;
		if(model != null){
			putQueryParameter("model", model);
		}
	}

	public String getLife_state() {
		return this.life_state;
	}

	public void setLife_state(String life_state) {
		this.life_state = life_state;
		if(life_state != null){
			putQueryParameter("life_state", life_state);
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
	public Class<DescribeEdgeMachinesResponse> getResponseClass() {
		return DescribeEdgeMachinesResponse.class;
	}

}
