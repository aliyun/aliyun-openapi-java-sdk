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

package com.aliyuncs.hitsdb.transform.v20200615;

import com.aliyuncs.hitsdb.model.v20200615.GetLdpsComputeGroupResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLdpsComputeGroupResponseUnmarshaller {

	public static GetLdpsComputeGroupResponse unmarshall(GetLdpsComputeGroupResponse getLdpsComputeGroupResponse, UnmarshallerContext _ctx) {
		
		getLdpsComputeGroupResponse.setRequestId(_ctx.stringValue("GetLdpsComputeGroupResponse.RequestId"));
		getLdpsComputeGroupResponse.setGroupName(_ctx.stringValue("GetLdpsComputeGroupResponse.GroupName"));
		getLdpsComputeGroupResponse.setProperties(_ctx.mapValue("GetLdpsComputeGroupResponse.Properties"));
	 
	 	return getLdpsComputeGroupResponse;
	}
}