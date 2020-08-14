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

package com.aliyuncs.idrsservice.transform.v20200630;

import com.aliyuncs.idrsservice.model.v20200630.GetServiceConfigurationResponse;
import com.aliyuncs.idrsservice.model.v20200630.GetServiceConfigurationResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetServiceConfigurationResponseUnmarshaller {

	public static GetServiceConfigurationResponse unmarshall(GetServiceConfigurationResponse getServiceConfigurationResponse, UnmarshallerContext _ctx) {
		
		getServiceConfigurationResponse.setRequestId(_ctx.stringValue("GetServiceConfigurationResponse.RequestId"));
		getServiceConfigurationResponse.setCode(_ctx.stringValue("GetServiceConfigurationResponse.Code"));
		getServiceConfigurationResponse.setMessage(_ctx.stringValue("GetServiceConfigurationResponse.Message"));

		Data data = new Data();
		data.setClientQueueSize(_ctx.integerValue("GetServiceConfigurationResponse.Data.ClientQueueSize"));
		data.setLiveRecordAll(_ctx.booleanValue("GetServiceConfigurationResponse.Data.LiveRecordAll"));
		data.setLiveRecordEveryOne(_ctx.booleanValue("GetServiceConfigurationResponse.Data.LiveRecordEveryOne"));
		data.setLiveRecordLayout(_ctx.integerValue("GetServiceConfigurationResponse.Data.LiveRecordLayout"));
		data.setLiveRecordTaskProfile(_ctx.stringValue("GetServiceConfigurationResponse.Data.LiveRecordTaskProfile"));
		data.setTaskItemQueueSize(_ctx.integerValue("GetServiceConfigurationResponse.Data.TaskItemQueueSize"));
		getServiceConfigurationResponse.setData(data);
	 
	 	return getServiceConfigurationResponse;
	}
}