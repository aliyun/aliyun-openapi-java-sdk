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

package com.aliyuncs.mts.transform.v20140618;

import com.aliyuncs.mts.model.v20140618.SubmitVideoQualityJobResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SubmitVideoQualityJobResponseUnmarshaller {

	public static SubmitVideoQualityJobResponse unmarshall(SubmitVideoQualityJobResponse submitVideoQualityJobResponse, UnmarshallerContext _ctx) {
		
		submitVideoQualityJobResponse.setRequestId(_ctx.stringValue("SubmitVideoQualityJobResponse.RequestId"));
		submitVideoQualityJobResponse.setCode(_ctx.stringValue("SubmitVideoQualityJobResponse.Code"));
		submitVideoQualityJobResponse.setMessage(_ctx.stringValue("SubmitVideoQualityJobResponse.Message"));
		submitVideoQualityJobResponse.setJobId(_ctx.stringValue("SubmitVideoQualityJobResponse.JobId"));
	 
	 	return submitVideoQualityJobResponse;
	}
}