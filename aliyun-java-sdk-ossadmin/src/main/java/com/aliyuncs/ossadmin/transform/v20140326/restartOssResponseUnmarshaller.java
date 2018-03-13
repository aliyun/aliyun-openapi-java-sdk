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

import com.aliyuncs.ossadmin.model.v20140326.restartOssResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class restartOssResponseUnmarshaller {

	public static restartOssResponse unmarshall(restartOssResponse restartOssResponse, UnmarshallerContext context) {
		
		restartOssResponse.setRequestId(context.stringValue("restartOssResponse.RequestId"));
		restartOssResponse.setCode(context.stringValue("restartOssResponse.Code"));
		restartOssResponse.setMessage(context.stringValue("restartOssResponse.Message"));
		restartOssResponse.setSuccess(context.booleanValue("restartOssResponse.Success"));
		restartOssResponse.setaliUid(context.longValue("restartOssResponse.aliUid"));
		restartOssResponse.setinstanceId(context.stringValue("restartOssResponse.instanceId"));
		restartOssResponse.setinstacneStatus(context.stringValue("restartOssResponse.instacneStatus"));
		restartOssResponse.setinstanceName(context.stringValue("restartOssResponse.instanceName"));
		restartOssResponse.setstartTime(context.stringValue("restartOssResponse.startTime"));
		restartOssResponse.setendTime(context.stringValue("restartOssResponse.endTime"));
	 
	 	return restartOssResponse;
	}
}