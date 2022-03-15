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

package com.aliyuncs.miniapplcdp.transform.v20200113;

import com.aliyuncs.miniapplcdp.model.v20200113.CreateModulePublishResponse;
import com.aliyuncs.miniapplcdp.model.v20200113.CreateModulePublishResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateModulePublishResponseUnmarshaller {

	public static CreateModulePublishResponse unmarshall(CreateModulePublishResponse createModulePublishResponse, UnmarshallerContext _ctx) {
		
		createModulePublishResponse.setRequestId(_ctx.stringValue("CreateModulePublishResponse.RequestId"));

		Data data = new Data();
		data.setCommitId(_ctx.stringValue("CreateModulePublishResponse.Data.CommitId"));
		data.setDescription(_ctx.stringValue("CreateModulePublishResponse.Data.Description"));
		data.setCreateTime(_ctx.stringValue("CreateModulePublishResponse.Data.CreateTime"));
		data.setModifiedTime(_ctx.stringValue("CreateModulePublishResponse.Data.ModifiedTime"));
		data.setModuleId(_ctx.stringValue("CreateModulePublishResponse.Data.ModuleId"));
		data.setPublishId(_ctx.stringValue("CreateModulePublishResponse.Data.PublishId"));
		data.setVersion(_ctx.stringValue("CreateModulePublishResponse.Data.Version"));
		createModulePublishResponse.setData(data);
	 
	 	return createModulePublishResponse;
	}
}