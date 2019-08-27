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

import com.aliyuncs.emr.model.v20160408.GetQueueOutputStatisticInfoResponse;
import com.aliyuncs.emr.model.v20160408.GetQueueOutputStatisticInfoResponse.ClusterStatQueueOutput;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetQueueOutputStatisticInfoResponseUnmarshaller {

	public static GetQueueOutputStatisticInfoResponse unmarshall(GetQueueOutputStatisticInfoResponse getQueueOutputStatisticInfoResponse, UnmarshallerContext _ctx) {
		
		getQueueOutputStatisticInfoResponse.setRequestId(_ctx.stringValue("GetQueueOutputStatisticInfoResponse.RequestId"));

		List<ClusterStatQueueOutput> queueOutputList = new ArrayList<ClusterStatQueueOutput>();
		for (int i = 0; i < _ctx.lengthValue("GetQueueOutputStatisticInfoResponse.QueueOutputList.Length"); i++) {
			ClusterStatQueueOutput clusterStatQueueOutput = new ClusterStatQueueOutput();
			clusterStatQueueOutput.setQueue(_ctx.stringValue("GetQueueOutputStatisticInfoResponse.QueueOutputList["+ i +"].Queue"));
			clusterStatQueueOutput.setBytesOutput(_ctx.longValue("GetQueueOutputStatisticInfoResponse.QueueOutputList["+ i +"].BytesOutput"));

			queueOutputList.add(clusterStatQueueOutput);
		}
		getQueueOutputStatisticInfoResponse.setQueueOutputList(queueOutputList);
	 
	 	return getQueueOutputStatisticInfoResponse;
	}
}