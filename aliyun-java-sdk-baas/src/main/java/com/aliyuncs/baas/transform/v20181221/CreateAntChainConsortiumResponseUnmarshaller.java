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

import com.aliyuncs.baas.model.v20181221.CreateAntChainConsortiumResponse;
import com.aliyuncs.baas.model.v20181221.CreateAntChainConsortiumResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateAntChainConsortiumResponseUnmarshaller {

	public static CreateAntChainConsortiumResponse unmarshall(CreateAntChainConsortiumResponse createAntChainConsortiumResponse, UnmarshallerContext _ctx) {
		
		createAntChainConsortiumResponse.setRequestId(_ctx.stringValue("CreateAntChainConsortiumResponse.RequestId"));

		Result result = new Result();
		result.setConsortiumId(_ctx.stringValue("CreateAntChainConsortiumResponse.Result.ConsortiumId"));
		createAntChainConsortiumResponse.setResult(result);
	 
	 	return createAntChainConsortiumResponse;
	}
}