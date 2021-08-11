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

package com.aliyuncs.iotcc.transform.v20210513;

import com.aliyuncs.iotcc.model.v20210513.GetIoTCloudConnectorAccessLogResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetIoTCloudConnectorAccessLogResponseUnmarshaller {

	public static GetIoTCloudConnectorAccessLogResponse unmarshall(GetIoTCloudConnectorAccessLogResponse getIoTCloudConnectorAccessLogResponse, UnmarshallerContext _ctx) {
		
		getIoTCloudConnectorAccessLogResponse.setRequestId(_ctx.stringValue("GetIoTCloudConnectorAccessLogResponse.RequestId"));
		getIoTCloudConnectorAccessLogResponse.setAccessLogSlsProject(_ctx.stringValue("GetIoTCloudConnectorAccessLogResponse.AccessLogSlsProject"));
		getIoTCloudConnectorAccessLogResponse.setAccessLogSlsLogStore(_ctx.stringValue("GetIoTCloudConnectorAccessLogResponse.AccessLogSlsLogStore"));
		getIoTCloudConnectorAccessLogResponse.setAccessLogStatus(_ctx.stringValue("GetIoTCloudConnectorAccessLogResponse.AccessLogStatus"));
	 
	 	return getIoTCloudConnectorAccessLogResponse;
	}
}