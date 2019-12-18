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

package com.aliyuncs.trademark.transform.v20180724;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.trademark.model.v20180724.QueryOssResourcesResponse;
import com.aliyuncs.trademark.model.v20180724.QueryOssResourcesResponse.TaskList;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryOssResourcesResponseUnmarshaller {

	public static QueryOssResourcesResponse unmarshall(QueryOssResourcesResponse queryOssResourcesResponse, UnmarshallerContext _ctx) {
		
		queryOssResourcesResponse.setRequestId(_ctx.stringValue("QueryOssResourcesResponse.RequestId"));

		List<TaskList> data = new ArrayList<TaskList>();
		for (int i = 0; i < _ctx.lengthValue("QueryOssResourcesResponse.Data.Length"); i++) {
			TaskList taskList = new TaskList();
			taskList.setBizId(_ctx.stringValue("QueryOssResourcesResponse.Data["+ i +"].BizId"));
			taskList.setName(_ctx.stringValue("QueryOssResourcesResponse.Data["+ i +"].Name"));
			taskList.setOssUrl(_ctx.stringValue("QueryOssResourcesResponse.Data["+ i +"].OssUrl"));
			taskList.setUpdateTime(_ctx.longValue("QueryOssResourcesResponse.Data["+ i +"].UpdateTime"));
			taskList.setCreateTime(_ctx.longValue("QueryOssResourcesResponse.Data["+ i +"].CreateTime"));

			data.add(taskList);
		}
		queryOssResourcesResponse.setData(data);
	 
	 	return queryOssResourcesResponse;
	}
}