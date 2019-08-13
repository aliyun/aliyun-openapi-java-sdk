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

package com.aliyuncs.emr.model.v20160408;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.emr.transform.v20160408.DescribeFlowProjectClusterSettingResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeFlowProjectClusterSettingResponse extends AcsResponse {

	private String requestId;

	private Long gmtCreate;

	private Long gmtModified;

	private String projectId;

	private String clusterId;

	private String defaultUser;

	private String defaultQueue;

	private List<String> userList;

	private List<String> queueList;

	private List<String> hostList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getGmtCreate() {
		return this.gmtCreate;
	}

	public void setGmtCreate(Long gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Long getGmtModified() {
		return this.gmtModified;
	}

	public void setGmtModified(Long gmtModified) {
		this.gmtModified = gmtModified;
	}

	public String getProjectId() {
		return this.projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
	}

	public String getDefaultUser() {
		return this.defaultUser;
	}

	public void setDefaultUser(String defaultUser) {
		this.defaultUser = defaultUser;
	}

	public String getDefaultQueue() {
		return this.defaultQueue;
	}

	public void setDefaultQueue(String defaultQueue) {
		this.defaultQueue = defaultQueue;
	}

	public List<String> getUserList() {
		return this.userList;
	}

	public void setUserList(List<String> userList) {
		this.userList = userList;
	}

	public List<String> getQueueList() {
		return this.queueList;
	}

	public void setQueueList(List<String> queueList) {
		this.queueList = queueList;
	}

	public List<String> getHostList() {
		return this.hostList;
	}

	public void setHostList(List<String> hostList) {
		this.hostList = hostList;
	}

	@Override
	public DescribeFlowProjectClusterSettingResponse getInstance(UnmarshallerContext context) {
		return	DescribeFlowProjectClusterSettingResponseUnmarshaller.unmarshall(this, context);
	}
}
