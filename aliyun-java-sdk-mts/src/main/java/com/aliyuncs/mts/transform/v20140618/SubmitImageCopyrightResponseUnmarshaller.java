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

import com.aliyuncs.mts.model.v20140618.SubmitImageCopyrightResponse;
import com.aliyuncs.mts.model.v20140618.SubmitImageCopyrightResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class SubmitImageCopyrightResponseUnmarshaller {

	public static SubmitImageCopyrightResponse unmarshall(SubmitImageCopyrightResponse submitImageCopyrightResponse, UnmarshallerContext _ctx) {
		
		submitImageCopyrightResponse.setRequestId(_ctx.stringValue("SubmitImageCopyrightResponse.RequestId"));
		submitImageCopyrightResponse.setMessage(_ctx.stringValue("SubmitImageCopyrightResponse.Message"));
		submitImageCopyrightResponse.setStatusCode(_ctx.longValue("SubmitImageCopyrightResponse.StatusCode"));

		Data data = new Data();
		data.setJobId(_ctx.stringValue("SubmitImageCopyrightResponse.Data.JobId"));
		submitImageCopyrightResponse.setData(data);
	 
	 	return submitImageCopyrightResponse;
	}
}