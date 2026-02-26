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

package com.aliyuncs.tingwu.model.v20220930;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetFileTransRequest extends RoaAcsRequest<GetFileTransResponse> {
	   

	private String transId;
	public GetFileTransRequest() {
		super("tingwu", "2022-09-30", "GetFileTrans", "tingwupaas");
		setUriPattern("/openapi/file-trans/[TransId]");
		setMethod(MethodType.GET);
	}

	public String getTransId() {
		return this.transId;
	}

	public void setTransId(String transId) {
		this.transId = transId;
		if(transId != null){
			putPathParameter("TransId", transId);
		}
	}

	@Override
	public Class<GetFileTransResponse> getResponseClass() {
		return GetFileTransResponse.class;
	}

}
