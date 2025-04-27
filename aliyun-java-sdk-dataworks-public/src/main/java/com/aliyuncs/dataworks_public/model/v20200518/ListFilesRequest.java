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

package com.aliyuncs.dataworks_public.model.v20200518;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dataworks_public.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListFilesRequest extends RpcAcsRequest<ListFilesResponse> {
	   

	private String owner;

	private String fileTypes;

	private Boolean needContent;

	private Boolean needAbsoluteFolderPath;

	private String projectIdentifier;

	private Integer pageNumber;

	private String fileIdIn;

	private String lastEditUser;

	private String fileFolderPath;

	private Integer pageSize;

	private String exactFileName;

	private String keyword;

	private Long projectId;

	private String useType;

	private Long nodeId;
	public ListFilesRequest() {
		super("dataworks-public", "2020-05-18", "ListFiles");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getOwner() {
		return this.owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
		if(owner != null){
			putBodyParameter("Owner", owner);
		}
	}

	public String getFileTypes() {
		return this.fileTypes;
	}

	public void setFileTypes(String fileTypes) {
		this.fileTypes = fileTypes;
		if(fileTypes != null){
			putBodyParameter("FileTypes", fileTypes);
		}
	}

	public Boolean getNeedContent() {
		return this.needContent;
	}

	public void setNeedContent(Boolean needContent) {
		this.needContent = needContent;
		if(needContent != null){
			putBodyParameter("NeedContent", needContent.toString());
		}
	}

	public Boolean getNeedAbsoluteFolderPath() {
		return this.needAbsoluteFolderPath;
	}

	public void setNeedAbsoluteFolderPath(Boolean needAbsoluteFolderPath) {
		this.needAbsoluteFolderPath = needAbsoluteFolderPath;
		if(needAbsoluteFolderPath != null){
			putBodyParameter("NeedAbsoluteFolderPath", needAbsoluteFolderPath.toString());
		}
	}

	public String getProjectIdentifier() {
		return this.projectIdentifier;
	}

	public void setProjectIdentifier(String projectIdentifier) {
		this.projectIdentifier = projectIdentifier;
		if(projectIdentifier != null){
			putBodyParameter("ProjectIdentifier", projectIdentifier);
		}
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putBodyParameter("PageNumber", pageNumber.toString());
		}
	}

	public String getFileIdIn() {
		return this.fileIdIn;
	}

	public void setFileIdIn(String fileIdIn) {
		this.fileIdIn = fileIdIn;
		if(fileIdIn != null){
			putBodyParameter("FileIdIn", fileIdIn);
		}
	}

	public String getLastEditUser() {
		return this.lastEditUser;
	}

	public void setLastEditUser(String lastEditUser) {
		this.lastEditUser = lastEditUser;
		if(lastEditUser != null){
			putBodyParameter("LastEditUser", lastEditUser);
		}
	}

	public String getFileFolderPath() {
		return this.fileFolderPath;
	}

	public void setFileFolderPath(String fileFolderPath) {
		this.fileFolderPath = fileFolderPath;
		if(fileFolderPath != null){
			putBodyParameter("FileFolderPath", fileFolderPath);
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putBodyParameter("PageSize", pageSize.toString());
		}
	}

	public String getExactFileName() {
		return this.exactFileName;
	}

	public void setExactFileName(String exactFileName) {
		this.exactFileName = exactFileName;
		if(exactFileName != null){
			putBodyParameter("ExactFileName", exactFileName);
		}
	}

	public String getKeyword() {
		return this.keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
		if(keyword != null){
			putBodyParameter("Keyword", keyword);
		}
	}

	public Long getProjectId() {
		return this.projectId;
	}

	public void setProjectId(Long projectId) {
		this.projectId = projectId;
		if(projectId != null){
			putBodyParameter("ProjectId", projectId.toString());
		}
	}

	public String getUseType() {
		return this.useType;
	}

	public void setUseType(String useType) {
		this.useType = useType;
		if(useType != null){
			putBodyParameter("UseType", useType);
		}
	}

	public Long getNodeId() {
		return this.nodeId;
	}

	public void setNodeId(Long nodeId) {
		this.nodeId = nodeId;
		if(nodeId != null){
			putBodyParameter("NodeId", nodeId.toString());
		}
	}

	@Override
	public Class<ListFilesResponse> getResponseClass() {
		return ListFilesResponse.class;
	}

}
