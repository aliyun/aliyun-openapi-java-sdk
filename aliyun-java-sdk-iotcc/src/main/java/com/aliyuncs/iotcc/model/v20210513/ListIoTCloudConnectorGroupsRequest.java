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
public class ListIoTCloudConnectorGroupsRequest extends RpcAcsRequest<ListIoTCloudConnectorGroupsResponse> {
	   

	private String type;

	private String nextToken;

	private List<String> ioTCloudConnectorGroupIdss;

	private List<String> ioTCloudConnectorGroupStatuss;

	private List<String> ioTCloudConnectorGroupNames;

	private Integer maxResults;
	public ListIoTCloudConnectorGroupsRequest() {
		super("IoTCC", "2021-05-13", "ListIoTCloudConnectorGroups", "IoTCC");
		setMethod(MethodType.POST);
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putQueryParameter("Type", type);
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

	public List<String> getIoTCloudConnectorGroupIdss() {
		return this.ioTCloudConnectorGroupIdss;
	}

	public void setIoTCloudConnectorGroupIdss(List<String> ioTCloudConnectorGroupIdss) {
		this.ioTCloudConnectorGroupIdss = ioTCloudConnectorGroupIdss;	
		if (ioTCloudConnectorGroupIdss != null) {
			for (int i = 0; i < ioTCloudConnectorGroupIdss.size(); i++) {
				putQueryParameter("IoTCloudConnectorGroupIds." + (i + 1) , ioTCloudConnectorGroupIdss.get(i));
			}
		}	
	}

	public List<String> getIoTCloudConnectorGroupStatuss() {
		return this.ioTCloudConnectorGroupStatuss;
	}

	public void setIoTCloudConnectorGroupStatuss(List<String> ioTCloudConnectorGroupStatuss) {
		this.ioTCloudConnectorGroupStatuss = ioTCloudConnectorGroupStatuss;	
		if (ioTCloudConnectorGroupStatuss != null) {
			for (int i = 0; i < ioTCloudConnectorGroupStatuss.size(); i++) {
				putQueryParameter("IoTCloudConnectorGroupStatus." + (i + 1) , ioTCloudConnectorGroupStatuss.get(i));
			}
		}	
	}

	public List<String> getIoTCloudConnectorGroupNames() {
		return this.ioTCloudConnectorGroupNames;
	}

	public void setIoTCloudConnectorGroupNames(List<String> ioTCloudConnectorGroupNames) {
		this.ioTCloudConnectorGroupNames = ioTCloudConnectorGroupNames;	
		if (ioTCloudConnectorGroupNames != null) {
			for (int i = 0; i < ioTCloudConnectorGroupNames.size(); i++) {
				putQueryParameter("IoTCloudConnectorGroupName." + (i + 1) , ioTCloudConnectorGroupNames.get(i));
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
	public Class<ListIoTCloudConnectorGroupsResponse> getResponseClass() {
		return ListIoTCloudConnectorGroupsResponse.class;
	}

}
