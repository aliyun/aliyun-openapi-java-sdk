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

package com.aliyuncs.companyreg.transform.v20201022;

import com.aliyuncs.companyreg.model.v20201022.GetEmployeeCountSumResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetEmployeeCountSumResponseUnmarshaller {

	public static GetEmployeeCountSumResponse unmarshall(GetEmployeeCountSumResponse getEmployeeCountSumResponse, UnmarshallerContext _ctx) {
		
		getEmployeeCountSumResponse.setRequestId(_ctx.stringValue("GetEmployeeCountSumResponse.RequestId"));
		getEmployeeCountSumResponse.setTotalEmployee(_ctx.stringValue("GetEmployeeCountSumResponse.TotalEmployee"));
		getEmployeeCountSumResponse.setTotalAmount(_ctx.stringValue("GetEmployeeCountSumResponse.TotalAmount"));
	 
	 	return getEmployeeCountSumResponse;
	}
}