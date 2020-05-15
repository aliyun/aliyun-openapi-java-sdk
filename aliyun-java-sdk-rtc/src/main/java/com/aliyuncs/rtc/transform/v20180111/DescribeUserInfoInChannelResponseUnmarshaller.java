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

package com.aliyuncs.rtc.transform.v20180111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rtc.model.v20180111.DescribeUserInfoInChannelResponse;
import com.aliyuncs.rtc.model.v20180111.DescribeUserInfoInChannelResponse.PropertyItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeUserInfoInChannelResponseUnmarshaller {

	public static DescribeUserInfoInChannelResponse unmarshall(DescribeUserInfoInChannelResponse describeUserInfoInChannelResponse, UnmarshallerContext _ctx) {
		
		describeUserInfoInChannelResponse.setRequestId(_ctx.stringValue("DescribeUserInfoInChannelResponse.RequestId"));
		describeUserInfoInChannelResponse.setTimestamp(_ctx.integerValue("DescribeUserInfoInChannelResponse.Timestamp"));
		describeUserInfoInChannelResponse.setIsChannelExist(_ctx.booleanValue("DescribeUserInfoInChannelResponse.IsChannelExist"));
		describeUserInfoInChannelResponse.setIsInChannel(_ctx.booleanValue("DescribeUserInfoInChannelResponse.IsInChannel"));

		List<PropertyItem> property = new ArrayList<PropertyItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeUserInfoInChannelResponse.Property.Length"); i++) {
			PropertyItem propertyItem = new PropertyItem();
			propertyItem.setSession(_ctx.stringValue("DescribeUserInfoInChannelResponse.Property["+ i +"].Session"));
			propertyItem.setJoin(_ctx.integerValue("DescribeUserInfoInChannelResponse.Property["+ i +"].Join"));
			propertyItem.setRole(_ctx.integerValue("DescribeUserInfoInChannelResponse.Property["+ i +"].Role"));

			property.add(propertyItem);
		}
		describeUserInfoInChannelResponse.setProperty(property);
	 
	 	return describeUserInfoInChannelResponse;
	}
}