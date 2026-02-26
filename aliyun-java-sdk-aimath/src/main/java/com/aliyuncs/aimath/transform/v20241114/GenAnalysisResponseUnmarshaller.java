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

package com.aliyuncs.aimath.transform.v20241114;

import com.aliyuncs.aimath.model.v20241114.GenAnalysisResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GenAnalysisResponseUnmarshaller {

	public static GenAnalysisResponse unmarshall(GenAnalysisResponse genAnalysisResponse, UnmarshallerContext _ctx) {
		
		genAnalysisResponse.setRequestId(_ctx.stringValue("GenAnalysisResponse.RequestId"));
		genAnalysisResponse.setEventType(_ctx.stringValue("GenAnalysisResponse.EventType"));
		genAnalysisResponse.setContent(_ctx.stringValue("GenAnalysisResponse.Content"));
		genAnalysisResponse.setErrCode(_ctx.stringValue("GenAnalysisResponse.ErrCode"));
		genAnalysisResponse.setErrMsg(_ctx.stringValue("GenAnalysisResponse.ErrMsg"));
	 
	 	return genAnalysisResponse;
	}
}