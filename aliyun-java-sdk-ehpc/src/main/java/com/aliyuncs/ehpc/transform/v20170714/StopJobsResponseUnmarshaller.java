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
package com.aliyuncs.ehpc.transform.v20170714;

import com.aliyuncs.ehpc.model.v20170714.StopJobsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class StopJobsResponseUnmarshaller {

	public static StopJobsResponse unmarshall(StopJobsResponse stopJobsResponse, UnmarshallerContext context) {
		
		stopJobsResponse.setRequestId(context.stringValue("StopJobsResponse.RequestId"));
	 
	 	return stopJobsResponse;
	}
}