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

package com.aliyuncs.iotts.model.v20181126;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class GetFieldOptionPassedRequest extends RpcAcsRequest<GetFieldOptionPassedResponse> {
	
	public GetFieldOptionPassedRequest() {
		super("iotts", "2018-11-26", "GetFieldOptionPassed", "iotts");
	}

	@Override
	public Class<GetFieldOptionPassedResponse> getResponseClass() {
		return GetFieldOptionPassedResponse.class;
	}

}
