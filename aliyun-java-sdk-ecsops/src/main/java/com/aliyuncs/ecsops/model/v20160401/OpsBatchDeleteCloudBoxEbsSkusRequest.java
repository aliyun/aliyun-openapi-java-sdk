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
public class OpsBatchDeleteCloudBoxEbsSkusRequest extends RpcAcsRequest<OpsBatchDeleteCloudBoxEbsSkusResponse> {
	   

	private List<String> cloudBoxSkuIdSets;
	public OpsBatchDeleteCloudBoxEbsSkusRequest() {
		super("Ecsops", "2016-04-01", "OpsBatchDeleteCloudBoxEbsSkus", "ecsops");
		setMethod(MethodType.POST);
	}

	public List<String> getCloudBoxSkuIdSets() {
		return this.cloudBoxSkuIdSets;
	}

	public void setCloudBoxSkuIdSets(List<String> cloudBoxSkuIdSets) {
		this.cloudBoxSkuIdSets = cloudBoxSkuIdSets;	
		if (cloudBoxSkuIdSets != null) {
			for (int i = 0; i < cloudBoxSkuIdSets.size(); i++) {
				putQueryParameter("CloudBoxSkuIdSet." + (i + 1) , cloudBoxSkuIdSets.get(i));
			}
		}	
	}

	@Override
	public Class<OpsBatchDeleteCloudBoxEbsSkusResponse> getResponseClass() {
		return OpsBatchDeleteCloudBoxEbsSkusResponse.class;
	}

}
