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

package com.aliyuncs.ecs.transform.v20160314;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20160314.DescribeResourceFilterAttributesResponse;
import com.aliyuncs.ecs.model.v20160314.DescribeResourceFilterAttributesResponse.FilterAttribute;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeResourceFilterAttributesResponseUnmarshaller {

	public static DescribeResourceFilterAttributesResponse unmarshall(DescribeResourceFilterAttributesResponse describeResourceFilterAttributesResponse, UnmarshallerContext _ctx) {
		
		describeResourceFilterAttributesResponse.setRequestId(_ctx.stringValue("DescribeResourceFilterAttributesResponse.RequestId"));

		List<FilterAttribute> filterAttributes = new ArrayList<FilterAttribute>();
		for (int i = 0; i < _ctx.lengthValue("DescribeResourceFilterAttributesResponse.FilterAttributes.Length"); i++) {
			FilterAttribute filterAttribute = new FilterAttribute();
			filterAttribute.setType(_ctx.stringValue("DescribeResourceFilterAttributesResponse.FilterAttributes["+ i +"].Type"));
			filterAttribute.setName(_ctx.stringValue("DescribeResourceFilterAttributesResponse.FilterAttributes["+ i +"].Name"));

			List<String> supportOperations = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeResourceFilterAttributesResponse.FilterAttributes["+ i +"].SupportOperations.Length"); j++) {
				supportOperations.add(_ctx.stringValue("DescribeResourceFilterAttributesResponse.FilterAttributes["+ i +"].SupportOperations["+ j +"]"));
			}
			filterAttribute.setSupportOperations(supportOperations);

			List<String> values = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeResourceFilterAttributesResponse.FilterAttributes["+ i +"].Values.Length"); j++) {
				values.add(_ctx.stringValue("DescribeResourceFilterAttributesResponse.FilterAttributes["+ i +"].Values["+ j +"]"));
			}
			filterAttribute.setValues(values);

			filterAttributes.add(filterAttribute);
		}
		describeResourceFilterAttributesResponse.setFilterAttributes(filterAttributes);
	 
	 	return describeResourceFilterAttributesResponse;
	}
}