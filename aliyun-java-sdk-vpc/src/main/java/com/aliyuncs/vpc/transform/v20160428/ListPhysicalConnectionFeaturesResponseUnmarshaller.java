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

package com.aliyuncs.vpc.transform.v20160428;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vpc.model.v20160428.ListPhysicalConnectionFeaturesResponse;
import com.aliyuncs.vpc.model.v20160428.ListPhysicalConnectionFeaturesResponse.PhysicalConnectionFeature;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPhysicalConnectionFeaturesResponseUnmarshaller {

	public static ListPhysicalConnectionFeaturesResponse unmarshall(ListPhysicalConnectionFeaturesResponse listPhysicalConnectionFeaturesResponse, UnmarshallerContext _ctx) {
		
		listPhysicalConnectionFeaturesResponse.setRequestId(_ctx.stringValue("ListPhysicalConnectionFeaturesResponse.RequestId"));

		List<PhysicalConnectionFeature> physicalConnectionFeatures = new ArrayList<PhysicalConnectionFeature>();
		for (int i = 0; i < _ctx.lengthValue("ListPhysicalConnectionFeaturesResponse.PhysicalConnectionFeatures.Length"); i++) {
			PhysicalConnectionFeature physicalConnectionFeature = new PhysicalConnectionFeature();
			physicalConnectionFeature.setFeatureKey(_ctx.stringValue("ListPhysicalConnectionFeaturesResponse.PhysicalConnectionFeatures["+ i +"].FeatureKey"));
			physicalConnectionFeature.setFeatureValue(_ctx.stringValue("ListPhysicalConnectionFeaturesResponse.PhysicalConnectionFeatures["+ i +"].FeatureValue"));

			physicalConnectionFeatures.add(physicalConnectionFeature);
		}
		listPhysicalConnectionFeaturesResponse.setPhysicalConnectionFeatures(physicalConnectionFeatures);
	 
	 	return listPhysicalConnectionFeaturesResponse;
	}
}