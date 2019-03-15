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

package com.aliyuncs.sas_api.transform.v20170705;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas_api.model.v20170705.DescribeThreatTypeLinesResponse;
import com.aliyuncs.sas_api.model.v20170705.DescribeThreatTypeLinesResponse.Item;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeThreatTypeLinesResponseUnmarshaller {

	public static DescribeThreatTypeLinesResponse unmarshall(DescribeThreatTypeLinesResponse describeThreatTypeLinesResponse, UnmarshallerContext context) {
		
		describeThreatTypeLinesResponse.setRequestId(context.stringValue("DescribeThreatTypeLinesResponse.RequestId"));

		List<String> categories = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeThreatTypeLinesResponse.Categories.Length"); i++) {
			categories.add(context.stringValue("DescribeThreatTypeLinesResponse.Categories["+ i +"]"));
		}
		describeThreatTypeLinesResponse.setCategories(categories);

		List<Item> items = new ArrayList<Item>();
		for (int i = 0; i < context.lengthValue("DescribeThreatTypeLinesResponse.Items.Length"); i++) {
			Item item = new Item();
			item.setData(context.floatValue("DescribeThreatTypeLinesResponse.Items["+ i +"].Data"));
			item.setId(context.stringValue("DescribeThreatTypeLinesResponse.Items["+ i +"].Id"));
			item.setName(context.stringValue("DescribeThreatTypeLinesResponse.Items["+ i +"].Name"));

			items.add(item);
		}
		describeThreatTypeLinesResponse.setItems(items);
	 
	 	return describeThreatTypeLinesResponse;
	}
}