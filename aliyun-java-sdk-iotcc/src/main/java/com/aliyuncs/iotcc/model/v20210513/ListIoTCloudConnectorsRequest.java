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
public class ListIoTCloudConnectorsRequest extends RpcAcsRequest<ListIoTCloudConnectorsResponse> {
	   

	private List<String> ioTCloudConnectorStatuss;

	private List<String> iSPs;

	private List<String> ioTCloudConnectorIdss;

	private String nextToken;

	private List<String> aPNs;

	private String ioTCloudConnectorGroupId;

	private Boolean isInGroup;

	private List<String> vpcIds;

	private Integer maxResults;

	private List<String> ioTCloudConnectorNames;
	public ListIoTCloudConnectorsRequest() {
		super("IoTCC", "2021-05-13", "ListIoTCloudConnectors", "IoTCC");
		setMethod(MethodType.POST);
	}

	public List<String> getIoTCloudConnectorStatuss() {
		return this.ioTCloudConnectorStatuss;
	}

	public void setIoTCloudConnectorStatuss(List<String> ioTCloudConnectorStatuss) {
		this.ioTCloudConnectorStatuss = ioTCloudConnectorStatuss;	
		if (ioTCloudConnectorStatuss != null) {
			for (int i = 0; i < ioTCloudConnectorStatuss.size(); i++) {
				putQueryParameter("IoTCloudConnectorStatus." + (i + 1) , ioTCloudConnectorStatuss.get(i));
			}
		}	
	}

	public List<String> getISPs() {
		return this.iSPs;
	}

	public void setISPs(List<String> iSPs) {
		this.iSPs = iSPs;	
		if (iSPs != null) {
			for (int i = 0; i < iSPs.size(); i++) {
				putQueryParameter("ISP." + (i + 1) , iSPs.get(i));
			}
		}	
	}

	public List<String> getIoTCloudConnectorIdss() {
		return this.ioTCloudConnectorIdss;
	}

	public void setIoTCloudConnectorIdss(List<String> ioTCloudConnectorIdss) {
		this.ioTCloudConnectorIdss = ioTCloudConnectorIdss;	
		if (ioTCloudConnectorIdss != null) {
			for (int i = 0; i < ioTCloudConnectorIdss.size(); i++) {
				putQueryParameter("IoTCloudConnectorIds." + (i + 1) , ioTCloudConnectorIdss.get(i));
			}
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

	public List<String> getAPNs() {
		return this.aPNs;
	}

	public void setAPNs(List<String> aPNs) {
		this.aPNs = aPNs;	
		if (aPNs != null) {
			for (int i = 0; i < aPNs.size(); i++) {
				putQueryParameter("APN." + (i + 1) , aPNs.get(i));
			}
		}	
	}

	public String getIoTCloudConnectorGroupId() {
		return this.ioTCloudConnectorGroupId;
	}

	public void setIoTCloudConnectorGroupId(String ioTCloudConnectorGroupId) {
		this.ioTCloudConnectorGroupId = ioTCloudConnectorGroupId;
		if(ioTCloudConnectorGroupId != null){
			putQueryParameter("IoTCloudConnectorGroupId", ioTCloudConnectorGroupId);
		}
	}

	public Boolean getIsInGroup() {
		return this.isInGroup;
	}

	public void setIsInGroup(Boolean isInGroup) {
		this.isInGroup = isInGroup;
		if(isInGroup != null){
			putQueryParameter("IsInGroup", isInGroup.toString());
		}
	}

	public List<String> getVpcIds() {
		return this.vpcIds;
	}

	public void setVpcIds(List<String> vpcIds) {
		this.vpcIds = vpcIds;	
		if (vpcIds != null) {
			for (int i = 0; i < vpcIds.size(); i++) {
				putQueryParameter("VpcId." + (i + 1) , vpcIds.get(i));
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

	public List<String> getIoTCloudConnectorNames() {
		return this.ioTCloudConnectorNames;
	}

	public void setIoTCloudConnectorNames(List<String> ioTCloudConnectorNames) {
		this.ioTCloudConnectorNames = ioTCloudConnectorNames;	
		if (ioTCloudConnectorNames != null) {
			for (int i = 0; i < ioTCloudConnectorNames.size(); i++) {
				putQueryParameter("IoTCloudConnectorName." + (i + 1) , ioTCloudConnectorNames.get(i));
			}
		}	
	}

	@Override
	public Class<ListIoTCloudConnectorsResponse> getResponseClass() {
		return ListIoTCloudConnectorsResponse.class;
	}

}
