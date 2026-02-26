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

package com.aliyuncs.alidns.transform.v20150109;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.alidns.model.v20150109.DescribeIspFlushCacheTasksResponse;
import com.aliyuncs.alidns.model.v20150109.DescribeIspFlushCacheTasksResponse.IspFlushCacheTask;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeIspFlushCacheTasksResponseUnmarshaller {

	public static DescribeIspFlushCacheTasksResponse unmarshall(DescribeIspFlushCacheTasksResponse describeIspFlushCacheTasksResponse, UnmarshallerContext _ctx) {
		
		describeIspFlushCacheTasksResponse.setRequestId(_ctx.stringValue("DescribeIspFlushCacheTasksResponse.RequestId"));
		describeIspFlushCacheTasksResponse.setPageSize(_ctx.integerValue("DescribeIspFlushCacheTasksResponse.PageSize"));
		describeIspFlushCacheTasksResponse.setPageNumber(_ctx.integerValue("DescribeIspFlushCacheTasksResponse.PageNumber"));
		describeIspFlushCacheTasksResponse.setTotalPages(_ctx.integerValue("DescribeIspFlushCacheTasksResponse.TotalPages"));
		describeIspFlushCacheTasksResponse.setTotalItems(_ctx.integerValue("DescribeIspFlushCacheTasksResponse.TotalItems"));

		List<IspFlushCacheTask> ispFlushCacheTasks = new ArrayList<IspFlushCacheTask>();
		for (int i = 0; i < _ctx.lengthValue("DescribeIspFlushCacheTasksResponse.IspFlushCacheTasks.Length"); i++) {
			IspFlushCacheTask ispFlushCacheTask = new IspFlushCacheTask();
			ispFlushCacheTask.setTaskId(_ctx.stringValue("DescribeIspFlushCacheTasksResponse.IspFlushCacheTasks["+ i +"].TaskId"));
			ispFlushCacheTask.setDomainName(_ctx.stringValue("DescribeIspFlushCacheTasksResponse.IspFlushCacheTasks["+ i +"].DomainName"));
			ispFlushCacheTask.setInstanceId(_ctx.stringValue("DescribeIspFlushCacheTasksResponse.IspFlushCacheTasks["+ i +"].InstanceId"));
			ispFlushCacheTask.setInstanceName(_ctx.stringValue("DescribeIspFlushCacheTasksResponse.IspFlushCacheTasks["+ i +"].InstanceName"));
			ispFlushCacheTask.setIsp(_ctx.stringValue("DescribeIspFlushCacheTasksResponse.IspFlushCacheTasks["+ i +"].Isp"));
			ispFlushCacheTask.setTaskStatus(_ctx.stringValue("DescribeIspFlushCacheTasksResponse.IspFlushCacheTasks["+ i +"].TaskStatus"));
			ispFlushCacheTask.setCreateTime(_ctx.stringValue("DescribeIspFlushCacheTasksResponse.IspFlushCacheTasks["+ i +"].CreateTime"));
			ispFlushCacheTask.setCreateTimestamp(_ctx.longValue("DescribeIspFlushCacheTasksResponse.IspFlushCacheTasks["+ i +"].CreateTimestamp"));

			ispFlushCacheTasks.add(ispFlushCacheTask);
		}
		describeIspFlushCacheTasksResponse.setIspFlushCacheTasks(ispFlushCacheTasks);
	 
	 	return describeIspFlushCacheTasksResponse;
	}
}