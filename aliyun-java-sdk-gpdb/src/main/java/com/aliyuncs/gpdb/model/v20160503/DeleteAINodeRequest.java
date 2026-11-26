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

package com.aliyuncs.gpdb.model.v20160503;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.gpdb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DeleteAINodeRequest extends RpcAcsRequest<DeleteAINodeResponse> {
	   

	private List<String> nodeNamess;

	private Integer aINodeNum;

	private String dBInstanceId;

	private String aINodePoolId;
	public DeleteAINodeRequest() {
		super("gpdb", "2016-05-03", "DeleteAINode", "GPDB");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getNodeNamess() {
		return this.nodeNamess;
	}

	public void setNodeNamess(List<String> nodeNamess) {
		this.nodeNamess = nodeNamess;	
		if (nodeNamess != null) {
			for (int i = 0; i < nodeNamess.size(); i++) {
				putQueryParameter("NodeNames." + (i + 1) , nodeNamess.get(i));
			}
		}	
	}

	public Integer getAINodeNum() {
		return this.aINodeNum;
	}

	public void setAINodeNum(Integer aINodeNum) {
		this.aINodeNum = aINodeNum;
		if(aINodeNum != null){
			putQueryParameter("AINodeNum", aINodeNum.toString());
		}
	}

	public String getDBInstanceId() {
		return this.dBInstanceId;
	}

	public void setDBInstanceId(String dBInstanceId) {
		this.dBInstanceId = dBInstanceId;
		if(dBInstanceId != null){
			putQueryParameter("DBInstanceId", dBInstanceId);
		}
	}

	public String getAINodePoolId() {
		return this.aINodePoolId;
	}

	public void setAINodePoolId(String aINodePoolId) {
		this.aINodePoolId = aINodePoolId;
		if(aINodePoolId != null){
			putQueryParameter("AINodePoolId", aINodePoolId);
		}
	}

	@Override
	public Class<DeleteAINodeResponse> getResponseClass() {
		return DeleteAINodeResponse.class;
	}

}
