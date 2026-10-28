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

package com.aliyuncs.quotas.transform.v20200510;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.quotas.model.v20200510.ListProductDimensionGroupsResponse;
import com.aliyuncs.quotas.model.v20200510.ListProductDimensionGroupsResponse.DimensionGroupsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListProductDimensionGroupsResponseUnmarshaller {

	public static ListProductDimensionGroupsResponse unmarshall(ListProductDimensionGroupsResponse listProductDimensionGroupsResponse, UnmarshallerContext _ctx) {
		
		listProductDimensionGroupsResponse.setRequestId(_ctx.stringValue("ListProductDimensionGroupsResponse.RequestId"));
		listProductDimensionGroupsResponse.setTotalCount(_ctx.integerValue("ListProductDimensionGroupsResponse.TotalCount"));
		listProductDimensionGroupsResponse.setNextToken(_ctx.stringValue("ListProductDimensionGroupsResponse.NextToken"));
		listProductDimensionGroupsResponse.setMaxResults(_ctx.integerValue("ListProductDimensionGroupsResponse.MaxResults"));

		List<DimensionGroupsItem> dimensionGroups = new ArrayList<DimensionGroupsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListProductDimensionGroupsResponse.DimensionGroups.Length"); i++) {
			DimensionGroupsItem dimensionGroupsItem = new DimensionGroupsItem();
			dimensionGroupsItem.setGroupName(_ctx.stringValue("ListProductDimensionGroupsResponse.DimensionGroups["+ i +"].GroupName"));
			dimensionGroupsItem.setProductCode(_ctx.stringValue("ListProductDimensionGroupsResponse.DimensionGroups["+ i +"].ProductCode"));
			dimensionGroupsItem.setGroupCode(_ctx.stringValue("ListProductDimensionGroupsResponse.DimensionGroups["+ i +"].GroupCode"));

			List<String> dimensionKeys = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListProductDimensionGroupsResponse.DimensionGroups["+ i +"].DimensionKeys.Length"); j++) {
				dimensionKeys.add(_ctx.stringValue("ListProductDimensionGroupsResponse.DimensionGroups["+ i +"].DimensionKeys["+ j +"]"));
			}
			dimensionGroupsItem.setDimensionKeys(dimensionKeys);

			dimensionGroups.add(dimensionGroupsItem);
		}
		listProductDimensionGroupsResponse.setDimensionGroups(dimensionGroups);
	 
	 	return listProductDimensionGroupsResponse;
	}
}