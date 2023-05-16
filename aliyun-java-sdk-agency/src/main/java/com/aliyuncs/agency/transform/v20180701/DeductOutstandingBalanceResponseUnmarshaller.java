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

package com.aliyuncs.agency.transform.v20180701;

import com.aliyuncs.agency.model.v20180701.DeductOutstandingBalanceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeductOutstandingBalanceResponseUnmarshaller {

	public static DeductOutstandingBalanceResponse unmarshall(DeductOutstandingBalanceResponse deductOutstandingBalanceResponse, UnmarshallerContext _ctx) {
		
		deductOutstandingBalanceResponse.setCode(_ctx.stringValue("DeductOutstandingBalanceResponse.Code"));
		deductOutstandingBalanceResponse.setMessage(_ctx.stringValue("DeductOutstandingBalanceResponse.Message"));
		deductOutstandingBalanceResponse.setSuccess(_ctx.booleanValue("DeductOutstandingBalanceResponse.Success"));
	 
	 	return deductOutstandingBalanceResponse;
	}
}