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

package com.aliyuncs.cc5g.model.v20220314;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListDiagnoseInfoForSingleCardRequest extends RpcAcsRequest<ListDiagnoseInfoForSingleCardResponse> {
	   

	private String source;

	private String nextToken;

	private String sourceType;

	private String regionNo;

	private String wirelessCloudConnectorId;

	private Integer maxResults;

	private String status;
	public ListDiagnoseInfoForSingleCardRequest() {
		super("CC5G", "2022-03-14", "ListDiagnoseInfoForSingleCard", "fivegcc");
		setMethod(MethodType.POST);
	}

	public String getSource() {
		return this.source;
	}

	public void setSource(String source) {
		this.source = source;
		if(source != null){
			putQueryParameter("Source", source);
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

	public String getSourceType() {
		return this.sourceType;
	}

	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
		if(sourceType != null){
			putQueryParameter("SourceType", sourceType);
		}
	}

	public String getRegionNo() {
		return this.regionNo;
	}

	public void setRegionNo(String regionNo) {
		this.regionNo = regionNo;
		if(regionNo != null){
			putQueryParameter("RegionNo", regionNo);
		}
	}

	public String getWirelessCloudConnectorId() {
		return this.wirelessCloudConnectorId;
	}

	public void setWirelessCloudConnectorId(String wirelessCloudConnectorId) {
		this.wirelessCloudConnectorId = wirelessCloudConnectorId;
		if(wirelessCloudConnectorId != null){
			putQueryParameter("WirelessCloudConnectorId", wirelessCloudConnectorId);
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

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
		if(status != null){
			putQueryParameter("Status", status);
		}
	}

	@Override
	public Class<ListDiagnoseInfoForSingleCardResponse> getResponseClass() {
		return ListDiagnoseInfoForSingleCardResponse.class;
	}

}
