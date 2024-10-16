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

package com.aliyuncs.iqs.transform.v20240712;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iqs.model.v20240712.QueryRestaurantsResponse;
import com.aliyuncs.iqs.model.v20240712.QueryRestaurantsResponse.QueryResult;
import com.aliyuncs.iqs.model.v20240712.QueryRestaurantsResponse.QueryResult.DataItem;
import com.aliyuncs.iqs.model.v20240712.QueryRestaurantsResponse.QueryResult.DataItem.ImagesItem;
import com.aliyuncs.iqs.model.v20240712.QueryRestaurantsResponse.QueryResult.DataItem.Metadata;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryRestaurantsResponseUnmarshaller {

	public static QueryRestaurantsResponse unmarshall(QueryRestaurantsResponse queryRestaurantsResponse, UnmarshallerContext _ctx) {
		
		queryRestaurantsResponse.setRequestId(_ctx.stringValue("QueryRestaurantsResponse.requestId"));

		QueryResult queryResult = new QueryResult();

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryRestaurantsResponse.queryResult.data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setAddress(_ctx.stringValue("QueryRestaurantsResponse.queryResult.data["+ i +"].address"));
			dataItem.setCityCode(_ctx.stringValue("QueryRestaurantsResponse.queryResult.data["+ i +"].cityCode"));
			dataItem.setCityName(_ctx.stringValue("QueryRestaurantsResponse.queryResult.data["+ i +"].cityName"));
			dataItem.setDistrictCode(_ctx.stringValue("QueryRestaurantsResponse.queryResult.data["+ i +"].districtCode"));
			dataItem.setDistrictName(_ctx.stringValue("QueryRestaurantsResponse.queryResult.data["+ i +"].districtName"));
			dataItem.setId(_ctx.stringValue("QueryRestaurantsResponse.queryResult.data["+ i +"].id"));
			dataItem.setLatitude(_ctx.stringValue("QueryRestaurantsResponse.queryResult.data["+ i +"].latitude"));
			dataItem.setLongitude(_ctx.stringValue("QueryRestaurantsResponse.queryResult.data["+ i +"].longitude"));
			dataItem.setName(_ctx.stringValue("QueryRestaurantsResponse.queryResult.data["+ i +"].name"));
			dataItem.setProvinceCode(_ctx.stringValue("QueryRestaurantsResponse.queryResult.data["+ i +"].provinceCode"));
			dataItem.setProvinceName(_ctx.stringValue("QueryRestaurantsResponse.queryResult.data["+ i +"].provinceName"));
			dataItem.setTypeCode(_ctx.stringValue("QueryRestaurantsResponse.queryResult.data["+ i +"].typeCode"));
			dataItem.setTypes(_ctx.stringValue("QueryRestaurantsResponse.queryResult.data["+ i +"].types"));

			Metadata metadata = new Metadata();
			metadata.setBusinessArea(_ctx.stringValue("QueryRestaurantsResponse.queryResult.data["+ i +"].metadata.businessArea"));
			metadata.setDailyOpeningHours(_ctx.stringValue("QueryRestaurantsResponse.queryResult.data["+ i +"].metadata.dailyOpeningHours"));
			metadata.setMainTag(_ctx.stringValue("QueryRestaurantsResponse.queryResult.data["+ i +"].metadata.mainTag"));
			metadata.setPhone(_ctx.stringValue("QueryRestaurantsResponse.queryResult.data["+ i +"].metadata.phone"));
			metadata.setScore(_ctx.stringValue("QueryRestaurantsResponse.queryResult.data["+ i +"].metadata.score"));
			metadata.setWeeklyOpeningDays(_ctx.stringValue("QueryRestaurantsResponse.queryResult.data["+ i +"].metadata.weeklyOpeningDays"));
			dataItem.setMetadata(metadata);

			List<ImagesItem> images = new ArrayList<ImagesItem>();
			for (int j = 0; j < _ctx.lengthValue("QueryRestaurantsResponse.queryResult.data["+ i +"].images.Length"); j++) {
				ImagesItem imagesItem = new ImagesItem();
				imagesItem.setTitle(_ctx.stringValue("QueryRestaurantsResponse.queryResult.data["+ i +"].images["+ j +"].title"));
				imagesItem.setUrl(_ctx.stringValue("QueryRestaurantsResponse.queryResult.data["+ i +"].images["+ j +"].url"));

				images.add(imagesItem);
			}
			dataItem.setImages(images);

			data.add(dataItem);
		}
		queryResult.setData(data);
		queryRestaurantsResponse.setQueryResult(queryResult);
	 
	 	return queryRestaurantsResponse;
	}
}