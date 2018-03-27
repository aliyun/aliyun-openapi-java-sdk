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

package com.aliyuncs.phoenixsp_inner.transform.v20160805;

import com.aliyuncs.phoenixsp_inner.model.v20160805.FindResRenewalStartTimeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class FindResRenewalStartTimeResponseUnmarshaller {

	public static FindResRenewalStartTimeResponse unmarshall(FindResRenewalStartTimeResponse findResRenewalStartTimeResponse, UnmarshallerContext context) {
		
		findResRenewalStartTimeResponse.setRequestId(context.stringValue("FindResRenewalStartTimeResponse.RequestId"));
		findResRenewalStartTimeResponse.setCode(context.stringValue("FindResRenewalStartTimeResponse.Code"));
		findResRenewalStartTimeResponse.setMessage(context.stringValue("FindResRenewalStartTimeResponse.Message"));
		findResRenewalStartTimeResponse.setSuccess(context.booleanValue("FindResRenewalStartTimeResponse.Success"));
		findResRenewalStartTimeResponse.setData(context.longValue("FindResRenewalStartTimeResponse.Data"));
	 
	 	return findResRenewalStartTimeResponse;
	}
}