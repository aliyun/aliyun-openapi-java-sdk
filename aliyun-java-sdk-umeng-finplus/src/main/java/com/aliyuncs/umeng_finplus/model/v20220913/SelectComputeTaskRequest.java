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

package com.aliyuncs.umeng_finplus.model.v20220913;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class SelectComputeTaskRequest extends RoaAcsRequest<SelectComputeTaskResponse> {
	   

	private Long body;
	public SelectComputeTaskRequest() {
		super("umeng-finplus", "2022-09-13", "SelectComputeTask");
		setProtocol(ProtocolType.HTTPS);
		setUriPattern("/bc/selectComputeTask");
		setMethod(MethodType.POST);
	}

	public Long getBody() {
		return this.body;
	}

	public void setBody(Long body) {
		this.body = body;
		if(body != null){
			putBodyParameter("body", body.toString());
		}
	}

	@Override
	public Class<SelectComputeTaskResponse> getResponseClass() {
		return SelectComputeTaskResponse.class;
	}

}
