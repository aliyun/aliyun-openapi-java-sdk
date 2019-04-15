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

import com.aliyuncs.ecsinc.model.v20160314.InnerEcsRegionQueryActiveResponse;
import com.aliyuncs.ecsinc.model.v20160314.InnerEcsRegionQueryActiveResponse.ErrorCode;
import com.aliyuncs.ecsinc.model.v20160314.InnerEcsRegionQueryActiveResponse.Item;
import com.aliyuncs.ecsinc.model.v20160314.InnerEcsRegionQueryActiveResponse.Item.Attributes;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerEcsRegionQueryActiveResponseUnmarshaller {

	public static InnerEcsRegionQueryActiveResponse unmarshall(InnerEcsRegionQueryActiveResponse innerEcsRegionQueryActiveResponse, UnmarshallerContext context) {
		
		innerEcsRegionQueryActiveResponse.setRequestId(context.stringValue("InnerEcsRegionQueryActiveResponse.RequestId"));
		innerEcsRegionQueryActiveResponse.setCount(context.integerValue("InnerEcsRegionQueryActiveResponse.count"));

		ErrorCode errorCode = new ErrorCode();
		errorCode.setCode(context.stringValue("InnerEcsRegionQueryActiveResponse.errorCode.code"));
		errorCode.setMessage(context.stringValue("InnerEcsRegionQueryActiveResponse.errorCode.message"));
		errorCode.setIsSuccess(context.booleanValue("InnerEcsRegionQueryActiveResponse.errorCode.isSuccess"));
		innerEcsRegionQueryActiveResponse.setErrorCode(errorCode);

		List<Item> data = new ArrayList<Item>();
		for (int i = 0; i < context.lengthValue("InnerEcsRegionQueryActiveResponse.data.Length"); i++) {
			Item item = new Item();
			item.setRegionNoAlias(context.stringValue("InnerEcsRegionQueryActiveResponse.data["+ i +"].regionNoAlias"));
			item.setRegionMemo(context.stringValue("InnerEcsRegionQueryActiveResponse.data["+ i +"].regionMemo"));
			item.setRegionName(context.stringValue("InnerEcsRegionQueryActiveResponse.data["+ i +"].regionName"));
			item.setRegionNo(context.stringValue("InnerEcsRegionQueryActiveResponse.data["+ i +"].regionNo"));
			item.setRegionEnName(context.stringValue("InnerEcsRegionQueryActiveResponse.data["+ i +"].regionEnName"));
			item.setIsActive(context.stringValue("InnerEcsRegionQueryActiveResponse.data["+ i +"].isActive"));
			item.setId(context.longValue("InnerEcsRegionQueryActiveResponse.data["+ i +"].id"));

			Attributes attributes = new Attributes();
			attributes.setSupport_image_copy(context.stringValue("InnerEcsRegionQueryActiveResponse.data["+ i +"].attributes.support_image_copy"));
			attributes.setInternal_use(context.stringValue("InnerEcsRegionQueryActiveResponse.data["+ i +"].attributes.internal_use"));
			attributes.setAk_name(context.stringValue("InnerEcsRegionQueryActiveResponse.data["+ i +"].attributes.ak_name"));
			item.setAttributes(attributes);

			data.add(item);
		}
		innerEcsRegionQueryActiveResponse.setData(data);
	 
	 	return innerEcsRegionQueryActiveResponse;
	}
}