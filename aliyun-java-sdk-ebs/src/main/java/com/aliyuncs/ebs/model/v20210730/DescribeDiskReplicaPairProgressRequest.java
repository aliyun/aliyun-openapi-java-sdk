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

package com.aliyuncs.ebs.model.v20210730;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DescribeDiskReplicaPairProgressRequest extends RpcAcsRequest<DescribeDiskReplicaPairProgressResponse> {
	   

	private String replicaPairId;
	public DescribeDiskReplicaPairProgressRequest() {
		super("ebs", "2021-07-30", "DescribeDiskReplicaPairProgress", "ebs");
		setMethod(MethodType.POST);
	}

	public String getReplicaPairId() {
		return this.replicaPairId;
	}

	public void setReplicaPairId(String replicaPairId) {
		this.replicaPairId = replicaPairId;
		if(replicaPairId != null){
			putQueryParameter("ReplicaPairId", replicaPairId);
		}
	}

	@Override
	public Class<DescribeDiskReplicaPairProgressResponse> getResponseClass() {
		return DescribeDiskReplicaPairProgressResponse.class;
	}

}
