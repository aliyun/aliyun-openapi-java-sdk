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

package com.aliyuncs.cloudwifi_pop.transform.v20191118;

import com.aliyuncs.cloudwifi_pop.model.v20191118.SaveApgroupBasicConfigResponse;
import com.aliyuncs.cloudwifi_pop.model.v20191118.SaveApgroupBasicConfigResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class SaveApgroupBasicConfigResponseUnmarshaller {

	public static SaveApgroupBasicConfigResponse unmarshall(SaveApgroupBasicConfigResponse saveApgroupBasicConfigResponse, UnmarshallerContext _ctx) {
		
		saveApgroupBasicConfigResponse.setRequestId(_ctx.stringValue("SaveApgroupBasicConfigResponse.RequestId"));
		saveApgroupBasicConfigResponse.setIsSuccess(_ctx.booleanValue("SaveApgroupBasicConfigResponse.IsSuccess"));
		saveApgroupBasicConfigResponse.setErrorMessage(_ctx.stringValue("SaveApgroupBasicConfigResponse.ErrorMessage"));
		saveApgroupBasicConfigResponse.setErrorCode(_ctx.integerValue("SaveApgroupBasicConfigResponse.ErrorCode"));

		Data data = new Data();
		data.setTaskId(_ctx.stringValue("SaveApgroupBasicConfigResponse.Data.TaskId"));
		data.setId(_ctx.longValue("SaveApgroupBasicConfigResponse.Data.Id"));
		saveApgroupBasicConfigResponse.setData(data);
	 
	 	return saveApgroupBasicConfigResponse;
	}
}