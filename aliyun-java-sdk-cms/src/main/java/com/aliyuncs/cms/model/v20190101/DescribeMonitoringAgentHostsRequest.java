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

package com.aliyuncs.cms.model.v20190101;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class DescribeMonitoringAgentHostsRequest extends RpcAcsRequest<DescribeMonitoringAgentHostsResponse> {
	
	public DescribeMonitoringAgentHostsRequest() {
		super("Cms", "2019-01-01", "DescribeMonitoringAgentHosts", "cms");
	}

	private String hostName;

	private String instanceIds;

	private String instanceRegionId;

	private Integer pageSize;

	private String keyWord;

	private String serialNumbers;

	private Integer pageNumber;

	public String getHostName() {
		return this.hostName;
	}

	public void setHostName(String hostName) {
		this.hostName = hostName;
		if(hostName != null){
			putQueryParameter("HostName", hostName);
		}
	}

	public String getInstanceIds() {
		return this.instanceIds;
	}

	public void setInstanceIds(String instanceIds) {
		this.instanceIds = instanceIds;
		if(instanceIds != null){
			putQueryParameter("InstanceIds", instanceIds);
		}
	}

	public String getInstanceRegionId() {
		return this.instanceRegionId;
	}

	public void setInstanceRegionId(String instanceRegionId) {
		this.instanceRegionId = instanceRegionId;
		if(instanceRegionId != null){
			putQueryParameter("InstanceRegionId", instanceRegionId);
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

	public String getKeyWord() {
		return this.keyWord;
	}

	public void setKeyWord(String keyWord) {
		this.keyWord = keyWord;
		if(keyWord != null){
			putQueryParameter("KeyWord", keyWord);
		}
	}

	public String getSerialNumbers() {
		return this.serialNumbers;
	}

	public void setSerialNumbers(String serialNumbers) {
		this.serialNumbers = serialNumbers;
		if(serialNumbers != null){
			putQueryParameter("SerialNumbers", serialNumbers);
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

	@Override
	public Class<DescribeMonitoringAgentHostsResponse> getResponseClass() {
		return DescribeMonitoringAgentHostsResponse.class;
	}

}
