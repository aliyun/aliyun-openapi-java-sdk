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

import com.aliyuncs.ecsinc.model.v20160314.InnerQueryCopyImageSupportRegionsResponse;
import com.aliyuncs.ecsinc.model.v20160314.InnerQueryCopyImageSupportRegionsResponse.Region;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerQueryCopyImageSupportRegionsResponseUnmarshaller {

	public static InnerQueryCopyImageSupportRegionsResponse unmarshall(InnerQueryCopyImageSupportRegionsResponse innerQueryCopyImageSupportRegionsResponse, UnmarshallerContext context) {
		
		innerQueryCopyImageSupportRegionsResponse.setRequestId(context.stringValue("InnerQueryCopyImageSupportRegionsResponse.RequestId"));

		List<Region> regions = new ArrayList<Region>();
		for (int i = 0; i < context.lengthValue("InnerQueryCopyImageSupportRegionsResponse.Regions.Length"); i++) {
			Region region = new Region();
			region.setRegionId(context.stringValue("InnerQueryCopyImageSupportRegionsResponse.Regions["+ i +"].RegionId"));
			region.setLocalName(context.stringValue("InnerQueryCopyImageSupportRegionsResponse.Regions["+ i +"].LocalName"));

			regions.add(region);
		}
		innerQueryCopyImageSupportRegionsResponse.setRegions(regions);
	 
	 	return innerQueryCopyImageSupportRegionsResponse;
	}
}