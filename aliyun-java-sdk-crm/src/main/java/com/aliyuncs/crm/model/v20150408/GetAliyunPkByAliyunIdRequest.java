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

package com.aliyuncs.crm.model.v20150408;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class GetAliyunPkByAliyunIdRequest extends RpcAcsRequest<GetAliyunPkByAliyunIdResponse> {
	
	public GetAliyunPkByAliyunIdRequest() {
		super("Crm", "2015-04-08", "GetAliyunPkByAliyunId", "crm");
	}

	private String aliyunId;

	public String getAliyunId() {
		return this.aliyunId;
	}

	public void setAliyunId(String aliyunId) {
		this.aliyunId = aliyunId;
		if(aliyunId != null){
			putQueryParameter("AliyunId", aliyunId);
		}
	}

	@Override
	public Class<GetAliyunPkByAliyunIdResponse> getResponseClass() {
		return GetAliyunPkByAliyunIdResponse.class;
	}

}
