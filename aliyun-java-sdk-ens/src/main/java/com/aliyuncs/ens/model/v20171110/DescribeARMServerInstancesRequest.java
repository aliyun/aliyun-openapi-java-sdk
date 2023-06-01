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

package com.aliyuncs.ens.model.v20171110;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DescribeARMServerInstancesRequest extends RpcAcsRequest<DescribeARMServerInstancesResponse> {
	   

	@SerializedName("aICSpecs")
	private List<String> aICSpecs;

	private String orderByParams;

	private Boolean describeAICInstances;

	@SerializedName("serverIds")
	private List<String> serverIds;

	private String name;

	private String maxDate;

	private Integer pageNumber;

	@SerializedName("states")
	private List<String> states;

	@SerializedName("serverSpecs")
	private List<String> serverSpecs;

	private Integer pageSize;

	@SerializedName("ensRegionIds")
	private List<String> ensRegionIds;

	private String minDate;

	private String latestAction;

	private String namespace;
	public DescribeARMServerInstancesRequest() {
		super("Ens", "2017-11-10", "DescribeARMServerInstances", "ens");
		setMethod(MethodType.GET);
	}

	public List<String> getAICSpecs() {
		return this.aICSpecs;
	}

	public void setAICSpecs(List<String> aICSpecs) {
		this.aICSpecs = aICSpecs;	
		if (aICSpecs != null) {
			putQueryParameter("AICSpecs" , new Gson().toJson(aICSpecs));
		}	
	}

	public String getOrderByParams() {
		return this.orderByParams;
	}

	public void setOrderByParams(String orderByParams) {
		this.orderByParams = orderByParams;
		if(orderByParams != null){
			putQueryParameter("OrderByParams", orderByParams);
		}
	}

	public Boolean getDescribeAICInstances() {
		return this.describeAICInstances;
	}

	public void setDescribeAICInstances(Boolean describeAICInstances) {
		this.describeAICInstances = describeAICInstances;
		if(describeAICInstances != null){
			putQueryParameter("DescribeAICInstances", describeAICInstances.toString());
		}
	}

	public List<String> getServerIds() {
		return this.serverIds;
	}

	public void setServerIds(List<String> serverIds) {
		this.serverIds = serverIds;	
		if (serverIds != null) {
			putQueryParameter("ServerIds" , new Gson().toJson(serverIds));
		}	
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public String getMaxDate() {
		return this.maxDate;
	}

	public void setMaxDate(String maxDate) {
		this.maxDate = maxDate;
		if(maxDate != null){
			putQueryParameter("MaxDate", maxDate);
		}
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
		}
	}

	public List<String> getStates() {
		return this.states;
	}

	public void setStates(List<String> states) {
		this.states = states;	
		if (states != null) {
			putQueryParameter("States" , new Gson().toJson(states));
		}	
	}

	public List<String> getServerSpecs() {
		return this.serverSpecs;
	}

	public void setServerSpecs(List<String> serverSpecs) {
		this.serverSpecs = serverSpecs;	
		if (serverSpecs != null) {
			putQueryParameter("ServerSpecs" , new Gson().toJson(serverSpecs));
		}	
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public List<String> getEnsRegionIds() {
		return this.ensRegionIds;
	}

	public void setEnsRegionIds(List<String> ensRegionIds) {
		this.ensRegionIds = ensRegionIds;	
		if (ensRegionIds != null) {
			putQueryParameter("EnsRegionIds" , new Gson().toJson(ensRegionIds));
		}	
	}

	public String getMinDate() {
		return this.minDate;
	}

	public void setMinDate(String minDate) {
		this.minDate = minDate;
		if(minDate != null){
			putQueryParameter("MinDate", minDate);
		}
	}

	public String getLatestAction() {
		return this.latestAction;
	}

	public void setLatestAction(String latestAction) {
		this.latestAction = latestAction;
		if(latestAction != null){
			putQueryParameter("LatestAction", latestAction);
		}
	}

	public String getNamespace() {
		return this.namespace;
	}

	public void setNamespace(String namespace) {
		this.namespace = namespace;
		if(namespace != null){
			putQueryParameter("Namespace", namespace);
		}
	}

	@Override
	public Class<DescribeARMServerInstancesResponse> getResponseClass() {
		return DescribeARMServerInstancesResponse.class;
	}

}
