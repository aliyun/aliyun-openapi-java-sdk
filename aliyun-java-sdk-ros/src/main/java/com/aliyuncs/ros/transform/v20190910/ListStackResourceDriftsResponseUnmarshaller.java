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

package com.aliyuncs.ros.transform.v20190910;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ros.model.v20190910.ListStackResourceDriftsResponse;
import com.aliyuncs.ros.model.v20190910.ListStackResourceDriftsResponse.ResourceDrift;
import com.aliyuncs.ros.model.v20190910.ListStackResourceDriftsResponse.ResourceDrift.PropertyDifference;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListStackResourceDriftsResponseUnmarshaller {

	public static ListStackResourceDriftsResponse unmarshall(ListStackResourceDriftsResponse listStackResourceDriftsResponse, UnmarshallerContext _ctx) {
		
		listStackResourceDriftsResponse.setRequestId(_ctx.stringValue("ListStackResourceDriftsResponse.RequestId"));
		listStackResourceDriftsResponse.setNextToken(_ctx.stringValue("ListStackResourceDriftsResponse.NextToken"));

		List<ResourceDrift> resourceDrifts = new ArrayList<ResourceDrift>();
		for (int i = 0; i < _ctx.lengthValue("ListStackResourceDriftsResponse.ResourceDrifts.Length"); i++) {
			ResourceDrift resourceDrift = new ResourceDrift();
			resourceDrift.setDriftDetectionTime(_ctx.stringValue("ListStackResourceDriftsResponse.ResourceDrifts["+ i +"].DriftDetectionTime"));
			resourceDrift.setResourceDriftStatus(_ctx.stringValue("ListStackResourceDriftsResponse.ResourceDrifts["+ i +"].ResourceDriftStatus"));
			resourceDrift.setStackId(_ctx.stringValue("ListStackResourceDriftsResponse.ResourceDrifts["+ i +"].StackId"));
			resourceDrift.setResourceType(_ctx.stringValue("ListStackResourceDriftsResponse.ResourceDrifts["+ i +"].ResourceType"));
			resourceDrift.setPhysicalResourceId(_ctx.stringValue("ListStackResourceDriftsResponse.ResourceDrifts["+ i +"].PhysicalResourceId"));
			resourceDrift.setLogicalResourceId(_ctx.stringValue("ListStackResourceDriftsResponse.ResourceDrifts["+ i +"].LogicalResourceId"));
			resourceDrift.setActualProperties(_ctx.stringValue("ListStackResourceDriftsResponse.ResourceDrifts["+ i +"].ActualProperties"));
			resourceDrift.setExpectedProperties(_ctx.stringValue("ListStackResourceDriftsResponse.ResourceDrifts["+ i +"].ExpectedProperties"));

			List<PropertyDifference> propertyDifferences = new ArrayList<PropertyDifference>();
			for (int j = 0; j < _ctx.lengthValue("ListStackResourceDriftsResponse.ResourceDrifts["+ i +"].PropertyDifferences.Length"); j++) {
				PropertyDifference propertyDifference = new PropertyDifference();
				propertyDifference.setPropertyPath(_ctx.stringValue("ListStackResourceDriftsResponse.ResourceDrifts["+ i +"].PropertyDifferences["+ j +"].PropertyPath"));
				propertyDifference.setActualValue(_ctx.stringValue("ListStackResourceDriftsResponse.ResourceDrifts["+ i +"].PropertyDifferences["+ j +"].ActualValue"));
				propertyDifference.setExpectedValue(_ctx.stringValue("ListStackResourceDriftsResponse.ResourceDrifts["+ i +"].PropertyDifferences["+ j +"].ExpectedValue"));
				propertyDifference.setDifferenceType(_ctx.stringValue("ListStackResourceDriftsResponse.ResourceDrifts["+ i +"].PropertyDifferences["+ j +"].DifferenceType"));

				propertyDifferences.add(propertyDifference);
			}
			resourceDrift.setPropertyDifferences(propertyDifferences);

			resourceDrifts.add(resourceDrift);
		}
		listStackResourceDriftsResponse.setResourceDrifts(resourceDrifts);
	 
	 	return listStackResourceDriftsResponse;
	}
}