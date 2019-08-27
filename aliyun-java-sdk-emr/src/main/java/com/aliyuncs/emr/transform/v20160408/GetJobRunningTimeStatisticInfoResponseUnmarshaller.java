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

package com.aliyuncs.emr.transform.v20160408;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emr.model.v20160408.GetJobRunningTimeStatisticInfoResponse;
import com.aliyuncs.emr.model.v20160408.GetJobRunningTimeStatisticInfoResponse.ClusterStatJobRunningTime;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetJobRunningTimeStatisticInfoResponseUnmarshaller {

	public static GetJobRunningTimeStatisticInfoResponse unmarshall(GetJobRunningTimeStatisticInfoResponse getJobRunningTimeStatisticInfoResponse, UnmarshallerContext _ctx) {
		
		getJobRunningTimeStatisticInfoResponse.setRequestId(_ctx.stringValue("GetJobRunningTimeStatisticInfoResponse.RequestId"));
		getJobRunningTimeStatisticInfoResponse.setTotal(_ctx.integerValue("GetJobRunningTimeStatisticInfoResponse.Total"));
		getJobRunningTimeStatisticInfoResponse.setPageNumber(_ctx.integerValue("GetJobRunningTimeStatisticInfoResponse.PageNumber"));
		getJobRunningTimeStatisticInfoResponse.setPageSize(_ctx.integerValue("GetJobRunningTimeStatisticInfoResponse.PageSize"));

		List<ClusterStatJobRunningTime> runningTimeList = new ArrayList<ClusterStatJobRunningTime>();
		for (int i = 0; i < _ctx.lengthValue("GetJobRunningTimeStatisticInfoResponse.RunningTimeList.Length"); i++) {
			ClusterStatJobRunningTime clusterStatJobRunningTime = new ClusterStatJobRunningTime();
			clusterStatJobRunningTime.setApplicationId(_ctx.stringValue("GetJobRunningTimeStatisticInfoResponse.RunningTimeList["+ i +"].ApplicationId"));
			clusterStatJobRunningTime.setJobId(_ctx.stringValue("GetJobRunningTimeStatisticInfoResponse.RunningTimeList["+ i +"].JobId"));
			clusterStatJobRunningTime.setStartTime(_ctx.longValue("GetJobRunningTimeStatisticInfoResponse.RunningTimeList["+ i +"].StartTime"));
			clusterStatJobRunningTime.setFinishTime(_ctx.longValue("GetJobRunningTimeStatisticInfoResponse.RunningTimeList["+ i +"].FinishTime"));
			clusterStatJobRunningTime.setName(_ctx.stringValue("GetJobRunningTimeStatisticInfoResponse.RunningTimeList["+ i +"].Name"));
			clusterStatJobRunningTime.setQueue(_ctx.stringValue("GetJobRunningTimeStatisticInfoResponse.RunningTimeList["+ i +"].Queue"));
			clusterStatJobRunningTime.setUser(_ctx.stringValue("GetJobRunningTimeStatisticInfoResponse.RunningTimeList["+ i +"].User"));
			clusterStatJobRunningTime.setState(_ctx.stringValue("GetJobRunningTimeStatisticInfoResponse.RunningTimeList["+ i +"].State"));
			clusterStatJobRunningTime.setRunningTime(_ctx.longValue("GetJobRunningTimeStatisticInfoResponse.RunningTimeList["+ i +"].RunningTime"));

			runningTimeList.add(clusterStatJobRunningTime);
		}
		getJobRunningTimeStatisticInfoResponse.setRunningTimeList(runningTimeList);
	 
	 	return getJobRunningTimeStatisticInfoResponse;
	}
}