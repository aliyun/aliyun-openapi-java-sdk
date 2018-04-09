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

import com.aliyuncs.emr.model.v20160408.GetJobInputStatisticInfoResponse;
import com.aliyuncs.emr.model.v20160408.GetJobInputStatisticInfoResponse.ClusterStatJobInput;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetJobInputStatisticInfoResponseUnmarshaller {

	public static GetJobInputStatisticInfoResponse unmarshall(GetJobInputStatisticInfoResponse getJobInputStatisticInfoResponse, UnmarshallerContext context) {
		
		getJobInputStatisticInfoResponse.setRequestId(context.stringValue("GetJobInputStatisticInfoResponse.RequestId"));
		getJobInputStatisticInfoResponse.setTotal(context.integerValue("GetJobInputStatisticInfoResponse.Total"));
		getJobInputStatisticInfoResponse.setPageNumber(context.integerValue("GetJobInputStatisticInfoResponse.PageNumber"));
		getJobInputStatisticInfoResponse.setPageSize(context.integerValue("GetJobInputStatisticInfoResponse.PageSize"));

		List<ClusterStatJobInput> jobInputList = new ArrayList<ClusterStatJobInput>();
		for (int i = 0; i < context.lengthValue("GetJobInputStatisticInfoResponse.JobInputList.Length"); i++) {
			ClusterStatJobInput clusterStatJobInput = new ClusterStatJobInput();
			clusterStatJobInput.setApplicationId(context.stringValue("GetJobInputStatisticInfoResponse.JobInputList["+ i +"].ApplicationId"));
			clusterStatJobInput.setJobId(context.stringValue("GetJobInputStatisticInfoResponse.JobInputList["+ i +"].JobId"));
			clusterStatJobInput.setStartTime(context.longValue("GetJobInputStatisticInfoResponse.JobInputList["+ i +"].StartTime"));
			clusterStatJobInput.setFinishTime(context.longValue("GetJobInputStatisticInfoResponse.JobInputList["+ i +"].FinishTime"));
			clusterStatJobInput.setName(context.stringValue("GetJobInputStatisticInfoResponse.JobInputList["+ i +"].Name"));
			clusterStatJobInput.setQueue(context.stringValue("GetJobInputStatisticInfoResponse.JobInputList["+ i +"].Queue"));
			clusterStatJobInput.setUser(context.stringValue("GetJobInputStatisticInfoResponse.JobInputList["+ i +"].User"));
			clusterStatJobInput.setState(context.stringValue("GetJobInputStatisticInfoResponse.JobInputList["+ i +"].State"));
			clusterStatJobInput.setBytesInput(context.longValue("GetJobInputStatisticInfoResponse.JobInputList["+ i +"].BytesInput"));

			jobInputList.add(clusterStatJobInput);
		}
		getJobInputStatisticInfoResponse.setJobInputList(jobInputList);
	 
	 	return getJobInputStatisticInfoResponse;
	}
}