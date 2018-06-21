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

package com.aliyuncs.cds.model.v20170925;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetCredentialsRequest extends RoaAcsRequest<GetCredentialsResponse> {
	
	public GetCredentialsRequest() {
		super("Cds", "2017-09-25", "GetCredentials", "codepipeline");
		setUriPattern("/v1/credentials");
		setMethod(MethodType.GET);
	}

	@Override
	public Class<GetCredentialsResponse> getResponseClass() {
		return GetCredentialsResponse.class;
	}

}
