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

package com.aliyuncs.dytnsapi.transform.v20200217;

import com.aliyuncs.dytnsapi.model.v20200217.DescribePhoneNumberStatusResponse;
import com.aliyuncs.dytnsapi.model.v20200217.DescribePhoneNumberStatusResponse.PhoneStatus;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePhoneNumberStatusResponseUnmarshaller {

	public static DescribePhoneNumberStatusResponse unmarshall(DescribePhoneNumberStatusResponse describePhoneNumberStatusResponse, UnmarshallerContext _ctx) {
		
		describePhoneNumberStatusResponse.setRequestId(_ctx.stringValue("DescribePhoneNumberStatusResponse.RequestId"));
		describePhoneNumberStatusResponse.setCode(_ctx.stringValue("DescribePhoneNumberStatusResponse.Code"));
		describePhoneNumberStatusResponse.setMessage(_ctx.stringValue("DescribePhoneNumberStatusResponse.Message"));

		PhoneStatus phoneStatus = new PhoneStatus();
		phoneStatus.setStatus(_ctx.stringValue("DescribePhoneNumberStatusResponse.PhoneStatus.Status"));
		phoneStatus.setSerialId(_ctx.stringValue("DescribePhoneNumberStatusResponse.PhoneStatus.SerialId"));
		phoneStatus.setCarrier(_ctx.stringValue("DescribePhoneNumberStatusResponse.PhoneStatus.Carrier"));
		describePhoneNumberStatusResponse.setPhoneStatus(phoneStatus);
	 
	 	return describePhoneNumberStatusResponse;
	}
}