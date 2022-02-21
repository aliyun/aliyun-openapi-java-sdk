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

package com.aliyuncs.das.transform.v20200116;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.das.model.v20200116.CreateCloudBenchTasksResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateCloudBenchTasksResponseUnmarshaller {

	public static CreateCloudBenchTasksResponse unmarshall(CreateCloudBenchTasksResponse createCloudBenchTasksResponse, UnmarshallerContext _ctx) {
		
		createCloudBenchTasksResponse.setRequestId(_ctx.stringValue("CreateCloudBenchTasksResponse.RequestId"));
		createCloudBenchTasksResponse.setCode(_ctx.stringValue("CreateCloudBenchTasksResponse.Code"));
		createCloudBenchTasksResponse.setMessage(_ctx.stringValue("CreateCloudBenchTasksResponse.Message"));
		createCloudBenchTasksResponse.setSuccess(_ctx.stringValue("CreateCloudBenchTasksResponse.Success"));

		List<String> data = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateCloudBenchTasksResponse.Data.Length"); i++) {
			data.add(_ctx.stringValue("CreateCloudBenchTasksResponse.Data["+ i +"]"));
		}
		createCloudBenchTasksResponse.setData(data);
	 
	 	return createCloudBenchTasksResponse;
	}
}