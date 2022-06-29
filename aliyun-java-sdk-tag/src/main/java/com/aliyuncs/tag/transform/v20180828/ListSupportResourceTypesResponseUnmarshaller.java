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

package com.aliyuncs.tag.transform.v20180828;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.tag.model.v20180828.ListSupportResourceTypesResponse;
import com.aliyuncs.tag.model.v20180828.ListSupportResourceTypesResponse.SupportResourceType;
import com.aliyuncs.tag.model.v20180828.ListSupportResourceTypesResponse.SupportResourceType.SupportItemsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSupportResourceTypesResponseUnmarshaller {

	public static ListSupportResourceTypesResponse unmarshall(ListSupportResourceTypesResponse listSupportResourceTypesResponse, UnmarshallerContext _ctx) {
		
		listSupportResourceTypesResponse.setRequestId(_ctx.stringValue("ListSupportResourceTypesResponse.RequestId"));
		listSupportResourceTypesResponse.setNextToken(_ctx.stringValue("ListSupportResourceTypesResponse.NextToken"));

		List<SupportResourceType> supportResourceTypes = new ArrayList<SupportResourceType>();
		for (int i = 0; i < _ctx.lengthValue("ListSupportResourceTypesResponse.SupportResourceTypes.Length"); i++) {
			SupportResourceType supportResourceType = new SupportResourceType();
			supportResourceType.setProductCode(_ctx.stringValue("ListSupportResourceTypesResponse.SupportResourceTypes["+ i +"].ProductCode"));
			supportResourceType.setResourceType(_ctx.stringValue("ListSupportResourceTypesResponse.SupportResourceTypes["+ i +"].ResourceType"));

			List<SupportItemsItem> supportItems = new ArrayList<SupportItemsItem>();
			for (int j = 0; j < _ctx.lengthValue("ListSupportResourceTypesResponse.SupportResourceTypes["+ i +"].SupportItems.Length"); j++) {
				SupportItemsItem supportItemsItem = new SupportItemsItem();
				supportItemsItem.setSupportCode(_ctx.stringValue("ListSupportResourceTypesResponse.SupportResourceTypes["+ i +"].SupportItems["+ j +"].SupportCode"));
				supportItemsItem.setSupport(_ctx.booleanValue("ListSupportResourceTypesResponse.SupportResourceTypes["+ i +"].SupportItems["+ j +"].Support"));

				supportItems.add(supportItemsItem);
			}
			supportResourceType.setSupportItems(supportItems);

			supportResourceTypes.add(supportResourceType);
		}
		listSupportResourceTypesResponse.setSupportResourceTypes(supportResourceTypes);
	 
	 	return listSupportResourceTypesResponse;
	}
}