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

/**
 * @author auto create
 * @version 
 */
public class PhotoProcessRequest extends RpcAcsRequest<PhotoProcessResponse> {
	   

	private String project;

	private String externalID;

	private String notifyEndpoint;

	private String notifyTopicName;

	private String srcUri;

	private String style;

	private String tgtUri;
	public PhotoProcessRequest() {
		super("imm", "2017-09-06", "PhotoProcess", "imm");
		setMethod(MethodType.POST);
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

	public String getExternalID() {
		return this.externalID;
	}

	public void setExternalID(String externalID) {
		this.externalID = externalID;
		if(externalID != null){
			putQueryParameter("ExternalID", externalID);
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

	public String getNotifyTopicName() {
		return this.notifyTopicName;
	}

	public void setNotifyTopicName(String notifyTopicName) {
		this.notifyTopicName = notifyTopicName;
		if(notifyTopicName != null){
			putQueryParameter("NotifyTopicName", notifyTopicName);
		}
	}

	public String getSrcUri() {
		return this.srcUri;
	}

	public void setSrcUri(String srcUri) {
		this.srcUri = srcUri;
		if(srcUri != null){
			putQueryParameter("SrcUri", srcUri);
		}
	}

	public String getStyle() {
		return this.style;
	}

	public void setStyle(String style) {
		this.style = style;
		if(style != null){
			putQueryParameter("Style", style);
		}
	}

	public String getTgtUri() {
		return this.tgtUri;
	}

	public void setTgtUri(String tgtUri) {
		this.tgtUri = tgtUri;
		if(tgtUri != null){
			putQueryParameter("TgtUri", tgtUri);
		}
	}

	@Override
	public Class<PhotoProcessResponse> getResponseClass() {
		return PhotoProcessResponse.class;
	}

}
