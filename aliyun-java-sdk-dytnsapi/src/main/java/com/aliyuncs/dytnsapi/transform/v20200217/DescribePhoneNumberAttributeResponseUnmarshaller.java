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

import com.aliyuncs.dytnsapi.model.v20200217.DescribePhoneNumberAttributeResponse;
import com.aliyuncs.dytnsapi.model.v20200217.DescribePhoneNumberAttributeResponse.PhoneNumberAttribute;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePhoneNumberAttributeResponseUnmarshaller {

	public static DescribePhoneNumberAttributeResponse unmarshall(DescribePhoneNumberAttributeResponse describePhoneNumberAttributeResponse, UnmarshallerContext _ctx) {
		
		describePhoneNumberAttributeResponse.setRequestId(_ctx.stringValue("DescribePhoneNumberAttributeResponse.RequestId"));
		describePhoneNumberAttributeResponse.setCode(_ctx.stringValue("DescribePhoneNumberAttributeResponse.Code"));
		describePhoneNumberAttributeResponse.setMessage(_ctx.stringValue("DescribePhoneNumberAttributeResponse.Message"));

		PhoneNumberAttribute phoneNumberAttribute = new PhoneNumberAttribute();
		phoneNumberAttribute.setBasicCarrier(_ctx.stringValue("DescribePhoneNumberAttributeResponse.PhoneNumberAttribute.BasicCarrier"));
		phoneNumberAttribute.setCarrier(_ctx.stringValue("DescribePhoneNumberAttributeResponse.PhoneNumberAttribute.Carrier"));
		phoneNumberAttribute.setIsNumberPortability(_ctx.booleanValue("DescribePhoneNumberAttributeResponse.PhoneNumberAttribute.IsNumberPortability"));
		phoneNumberAttribute.setNumberSegment(_ctx.longValue("DescribePhoneNumberAttributeResponse.PhoneNumberAttribute.NumberSegment"));
		phoneNumberAttribute.setCity(_ctx.stringValue("DescribePhoneNumberAttributeResponse.PhoneNumberAttribute.City"));
		phoneNumberAttribute.setProvince(_ctx.stringValue("DescribePhoneNumberAttributeResponse.PhoneNumberAttribute.Province"));
		describePhoneNumberAttributeResponse.setPhoneNumberAttribute(phoneNumberAttribute);
	 
	 	return describePhoneNumberAttributeResponse;
	}
}