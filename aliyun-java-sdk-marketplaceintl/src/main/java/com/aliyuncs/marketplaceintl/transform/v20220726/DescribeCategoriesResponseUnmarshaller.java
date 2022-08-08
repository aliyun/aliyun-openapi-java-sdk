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

package com.aliyuncs.marketplaceintl.transform.v20220726;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.marketplaceintl.model.v20220726.DescribeCategoriesResponse;
import com.aliyuncs.marketplaceintl.model.v20220726.DescribeCategoriesResponse.DataItem;
import com.aliyuncs.marketplaceintl.model.v20220726.DescribeCategoriesResponse.DataItem.SubCategorie;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCategoriesResponseUnmarshaller {

	public static DescribeCategoriesResponse unmarshall(DescribeCategoriesResponse describeCategoriesResponse, UnmarshallerContext _ctx) {
		
		describeCategoriesResponse.setRequestId(_ctx.stringValue("DescribeCategoriesResponse.RequestId"));
		describeCategoriesResponse.setErrorCode(_ctx.stringValue("DescribeCategoriesResponse.ErrorCode"));
		describeCategoriesResponse.setCode(_ctx.integerValue("DescribeCategoriesResponse.Code"));
		describeCategoriesResponse.setMsg(_ctx.stringValue("DescribeCategoriesResponse.Msg"));
		describeCategoriesResponse.setSuccess(_ctx.booleanValue("DescribeCategoriesResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCategoriesResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setCategoryId(_ctx.stringValue("DescribeCategoriesResponse.Data["+ i +"].CategoryId"));
			dataItem.setCategoryName(_ctx.stringValue("DescribeCategoriesResponse.Data["+ i +"].CategoryName"));
			dataItem.setTrackId(_ctx.stringValue("DescribeCategoriesResponse.Data["+ i +"].TrackId"));

			List<SubCategorie> subCategories = new ArrayList<SubCategorie>();
			for (int j = 0; j < _ctx.lengthValue("DescribeCategoriesResponse.Data["+ i +"].SubCategories.Length"); j++) {
				SubCategorie subCategorie = new SubCategorie();
				subCategorie.setCategoryId(_ctx.stringValue("DescribeCategoriesResponse.Data["+ i +"].SubCategories["+ j +"].CategoryId"));
				subCategorie.setCategoryName(_ctx.stringValue("DescribeCategoriesResponse.Data["+ i +"].SubCategories["+ j +"].CategoryName"));

				subCategories.add(subCategorie);
			}
			dataItem.setSubCategories(subCategories);

			data.add(dataItem);
		}
		describeCategoriesResponse.setData(data);
	 
	 	return describeCategoriesResponse;
	}
}