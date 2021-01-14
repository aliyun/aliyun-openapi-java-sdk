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

package com.aliyuncs.cdrs.transform.v20201101;

import com.aliyuncs.cdrs.model.v20201101.IntersectTrajectoryResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class IntersectTrajectoryResponseUnmarshaller {

	public static IntersectTrajectoryResponse unmarshall(IntersectTrajectoryResponse intersectTrajectoryResponse, UnmarshallerContext _ctx) {
		
		intersectTrajectoryResponse.setRequestId(_ctx.stringValue("IntersectTrajectoryResponse.RequestId"));
		intersectTrajectoryResponse.setCode(_ctx.integerValue("IntersectTrajectoryResponse.Code"));
		intersectTrajectoryResponse.setData(_ctx.stringValue("IntersectTrajectoryResponse.Data"));
		intersectTrajectoryResponse.setMessage(_ctx.stringValue("IntersectTrajectoryResponse.Message"));
		intersectTrajectoryResponse.setSuccess(_ctx.booleanValue("IntersectTrajectoryResponse.Success"));
	 
	 	return intersectTrajectoryResponse;
	}
}