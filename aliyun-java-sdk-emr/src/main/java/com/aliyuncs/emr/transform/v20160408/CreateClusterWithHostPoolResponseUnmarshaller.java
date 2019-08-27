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

package com.aliyuncs.emr.transform.v20160408;

import com.aliyuncs.emr.model.v20160408.CreateClusterWithHostPoolResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateClusterWithHostPoolResponseUnmarshaller {

	public static CreateClusterWithHostPoolResponse unmarshall(CreateClusterWithHostPoolResponse createClusterWithHostPoolResponse, UnmarshallerContext _ctx) {
		
		createClusterWithHostPoolResponse.setRequestId(_ctx.stringValue("CreateClusterWithHostPoolResponse.RequestId"));
		createClusterWithHostPoolResponse.setClusterId(_ctx.stringValue("CreateClusterWithHostPoolResponse.ClusterId"));
		createClusterWithHostPoolResponse.setWorkFlowInstanceId(_ctx.stringValue("CreateClusterWithHostPoolResponse.WorkFlowInstanceId"));
		createClusterWithHostPoolResponse.setOperationId(_ctx.stringValue("CreateClusterWithHostPoolResponse.OperationId"));
	 
	 	return createClusterWithHostPoolResponse;
	}
}