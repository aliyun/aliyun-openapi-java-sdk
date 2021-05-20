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

package com.aliyuncs.dataworks_public.transform.v20200518;

import com.aliyuncs.dataworks_public.model.v20200518.GetInstanceStatusStatisticResponse;
import com.aliyuncs.dataworks_public.model.v20200518.GetInstanceStatusStatisticResponse.StatusCount;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetInstanceStatusStatisticResponseUnmarshaller {

	public static GetInstanceStatusStatisticResponse unmarshall(GetInstanceStatusStatisticResponse getInstanceStatusStatisticResponse, UnmarshallerContext _ctx) {
		
		getInstanceStatusStatisticResponse.setRequestId(_ctx.stringValue("GetInstanceStatusStatisticResponse.RequestId"));

		StatusCount statusCount = new StatusCount();
		statusCount.setTotalCount(_ctx.integerValue("GetInstanceStatusStatisticResponse.StatusCount.TotalCount"));
		statusCount.setNotRunCount(_ctx.integerValue("GetInstanceStatusStatisticResponse.StatusCount.NotRunCount"));
		statusCount.setWaitTimeCount(_ctx.integerValue("GetInstanceStatusStatisticResponse.StatusCount.WaitTimeCount"));
		statusCount.setWaitResCount(_ctx.integerValue("GetInstanceStatusStatisticResponse.StatusCount.WaitResCount"));
		statusCount.setRunningCount(_ctx.integerValue("GetInstanceStatusStatisticResponse.StatusCount.RunningCount"));
		statusCount.setFailureCount(_ctx.integerValue("GetInstanceStatusStatisticResponse.StatusCount.FailureCount"));
		statusCount.setSuccessCount(_ctx.integerValue("GetInstanceStatusStatisticResponse.StatusCount.SuccessCount"));
		getInstanceStatusStatisticResponse.setStatusCount(statusCount);
	 
	 	return getInstanceStatusStatisticResponse;
	}
}