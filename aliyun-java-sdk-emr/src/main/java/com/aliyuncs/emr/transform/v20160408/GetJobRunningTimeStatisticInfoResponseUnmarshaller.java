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

	public static GetJobRunningTimeStatisticInfoResponse unmarshall(GetJobRunningTimeStatisticInfoResponse getJobRunningTimeStatisticInfoResponse, UnmarshallerContext context) {
		
		getJobRunningTimeStatisticInfoResponse.setRequestId(context.stringValue("GetJobRunningTimeStatisticInfoResponse.RequestId"));
		getJobRunningTimeStatisticInfoResponse.setTotal(context.integerValue("GetJobRunningTimeStatisticInfoResponse.Total"));
		getJobRunningTimeStatisticInfoResponse.setPageNumber(context.integerValue("GetJobRunningTimeStatisticInfoResponse.PageNumber"));
		getJobRunningTimeStatisticInfoResponse.setPageSize(context.integerValue("GetJobRunningTimeStatisticInfoResponse.PageSize"));

		List<ClusterStatJobRunningTime> runningTimeList = new ArrayList<ClusterStatJobRunningTime>();
		for (int i = 0; i < context.lengthValue("GetJobRunningTimeStatisticInfoResponse.RunningTimeList.Length"); i++) {
			ClusterStatJobRunningTime clusterStatJobRunningTime = new ClusterStatJobRunningTime();
			clusterStatJobRunningTime.setApplicationId(context.stringValue("GetJobRunningTimeStatisticInfoResponse.RunningTimeList["+ i +"].ApplicationId"));
			clusterStatJobRunningTime.setJobId(context.stringValue("GetJobRunningTimeStatisticInfoResponse.RunningTimeList["+ i +"].JobId"));
			clusterStatJobRunningTime.setStartTime(context.longValue("GetJobRunningTimeStatisticInfoResponse.RunningTimeList["+ i +"].StartTime"));
			clusterStatJobRunningTime.setFinishTime(context.longValue("GetJobRunningTimeStatisticInfoResponse.RunningTimeList["+ i +"].FinishTime"));
			clusterStatJobRunningTime.setName(context.stringValue("GetJobRunningTimeStatisticInfoResponse.RunningTimeList["+ i +"].Name"));
			clusterStatJobRunningTime.setQueue(context.stringValue("GetJobRunningTimeStatisticInfoResponse.RunningTimeList["+ i +"].Queue"));
			clusterStatJobRunningTime.setUser(context.stringValue("GetJobRunningTimeStatisticInfoResponse.RunningTimeList["+ i +"].User"));
			clusterStatJobRunningTime.setState(context.stringValue("GetJobRunningTimeStatisticInfoResponse.RunningTimeList["+ i +"].State"));
			clusterStatJobRunningTime.setRunningTime(context.longValue("GetJobRunningTimeStatisticInfoResponse.RunningTimeList["+ i +"].RunningTime"));

			runningTimeList.add(clusterStatJobRunningTime);
		}
		getJobRunningTimeStatisticInfoResponse.setRunningTimeList(runningTimeList);
	 
	 	return getJobRunningTimeStatisticInfoResponse;
	}
}