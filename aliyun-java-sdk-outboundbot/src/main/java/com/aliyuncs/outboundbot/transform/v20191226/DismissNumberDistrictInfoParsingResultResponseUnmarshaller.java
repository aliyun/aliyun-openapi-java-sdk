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

package com.aliyuncs.outboundbot.transform.v20191226;

import com.aliyuncs.outboundbot.model.v20191226.DismissNumberDistrictInfoParsingResultResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DismissNumberDistrictInfoParsingResultResponseUnmarshaller {

	public static DismissNumberDistrictInfoParsingResultResponse unmarshall(DismissNumberDistrictInfoParsingResultResponse dismissNumberDistrictInfoParsingResultResponse, UnmarshallerContext _ctx) {
		
		dismissNumberDistrictInfoParsingResultResponse.setRequestId(_ctx.stringValue("DismissNumberDistrictInfoParsingResultResponse.RequestId"));
		dismissNumberDistrictInfoParsingResultResponse.setHttpStatusCode(_ctx.integerValue("DismissNumberDistrictInfoParsingResultResponse.HttpStatusCode"));
		dismissNumberDistrictInfoParsingResultResponse.setCode(_ctx.stringValue("DismissNumberDistrictInfoParsingResultResponse.Code"));
		dismissNumberDistrictInfoParsingResultResponse.setMessage(_ctx.stringValue("DismissNumberDistrictInfoParsingResultResponse.Message"));
		dismissNumberDistrictInfoParsingResultResponse.setSuccess(_ctx.booleanValue("DismissNumberDistrictInfoParsingResultResponse.Success"));
	 
	 	return dismissNumberDistrictInfoParsingResultResponse;
	}
}