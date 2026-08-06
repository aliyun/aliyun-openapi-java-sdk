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

package com.aliyuncs.nas.model.v20170626;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.nas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetProtocolMountTargetRequest extends RpcAcsRequest<GetProtocolMountTargetResponse> {
	   

	private String clientToken;

	private String protocolServiceId;

	private String nextToken;

	private String fileSystemId;

	private Long maxResults;

	private String exportId;
	public GetProtocolMountTargetRequest() {
		super("NAS", "2017-06-26", "GetProtocolMountTarget", "nas");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public String getProtocolServiceId() {
		return this.protocolServiceId;
	}

	public void setProtocolServiceId(String protocolServiceId) {
		this.protocolServiceId = protocolServiceId;
		if(protocolServiceId != null){
			putQueryParameter("ProtocolServiceId", protocolServiceId);
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

	public String getFileSystemId() {
		return this.fileSystemId;
	}

	public void setFileSystemId(String fileSystemId) {
		this.fileSystemId = fileSystemId;
		if(fileSystemId != null){
			putQueryParameter("FileSystemId", fileSystemId);
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

	public String getExportId() {
		return this.exportId;
	}

	public void setExportId(String exportId) {
		this.exportId = exportId;
		if(exportId != null){
			putQueryParameter("ExportId", exportId);
		}
	}

	@Override
	public Class<GetProtocolMountTargetResponse> getResponseClass() {
		return GetProtocolMountTargetResponse.class;
	}

}
