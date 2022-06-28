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

import com.aliyuncs.dytnsapi.model.v20200217.DescribePhoneNumberOperatorAttributeResponse;
import com.aliyuncs.dytnsapi.model.v20200217.DescribePhoneNumberOperatorAttributeResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePhoneNumberOperatorAttributeResponseUnmarshaller {

	public static DescribePhoneNumberOperatorAttributeResponse unmarshall(DescribePhoneNumberOperatorAttributeResponse describePhoneNumberOperatorAttributeResponse, UnmarshallerContext _ctx) {
		
		describePhoneNumberOperatorAttributeResponse.setRequestId(_ctx.stringValue("DescribePhoneNumberOperatorAttributeResponse.RequestId"));
		describePhoneNumberOperatorAttributeResponse.setCode(_ctx.stringValue("DescribePhoneNumberOperatorAttributeResponse.Code"));
		describePhoneNumberOperatorAttributeResponse.setMessage(_ctx.stringValue("DescribePhoneNumberOperatorAttributeResponse.Message"));

		Data data = new Data();
		data.setBasicCarrier(_ctx.stringValue("DescribePhoneNumberOperatorAttributeResponse.Data.BasicCarrier"));
		data.setCarrier(_ctx.stringValue("DescribePhoneNumberOperatorAttributeResponse.Data.Carrier"));
		data.setIsNumberPortability(_ctx.booleanValue("DescribePhoneNumberOperatorAttributeResponse.Data.IsNumberPortability"));
		data.setNumberSegment(_ctx.longValue("DescribePhoneNumberOperatorAttributeResponse.Data.NumberSegment"));
		data.setCity(_ctx.stringValue("DescribePhoneNumberOperatorAttributeResponse.Data.City"));
		data.setProvince(_ctx.stringValue("DescribePhoneNumberOperatorAttributeResponse.Data.Province"));
		describePhoneNumberOperatorAttributeResponse.setData(data);
	 
	 	return describePhoneNumberOperatorAttributeResponse;
	}
}