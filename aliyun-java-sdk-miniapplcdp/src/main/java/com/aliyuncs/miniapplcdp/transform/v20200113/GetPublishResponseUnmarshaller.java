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

import com.aliyuncs.miniapplcdp.model.v20200113.GetPublishResponse;
import com.aliyuncs.miniapplcdp.model.v20200113.GetPublishResponse.Data;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetPublishResponseUnmarshaller {

	public static GetPublishResponse unmarshall(GetPublishResponse getPublishResponse, UnmarshallerContext _ctx) {
		
		getPublishResponse.setRequestId(_ctx.stringValue("GetPublishResponse.RequestId"));

		Data data = new Data();
		data.setCommitId(_ctx.stringValue("GetPublishResponse.Data.CommitId"));
		data.setCreateTime(_ctx.stringValue("GetPublishResponse.Data.CreateTime"));
		data.setPublishStatus(_ctx.stringValue("GetPublishResponse.Data.PublishStatus"));
		data.setCompletionTime(_ctx.stringValue("GetPublishResponse.Data.CompletionTime"));
		data.setVersionNumber(_ctx.stringValue("GetPublishResponse.Data.VersionNumber"));
		data.setStartTime(_ctx.stringValue("GetPublishResponse.Data.StartTime"));
		data.setModifiedTime(_ctx.stringValue("GetPublishResponse.Data.ModifiedTime"));
		data.setPublishId(_ctx.stringValue("GetPublishResponse.Data.PublishId"));
		data.setPublishType(_ctx.stringValue("GetPublishResponse.Data.PublishType"));
		data.setDescription(_ctx.stringValue("GetPublishResponse.Data.Description"));
		data.setAppId(_ctx.stringValue("GetPublishResponse.Data.AppId"));
		data.setEnvId(_ctx.stringValue("GetPublishResponse.Data.EnvId"));
		data.setReason(_ctx.stringValue("GetPublishResponse.Data.Reason"));

		List<Map<Object, Object>> subTasks = _ctx.listMapValue("GetPublishResponse.Data.SubTasks");
		data.setSubTasks(subTasks);
		getPublishResponse.setData(data);
	 
	 	return getPublishResponse;
	}
}