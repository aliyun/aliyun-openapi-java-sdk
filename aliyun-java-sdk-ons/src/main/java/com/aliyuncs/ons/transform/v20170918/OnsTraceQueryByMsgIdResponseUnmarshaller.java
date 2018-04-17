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

package com.aliyuncs.ons.transform.v20170918;

import com.aliyuncs.ons.model.v20170918.OnsTraceQueryByMsgIdResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class OnsTraceQueryByMsgIdResponseUnmarshaller {

	public static OnsTraceQueryByMsgIdResponse unmarshall(OnsTraceQueryByMsgIdResponse onsTraceQueryByMsgIdResponse, UnmarshallerContext context) {
		
		onsTraceQueryByMsgIdResponse.setRequestId(context.stringValue("OnsTraceQueryByMsgIdResponse.RequestId"));
		onsTraceQueryByMsgIdResponse.setHelpUrl(context.stringValue("OnsTraceQueryByMsgIdResponse.HelpUrl"));
		onsTraceQueryByMsgIdResponse.setQueryId(context.stringValue("OnsTraceQueryByMsgIdResponse.QueryId"));
	 
	 	return onsTraceQueryByMsgIdResponse;
	}
}