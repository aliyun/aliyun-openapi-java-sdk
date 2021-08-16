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

import com.aliyuncs.das.model.v20200116.RunCloudBenchTaskResponse;
import com.aliyuncs.das.model.v20200116.RunCloudBenchTaskResponse.PreCheckItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class RunCloudBenchTaskResponseUnmarshaller {

	public static RunCloudBenchTaskResponse unmarshall(RunCloudBenchTaskResponse runCloudBenchTaskResponse, UnmarshallerContext _ctx) {
		
		runCloudBenchTaskResponse.setRequestId(_ctx.stringValue("RunCloudBenchTaskResponse.RequestId"));
		runCloudBenchTaskResponse.setCode(_ctx.stringValue("RunCloudBenchTaskResponse.Code"));
		runCloudBenchTaskResponse.setMessage(_ctx.stringValue("RunCloudBenchTaskResponse.Message"));
		runCloudBenchTaskResponse.setSuccess(_ctx.stringValue("RunCloudBenchTaskResponse.Success"));

		List<PreCheckItem> data = new ArrayList<PreCheckItem>();
		for (int i = 0; i < _ctx.lengthValue("RunCloudBenchTaskResponse.Data.Length"); i++) {
			PreCheckItem preCheckItem = new PreCheckItem();
			preCheckItem.setStatus(_ctx.stringValue("RunCloudBenchTaskResponse.Data["+ i +"].Status"));
			preCheckItem.setOrder(_ctx.integerValue("RunCloudBenchTaskResponse.Data["+ i +"].Order"));
			preCheckItem.setCode(_ctx.integerValue("RunCloudBenchTaskResponse.Data["+ i +"].Code"));
			preCheckItem.setMessage(_ctx.stringValue("RunCloudBenchTaskResponse.Data["+ i +"].Message"));
			preCheckItem.setName(_ctx.stringValue("RunCloudBenchTaskResponse.Data["+ i +"].Name"));
			preCheckItem.setDetails(_ctx.stringValue("RunCloudBenchTaskResponse.Data["+ i +"].Details"));

			data.add(preCheckItem);
		}
		runCloudBenchTaskResponse.setData(data);
	 
	 	return runCloudBenchTaskResponse;
	}
}