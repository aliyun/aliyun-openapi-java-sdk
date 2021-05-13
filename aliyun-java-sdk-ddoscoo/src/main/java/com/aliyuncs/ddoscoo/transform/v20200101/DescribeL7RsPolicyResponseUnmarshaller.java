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

package com.aliyuncs.ddoscoo.transform.v20200101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ddoscoo.model.v20200101.DescribeL7RsPolicyResponse;
import com.aliyuncs.ddoscoo.model.v20200101.DescribeL7RsPolicyResponse.AttributeItem;
import com.aliyuncs.ddoscoo.model.v20200101.DescribeL7RsPolicyResponse.AttributeItem.Attribute;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeL7RsPolicyResponseUnmarshaller {

	public static DescribeL7RsPolicyResponse unmarshall(DescribeL7RsPolicyResponse describeL7RsPolicyResponse, UnmarshallerContext _ctx) {
		
		describeL7RsPolicyResponse.setRequestId(_ctx.stringValue("DescribeL7RsPolicyResponse.RequestId"));
		describeL7RsPolicyResponse.setProxyMode(_ctx.stringValue("DescribeL7RsPolicyResponse.ProxyMode"));

		List<AttributeItem> attributes = new ArrayList<AttributeItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeL7RsPolicyResponse.Attributes.Length"); i++) {
			AttributeItem attributeItem = new AttributeItem();
			attributeItem.setRsType(_ctx.integerValue("DescribeL7RsPolicyResponse.Attributes["+ i +"].RsType"));
			attributeItem.setRealServer(_ctx.stringValue("DescribeL7RsPolicyResponse.Attributes["+ i +"].RealServer"));

			Attribute attribute = new Attribute();
			attribute.setWeight(_ctx.integerValue("DescribeL7RsPolicyResponse.Attributes["+ i +"].Attribute.Weight"));
			attributeItem.setAttribute(attribute);

			attributes.add(attributeItem);
		}
		describeL7RsPolicyResponse.setAttributes(attributes);
	 
	 	return describeL7RsPolicyResponse;
	}
}