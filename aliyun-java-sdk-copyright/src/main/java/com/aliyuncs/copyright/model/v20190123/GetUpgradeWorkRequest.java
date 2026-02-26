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

package com.aliyuncs.copyright.model.v20190123;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetUpgradeWorkRequest extends RpcAcsRequest<GetUpgradeWorkResponse> {
	   

	private Long workId;
	public GetUpgradeWorkRequest() {
		super("Copyright", "2019-01-23", "GetUpgradeWork", "swcopyright");
		setMethod(MethodType.POST);
	}

	public Long getWorkId() {
		return this.workId;
	}

	public void setWorkId(Long workId) {
		this.workId = workId;
		if(workId != null){
			putQueryParameter("WorkId", workId.toString());
		}
	}

	@Override
	public Class<GetUpgradeWorkResponse> getResponseClass() {
		return GetUpgradeWorkResponse.class;
	}

}
