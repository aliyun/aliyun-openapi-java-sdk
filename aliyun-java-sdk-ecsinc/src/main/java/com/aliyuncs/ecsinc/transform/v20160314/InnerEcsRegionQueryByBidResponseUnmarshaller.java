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

import com.aliyuncs.ecsinc.model.v20160314.InnerEcsRegionQueryByBidResponse;
import com.aliyuncs.ecsinc.model.v20160314.InnerEcsRegionQueryByBidResponse.Item;
import com.aliyuncs.ecsinc.model.v20160314.InnerEcsRegionQueryByBidResponse.Item.Attributes;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerEcsRegionQueryByBidResponseUnmarshaller {

	public static InnerEcsRegionQueryByBidResponse unmarshall(InnerEcsRegionQueryByBidResponse innerEcsRegionQueryByBidResponse, UnmarshallerContext context) {
		
		innerEcsRegionQueryByBidResponse.setRequestId(context.stringValue("InnerEcsRegionQueryByBidResponse.RequestId"));
		innerEcsRegionQueryByBidResponse.setCount(context.integerValue("InnerEcsRegionQueryByBidResponse.Count"));

		List<Item> data = new ArrayList<Item>();
		for (int i = 0; i < context.lengthValue("InnerEcsRegionQueryByBidResponse.Data.Length"); i++) {
			Item item = new Item();
			item.setRegionNoAlias(context.stringValue("InnerEcsRegionQueryByBidResponse.Data["+ i +"].RegionNoAlias"));
			item.setRegionMemo(context.stringValue("InnerEcsRegionQueryByBidResponse.Data["+ i +"].RegionMemo"));
			item.setRegionName(context.stringValue("InnerEcsRegionQueryByBidResponse.Data["+ i +"].RegionName"));
			item.setRegionNo(context.stringValue("InnerEcsRegionQueryByBidResponse.Data["+ i +"].RegionNo"));
			item.setRegionEnName(context.stringValue("InnerEcsRegionQueryByBidResponse.Data["+ i +"].RegionEnName"));
			item.setIsActive(context.stringValue("InnerEcsRegionQueryByBidResponse.Data["+ i +"].IsActive"));
			item.setId(context.longValue("InnerEcsRegionQueryByBidResponse.Data["+ i +"].Id"));

			Attributes attributes = new Attributes();
			attributes.setSupport_image_copy(context.stringValue("InnerEcsRegionQueryByBidResponse.Data["+ i +"].Attributes.support_image_copy"));
			attributes.setInternal_use(context.stringValue("InnerEcsRegionQueryByBidResponse.Data["+ i +"].Attributes.internal_use"));
			attributes.setAk_name(context.stringValue("InnerEcsRegionQueryByBidResponse.Data["+ i +"].Attributes.ak_name"));
			attributes.setSupported_network_categories(context.stringValue("InnerEcsRegionQueryByBidResponse.Data["+ i +"].Attributes.supported_network_categories"));
			item.setAttributes(attributes);

			data.add(item);
		}
		innerEcsRegionQueryByBidResponse.setData(data);
	 
	 	return innerEcsRegionQueryByBidResponse;
	}
}