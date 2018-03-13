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
package com.aliyuncs.ossadmin.transform.v20140326;

import com.aliyuncs.ossadmin.model.v20140326.stopOssResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class stopOssResponseUnmarshaller {

	public static stopOssResponse unmarshall(stopOssResponse stopOssResponse, UnmarshallerContext context) {
		
		stopOssResponse.setRequestId(context.stringValue("stopOssResponse.RequestId"));
		stopOssResponse.setCode(context.stringValue("stopOssResponse.Code"));
		stopOssResponse.setMessage(context.stringValue("stopOssResponse.Message"));
		stopOssResponse.setSuccess(context.booleanValue("stopOssResponse.Success"));
		stopOssResponse.setaliUid(context.longValue("stopOssResponse.aliUid"));
		stopOssResponse.setinstanceId(context.stringValue("stopOssResponse.instanceId"));
		stopOssResponse.setinstacneStatus(context.stringValue("stopOssResponse.instacneStatus"));
		stopOssResponse.setinstanceName(context.stringValue("stopOssResponse.instanceName"));
		stopOssResponse.setstartTime(context.stringValue("stopOssResponse.startTime"));
		stopOssResponse.setendTime(context.stringValue("stopOssResponse.endTime"));
	 
	 	return stopOssResponse;
	}
}