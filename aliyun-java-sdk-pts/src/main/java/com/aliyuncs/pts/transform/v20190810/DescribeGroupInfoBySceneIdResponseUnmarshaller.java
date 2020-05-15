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

package com.aliyuncs.pts.transform.v20190810;

import com.aliyuncs.pts.model.v20190810.DescribeGroupInfoBySceneIdResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeGroupInfoBySceneIdResponseUnmarshaller {

	public static DescribeGroupInfoBySceneIdResponse unmarshall(DescribeGroupInfoBySceneIdResponse describeGroupInfoBySceneIdResponse, UnmarshallerContext _ctx) {
		
		describeGroupInfoBySceneIdResponse.setRequestId(_ctx.stringValue("DescribeGroupInfoBySceneIdResponse.RequestId"));
		describeGroupInfoBySceneIdResponse.setMessage(_ctx.stringValue("DescribeGroupInfoBySceneIdResponse.Message"));
		describeGroupInfoBySceneIdResponse.setCode(_ctx.stringValue("DescribeGroupInfoBySceneIdResponse.Code"));
		describeGroupInfoBySceneIdResponse.setSuccess(_ctx.booleanValue("DescribeGroupInfoBySceneIdResponse.Success"));
		describeGroupInfoBySceneIdResponse.setHttpStatusCode(_ctx.integerValue("DescribeGroupInfoBySceneIdResponse.HttpStatusCode"));
		describeGroupInfoBySceneIdResponse.setGroupView(_ctx.stringValue("DescribeGroupInfoBySceneIdResponse.GroupView"));
	 
	 	return describeGroupInfoBySceneIdResponse;
	}
}