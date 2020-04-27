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

package com.aliyuncs.lrg.model.v20191010;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class SyncNcPrivateSegRequest extends RoaAcsRequest<SyncNcPrivateSegResponse> {
	   

	private Long clusterNodeId;
	public SyncNcPrivateSegRequest() {
		super("LRG", "2019-10-10", "SyncNcPrivateSeg");
		setUriPattern("/api/v2/tianji/node/[clusterNodeId]/nc-private-ipseg");
		setMethod(MethodType.POST);
	}

	public Long getClusterNodeId() {
		return this.clusterNodeId;
	}

	public void setClusterNodeId(Long clusterNodeId) {
		this.clusterNodeId = clusterNodeId;
		if(clusterNodeId != null){
			putPathParameter("clusterNodeId", clusterNodeId.toString());
		}
	}

	@Override
	public Class<SyncNcPrivateSegResponse> getResponseClass() {
		return SyncNcPrivateSegResponse.class;
	}

}
