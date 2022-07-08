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

package com.aliyuncs.edas.transform.v20170801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.edas.model.v20170801.StartK8sAppPrecheckResponse;
import com.aliyuncs.edas.model.v20170801.StartK8sAppPrecheckResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class StartK8sAppPrecheckResponseUnmarshaller {

	public static StartK8sAppPrecheckResponse unmarshall(StartK8sAppPrecheckResponse startK8sAppPrecheckResponse, UnmarshallerContext _ctx) {
		
		startK8sAppPrecheckResponse.setRequestId(_ctx.stringValue("StartK8sAppPrecheckResponse.RequestId"));
		startK8sAppPrecheckResponse.setCode(_ctx.integerValue("StartK8sAppPrecheckResponse.Code"));
		startK8sAppPrecheckResponse.setMessage(_ctx.stringValue("StartK8sAppPrecheckResponse.Message"));

		Data data = new Data();

		List<String> jobs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("StartK8sAppPrecheckResponse.Data.Jobs.Length"); i++) {
			jobs.add(_ctx.stringValue("StartK8sAppPrecheckResponse.Data.Jobs["+ i +"]"));
		}
		data.setJobs(jobs);
		startK8sAppPrecheckResponse.setData(data);
	 
	 	return startK8sAppPrecheckResponse;
	}
}