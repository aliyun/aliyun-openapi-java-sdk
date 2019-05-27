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

package com.aliyuncs.imm.transform.v20170906;

import com.aliyuncs.imm.model.v20170906.GetPornBatchDetectJobResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetPornBatchDetectJobResponseUnmarshaller {

	public static GetPornBatchDetectJobResponse unmarshall(GetPornBatchDetectJobResponse getPornBatchDetectJobResponse, UnmarshallerContext context) {
		
		getPornBatchDetectJobResponse.setRequestId(context.stringValue("GetPornBatchDetectJobResponse.RequestId"));
		getPornBatchDetectJobResponse.setJobId(context.stringValue("GetPornBatchDetectJobResponse.JobId"));
		getPornBatchDetectJobResponse.setSrcUri(context.stringValue("GetPornBatchDetectJobResponse.SrcUri"));
		getPornBatchDetectJobResponse.setTgtUri(context.stringValue("GetPornBatchDetectJobResponse.TgtUri"));
		getPornBatchDetectJobResponse.setNotifyTopicName(context.stringValue("GetPornBatchDetectJobResponse.NotifyTopicName"));
		getPornBatchDetectJobResponse.setNotifyEndpoint(context.stringValue("GetPornBatchDetectJobResponse.NotifyEndpoint"));
		getPornBatchDetectJobResponse.setExternalID(context.stringValue("GetPornBatchDetectJobResponse.ExternalID"));
		getPornBatchDetectJobResponse.setStatus(context.stringValue("GetPornBatchDetectJobResponse.Status"));
		getPornBatchDetectJobResponse.setCreateTime(context.stringValue("GetPornBatchDetectJobResponse.CreateTime"));
		getPornBatchDetectJobResponse.setFinishTime(context.stringValue("GetPornBatchDetectJobResponse.FinishTime"));
		getPornBatchDetectJobResponse.setPercent(context.integerValue("GetPornBatchDetectJobResponse.Percent"));
	 
	 	return getPornBatchDetectJobResponse;
	}
}