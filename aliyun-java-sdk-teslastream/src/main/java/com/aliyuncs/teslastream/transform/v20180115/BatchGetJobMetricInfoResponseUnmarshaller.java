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

package com.aliyuncs.teslastream.transform.v20180115;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.teslastream.model.v20180115.BatchGetJobMetricInfoResponse;
import com.aliyuncs.teslastream.model.v20180115.BatchGetJobMetricInfoResponse.Job;
import com.aliyuncs.transform.UnmarshallerContext;


public class BatchGetJobMetricInfoResponseUnmarshaller {

	public static BatchGetJobMetricInfoResponse unmarshall(BatchGetJobMetricInfoResponse batchGetJobMetricInfoResponse, UnmarshallerContext context) {
		
		batchGetJobMetricInfoResponse.setRequestId(context.stringValue("BatchGetJobMetricInfoResponse.RequestId"));
		batchGetJobMetricInfoResponse.setCode(context.integerValue("BatchGetJobMetricInfoResponse.Code"));
		batchGetJobMetricInfoResponse.setMessage(context.stringValue("BatchGetJobMetricInfoResponse.Message"));

		List<Job> data = new ArrayList<Job>();
		for (int i = 0; i < context.lengthValue("BatchGetJobMetricInfoResponse.Data.Length"); i++) {
			Job job = new Job();
			job.setDelay(context.integerValue("BatchGetJobMetricInfoResponse.Data["+ i +"].Delay"));
			job.setTpsOut(context.integerValue("BatchGetJobMetricInfoResponse.Data["+ i +"].TpsOut"));
			job.setMemRequest(context.integerValue("BatchGetJobMetricInfoResponse.Data["+ i +"].MemRequest"));
			job.setJobUniqKey(context.stringValue("BatchGetJobMetricInfoResponse.Data["+ i +"].JobUniqKey"));
			job.setMemUsed(context.floatValue("BatchGetJobMetricInfoResponse.Data["+ i +"].MemUsed"));
			job.setCpuUsed(context.floatValue("BatchGetJobMetricInfoResponse.Data["+ i +"].CpuUsed"));
			job.setCpuRequest(context.integerValue("BatchGetJobMetricInfoResponse.Data["+ i +"].CpuRequest"));
			job.setNickname(context.stringValue("BatchGetJobMetricInfoResponse.Data["+ i +"].Nickname"));
			job.setTpsIn(context.integerValue("BatchGetJobMetricInfoResponse.Data["+ i +"].TpsIn"));
			job.setPriority(context.stringValue("BatchGetJobMetricInfoResponse.Data["+ i +"].Priority"));

			data.add(job);
		}
		batchGetJobMetricInfoResponse.setData(data);
	 
	 	return batchGetJobMetricInfoResponse;
	}
}