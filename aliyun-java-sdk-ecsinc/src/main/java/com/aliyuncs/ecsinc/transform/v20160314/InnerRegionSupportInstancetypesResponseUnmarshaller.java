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

package com.aliyuncs.ecsinc.transform.v20160314;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsinc.model.v20160314.InnerRegionSupportInstancetypesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerRegionSupportInstancetypesResponseUnmarshaller {

	public static InnerRegionSupportInstancetypesResponse unmarshall(InnerRegionSupportInstancetypesResponse innerRegionSupportInstancetypesResponse, UnmarshallerContext context) {
		
		innerRegionSupportInstancetypesResponse.setRequestId(context.stringValue("InnerRegionSupportInstancetypesResponse.RequestId"));
		innerRegionSupportInstancetypesResponse.setTotalCount(context.integerValue("InnerRegionSupportInstancetypesResponse.TotalCount"));

		List<String> supportInstanceTypes = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("InnerRegionSupportInstancetypesResponse.SupportInstanceTypes.Length"); i++) {
			supportInstanceTypes.add(context.stringValue("InnerRegionSupportInstancetypesResponse.SupportInstanceTypes["+ i +"]"));
		}
		innerRegionSupportInstancetypesResponse.setSupportInstanceTypes(supportInstanceTypes);
	 
	 	return innerRegionSupportInstancetypesResponse;
	}
}