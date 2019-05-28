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

package com.aliyuncs.ccc.transform.v20170705;

import com.aliyuncs.ccc.model.v20170705.GetNumberRegionInfoResponse;
import com.aliyuncs.ccc.model.v20170705.GetNumberRegionInfoResponse.PhoneNumber;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetNumberRegionInfoResponseUnmarshaller {

	public static GetNumberRegionInfoResponse unmarshall(GetNumberRegionInfoResponse getNumberRegionInfoResponse, UnmarshallerContext context) {
		
		getNumberRegionInfoResponse.setRequestId(context.stringValue("GetNumberRegionInfoResponse.RequestId"));
		getNumberRegionInfoResponse.setSuccess(context.booleanValue("GetNumberRegionInfoResponse.Success"));
		getNumberRegionInfoResponse.setCode(context.stringValue("GetNumberRegionInfoResponse.Code"));
		getNumberRegionInfoResponse.setMessage(context.stringValue("GetNumberRegionInfoResponse.Message"));

		PhoneNumber phoneNumber = new PhoneNumber();
		phoneNumber.setNumber(context.stringValue("GetNumberRegionInfoResponse.PhoneNumber.Number"));
		phoneNumber.setProvince(context.stringValue("GetNumberRegionInfoResponse.PhoneNumber.Province"));
		phoneNumber.setCity(context.stringValue("GetNumberRegionInfoResponse.PhoneNumber.City"));
		getNumberRegionInfoResponse.setPhoneNumber(phoneNumber);
	 
	 	return getNumberRegionInfoResponse;
	}
}