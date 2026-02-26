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

package com.aliyuncs.ehpcinstant.transform.v20230701;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ehpcinstant.model.v20230701.ListJobExecutorsResponse;
import com.aliyuncs.ehpcinstant.model.v20230701.ListJobExecutorsResponse.Executor;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListJobExecutorsResponseUnmarshaller {

	public static ListJobExecutorsResponse unmarshall(ListJobExecutorsResponse listJobExecutorsResponse, UnmarshallerContext _ctx) {
		
		listJobExecutorsResponse.setRequestId(_ctx.stringValue("ListJobExecutorsResponse.RequestId"));
		listJobExecutorsResponse.setJobId(_ctx.stringValue("ListJobExecutorsResponse.JobId"));
		listJobExecutorsResponse.setTaskName(_ctx.stringValue("ListJobExecutorsResponse.TaskName"));
		listJobExecutorsResponse.setPageSize(_ctx.stringValue("ListJobExecutorsResponse.PageSize"));
		listJobExecutorsResponse.setPageNumber(_ctx.stringValue("ListJobExecutorsResponse.PageNumber"));
		listJobExecutorsResponse.setTotalCount(_ctx.stringValue("ListJobExecutorsResponse.TotalCount"));

		List<Executor> executors = new ArrayList<Executor>();
		for (int i = 0; i < _ctx.lengthValue("ListJobExecutorsResponse.Executors.Length"); i++) {
			Executor executor = new Executor();
			executor.setArrayIndex(_ctx.integerValue("ListJobExecutorsResponse.Executors["+ i +"].ArrayIndex"));
			executor.setCreateTime(_ctx.stringValue("ListJobExecutorsResponse.Executors["+ i +"].CreateTime"));
			executor.setEndTime(_ctx.stringValue("ListJobExecutorsResponse.Executors["+ i +"].EndTime"));
			executor.setStatus(_ctx.stringValue("ListJobExecutorsResponse.Executors["+ i +"].Status"));
			executor.setStatusReason(_ctx.stringValue("ListJobExecutorsResponse.Executors["+ i +"].StatusReason"));

			List<String> ipAddress = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListJobExecutorsResponse.Executors["+ i +"].IpAddress.Length"); j++) {
				ipAddress.add(_ctx.stringValue("ListJobExecutorsResponse.Executors["+ i +"].IpAddress["+ j +"]"));
			}
			executor.setIpAddress(ipAddress);

			List<String> hostName = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListJobExecutorsResponse.Executors["+ i +"].HostName.Length"); j++) {
				hostName.add(_ctx.stringValue("ListJobExecutorsResponse.Executors["+ i +"].HostName["+ j +"]"));
			}
			executor.setHostName(hostName);

			executors.add(executor);
		}
		listJobExecutorsResponse.setExecutors(executors);
	 
	 	return listJobExecutorsResponse;
	}
}