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

package com.aliyuncs.aegis.transform.v20161111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.aegis.model.v20161111.DescribeTraceInfoNodeResponse;
import com.aliyuncs.aegis.model.v20161111.DescribeTraceInfoNodeResponse.Node;
import com.aliyuncs.aegis.model.v20161111.DescribeTraceInfoNodeResponse.Node.Property;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTraceInfoNodeResponseUnmarshaller {

	public static DescribeTraceInfoNodeResponse unmarshall(DescribeTraceInfoNodeResponse describeTraceInfoNodeResponse, UnmarshallerContext context) {
		
		describeTraceInfoNodeResponse.setRequestId(context.stringValue("DescribeTraceInfoNodeResponse.RequestId"));

		Node node = new Node();
		node.setName(context.stringValue("DescribeTraceInfoNodeResponse.Node.Name"));
		node.setType(context.stringValue("DescribeTraceInfoNodeResponse.Node.Type"));

		List<Property> propertyList = new ArrayList<Property>();
		for (int i = 0; i < context.lengthValue("DescribeTraceInfoNodeResponse.Node.PropertyList.Length"); i++) {
			Property property = new Property();
			property.setName(context.stringValue("DescribeTraceInfoNodeResponse.Node.PropertyList["+ i +"].Name"));
			property.setValue(context.stringValue("DescribeTraceInfoNodeResponse.Node.PropertyList["+ i +"].Value"));

			propertyList.add(property);
		}
		node.setPropertyList(propertyList);
		describeTraceInfoNodeResponse.setNode(node);
	 
	 	return describeTraceInfoNodeResponse;
	}
}