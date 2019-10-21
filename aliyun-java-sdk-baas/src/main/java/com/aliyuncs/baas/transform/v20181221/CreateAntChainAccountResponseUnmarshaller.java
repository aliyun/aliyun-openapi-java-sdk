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

package com.aliyuncs.baas.transform.v20181221;

import com.aliyuncs.baas.model.v20181221.CreateAntChainAccountResponse;
import com.aliyuncs.baas.model.v20181221.CreateAntChainAccountResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateAntChainAccountResponseUnmarshaller {

	public static CreateAntChainAccountResponse unmarshall(CreateAntChainAccountResponse createAntChainAccountResponse, UnmarshallerContext _ctx) {
		
		createAntChainAccountResponse.setRequestId(_ctx.stringValue("CreateAntChainAccountResponse.RequestId"));

		Result result = new Result();
		result.setAntChainId(_ctx.stringValue("CreateAntChainAccountResponse.Result.AntChainId"));
		result.setAccount(_ctx.stringValue("CreateAntChainAccountResponse.Result.Account"));
		createAntChainAccountResponse.setResult(result);
	 
	 	return createAntChainAccountResponse;
	}
}