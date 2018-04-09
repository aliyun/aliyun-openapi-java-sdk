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

import com.aliyuncs.emr.model.v20160408.GetJobOutputStatisticInfoResponse;
import com.aliyuncs.emr.model.v20160408.GetJobOutputStatisticInfoResponse.ClusterStatJobOutput;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetJobOutputStatisticInfoResponseUnmarshaller {

	public static GetJobOutputStatisticInfoResponse unmarshall(GetJobOutputStatisticInfoResponse getJobOutputStatisticInfoResponse, UnmarshallerContext context) {
		
		getJobOutputStatisticInfoResponse.setRequestId(context.stringValue("GetJobOutputStatisticInfoResponse.RequestId"));
		getJobOutputStatisticInfoResponse.setTotal(context.integerValue("GetJobOutputStatisticInfoResponse.Total"));
		getJobOutputStatisticInfoResponse.setPageNumber(context.integerValue("GetJobOutputStatisticInfoResponse.PageNumber"));
		getJobOutputStatisticInfoResponse.setPageSize(context.integerValue("GetJobOutputStatisticInfoResponse.PageSize"));

		List<ClusterStatJobOutput> jobOutputList = new ArrayList<ClusterStatJobOutput>();
		for (int i = 0; i < context.lengthValue("GetJobOutputStatisticInfoResponse.JobOutputList.Length"); i++) {
			ClusterStatJobOutput clusterStatJobOutput = new ClusterStatJobOutput();
			clusterStatJobOutput.setApplicationId(context.stringValue("GetJobOutputStatisticInfoResponse.JobOutputList["+ i +"].ApplicationId"));
			clusterStatJobOutput.setJobId(context.stringValue("GetJobOutputStatisticInfoResponse.JobOutputList["+ i +"].JobId"));
			clusterStatJobOutput.setStartTime(context.longValue("GetJobOutputStatisticInfoResponse.JobOutputList["+ i +"].StartTime"));
			clusterStatJobOutput.setFinishTime(context.longValue("GetJobOutputStatisticInfoResponse.JobOutputList["+ i +"].FinishTime"));
			clusterStatJobOutput.setName(context.stringValue("GetJobOutputStatisticInfoResponse.JobOutputList["+ i +"].Name"));
			clusterStatJobOutput.setQueue(context.stringValue("GetJobOutputStatisticInfoResponse.JobOutputList["+ i +"].Queue"));
			clusterStatJobOutput.setUser(context.stringValue("GetJobOutputStatisticInfoResponse.JobOutputList["+ i +"].User"));
			clusterStatJobOutput.setState(context.stringValue("GetJobOutputStatisticInfoResponse.JobOutputList["+ i +"].State"));
			clusterStatJobOutput.setBytesOutput(context.longValue("GetJobOutputStatisticInfoResponse.JobOutputList["+ i +"].BytesOutput"));

			jobOutputList.add(clusterStatJobOutput);
		}
		getJobOutputStatisticInfoResponse.setJobOutputList(jobOutputList);
	 
	 	return getJobOutputStatisticInfoResponse;
	}
}