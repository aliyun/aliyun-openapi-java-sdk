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

import com.aliyuncs.emr.model.v20160408.GetQueueInputStatisticInfoResponse;
import com.aliyuncs.emr.model.v20160408.GetQueueInputStatisticInfoResponse.ClusterStatQueueInput;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetQueueInputStatisticInfoResponseUnmarshaller {

	public static GetQueueInputStatisticInfoResponse unmarshall(GetQueueInputStatisticInfoResponse getQueueInputStatisticInfoResponse, UnmarshallerContext context) {
		
		getQueueInputStatisticInfoResponse.setRequestId(context.stringValue("GetQueueInputStatisticInfoResponse.RequestId"));

		List<ClusterStatQueueInput> queueInputList = new ArrayList<ClusterStatQueueInput>();
		for (int i = 0; i < context.lengthValue("GetQueueInputStatisticInfoResponse.QueueInputList.Length"); i++) {
			ClusterStatQueueInput clusterStatQueueInput = new ClusterStatQueueInput();
			clusterStatQueueInput.setQueue(context.stringValue("GetQueueInputStatisticInfoResponse.QueueInputList["+ i +"].Queue"));
			clusterStatQueueInput.setBytesInput(context.longValue("GetQueueInputStatisticInfoResponse.QueueInputList["+ i +"].BytesInput"));

			queueInputList.add(clusterStatQueueInput);
		}
		getQueueInputStatisticInfoResponse.setQueueInputList(queueInputList);
	 
	 	return getQueueInputStatisticInfoResponse;
	}
}