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

package com.aliyuncs.vod.transform.v20170321;

import com.aliyuncs.vod.model.v20170321.SubmitAICaptionExtractionJobResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SubmitAICaptionExtractionJobResponseUnmarshaller {

	public static SubmitAICaptionExtractionJobResponse unmarshall(SubmitAICaptionExtractionJobResponse submitAICaptionExtractionJobResponse, UnmarshallerContext _ctx) {
		
		submitAICaptionExtractionJobResponse.setRequestId(_ctx.stringValue("SubmitAICaptionExtractionJobResponse.RequestId"));
		submitAICaptionExtractionJobResponse.setJobId(_ctx.stringValue("SubmitAICaptionExtractionJobResponse.JobId"));
	 
	 	return submitAICaptionExtractionJobResponse;
	}
}