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

import com.aliyuncs.mts.model.v20140618.SubmitOssFileCopyJobResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SubmitOssFileCopyJobResponseUnmarshaller {

	public static SubmitOssFileCopyJobResponse unmarshall(SubmitOssFileCopyJobResponse submitOssFileCopyJobResponse, UnmarshallerContext _ctx) {
		
		submitOssFileCopyJobResponse.setRequestId(_ctx.stringValue("SubmitOssFileCopyJobResponse.RequestId"));
		submitOssFileCopyJobResponse.setJobId(_ctx.stringValue("SubmitOssFileCopyJobResponse.JobId"));
	 
	 	return submitOssFileCopyJobResponse;
	}
}