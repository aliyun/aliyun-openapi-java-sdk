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

import com.aliyuncs.idrsservice.model.v20200630.CreateAppResponse;
import com.aliyuncs.idrsservice.model.v20200630.CreateAppResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateAppResponseUnmarshaller {

	public static CreateAppResponse unmarshall(CreateAppResponse createAppResponse, UnmarshallerContext _ctx) {
		
		createAppResponse.setRequestId(_ctx.stringValue("CreateAppResponse.RequestId"));
		createAppResponse.setCode(_ctx.stringValue("CreateAppResponse.Code"));
		createAppResponse.setMessage(_ctx.stringValue("CreateAppResponse.Message"));

		Data data = new Data();
		data.setCreatedAt(_ctx.stringValue("CreateAppResponse.Data.CreatedAt"));
		data.setCreatorName(_ctx.stringValue("CreateAppResponse.Data.CreatorName"));
		data.setDisabled(_ctx.booleanValue("CreateAppResponse.Data.Disabled"));
		data.setId(_ctx.stringValue("CreateAppResponse.Data.Id"));
		data.setName(_ctx.stringValue("CreateAppResponse.Data.Name"));
		createAppResponse.setData(data);
	 
	 	return createAppResponse;
	}
}