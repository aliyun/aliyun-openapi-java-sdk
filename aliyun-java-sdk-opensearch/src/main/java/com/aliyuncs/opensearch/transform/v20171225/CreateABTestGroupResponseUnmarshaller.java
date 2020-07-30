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

package com.aliyuncs.opensearch.transform.v20171225;

import com.aliyuncs.opensearch.model.v20171225.CreateABTestGroupResponse;
import com.aliyuncs.opensearch.model.v20171225.CreateABTestGroupResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateABTestGroupResponseUnmarshaller {

	public static CreateABTestGroupResponse unmarshall(CreateABTestGroupResponse createABTestGroupResponse, UnmarshallerContext _ctx) {
		
		createABTestGroupResponse.setRequestId(_ctx.stringValue("CreateABTestGroupResponse.requestId"));

		Result result = new Result();
		result.setId(_ctx.stringValue("CreateABTestGroupResponse.result.id"));
		result.setName(_ctx.stringValue("CreateABTestGroupResponse.result.name"));
		result.setStatus(_ctx.integerValue("CreateABTestGroupResponse.result.status"));
		result.setCreated(_ctx.integerValue("CreateABTestGroupResponse.result.created"));
		result.setUpdated(_ctx.integerValue("CreateABTestGroupResponse.result.updated"));
		createABTestGroupResponse.setResult(result);
	 
	 	return createABTestGroupResponse;
	}
}