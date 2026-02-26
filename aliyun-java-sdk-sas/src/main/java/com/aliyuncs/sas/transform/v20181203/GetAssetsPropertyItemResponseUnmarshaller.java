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

package com.aliyuncs.sas.transform.v20181203;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas.model.v20181203.GetAssetsPropertyItemResponse;
import com.aliyuncs.sas.model.v20181203.GetAssetsPropertyItemResponse.PageInfo;
import com.aliyuncs.sas.model.v20181203.GetAssetsPropertyItemResponse.PropertyItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAssetsPropertyItemResponseUnmarshaller {

	public static GetAssetsPropertyItemResponse unmarshall(GetAssetsPropertyItemResponse getAssetsPropertyItemResponse, UnmarshallerContext _ctx) {
		
		getAssetsPropertyItemResponse.setRequestId(_ctx.stringValue("GetAssetsPropertyItemResponse.RequestId"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setCurrentPage(_ctx.integerValue("GetAssetsPropertyItemResponse.PageInfo.CurrentPage"));
		pageInfo.setPageSize(_ctx.integerValue("GetAssetsPropertyItemResponse.PageInfo.PageSize"));
		pageInfo.setTotalCount(_ctx.integerValue("GetAssetsPropertyItemResponse.PageInfo.TotalCount"));
		pageInfo.setCount(_ctx.integerValue("GetAssetsPropertyItemResponse.PageInfo.Count"));
		getAssetsPropertyItemResponse.setPageInfo(pageInfo);

		List<PropertyItem> propertyItems = new ArrayList<PropertyItem>();
		for (int i = 0; i < _ctx.lengthValue("GetAssetsPropertyItemResponse.PropertyItems.Length"); i++) {
			PropertyItem propertyItem = new PropertyItem();
			propertyItem.setCount(_ctx.integerValue("GetAssetsPropertyItemResponse.PropertyItems["+ i +"].Count"));
			propertyItem.setPath(_ctx.stringValue("GetAssetsPropertyItemResponse.PropertyItems["+ i +"].Path"));
			propertyItem.setModuleName(_ctx.stringValue("GetAssetsPropertyItemResponse.PropertyItems["+ i +"].ModuleName"));
			propertyItem.setServerType(_ctx.stringValue("GetAssetsPropertyItemResponse.PropertyItems["+ i +"].ServerType"));
			propertyItem.setDomain(_ctx.stringValue("GetAssetsPropertyItemResponse.PropertyItems["+ i +"].Domain"));

			propertyItems.add(propertyItem);
		}
		getAssetsPropertyItemResponse.setPropertyItems(propertyItems);
	 
	 	return getAssetsPropertyItemResponse;
	}
}