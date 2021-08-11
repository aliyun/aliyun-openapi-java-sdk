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

package com.aliyuncs.retailcloud.transform.v20180313;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.retailcloud.model.v20180313.DescribePodContainerLogListResponse;
import com.aliyuncs.retailcloud.model.v20180313.DescribePodContainerLogListResponse.Result;
import com.aliyuncs.retailcloud.model.v20180313.DescribePodContainerLogListResponse.Result.PodContainerLog;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePodContainerLogListResponseUnmarshaller {

	public static DescribePodContainerLogListResponse unmarshall(DescribePodContainerLogListResponse describePodContainerLogListResponse, UnmarshallerContext _ctx) {
		
		describePodContainerLogListResponse.setRequestId(_ctx.stringValue("DescribePodContainerLogListResponse.RequestId"));
		describePodContainerLogListResponse.setCode(_ctx.integerValue("DescribePodContainerLogListResponse.Code"));
		describePodContainerLogListResponse.setErrMsg(_ctx.stringValue("DescribePodContainerLogListResponse.ErrMsg"));
		describePodContainerLogListResponse.setSuccess(_ctx.booleanValue("DescribePodContainerLogListResponse.Success"));

		Result result = new Result();

		List<PodContainerLog> containerLogList = new ArrayList<PodContainerLog>();
		for (int i = 0; i < _ctx.lengthValue("DescribePodContainerLogListResponse.Result.ContainerLogList.Length"); i++) {
			PodContainerLog podContainerLog = new PodContainerLog();
			podContainerLog.setContainerName(_ctx.stringValue("DescribePodContainerLogListResponse.Result.ContainerLogList["+ i +"].ContainerName"));
			podContainerLog.setContent(_ctx.stringValue("DescribePodContainerLogListResponse.Result.ContainerLogList["+ i +"].Content"));
			podContainerLog.setPodName(_ctx.stringValue("DescribePodContainerLogListResponse.Result.ContainerLogList["+ i +"].PodName"));

			containerLogList.add(podContainerLog);
		}
		result.setContainerLogList(containerLogList);
		describePodContainerLogListResponse.setResult(result);
	 
	 	return describePodContainerLogListResponse;
	}
}