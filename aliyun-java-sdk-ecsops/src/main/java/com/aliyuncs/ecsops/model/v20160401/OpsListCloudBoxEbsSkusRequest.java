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

package com.aliyuncs.ecsops.model.v20160401;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class OpsListCloudBoxEbsSkusRequest extends RpcAcsRequest<OpsListCloudBoxEbsSkusResponse> {
	   

	private Long maxResult;

	private String nextToken;

	private List<String> cloudBoxSkuIdLists;
	public OpsListCloudBoxEbsSkusRequest() {
		super("Ecsops", "2016-04-01", "OpsListCloudBoxEbsSkus", "ecsops");
		setMethod(MethodType.POST);
	}

	public Long getMaxResult() {
		return this.maxResult;
	}

	public void setMaxResult(Long maxResult) {
		this.maxResult = maxResult;
		if(maxResult != null){
			putQueryParameter("MaxResult", maxResult.toString());
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

	public List<String> getCloudBoxSkuIdLists() {
		return this.cloudBoxSkuIdLists;
	}

	public void setCloudBoxSkuIdLists(List<String> cloudBoxSkuIdLists) {
		this.cloudBoxSkuIdLists = cloudBoxSkuIdLists;	
		if (cloudBoxSkuIdLists != null) {
			for (int i = 0; i < cloudBoxSkuIdLists.size(); i++) {
				putQueryParameter("CloudBoxSkuIdList." + (i + 1) , cloudBoxSkuIdLists.get(i));
			}
		}	
	}

	@Override
	public Class<OpsListCloudBoxEbsSkusResponse> getResponseClass() {
		return OpsListCloudBoxEbsSkusResponse.class;
	}

}
