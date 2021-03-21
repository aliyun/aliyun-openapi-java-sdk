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

package com.aliyuncs.imm.model.v20170906;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.imm.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetWebofficeURLRequest extends RpcAcsRequest<GetWebofficeURLResponse> {
	   

	private String srcType;

	private String project;

	private String file;

	private Boolean hidecmb;

	private String notifyEndpoint;

	private String fileID;

	private String watermark;

	private String notifyTopicName;

	private String permission;

	private String user;
	public GetWebofficeURLRequest() {
		super("imm", "2017-09-06", "GetWebofficeURL", "imm");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSrcType() {
		return this.srcType;
	}

	public void setSrcType(String srcType) {
		this.srcType = srcType;
		if(srcType != null){
			putQueryParameter("SrcType", srcType);
		}
	}

	public String getProject() {
		return this.project;
	}

	public void setProject(String project) {
		this.project = project;
		if(project != null){
			putQueryParameter("Project", project);
		}
	}

	public String getFile() {
		return this.file;
	}

	public void setFile(String file) {
		this.file = file;
		if(file != null){
			putQueryParameter("File", file);
		}
	}

	public Boolean getHidecmb() {
		return this.hidecmb;
	}

	public void setHidecmb(Boolean hidecmb) {
		this.hidecmb = hidecmb;
		if(hidecmb != null){
			putQueryParameter("Hidecmb", hidecmb.toString());
		}
	}

	public String getNotifyEndpoint() {
		return this.notifyEndpoint;
	}

	public void setNotifyEndpoint(String notifyEndpoint) {
		this.notifyEndpoint = notifyEndpoint;
		if(notifyEndpoint != null){
			putQueryParameter("NotifyEndpoint", notifyEndpoint);
		}
	}

	public String getFileID() {
		return this.fileID;
	}

	public void setFileID(String fileID) {
		this.fileID = fileID;
		if(fileID != null){
			putQueryParameter("FileID", fileID);
		}
	}

	public String getWatermark() {
		return this.watermark;
	}

	public void setWatermark(String watermark) {
		this.watermark = watermark;
		if(watermark != null){
			putQueryParameter("Watermark", watermark);
		}
	}

	public String getNotifyTopicName() {
		return this.notifyTopicName;
	}

	public void setNotifyTopicName(String notifyTopicName) {
		this.notifyTopicName = notifyTopicName;
		if(notifyTopicName != null){
			putQueryParameter("NotifyTopicName", notifyTopicName);
		}
	}

	public String getPermission() {
		return this.permission;
	}

	public void setPermission(String permission) {
		this.permission = permission;
		if(permission != null){
			putQueryParameter("Permission", permission);
		}
	}

	public String getUser() {
		return this.user;
	}

	public void setUser(String user) {
		this.user = user;
		if(user != null){
			putQueryParameter("User", user);
		}
	}

	@Override
	public Class<GetWebofficeURLResponse> getResponseClass() {
		return GetWebofficeURLResponse.class;
	}

}
