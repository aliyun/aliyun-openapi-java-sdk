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

package com.aliyuncs.eds_aic.model.v20230930;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DescribeBackupFilesRequest extends RpcAcsRequest<DescribeBackupFilesResponse> {
	   

	private String backupFileName;

	private String instanceGroupId;

	private List<String> statusLists;

	private String description;

	private String startTime;

	private String backupFileId;

	private String androidInstanceId;

	private String nextToken;

	private Boolean backupAll;

	private String endUserId;

	private String androidInstanceName;

	private String endTime;

	private Long maxResults;
	public DescribeBackupFilesRequest() {
		super("eds-aic", "2023-09-30", "DescribeBackupFiles");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public String getBackupFileName() {
		return this.backupFileName;
	}

	public void setBackupFileName(String backupFileName) {
		this.backupFileName = backupFileName;
		if(backupFileName != null){
			putQueryParameter("BackupFileName", backupFileName);
		}
	}

	public String getInstanceGroupId() {
		return this.instanceGroupId;
	}

	public void setInstanceGroupId(String instanceGroupId) {
		this.instanceGroupId = instanceGroupId;
		if(instanceGroupId != null){
			putQueryParameter("InstanceGroupId", instanceGroupId);
		}
	}

	public List<String> getStatusLists() {
		return this.statusLists;
	}

	public void setStatusLists(List<String> statusLists) {
		this.statusLists = statusLists;	
		if (statusLists != null) {
			for (int i = 0; i < statusLists.size(); i++) {
				putQueryParameter("StatusList." + (i + 1) , statusLists.get(i));
			}
		}	
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putQueryParameter("StartTime", startTime);
		}
	}

	public String getBackupFileId() {
		return this.backupFileId;
	}

	public void setBackupFileId(String backupFileId) {
		this.backupFileId = backupFileId;
		if(backupFileId != null){
			putQueryParameter("BackupFileId", backupFileId);
		}
	}

	public String getAndroidInstanceId() {
		return this.androidInstanceId;
	}

	public void setAndroidInstanceId(String androidInstanceId) {
		this.androidInstanceId = androidInstanceId;
		if(androidInstanceId != null){
			putQueryParameter("AndroidInstanceId", androidInstanceId);
		}
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
		if(nextToken != null){
			putQueryParameter("NextToken", nextToken);
		}
	}

	public Boolean getBackupAll() {
		return this.backupAll;
	}

	public void setBackupAll(Boolean backupAll) {
		this.backupAll = backupAll;
		if(backupAll != null){
			putQueryParameter("BackupAll", backupAll.toString());
		}
	}

	public String getEndUserId() {
		return this.endUserId;
	}

	public void setEndUserId(String endUserId) {
		this.endUserId = endUserId;
		if(endUserId != null){
			putQueryParameter("EndUserId", endUserId);
		}
	}

	public String getAndroidInstanceName() {
		return this.androidInstanceName;
	}

	public void setAndroidInstanceName(String androidInstanceName) {
		this.androidInstanceName = androidInstanceName;
		if(androidInstanceName != null){
			putQueryParameter("AndroidInstanceName", androidInstanceName);
		}
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putQueryParameter("EndTime", endTime);
		}
	}

	public Long getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Long maxResults) {
		this.maxResults = maxResults;
		if(maxResults != null){
			putQueryParameter("MaxResults", maxResults.toString());
		}
	}

	@Override
	public Class<DescribeBackupFilesResponse> getResponseClass() {
		return DescribeBackupFilesResponse.class;
	}

}
