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

	public static GetPornBatchDetectJobResponse unmarshall(GetPornBatchDetectJobResponse getPornBatchDetectJobResponse, UnmarshallerContext _ctx) {
		
		getPornBatchDetectJobResponse.setRequestId(_ctx.stringValue("GetPornBatchDetectJobResponse.RequestId"));
		getPornBatchDetectJobResponse.setJobId(_ctx.stringValue("GetPornBatchDetectJobResponse.JobId"));
		getPornBatchDetectJobResponse.setSrcUri(_ctx.stringValue("GetPornBatchDetectJobResponse.SrcUri"));
		getPornBatchDetectJobResponse.setTgtUri(_ctx.stringValue("GetPornBatchDetectJobResponse.TgtUri"));
		getPornBatchDetectJobResponse.setNotifyTopicName(_ctx.stringValue("GetPornBatchDetectJobResponse.NotifyTopicName"));
		getPornBatchDetectJobResponse.setNotifyEndpoint(_ctx.stringValue("GetPornBatchDetectJobResponse.NotifyEndpoint"));
		getPornBatchDetectJobResponse.setExternalID(_ctx.stringValue("GetPornBatchDetectJobResponse.ExternalID"));
		getPornBatchDetectJobResponse.setStatus(_ctx.stringValue("GetPornBatchDetectJobResponse.Status"));
		getPornBatchDetectJobResponse.setCreateTime(_ctx.stringValue("GetPornBatchDetectJobResponse.CreateTime"));
		getPornBatchDetectJobResponse.setFinishTime(_ctx.stringValue("GetPornBatchDetectJobResponse.FinishTime"));
		getPornBatchDetectJobResponse.setPercent(_ctx.integerValue("GetPornBatchDetectJobResponse.Percent"));
	 
	 	return getPornBatchDetectJobResponse;
	}
}