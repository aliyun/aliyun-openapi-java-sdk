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

package com.aliyuncs.emas_dmp_pre.model.v20210402;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetTokenRequest extends RpcAcsRequest<GetTokenResponse> {
	   
	public GetTokenRequest() {
		super("emas-dmp-pre", "2021-04-02", "GetToken");
		setMethod(MethodType.POST);
	}

	@Override
	public Class<GetTokenResponse> getResponseClass() {
		return GetTokenResponse.class;
	}

}
