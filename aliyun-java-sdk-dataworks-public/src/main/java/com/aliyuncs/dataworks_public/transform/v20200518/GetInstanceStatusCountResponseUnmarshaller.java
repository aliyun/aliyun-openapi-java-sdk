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

import com.aliyuncs.dataworks_public.model.v20200518.GetInstanceStatusCountResponse;
import com.aliyuncs.dataworks_public.model.v20200518.GetInstanceStatusCountResponse.StatusCount;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetInstanceStatusCountResponseUnmarshaller {

	public static GetInstanceStatusCountResponse unmarshall(GetInstanceStatusCountResponse getInstanceStatusCountResponse, UnmarshallerContext _ctx) {
		
		getInstanceStatusCountResponse.setRequestId(_ctx.stringValue("GetInstanceStatusCountResponse.RequestId"));

		StatusCount statusCount = new StatusCount();
		statusCount.setFailureCount(_ctx.integerValue("GetInstanceStatusCountResponse.StatusCount.FailureCount"));
		statusCount.setWaitTimeCount(_ctx.integerValue("GetInstanceStatusCountResponse.StatusCount.WaitTimeCount"));
		statusCount.setRunningCount(_ctx.integerValue("GetInstanceStatusCountResponse.StatusCount.RunningCount"));
		statusCount.setSuccessCount(_ctx.integerValue("GetInstanceStatusCountResponse.StatusCount.SuccessCount"));
		statusCount.setTotalCount(_ctx.integerValue("GetInstanceStatusCountResponse.StatusCount.TotalCount"));
		statusCount.setNotRunCount(_ctx.integerValue("GetInstanceStatusCountResponse.StatusCount.NotRunCount"));
		statusCount.setWaitResCount(_ctx.integerValue("GetInstanceStatusCountResponse.StatusCount.WaitResCount"));
		getInstanceStatusCountResponse.setStatusCount(statusCount);
	 
	 	return getInstanceStatusCountResponse;
	}
}