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

package com.aliyuncs.live.transform.v20161101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.live.model.v20161101.DescribeLiveStreamPreloadTasksResponse;
import com.aliyuncs.live.model.v20161101.DescribeLiveStreamPreloadTasksResponse.PreloadTask;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveStreamPreloadTasksResponseUnmarshaller {

	public static DescribeLiveStreamPreloadTasksResponse unmarshall(DescribeLiveStreamPreloadTasksResponse describeLiveStreamPreloadTasksResponse, UnmarshallerContext _ctx) {
		
		describeLiveStreamPreloadTasksResponse.setRequestId(_ctx.stringValue("DescribeLiveStreamPreloadTasksResponse.RequestId"));
		describeLiveStreamPreloadTasksResponse.setTotalPage(_ctx.integerValue("DescribeLiveStreamPreloadTasksResponse.TotalPage"));
		describeLiveStreamPreloadTasksResponse.setPageNum(_ctx.integerValue("DescribeLiveStreamPreloadTasksResponse.PageNum"));
		describeLiveStreamPreloadTasksResponse.setPageSize(_ctx.integerValue("DescribeLiveStreamPreloadTasksResponse.PageSize"));
		describeLiveStreamPreloadTasksResponse.setTotalNum(_ctx.integerValue("DescribeLiveStreamPreloadTasksResponse.TotalNum"));

		List<PreloadTask> preloadTasks = new ArrayList<PreloadTask>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLiveStreamPreloadTasksResponse.PreloadTasks.Length"); i++) {
			PreloadTask preloadTask = new PreloadTask();
			preloadTask.setStatus(_ctx.stringValue("DescribeLiveStreamPreloadTasksResponse.PreloadTasks["+ i +"].Status"));
			preloadTask.setProcess(_ctx.stringValue("DescribeLiveStreamPreloadTasksResponse.PreloadTasks["+ i +"].Process"));
			preloadTask.setDescription(_ctx.stringValue("DescribeLiveStreamPreloadTasksResponse.PreloadTasks["+ i +"].Description"));
			preloadTask.setCreateTime(_ctx.stringValue("DescribeLiveStreamPreloadTasksResponse.PreloadTasks["+ i +"].CreateTime"));
			preloadTask.setPreloadedEndTime(_ctx.stringValue("DescribeLiveStreamPreloadTasksResponse.PreloadTasks["+ i +"].PreloadedEndTime"));
			preloadTask.setPreloadedStartTime(_ctx.stringValue("DescribeLiveStreamPreloadTasksResponse.PreloadTasks["+ i +"].PreloadedStartTime"));
			preloadTask.setPlayUrl(_ctx.stringValue("DescribeLiveStreamPreloadTasksResponse.PreloadTasks["+ i +"].PlayUrl"));
			preloadTask.setArea(_ctx.stringValue("DescribeLiveStreamPreloadTasksResponse.PreloadTasks["+ i +"].Area"));
			preloadTask.setTaskId(_ctx.stringValue("DescribeLiveStreamPreloadTasksResponse.PreloadTasks["+ i +"].TaskId"));
			preloadTask.setDomainName(_ctx.stringValue("DescribeLiveStreamPreloadTasksResponse.PreloadTasks["+ i +"].DomainName"));

			preloadTasks.add(preloadTask);
		}
		describeLiveStreamPreloadTasksResponse.setPreloadTasks(preloadTasks);
	 
	 	return describeLiveStreamPreloadTasksResponse;
	}
}