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

import com.aliyuncs.ecsinc.model.v20160314.InnerQueryImageBindByInstanceResponse;
import com.aliyuncs.ecsinc.model.v20160314.InnerQueryImageBindByInstanceResponse.Item;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerQueryImageBindByInstanceResponseUnmarshaller {

	public static InnerQueryImageBindByInstanceResponse unmarshall(InnerQueryImageBindByInstanceResponse innerQueryImageBindByInstanceResponse, UnmarshallerContext context) {
		
		innerQueryImageBindByInstanceResponse.setRequestId(context.stringValue("InnerQueryImageBindByInstanceResponse.RequestId"));

		List<Item> data = new ArrayList<Item>();
		for (int i = 0; i < context.lengthValue("InnerQueryImageBindByInstanceResponse.data.Length"); i++) {
			Item item = new Item();
			item.setImageInstanceId(context.stringValue("InnerQueryImageBindByInstanceResponse.data["+ i +"].ImageInstanceId"));
			item.setImageId(context.stringValue("InnerQueryImageBindByInstanceResponse.data["+ i +"].ImageId"));
			item.setInstanceId(context.stringValue("InnerQueryImageBindByInstanceResponse.data["+ i +"].InstanceId"));
			item.setImagePc(context.stringValue("InnerQueryImageBindByInstanceResponse.data["+ i +"].ImagePc"));
			item.setRegion(context.stringValue("InnerQueryImageBindByInstanceResponse.data["+ i +"].Region"));
			item.setBindStatus(context.integerValue("InnerQueryImageBindByInstanceResponse.data["+ i +"].BindStatus"));
			item.setBindTime(context.longValue("InnerQueryImageBindByInstanceResponse.data["+ i +"].BindTime"));
			item.setUnbindTime(context.longValue("InnerQueryImageBindByInstanceResponse.data["+ i +"].UnbindTime"));
			item.setChargeType(context.stringValue("InnerQueryImageBindByInstanceResponse.data["+ i +"].ChargeType"));

			data.add(item);
		}
		innerQueryImageBindByInstanceResponse.setData(data);
	 
	 	return innerQueryImageBindByInstanceResponse;
	}
}