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

package com.aliyuncs.alidns.transform.v20150109;

import com.aliyuncs.alidns.model.v20150109.AddCustomLineResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddCustomLineResponseUnmarshaller {

	public static AddCustomLineResponse unmarshall(AddCustomLineResponse addCustomLineResponse, UnmarshallerContext _ctx) {
		
		addCustomLineResponse.setRequestId(_ctx.stringValue("AddCustomLineResponse.RequestId"));
		addCustomLineResponse.setLineId(_ctx.longValue("AddCustomLineResponse.LineId"));
		addCustomLineResponse.setLineCode(_ctx.stringValue("AddCustomLineResponse.LineCode"));
	 
	 	return addCustomLineResponse;
	}
}