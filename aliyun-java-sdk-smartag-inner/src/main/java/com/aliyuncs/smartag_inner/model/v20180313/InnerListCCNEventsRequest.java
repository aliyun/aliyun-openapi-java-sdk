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

package com.aliyuncs.smartag_inner.model.v20180313;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class InnerListCCNEventsRequest extends RpcAcsRequest<InnerListCCNEventsResponse> {
	
	public InnerListCCNEventsRequest() {
		super("Smartag-inner", "2018-03-13", "InnerListCCNEvents", "smartag", "innerAPI");
	}

	private String access_key_id;

	private String handlerIp;

	private String sourceNamespace;

	private Integer pageNumber;

	private String regionNo;

	private String instanceId;

	private String namespace;

	private Integer pageSize;

	private String sourceInstanceId;

	private String state;

	private String schedulerIp;

	public String getAccess_key_id() {
		return this.access_key_id;
	}

	public void setAccess_key_id(String access_key_id) {
		this.access_key_id = access_key_id;
		if(access_key_id != null){
			putQueryParameter("access_key_id", access_key_id);
		}
	}

	public String getHandlerIp() {
		return this.handlerIp;
	}

	public void setHandlerIp(String handlerIp) {
		this.handlerIp = handlerIp;
		if(handlerIp != null){
			putQueryParameter("HandlerIp", handlerIp);
		}
	}

	public String getSourceNamespace() {
		return this.sourceNamespace;
	}

	public void setSourceNamespace(String sourceNamespace) {
		this.sourceNamespace = sourceNamespace;
		if(sourceNamespace != null){
			putQueryParameter("SourceNamespace", sourceNamespace);
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

	public String getRegionNo() {
		return this.regionNo;
	}

	public void setRegionNo(String regionNo) {
		this.regionNo = regionNo;
		if(regionNo != null){
			putQueryParameter("RegionNo", regionNo);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
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

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public String getSourceInstanceId() {
		return this.sourceInstanceId;
	}

	public void setSourceInstanceId(String sourceInstanceId) {
		this.sourceInstanceId = sourceInstanceId;
		if(sourceInstanceId != null){
			putQueryParameter("SourceInstanceId", sourceInstanceId);
		}
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
		if(state != null){
			putQueryParameter("State", state);
		}
	}

	public String getSchedulerIp() {
		return this.schedulerIp;
	}

	public void setSchedulerIp(String schedulerIp) {
		this.schedulerIp = schedulerIp;
		if(schedulerIp != null){
			putQueryParameter("SchedulerIp", schedulerIp);
		}
	}

	@Override
	public Class<InnerListCCNEventsResponse> getResponseClass() {
		return InnerListCCNEventsResponse.class;
	}

}
