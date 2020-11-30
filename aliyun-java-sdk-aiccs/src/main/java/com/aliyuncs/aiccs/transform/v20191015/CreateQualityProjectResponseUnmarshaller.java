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

package com.aliyuncs.aiccs.transform.v20191015;

import com.aliyuncs.aiccs.model.v20191015.CreateQualityProjectResponse;
import com.aliyuncs.aiccs.model.v20191015.CreateQualityProjectResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateQualityProjectResponseUnmarshaller {

	public static CreateQualityProjectResponse unmarshall(CreateQualityProjectResponse createQualityProjectResponse, UnmarshallerContext _ctx) {
		
		createQualityProjectResponse.setRequestId(_ctx.stringValue("CreateQualityProjectResponse.RequestId"));
		createQualityProjectResponse.setCode(_ctx.stringValue("CreateQualityProjectResponse.Code"));
		createQualityProjectResponse.setMessage(_ctx.stringValue("CreateQualityProjectResponse.Message"));
		createQualityProjectResponse.setSuccess(_ctx.booleanValue("CreateQualityProjectResponse.Success"));

		Data data = new Data();
		data.setInstanceId(_ctx.stringValue("CreateQualityProjectResponse.Data.InstanceId"));
		data.setProjectId(_ctx.longValue("CreateQualityProjectResponse.Data.ProjectId"));
		data.setVersion(_ctx.integerValue("CreateQualityProjectResponse.Data.Version"));
		createQualityProjectResponse.setData(data);
	 
	 	return createQualityProjectResponse;
	}
}