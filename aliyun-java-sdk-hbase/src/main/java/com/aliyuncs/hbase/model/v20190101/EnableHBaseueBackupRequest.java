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

package com.aliyuncs.hbase.model.v20190101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.hbase.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class EnableHBaseueBackupRequest extends RpcAcsRequest<EnableHBaseueBackupResponse> {
	   

	private String clientToken;

	private String hbaseueClusterId;

	private Integer coldStorageSize;

	private Integer nodeCount;
	public EnableHBaseueBackupRequest() {
		super("HBase", "2019-01-01", "EnableHBaseueBackup", "hbase");
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

	public String getHbaseueClusterId() {
		return this.hbaseueClusterId;
	}

	public void setHbaseueClusterId(String hbaseueClusterId) {
		this.hbaseueClusterId = hbaseueClusterId;
		if(hbaseueClusterId != null){
			putQueryParameter("HbaseueClusterId", hbaseueClusterId);
		}
	}

	public Integer getColdStorageSize() {
		return this.coldStorageSize;
	}

	public void setColdStorageSize(Integer coldStorageSize) {
		this.coldStorageSize = coldStorageSize;
		if(coldStorageSize != null){
			putQueryParameter("ColdStorageSize", coldStorageSize.toString());
		}
	}

	public Integer getNodeCount() {
		return this.nodeCount;
	}

	public void setNodeCount(Integer nodeCount) {
		this.nodeCount = nodeCount;
		if(nodeCount != null){
			putQueryParameter("NodeCount", nodeCount.toString());
		}
	}

	@Override
	public Class<EnableHBaseueBackupResponse> getResponseClass() {
		return EnableHBaseueBackupResponse.class;
	}

}
