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

package com.aliyuncs.linkwan.transform.v20190301;

import com.aliyuncs.linkwan.model.v20190301.CreateNodeGroupResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateNodeGroupResponseUnmarshaller {

	public static CreateNodeGroupResponse unmarshall(CreateNodeGroupResponse createNodeGroupResponse, UnmarshallerContext _ctx) {
		
		createNodeGroupResponse.setRequestId(_ctx.stringValue("CreateNodeGroupResponse.RequestId"));
		createNodeGroupResponse.setSuccess(_ctx.booleanValue("CreateNodeGroupResponse.Success"));
		createNodeGroupResponse.setData(_ctx.stringValue("CreateNodeGroupResponse.Data"));
	 
	 	return createNodeGroupResponse;
	}
}