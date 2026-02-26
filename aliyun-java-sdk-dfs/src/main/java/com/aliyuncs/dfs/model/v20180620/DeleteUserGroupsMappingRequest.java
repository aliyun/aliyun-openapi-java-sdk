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

package com.aliyuncs.dfs.model.v20180620;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DeleteUserGroupsMappingRequest extends RpcAcsRequest<DeleteUserGroupsMappingResponse> {
	   

	@SerializedName("groupNames")
	private List<String> groupNames;

	private String inputRegionId;

	private String fileSystemId;

	private String userName;
	public DeleteUserGroupsMappingRequest() {
		super("DFS", "2018-06-20", "DeleteUserGroupsMapping", "alidfs");
		setMethod(MethodType.GET);
	}

	public List<String> getGroupNames() {
		return this.groupNames;
	}

	public void setGroupNames(List<String> groupNames) {
		this.groupNames = groupNames;	
		if (groupNames != null) {
			putQueryParameter("GroupNames" , new Gson().toJson(groupNames));
		}	
	}

	public String getInputRegionId() {
		return this.inputRegionId;
	}

	public void setInputRegionId(String inputRegionId) {
		this.inputRegionId = inputRegionId;
		if(inputRegionId != null){
			putQueryParameter("InputRegionId", inputRegionId);
		}
	}

	public String getFileSystemId() {
		return this.fileSystemId;
	}

	public void setFileSystemId(String fileSystemId) {
		this.fileSystemId = fileSystemId;
		if(fileSystemId != null){
			putQueryParameter("FileSystemId", fileSystemId);
		}
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
		if(userName != null){
			putQueryParameter("UserName", userName);
		}
	}

	@Override
	public Class<DeleteUserGroupsMappingResponse> getResponseClass() {
		return DeleteUserGroupsMappingResponse.class;
	}

}
