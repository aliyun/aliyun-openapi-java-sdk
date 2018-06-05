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

package com.aliyuncs.ccc.transform.v20170705;

import com.aliyuncs.ccc.model.v20170705.SubmitBatchJobsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SubmitBatchJobsResponseUnmarshaller {

	public static SubmitBatchJobsResponse unmarshall(SubmitBatchJobsResponse submitBatchJobsResponse, UnmarshallerContext context) {
		
		submitBatchJobsResponse.setRequestId(context.stringValue("SubmitBatchJobsResponse.RequestId"));
		submitBatchJobsResponse.setSuccess(context.booleanValue("SubmitBatchJobsResponse.Success"));
		submitBatchJobsResponse.setCode(context.stringValue("SubmitBatchJobsResponse.Code"));
		submitBatchJobsResponse.setMessage(context.stringValue("SubmitBatchJobsResponse.Message"));
		submitBatchJobsResponse.setHttpStatusCode(context.integerValue("SubmitBatchJobsResponse.HttpStatusCode"));
	 
	 	return submitBatchJobsResponse;
	}
}