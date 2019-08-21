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
import com.aliyuncs.nas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeBlackListClientsRequest extends RpcAcsRequest<DescribeBlackListClientsResponse> {
	
	public DescribeBlackListClientsRequest() {
		super("NAS", "2017-06-26", "DescribeBlackListClients", "nas");
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private String clientIP;

	private String fileSystemId;

	public String getClientIP() {
		return this.clientIP;
	}

	public void setClientIP(String clientIP) {
		this.clientIP = clientIP;
		if(clientIP != null){
			putQueryParameter("ClientIP", clientIP);
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

	@Override
	public Class<DescribeBlackListClientsResponse> getResponseClass() {
		return DescribeBlackListClientsResponse.class;
	}

}
