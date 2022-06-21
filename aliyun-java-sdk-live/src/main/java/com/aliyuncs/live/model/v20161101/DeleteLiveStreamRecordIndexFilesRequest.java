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

package com.aliyuncs.live.model.v20161101;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.live.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DeleteLiveStreamRecordIndexFilesRequest extends RpcAcsRequest<DeleteLiveStreamRecordIndexFilesResponse> {
	   

	private String removeFile;

	private String appName;

	private String streamName;

	private String domainName;

	private Long ownerId;

	private List<String> recordIds;
	public DeleteLiveStreamRecordIndexFilesRequest() {
		super("live", "2016-11-01", "DeleteLiveStreamRecordIndexFiles", "live");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getRemoveFile() {
		return this.removeFile;
	}

	public void setRemoveFile(String removeFile) {
		this.removeFile = removeFile;
		if(removeFile != null){
			putQueryParameter("RemoveFile", removeFile);
		}
	}

	public String getAppName() {
		return this.appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
		if(appName != null){
			putQueryParameter("AppName", appName);
		}
	}

	public String getStreamName() {
		return this.streamName;
	}

	public void setStreamName(String streamName) {
		this.streamName = streamName;
		if(streamName != null){
			putQueryParameter("StreamName", streamName);
		}
	}

	public String getDomainName() {
		return this.domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
		if(domainName != null){
			putQueryParameter("DomainName", domainName);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public List<String> getRecordIds() {
		return this.recordIds;
	}

	public void setRecordIds(List<String> recordIds) {
		this.recordIds = recordIds;	
		if (recordIds != null) {
			for (int i = 0; i < recordIds.size(); i++) {
				putQueryParameter("RecordId." + (i + 1) , recordIds.get(i));
			}
		}	
	}

	@Override
	public Class<DeleteLiveStreamRecordIndexFilesResponse> getResponseClass() {
		return DeleteLiveStreamRecordIndexFilesResponse.class;
	}

}
