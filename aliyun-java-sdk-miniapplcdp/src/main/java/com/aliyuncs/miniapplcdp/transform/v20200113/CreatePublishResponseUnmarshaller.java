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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.miniapplcdp.model.v20200113.CreatePublishResponse;
import com.aliyuncs.miniapplcdp.model.v20200113.CreatePublishResponse.Data;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreatePublishResponseUnmarshaller {

	public static CreatePublishResponse unmarshall(CreatePublishResponse createPublishResponse, UnmarshallerContext _ctx) {
		
		createPublishResponse.setRequestId(_ctx.stringValue("CreatePublishResponse.RequestId"));

		Data data = new Data();
		data.setAppId(_ctx.stringValue("CreatePublishResponse.Data.AppId"));
		data.setCommitId(_ctx.stringValue("CreatePublishResponse.Data.CommitId"));
		data.setCompletionTime(_ctx.stringValue("CreatePublishResponse.Data.CompletionTime"));
		data.setDescription(_ctx.stringValue("CreatePublishResponse.Data.Description"));
		data.setEnvId(_ctx.stringValue("CreatePublishResponse.Data.EnvId"));
		data.setCreateTime(_ctx.stringValue("CreatePublishResponse.Data.CreateTime"));
		data.setModifiedTime(_ctx.stringValue("CreatePublishResponse.Data.ModifiedTime"));
		data.setPublishId(_ctx.stringValue("CreatePublishResponse.Data.PublishId"));
		data.setReason(_ctx.stringValue("CreatePublishResponse.Data.Reason"));
		data.setStartTime(_ctx.stringValue("CreatePublishResponse.Data.StartTime"));
		data.setPublishStatus(_ctx.stringValue("CreatePublishResponse.Data.PublishStatus"));
		data.setPublishType(_ctx.stringValue("CreatePublishResponse.Data.PublishType"));
		data.setVersionNumber(_ctx.stringValue("CreatePublishResponse.Data.VersionNumber"));

		List<Map<Object, Object>> subTasks = _ctx.listMapValue("CreatePublishResponse.Data.SubTasks");
		data.setSubTasks(subTasks);
		createPublishResponse.setData(data);
	 
	 	return createPublishResponse;
	}
}