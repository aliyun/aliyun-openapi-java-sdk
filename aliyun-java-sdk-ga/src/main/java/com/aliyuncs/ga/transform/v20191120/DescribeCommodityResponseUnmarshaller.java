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

package com.aliyuncs.ga.transform.v20191120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ga.model.v20191120.DescribeCommodityResponse;
import com.aliyuncs.ga.model.v20191120.DescribeCommodityResponse.ComponentsItem;
import com.aliyuncs.ga.model.v20191120.DescribeCommodityResponse.ComponentsItem.PropertiesItem;
import com.aliyuncs.ga.model.v20191120.DescribeCommodityResponse.ComponentsItem.PropertiesItem.PropertyValueListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCommodityResponseUnmarshaller {

	public static DescribeCommodityResponse unmarshall(DescribeCommodityResponse describeCommodityResponse, UnmarshallerContext _ctx) {
		
		describeCommodityResponse.setRequestId(_ctx.stringValue("DescribeCommodityResponse.RequestId"));
		describeCommodityResponse.setCommodityCode(_ctx.stringValue("DescribeCommodityResponse.CommodityCode"));
		describeCommodityResponse.setCommodityName(_ctx.stringValue("DescribeCommodityResponse.CommodityName"));

		List<ComponentsItem> components = new ArrayList<ComponentsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCommodityResponse.Components.Length"); i++) {
			ComponentsItem componentsItem = new ComponentsItem();
			componentsItem.setComponentCode(_ctx.stringValue("DescribeCommodityResponse.Components["+ i +"].ComponentCode"));
			componentsItem.setComponentName(_ctx.stringValue("DescribeCommodityResponse.Components["+ i +"].ComponentName"));

			List<PropertiesItem> properties = new ArrayList<PropertiesItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeCommodityResponse.Components["+ i +"].Properties.Length"); j++) {
				PropertiesItem propertiesItem = new PropertiesItem();
				propertiesItem.setCode(_ctx.stringValue("DescribeCommodityResponse.Components["+ i +"].Properties["+ j +"].Code"));
				propertiesItem.setName(_ctx.stringValue("DescribeCommodityResponse.Components["+ i +"].Properties["+ j +"].Name"));

				List<PropertyValueListItem> propertyValueList = new ArrayList<PropertyValueListItem>();
				for (int k = 0; k < _ctx.lengthValue("DescribeCommodityResponse.Components["+ i +"].Properties["+ j +"].PropertyValueList.Length"); k++) {
					PropertyValueListItem propertyValueListItem = new PropertyValueListItem();
					propertyValueListItem.setText(_ctx.stringValue("DescribeCommodityResponse.Components["+ i +"].Properties["+ j +"].PropertyValueList["+ k +"].Text"));
					propertyValueListItem.setValue(_ctx.stringValue("DescribeCommodityResponse.Components["+ i +"].Properties["+ j +"].PropertyValueList["+ k +"].Value"));
					propertyValueListItem.setTips(_ctx.stringValue("DescribeCommodityResponse.Components["+ i +"].Properties["+ j +"].PropertyValueList["+ k +"].Tips"));
					propertyValueListItem.setOrderIndex(_ctx.longValue("DescribeCommodityResponse.Components["+ i +"].Properties["+ j +"].PropertyValueList["+ k +"].OrderIndex"));

					propertyValueList.add(propertyValueListItem);
				}
				propertiesItem.setPropertyValueList(propertyValueList);

				properties.add(propertiesItem);
			}
			componentsItem.setProperties(properties);

			components.add(componentsItem);
		}
		describeCommodityResponse.setComponents(components);
	 
	 	return describeCommodityResponse;
	}
}