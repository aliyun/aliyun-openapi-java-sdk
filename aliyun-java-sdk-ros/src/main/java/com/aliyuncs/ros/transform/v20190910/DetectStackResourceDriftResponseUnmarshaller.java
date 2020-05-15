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

import com.aliyuncs.ros.model.v20190910.DetectStackResourceDriftResponse;
import com.aliyuncs.ros.model.v20190910.DetectStackResourceDriftResponse.PropertyDifference;
import com.aliyuncs.transform.UnmarshallerContext;


public class DetectStackResourceDriftResponseUnmarshaller {

	public static DetectStackResourceDriftResponse unmarshall(DetectStackResourceDriftResponse detectStackResourceDriftResponse, UnmarshallerContext _ctx) {
		
		detectStackResourceDriftResponse.setRequestId(_ctx.stringValue("DetectStackResourceDriftResponse.RequestId"));
		detectStackResourceDriftResponse.setDriftDetectionTime(_ctx.stringValue("DetectStackResourceDriftResponse.DriftDetectionTime"));
		detectStackResourceDriftResponse.setResourceDriftStatus(_ctx.stringValue("DetectStackResourceDriftResponse.ResourceDriftStatus"));
		detectStackResourceDriftResponse.setStackId(_ctx.stringValue("DetectStackResourceDriftResponse.StackId"));
		detectStackResourceDriftResponse.setResourceType(_ctx.stringValue("DetectStackResourceDriftResponse.ResourceType"));
		detectStackResourceDriftResponse.setPhysicalResourceId(_ctx.stringValue("DetectStackResourceDriftResponse.PhysicalResourceId"));
		detectStackResourceDriftResponse.setLogicalResourceId(_ctx.stringValue("DetectStackResourceDriftResponse.LogicalResourceId"));
		detectStackResourceDriftResponse.setActualProperties(_ctx.stringValue("DetectStackResourceDriftResponse.ActualProperties"));
		detectStackResourceDriftResponse.setExpectedProperties(_ctx.stringValue("DetectStackResourceDriftResponse.ExpectedProperties"));

		List<PropertyDifference> propertyDifferences = new ArrayList<PropertyDifference>();
		for (int i = 0; i < _ctx.lengthValue("DetectStackResourceDriftResponse.PropertyDifferences.Length"); i++) {
			PropertyDifference propertyDifference = new PropertyDifference();
			propertyDifference.setPropertyPath(_ctx.stringValue("DetectStackResourceDriftResponse.PropertyDifferences["+ i +"].PropertyPath"));
			propertyDifference.setActualValue(_ctx.stringValue("DetectStackResourceDriftResponse.PropertyDifferences["+ i +"].ActualValue"));
			propertyDifference.setExpectedValue(_ctx.stringValue("DetectStackResourceDriftResponse.PropertyDifferences["+ i +"].ExpectedValue"));
			propertyDifference.setDifferenceType(_ctx.stringValue("DetectStackResourceDriftResponse.PropertyDifferences["+ i +"].DifferenceType"));

			propertyDifferences.add(propertyDifference);
		}
		detectStackResourceDriftResponse.setPropertyDifferences(propertyDifferences);
	 
	 	return detectStackResourceDriftResponse;
	}
}