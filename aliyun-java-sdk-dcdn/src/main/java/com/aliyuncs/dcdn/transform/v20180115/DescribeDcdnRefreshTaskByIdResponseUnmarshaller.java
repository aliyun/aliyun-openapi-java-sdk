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

package com.aliyuncs.dcdn.transform.v20180115;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnRefreshTaskByIdResponse;
import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnRefreshTaskByIdResponse.CDNTask;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDcdnRefreshTaskByIdResponseUnmarshaller {

	public static DescribeDcdnRefreshTaskByIdResponse unmarshall(DescribeDcdnRefreshTaskByIdResponse describeDcdnRefreshTaskByIdResponse, UnmarshallerContext _ctx) {
		
		describeDcdnRefreshTaskByIdResponse.setRequestId(_ctx.stringValue("DescribeDcdnRefreshTaskByIdResponse.RequestId"));
		describeDcdnRefreshTaskByIdResponse.setTotalCount(_ctx.longValue("DescribeDcdnRefreshTaskByIdResponse.TotalCount"));

		List<CDNTask> tasks = new ArrayList<CDNTask>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDcdnRefreshTaskByIdResponse.Tasks.Length"); i++) {
			CDNTask cDNTask = new CDNTask();
			cDNTask.setTaskId(_ctx.stringValue("DescribeDcdnRefreshTaskByIdResponse.Tasks["+ i +"].TaskId"));
			cDNTask.setObjectPath(_ctx.stringValue("DescribeDcdnRefreshTaskByIdResponse.Tasks["+ i +"].ObjectPath"));
			cDNTask.setProcess(_ctx.stringValue("DescribeDcdnRefreshTaskByIdResponse.Tasks["+ i +"].Process"));
			cDNTask.setStatus(_ctx.stringValue("DescribeDcdnRefreshTaskByIdResponse.Tasks["+ i +"].Status"));
			cDNTask.setCreationTime(_ctx.stringValue("DescribeDcdnRefreshTaskByIdResponse.Tasks["+ i +"].CreationTime"));
			cDNTask.setDescription(_ctx.stringValue("DescribeDcdnRefreshTaskByIdResponse.Tasks["+ i +"].Description"));
			cDNTask.setObjectType(_ctx.stringValue("DescribeDcdnRefreshTaskByIdResponse.Tasks["+ i +"].ObjectType"));

			tasks.add(cDNTask);
		}
		describeDcdnRefreshTaskByIdResponse.setTasks(tasks);
	 
	 	return describeDcdnRefreshTaskByIdResponse;
	}
}