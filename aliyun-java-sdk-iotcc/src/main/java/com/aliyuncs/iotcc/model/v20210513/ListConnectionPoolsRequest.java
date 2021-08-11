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

package com.aliyuncs.iotcc.model.v20210513;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListConnectionPoolsRequest extends RpcAcsRequest<ListConnectionPoolsResponse> {
	   

	private String nextToken;

	private List<String> connectionPoolStatuss;

	private List<String> connectionPoolNames;

	private String ioTCloudConnectorId;

	private List<String> connectionPoolIdss;

	private Integer maxResults;
	public ListConnectionPoolsRequest() {
		super("IoTCC", "2021-05-13", "ListConnectionPools", "cciot");
		setMethod(MethodType.POST);
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

	public List<String> getConnectionPoolStatuss() {
		return this.connectionPoolStatuss;
	}

	public void setConnectionPoolStatuss(List<String> connectionPoolStatuss) {
		this.connectionPoolStatuss = connectionPoolStatuss;	
		if (connectionPoolStatuss != null) {
			for (int i = 0; i < connectionPoolStatuss.size(); i++) {
				putQueryParameter("ConnectionPoolStatus." + (i + 1) , connectionPoolStatuss.get(i));
			}
		}	
	}

	public List<String> getConnectionPoolNames() {
		return this.connectionPoolNames;
	}

	public void setConnectionPoolNames(List<String> connectionPoolNames) {
		this.connectionPoolNames = connectionPoolNames;	
		if (connectionPoolNames != null) {
			for (int i = 0; i < connectionPoolNames.size(); i++) {
				putQueryParameter("ConnectionPoolName." + (i + 1) , connectionPoolNames.get(i));
			}
		}	
	}

	public String getIoTCloudConnectorId() {
		return this.ioTCloudConnectorId;
	}

	public void setIoTCloudConnectorId(String ioTCloudConnectorId) {
		this.ioTCloudConnectorId = ioTCloudConnectorId;
		if(ioTCloudConnectorId != null){
			putQueryParameter("IoTCloudConnectorId", ioTCloudConnectorId);
		}
	}

	public List<String> getConnectionPoolIdss() {
		return this.connectionPoolIdss;
	}

	public void setConnectionPoolIdss(List<String> connectionPoolIdss) {
		this.connectionPoolIdss = connectionPoolIdss;	
		if (connectionPoolIdss != null) {
			for (int i = 0; i < connectionPoolIdss.size(); i++) {
				putQueryParameter("ConnectionPoolIds." + (i + 1) , connectionPoolIdss.get(i));
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

	@Override
	public Class<ListConnectionPoolsResponse> getResponseClass() {
		return ListConnectionPoolsResponse.class;
	}

}
