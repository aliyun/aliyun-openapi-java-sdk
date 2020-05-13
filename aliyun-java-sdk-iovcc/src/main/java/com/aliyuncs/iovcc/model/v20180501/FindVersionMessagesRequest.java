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

package com.aliyuncs.iovcc.model.v20180501;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.iovcc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class FindVersionMessagesRequest extends RpcAcsRequest<FindVersionMessagesResponse> {
	   

	private String messageType;

	private String versionId;

	private Integer pageSize;

	private Integer pageIndex;

	private String testId;

	private String sendRecordId;

	private String projectId;

	private String deviceId;

	private String versionType;
	public FindVersionMessagesRequest() {
		super("iovcc", "2018-05-01", "FindVersionMessages", "iovcc");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getMessageType() {
		return this.messageType;
	}

	public void setMessageType(String messageType) {
		this.messageType = messageType;
		if(messageType != null){
			putQueryParameter("MessageType", messageType);
		}
	}

	public String getVersionId() {
		return this.versionId;
	}

	public void setVersionId(String versionId) {
		this.versionId = versionId;
		if(versionId != null){
			putQueryParameter("VersionId", versionId);
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

	public Integer getPageIndex() {
		return this.pageIndex;
	}

	public void setPageIndex(Integer pageIndex) {
		this.pageIndex = pageIndex;
		if(pageIndex != null){
			putQueryParameter("PageIndex", pageIndex.toString());
		}
	}

	public String getTestId() {
		return this.testId;
	}

	public void setTestId(String testId) {
		this.testId = testId;
		if(testId != null){
			putQueryParameter("TestId", testId);
		}
	}

	public String getSendRecordId() {
		return this.sendRecordId;
	}

	public void setSendRecordId(String sendRecordId) {
		this.sendRecordId = sendRecordId;
		if(sendRecordId != null){
			putQueryParameter("SendRecordId", sendRecordId);
		}
	}

	public String getProjectId() {
		return this.projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
		if(projectId != null){
			putQueryParameter("ProjectId", projectId);
		}
	}

	public String getDeviceId() {
		return this.deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
		if(deviceId != null){
			putQueryParameter("DeviceId", deviceId);
		}
	}

	public String getVersionType() {
		return this.versionType;
	}

	public void setVersionType(String versionType) {
		this.versionType = versionType;
		if(versionType != null){
			putQueryParameter("VersionType", versionType);
		}
	}

	@Override
	public Class<FindVersionMessagesResponse> getResponseClass() {
		return FindVersionMessagesResponse.class;
	}

}
