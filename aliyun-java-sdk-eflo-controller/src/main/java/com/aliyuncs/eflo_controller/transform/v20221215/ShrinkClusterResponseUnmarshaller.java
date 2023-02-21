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

package com.aliyuncs.eflo_controller.transform.v20221215;

import com.aliyuncs.eflo_controller.model.v20221215.ShrinkClusterResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ShrinkClusterResponseUnmarshaller {

	public static ShrinkClusterResponse unmarshall(ShrinkClusterResponse shrinkClusterResponse, UnmarshallerContext _ctx) {
		
		shrinkClusterResponse.setRequestId(_ctx.stringValue("ShrinkClusterResponse.RequestId"));
		shrinkClusterResponse.setTaskId(_ctx.stringValue("ShrinkClusterResponse.TaskId"));
	 
	 	return shrinkClusterResponse;
	}
}