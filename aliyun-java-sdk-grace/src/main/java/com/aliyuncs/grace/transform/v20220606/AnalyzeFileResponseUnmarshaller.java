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

package com.aliyuncs.grace.transform.v20220606;

import com.aliyuncs.grace.model.v20220606.AnalyzeFileResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AnalyzeFileResponseUnmarshaller {

	public static AnalyzeFileResponse unmarshall(AnalyzeFileResponse analyzeFileResponse, UnmarshallerContext _ctx) {
		
		analyzeFileResponse.setRequestId(_ctx.stringValue("AnalyzeFileResponse.requestId"));
		analyzeFileResponse.setFileName(_ctx.stringValue("AnalyzeFileResponse.fileName"));
	 
	 	return analyzeFileResponse;
	}
}