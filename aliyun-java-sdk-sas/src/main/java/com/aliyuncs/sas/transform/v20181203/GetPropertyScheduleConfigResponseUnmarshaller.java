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

package com.aliyuncs.sas.transform.v20181203;

import com.aliyuncs.sas.model.v20181203.GetPropertyScheduleConfigResponse;
import com.aliyuncs.sas.model.v20181203.GetPropertyScheduleConfigResponse.PropertyScheduleConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetPropertyScheduleConfigResponseUnmarshaller {

	public static GetPropertyScheduleConfigResponse unmarshall(GetPropertyScheduleConfigResponse getPropertyScheduleConfigResponse, UnmarshallerContext _ctx) {
		
		getPropertyScheduleConfigResponse.setRequestId(_ctx.stringValue("GetPropertyScheduleConfigResponse.RequestId"));
		getPropertyScheduleConfigResponse.setSuccess(_ctx.booleanValue("GetPropertyScheduleConfigResponse.Success"));
		getPropertyScheduleConfigResponse.setCode(_ctx.stringValue("GetPropertyScheduleConfigResponse.Code"));
		getPropertyScheduleConfigResponse.setMessage(_ctx.stringValue("GetPropertyScheduleConfigResponse.Message"));
		getPropertyScheduleConfigResponse.setHttpStatusCode(_ctx.integerValue("GetPropertyScheduleConfigResponse.HttpStatusCode"));

		PropertyScheduleConfig propertyScheduleConfig = new PropertyScheduleConfig();
		propertyScheduleConfig.setScheduleTime(_ctx.stringValue("GetPropertyScheduleConfigResponse.PropertyScheduleConfig.ScheduleTime"));
		propertyScheduleConfig.setType(_ctx.stringValue("GetPropertyScheduleConfigResponse.PropertyScheduleConfig.Type"));
		propertyScheduleConfig.setNextScheduleTime(_ctx.longValue("GetPropertyScheduleConfigResponse.PropertyScheduleConfig.NextScheduleTime"));
		getPropertyScheduleConfigResponse.setPropertyScheduleConfig(propertyScheduleConfig);
	 
	 	return getPropertyScheduleConfigResponse;
	}
}