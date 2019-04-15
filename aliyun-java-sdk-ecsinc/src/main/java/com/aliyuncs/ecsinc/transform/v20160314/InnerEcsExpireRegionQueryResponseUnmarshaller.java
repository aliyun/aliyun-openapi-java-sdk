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

import com.aliyuncs.ecsinc.model.v20160314.InnerEcsExpireRegionQueryResponse;
import com.aliyuncs.ecsinc.model.v20160314.InnerEcsExpireRegionQueryResponse.ExpireRegion;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerEcsExpireRegionQueryResponseUnmarshaller {

	public static InnerEcsExpireRegionQueryResponse unmarshall(InnerEcsExpireRegionQueryResponse innerEcsExpireRegionQueryResponse, UnmarshallerContext context) {
		
		innerEcsExpireRegionQueryResponse.setRequestId(context.stringValue("InnerEcsExpireRegionQueryResponse.RequestId"));

		List<ExpireRegion> expireRegions = new ArrayList<ExpireRegion>();
		for (int i = 0; i < context.lengthValue("InnerEcsExpireRegionQueryResponse.ExpireRegions.Length"); i++) {
			ExpireRegion expireRegion = new ExpireRegion();
			expireRegion.setRegionId(context.stringValue("InnerEcsExpireRegionQueryResponse.ExpireRegions["+ i +"].RegionId"));
			expireRegion.setRegionName(context.stringValue("InnerEcsExpireRegionQueryResponse.ExpireRegions["+ i +"].RegionName"));
			expireRegion.setMessage(context.stringValue("InnerEcsExpireRegionQueryResponse.ExpireRegions["+ i +"].Message"));
			expireRegion.setMessageId(context.stringValue("InnerEcsExpireRegionQueryResponse.ExpireRegions["+ i +"].MessageId"));
			expireRegion.setExtMessage(context.stringValue("InnerEcsExpireRegionQueryResponse.ExpireRegions["+ i +"].ExtMessage"));
			expireRegion.setExtMessageId(context.stringValue("InnerEcsExpireRegionQueryResponse.ExpireRegions["+ i +"].ExtMessageId"));

			expireRegions.add(expireRegion);
		}
		innerEcsExpireRegionQueryResponse.setExpireRegions(expireRegions);
	 
	 	return innerEcsExpireRegionQueryResponse;
	}
}