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

package com.aliyuncs.dataphin_public.transform.v20230630;

import com.aliyuncs.dataphin_public.model.v20230630.CreateDataServiceAppGroupResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateDataServiceAppGroupResponseUnmarshaller {

	public static CreateDataServiceAppGroupResponse unmarshall(CreateDataServiceAppGroupResponse createDataServiceAppGroupResponse, UnmarshallerContext _ctx) {
		
		createDataServiceAppGroupResponse.setRequestId(_ctx.stringValue("CreateDataServiceAppGroupResponse.RequestId"));
		createDataServiceAppGroupResponse.setMessage(_ctx.stringValue("CreateDataServiceAppGroupResponse.Message"));
		createDataServiceAppGroupResponse.setHttpStatusCode(_ctx.integerValue("CreateDataServiceAppGroupResponse.HttpStatusCode"));
		createDataServiceAppGroupResponse.setData(_ctx.integerValue("CreateDataServiceAppGroupResponse.Data"));
		createDataServiceAppGroupResponse.setCode(_ctx.stringValue("CreateDataServiceAppGroupResponse.Code"));
		createDataServiceAppGroupResponse.setSuccess(_ctx.booleanValue("CreateDataServiceAppGroupResponse.Success"));
	 
	 	return createDataServiceAppGroupResponse;
	}
}