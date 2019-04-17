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

package com.aliyuncs.couponnew.transform.v20190401;

import com.aliyuncs.couponnew.model.v20190401.GetHasCouponUidListResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetHasCouponUidListResponseUnmarshaller {

	public static GetHasCouponUidListResponse unmarshall(GetHasCouponUidListResponse getHasCouponUidListResponse, UnmarshallerContext context) {
		
		getHasCouponUidListResponse.setRequestId(context.stringValue("GetHasCouponUidListResponse.RequestId"));
		getHasCouponUidListResponse.setSuccess(context.booleanValue("GetHasCouponUidListResponse.Success"));
		getHasCouponUidListResponse.setCode(context.stringValue("GetHasCouponUidListResponse.Code"));
		getHasCouponUidListResponse.setMessage(context.stringValue("GetHasCouponUidListResponse.Message"));
		getHasCouponUidListResponse.setIsIdempotentResp(context.booleanValue("GetHasCouponUidListResponse.IsIdempotentResp"));
		getHasCouponUidListResponse.setData(context.stringValue("GetHasCouponUidListResponse.Data"));
	 
	 	return getHasCouponUidListResponse;
	}
}