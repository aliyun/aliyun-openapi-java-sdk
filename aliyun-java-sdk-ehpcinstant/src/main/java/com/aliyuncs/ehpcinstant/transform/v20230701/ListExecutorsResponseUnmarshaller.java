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

import com.aliyuncs.ehpcinstant.model.v20230701.ListExecutorsResponse;
import com.aliyuncs.ehpcinstant.model.v20230701.ListExecutorsResponse.Executor;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListExecutorsResponseUnmarshaller {

	public static ListExecutorsResponse unmarshall(ListExecutorsResponse listExecutorsResponse, UnmarshallerContext _ctx) {
		
		listExecutorsResponse.setRequestId(_ctx.stringValue("ListExecutorsResponse.RequestId"));
		listExecutorsResponse.setPageSize(_ctx.stringValue("ListExecutorsResponse.PageSize"));
		listExecutorsResponse.setPageNumber(_ctx.stringValue("ListExecutorsResponse.PageNumber"));
		listExecutorsResponse.setTotalCount(_ctx.stringValue("ListExecutorsResponse.TotalCount"));

		List<Executor> executors = new ArrayList<Executor>();
		for (int i = 0; i < _ctx.lengthValue("ListExecutorsResponse.Executors.Length"); i++) {
			Executor executor = new Executor();
			executor.setExecutorId(_ctx.stringValue("ListExecutorsResponse.Executors["+ i +"].ExecutorId"));
			executor.setJobId(_ctx.stringValue("ListExecutorsResponse.Executors["+ i +"].JobId"));
			executor.setJobName(_ctx.stringValue("ListExecutorsResponse.Executors["+ i +"].JobName"));
			executor.setTaskName(_ctx.stringValue("ListExecutorsResponse.Executors["+ i +"].TaskName"));
			executor.setArrayIndex(_ctx.integerValue("ListExecutorsResponse.Executors["+ i +"].ArrayIndex"));
			executor.setCreateTime(_ctx.stringValue("ListExecutorsResponse.Executors["+ i +"].CreateTime"));
			executor.setEndTime(_ctx.stringValue("ListExecutorsResponse.Executors["+ i +"].EndTime"));
			executor.setStatus(_ctx.stringValue("ListExecutorsResponse.Executors["+ i +"].Status"));
			executor.setStatusReason(_ctx.stringValue("ListExecutorsResponse.Executors["+ i +"].StatusReason"));

			List<String> ipAddress = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListExecutorsResponse.Executors["+ i +"].IpAddress.Length"); j++) {
				ipAddress.add(_ctx.stringValue("ListExecutorsResponse.Executors["+ i +"].IpAddress["+ j +"]"));
			}
			executor.setIpAddress(ipAddress);

			List<String> hostName = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListExecutorsResponse.Executors["+ i +"].HostName.Length"); j++) {
				hostName.add(_ctx.stringValue("ListExecutorsResponse.Executors["+ i +"].HostName["+ j +"]"));
			}
			executor.setHostName(hostName);

			executors.add(executor);
		}
		listExecutorsResponse.setExecutors(executors);
	 
	 	return listExecutorsResponse;
	}
}