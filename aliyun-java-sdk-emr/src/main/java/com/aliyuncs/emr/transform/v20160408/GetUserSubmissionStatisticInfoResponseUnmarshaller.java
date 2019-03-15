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

import com.aliyuncs.emr.model.v20160408.GetUserSubmissionStatisticInfoResponse;
import com.aliyuncs.emr.model.v20160408.GetUserSubmissionStatisticInfoResponse.ClusterStatUserSubmission;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetUserSubmissionStatisticInfoResponseUnmarshaller {

	public static GetUserSubmissionStatisticInfoResponse unmarshall(GetUserSubmissionStatisticInfoResponse getUserSubmissionStatisticInfoResponse, UnmarshallerContext context) {
		
		getUserSubmissionStatisticInfoResponse.setRequestId(context.stringValue("GetUserSubmissionStatisticInfoResponse.RequestId"));

		List<ClusterStatUserSubmission> userSubmissionList = new ArrayList<ClusterStatUserSubmission>();
		for (int i = 0; i < context.lengthValue("GetUserSubmissionStatisticInfoResponse.UserSubmissionList.Length"); i++) {
			ClusterStatUserSubmission clusterStatUserSubmission = new ClusterStatUserSubmission();
			clusterStatUserSubmission.setUser(context.stringValue("GetUserSubmissionStatisticInfoResponse.UserSubmissionList["+ i +"].User"));
			clusterStatUserSubmission.setSubmission(context.longValue("GetUserSubmissionStatisticInfoResponse.UserSubmissionList["+ i +"].Submission"));

			userSubmissionList.add(clusterStatUserSubmission);
		}
		getUserSubmissionStatisticInfoResponse.setUserSubmissionList(userSubmissionList);
	 
	 	return getUserSubmissionStatisticInfoResponse;
	}
}