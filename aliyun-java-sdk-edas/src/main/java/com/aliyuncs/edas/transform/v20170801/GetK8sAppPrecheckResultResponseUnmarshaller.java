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

import com.aliyuncs.edas.model.v20170801.GetK8sAppPrecheckResultResponse;
import com.aliyuncs.edas.model.v20170801.GetK8sAppPrecheckResultResponse.Data;
import com.aliyuncs.edas.model.v20170801.GetK8sAppPrecheckResultResponse.Data.JobResultsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetK8sAppPrecheckResultResponseUnmarshaller {

	public static GetK8sAppPrecheckResultResponse unmarshall(GetK8sAppPrecheckResultResponse getK8sAppPrecheckResultResponse, UnmarshallerContext _ctx) {
		
		getK8sAppPrecheckResultResponse.setRequestId(_ctx.stringValue("GetK8sAppPrecheckResultResponse.RequestId"));
		getK8sAppPrecheckResultResponse.setCode(_ctx.integerValue("GetK8sAppPrecheckResultResponse.Code"));
		getK8sAppPrecheckResultResponse.setMessage(_ctx.stringValue("GetK8sAppPrecheckResultResponse.Message"));

		Data data = new Data();
		data.setStatus(_ctx.stringValue("GetK8sAppPrecheckResultResponse.Data.Status"));
		data.setReason(_ctx.stringValue("GetK8sAppPrecheckResultResponse.Data.Reason"));

		List<JobResultsItem> jobResults = new ArrayList<JobResultsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetK8sAppPrecheckResultResponse.Data.JobResults.Length"); i++) {
			JobResultsItem jobResultsItem = new JobResultsItem();
			jobResultsItem.setName(_ctx.stringValue("GetK8sAppPrecheckResultResponse.Data.JobResults["+ i +"].Name"));
			jobResultsItem.setPass(_ctx.booleanValue("GetK8sAppPrecheckResultResponse.Data.JobResults["+ i +"].Pass"));
			jobResultsItem.setInterrupted(_ctx.booleanValue("GetK8sAppPrecheckResultResponse.Data.JobResults["+ i +"].Interrupted"));
			jobResultsItem.setReason(_ctx.stringValue("GetK8sAppPrecheckResultResponse.Data.JobResults["+ i +"].Reason"));

			jobResults.add(jobResultsItem);
		}
		data.setJobResults(jobResults);
		getK8sAppPrecheckResultResponse.setData(data);
	 
	 	return getK8sAppPrecheckResultResponse;
	}
}