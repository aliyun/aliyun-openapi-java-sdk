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

import com.aliyuncs.opensearch.model.v20171225.UpdateABTestGroupResponse;
import com.aliyuncs.opensearch.model.v20171225.UpdateABTestGroupResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateABTestGroupResponseUnmarshaller {

	public static UpdateABTestGroupResponse unmarshall(UpdateABTestGroupResponse updateABTestGroupResponse, UnmarshallerContext _ctx) {
		
		updateABTestGroupResponse.setRequestId(_ctx.stringValue("UpdateABTestGroupResponse.requestId"));

		Result result = new Result();
		result.setId(_ctx.stringValue("UpdateABTestGroupResponse.result.id"));
		result.setName(_ctx.stringValue("UpdateABTestGroupResponse.result.name"));
		result.setStatus(_ctx.integerValue("UpdateABTestGroupResponse.result.status"));
		result.setCreated(_ctx.integerValue("UpdateABTestGroupResponse.result.created"));
		result.setUpdated(_ctx.integerValue("UpdateABTestGroupResponse.result.updated"));
		updateABTestGroupResponse.setResult(result);
	 
	 	return updateABTestGroupResponse;
	}
}