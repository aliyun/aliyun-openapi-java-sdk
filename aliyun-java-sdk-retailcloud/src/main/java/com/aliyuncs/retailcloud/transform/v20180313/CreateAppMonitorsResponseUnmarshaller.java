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

package com.aliyuncs.retailcloud.transform.v20180313;

import com.aliyuncs.retailcloud.model.v20180313.CreateAppMonitorsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateAppMonitorsResponseUnmarshaller {

	public static CreateAppMonitorsResponse unmarshall(CreateAppMonitorsResponse createAppMonitorsResponse, UnmarshallerContext _ctx) {
		
		createAppMonitorsResponse.setRequestId(_ctx.stringValue("CreateAppMonitorsResponse.RequestId"));
		createAppMonitorsResponse.setCode(_ctx.integerValue("CreateAppMonitorsResponse.Code"));
		createAppMonitorsResponse.setSuccess(_ctx.booleanValue("CreateAppMonitorsResponse.Success"));
	 
	 	return createAppMonitorsResponse;
	}
}