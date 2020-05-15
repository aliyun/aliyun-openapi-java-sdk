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

package com.aliyuncs.openanalytics_open.transform.v20180619;

import com.aliyuncs.openanalytics_open.model.v20180619.GetJobLogResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetJobLogResponseUnmarshaller {

	public static GetJobLogResponse unmarshall(GetJobLogResponse getJobLogResponse, UnmarshallerContext _ctx) {
		
		getJobLogResponse.setRequestId(_ctx.stringValue("GetJobLogResponse.RequestId"));
		getJobLogResponse.setData(_ctx.stringValue("GetJobLogResponse.Data"));
	 
	 	return getJobLogResponse;
	}
}