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

package com.aliyuncs.lto.transform.v20210707;

import com.aliyuncs.lto.model.v20210707.AddBaaSAntChainBizChainResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddBaaSAntChainBizChainResponseUnmarshaller {

	public static AddBaaSAntChainBizChainResponse unmarshall(AddBaaSAntChainBizChainResponse addBaaSAntChainBizChainResponse, UnmarshallerContext _ctx) {
		
		addBaaSAntChainBizChainResponse.setRequestId(_ctx.stringValue("AddBaaSAntChainBizChainResponse.RequestId"));
		addBaaSAntChainBizChainResponse.setCode(_ctx.stringValue("AddBaaSAntChainBizChainResponse.Code"));
		addBaaSAntChainBizChainResponse.setHttpStatusCode(_ctx.integerValue("AddBaaSAntChainBizChainResponse.HttpStatusCode"));
		addBaaSAntChainBizChainResponse.setMessage(_ctx.stringValue("AddBaaSAntChainBizChainResponse.Message"));
		addBaaSAntChainBizChainResponse.setSuccess(_ctx.booleanValue("AddBaaSAntChainBizChainResponse.Success"));
	 
	 	return addBaaSAntChainBizChainResponse;
	}
}