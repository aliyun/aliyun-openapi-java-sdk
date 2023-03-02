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

import com.aliyuncs.lto.model.v20210707.AddBsnFabricBizChainResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddBsnFabricBizChainResponseUnmarshaller {

	public static AddBsnFabricBizChainResponse unmarshall(AddBsnFabricBizChainResponse addBsnFabricBizChainResponse, UnmarshallerContext _ctx) {
		
		addBsnFabricBizChainResponse.setRequestId(_ctx.stringValue("AddBsnFabricBizChainResponse.RequestId"));
		addBsnFabricBizChainResponse.setCode(_ctx.stringValue("AddBsnFabricBizChainResponse.Code"));
		addBsnFabricBizChainResponse.setHttpStatusCode(_ctx.integerValue("AddBsnFabricBizChainResponse.HttpStatusCode"));
		addBsnFabricBizChainResponse.setMessage(_ctx.stringValue("AddBsnFabricBizChainResponse.Message"));
		addBsnFabricBizChainResponse.setSuccess(_ctx.booleanValue("AddBsnFabricBizChainResponse.Success"));
	 
	 	return addBsnFabricBizChainResponse;
	}
}