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

package com.aliyuncs.cs.transform.v20151215;

import com.aliyuncs.cs.model.v20151215.ModifyClusterResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyClusterResponseUnmarshaller {

	public static ModifyClusterResponse unmarshall(ModifyClusterResponse modifyClusterResponse, UnmarshallerContext _ctx) {
		
		modifyClusterResponse.setCluster_id(_ctx.stringValue("ModifyClusterResponse.cluster_id"));
		modifyClusterResponse.setRequest_id(_ctx.stringValue("ModifyClusterResponse.request_id"));
		modifyClusterResponse.setTask_id(_ctx.stringValue("ModifyClusterResponse.task_id"));
	 
	 	return modifyClusterResponse;
	}
}