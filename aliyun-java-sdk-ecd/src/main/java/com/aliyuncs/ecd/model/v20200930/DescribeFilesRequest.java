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

package com.aliyuncs.ecd.model.v20200930;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecd.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeFilesRequest extends RpcAcsRequest<DescribeFilesResponse> {
	   

	private String rootId;

	private String userId;

	private String parentFileId;

	private String driveId;

	private String nextToken;

	private List<String> fileIdss;

	private Integer maxResults;

	private String orderType;
	public DescribeFilesRequest() {
		super("ecd", "2020-09-30", "DescribeFiles");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getRootId() {
		return this.rootId;
	}

	public void setRootId(String rootId) {
		this.rootId = rootId;
		if(rootId != null){
			putQueryParameter("RootId", rootId);
		}
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
		if(userId != null){
			putQueryParameter("UserId", userId);
		}
	}

	public String getParentFileId() {
		return this.parentFileId;
	}

	public void setParentFileId(String parentFileId) {
		this.parentFileId = parentFileId;
		if(parentFileId != null){
			putQueryParameter("ParentFileId", parentFileId);
		}
	}

	public String getDriveId() {
		return this.driveId;
	}

	public void setDriveId(String driveId) {
		this.driveId = driveId;
		if(driveId != null){
			putQueryParameter("DriveId", driveId);
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

	public List<String> getFileIdss() {
		return this.fileIdss;
	}

	public void setFileIdss(List<String> fileIdss) {
		this.fileIdss = fileIdss;	
		if (fileIdss != null) {
			for (int i = 0; i < fileIdss.size(); i++) {
				putQueryParameter("FileIds." + (i + 1) , fileIdss.get(i));
			}
		}	
	}

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
		if(maxResults != null){
			putQueryParameter("MaxResults", maxResults.toString());
		}
	}

	public String getOrderType() {
		return this.orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
		if(orderType != null){
			putQueryParameter("OrderType", orderType);
		}
	}

	@Override
	public Class<DescribeFilesResponse> getResponseClass() {
		return DescribeFilesResponse.class;
	}

}
