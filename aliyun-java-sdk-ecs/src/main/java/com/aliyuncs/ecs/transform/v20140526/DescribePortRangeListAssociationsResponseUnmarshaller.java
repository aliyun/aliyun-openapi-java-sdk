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

package com.aliyuncs.ecs.transform.v20140526;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20140526.DescribePortRangeListAssociationsResponse;
import com.aliyuncs.ecs.model.v20140526.DescribePortRangeListAssociationsResponse.PortRangeListAssociation;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePortRangeListAssociationsResponseUnmarshaller {

	public static DescribePortRangeListAssociationsResponse unmarshall(DescribePortRangeListAssociationsResponse describePortRangeListAssociationsResponse, UnmarshallerContext _ctx) {
		
		describePortRangeListAssociationsResponse.setRequestId(_ctx.stringValue("DescribePortRangeListAssociationsResponse.RequestId"));
		describePortRangeListAssociationsResponse.setNextToken(_ctx.stringValue("DescribePortRangeListAssociationsResponse.NextToken"));

		List<PortRangeListAssociation> portRangeListAssociations = new ArrayList<PortRangeListAssociation>();
		for (int i = 0; i < _ctx.lengthValue("DescribePortRangeListAssociationsResponse.PortRangeListAssociations.Length"); i++) {
			PortRangeListAssociation portRangeListAssociation = new PortRangeListAssociation();
			portRangeListAssociation.setResourceId(_ctx.stringValue("DescribePortRangeListAssociationsResponse.PortRangeListAssociations["+ i +"].ResourceId"));
			portRangeListAssociation.setResourceType(_ctx.stringValue("DescribePortRangeListAssociationsResponse.PortRangeListAssociations["+ i +"].ResourceType"));

			portRangeListAssociations.add(portRangeListAssociation);
		}
		describePortRangeListAssociationsResponse.setPortRangeListAssociations(portRangeListAssociations);
	 
	 	return describePortRangeListAssociationsResponse;
	}
}