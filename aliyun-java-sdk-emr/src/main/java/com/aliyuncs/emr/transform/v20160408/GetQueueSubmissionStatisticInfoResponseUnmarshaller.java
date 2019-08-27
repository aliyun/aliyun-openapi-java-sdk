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

import com.aliyuncs.emr.model.v20160408.GetQueueSubmissionStatisticInfoResponse;
import com.aliyuncs.emr.model.v20160408.GetQueueSubmissionStatisticInfoResponse.ClusterStatQueueSubmission;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetQueueSubmissionStatisticInfoResponseUnmarshaller {

	public static GetQueueSubmissionStatisticInfoResponse unmarshall(GetQueueSubmissionStatisticInfoResponse getQueueSubmissionStatisticInfoResponse, UnmarshallerContext _ctx) {
		
		getQueueSubmissionStatisticInfoResponse.setRequestId(_ctx.stringValue("GetQueueSubmissionStatisticInfoResponse.RequestId"));

		List<ClusterStatQueueSubmission> queueSubmissionList = new ArrayList<ClusterStatQueueSubmission>();
		for (int i = 0; i < _ctx.lengthValue("GetQueueSubmissionStatisticInfoResponse.QueueSubmissionList.Length"); i++) {
			ClusterStatQueueSubmission clusterStatQueueSubmission = new ClusterStatQueueSubmission();
			clusterStatQueueSubmission.setQueue(_ctx.stringValue("GetQueueSubmissionStatisticInfoResponse.QueueSubmissionList["+ i +"].Queue"));
			clusterStatQueueSubmission.setSubmission(_ctx.longValue("GetQueueSubmissionStatisticInfoResponse.QueueSubmissionList["+ i +"].Submission"));

			queueSubmissionList.add(clusterStatQueueSubmission);
		}
		getQueueSubmissionStatisticInfoResponse.setQueueSubmissionList(queueSubmissionList);
	 
	 	return getQueueSubmissionStatisticInfoResponse;
	}
}