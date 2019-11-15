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

package com.aliyuncs.scdn.transform.v20171115;

import com.aliyuncs.scdn.model.v20171115.CheckScdnServiceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckScdnServiceResponseUnmarshaller {

	public static CheckScdnServiceResponse unmarshall(CheckScdnServiceResponse checkScdnServiceResponse, UnmarshallerContext _ctx) {
		
		checkScdnServiceResponse.setRequestId(_ctx.stringValue("CheckScdnServiceResponse.RequestId"));
		checkScdnServiceResponse.setEnabled(_ctx.booleanValue("CheckScdnServiceResponse.Enabled"));
		checkScdnServiceResponse.setOnService(_ctx.booleanValue("CheckScdnServiceResponse.OnService"));
		checkScdnServiceResponse.setInDebt(_ctx.booleanValue("CheckScdnServiceResponse.InDebt"));
		checkScdnServiceResponse.setInDebtOverdue(_ctx.booleanValue("CheckScdnServiceResponse.InDebtOverdue"));
	 
	 	return checkScdnServiceResponse;
	}
}