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
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListMqSofamqWarnHistoryRequest extends RpcAcsRequest<ListMqSofamqWarnHistoryResponse> {
	   

	private String cell;

	private Long pageNum;

	private Long pageSize;

	private String groupId;

	private String instanceId;

	private String topic;

	private Long warnId;
	public ListMqSofamqWarnHistoryRequest() {
		super("SOFA", "2019-08-15", "ListMqSofamqWarnHistory", "sofacafedeps");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getCell() {
		return this.cell;
	}

	public void setCell(String cell) {
		this.cell = cell;
		if(cell != null){
			putBodyParameter("Cell", cell);
		}
	}

	public Long getPageNum() {
		return this.pageNum;
	}

	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
		if(pageNum != null){
			putBodyParameter("PageNum", pageNum.toString());
		}
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putBodyParameter("PageSize", pageSize.toString());
		}
	}

	public String getGroupId() {
		return this.groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
		if(groupId != null){
			putBodyParameter("GroupId", groupId);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putBodyParameter("InstanceId", instanceId);
		}
	}

	public String getTopic() {
		return this.topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
		if(topic != null){
			putBodyParameter("Topic", topic);
		}
	}

	public Long getWarnId() {
		return this.warnId;
	}

	public void setWarnId(Long warnId) {
		this.warnId = warnId;
		if(warnId != null){
			putBodyParameter("WarnId", warnId.toString());
		}
	}

	@Override
	public Class<ListMqSofamqWarnHistoryResponse> getResponseClass() {
		return ListMqSofamqWarnHistoryResponse.class;
	}

}
