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

package com.aliyuncs.companyreg.transform.v20190508;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.companyreg.model.v20190508.QueryBookkeepingCommoditiesResponse;
import com.aliyuncs.companyreg.model.v20190508.QueryBookkeepingCommoditiesResponse.BookkeepingCommodity;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryBookkeepingCommoditiesResponseUnmarshaller {

	public static QueryBookkeepingCommoditiesResponse unmarshall(QueryBookkeepingCommoditiesResponse queryBookkeepingCommoditiesResponse, UnmarshallerContext _ctx) {
		
		queryBookkeepingCommoditiesResponse.setRequestId(_ctx.stringValue("QueryBookkeepingCommoditiesResponse.RequestId"));

		List<BookkeepingCommodity> data = new ArrayList<BookkeepingCommodity>();
		for (int i = 0; i < _ctx.lengthValue("QueryBookkeepingCommoditiesResponse.Data.Length"); i++) {
			BookkeepingCommodity bookkeepingCommodity = new BookkeepingCommodity();
			bookkeepingCommodity.setTopOrgCode(_ctx.stringValue("QueryBookkeepingCommoditiesResponse.Data["+ i +"].TopOrgCode"));
			bookkeepingCommodity.setCommodityCode(_ctx.stringValue("QueryBookkeepingCommoditiesResponse.Data["+ i +"].CommodityCode"));
			bookkeepingCommodity.setCommodityName(_ctx.stringValue("QueryBookkeepingCommoditiesResponse.Data["+ i +"].CommodityName"));
			bookkeepingCommodity.setSpecCode(_ctx.stringValue("QueryBookkeepingCommoditiesResponse.Data["+ i +"].SpecCode"));
			bookkeepingCommodity.setPackageVersionCode(_ctx.stringValue("QueryBookkeepingCommoditiesResponse.Data["+ i +"].PackageVersionCode"));
			bookkeepingCommodity.setPackageVersionValue(_ctx.stringValue("QueryBookkeepingCommoditiesResponse.Data["+ i +"].PackageVersionValue"));
			bookkeepingCommodity.setPackageVersionName(_ctx.stringValue("QueryBookkeepingCommoditiesResponse.Data["+ i +"].PackageVersionName"));
			bookkeepingCommodity.setCityModuleCode(_ctx.stringValue("QueryBookkeepingCommoditiesResponse.Data["+ i +"].CityModuleCode"));
			bookkeepingCommodity.setCityModuleValue(_ctx.stringValue("QueryBookkeepingCommoditiesResponse.Data["+ i +"].CityModuleValue"));
			bookkeepingCommodity.setCityModuleName(_ctx.stringValue("QueryBookkeepingCommoditiesResponse.Data["+ i +"].CityModuleName"));
			bookkeepingCommodity.setOrdTimeCode(_ctx.stringValue("QueryBookkeepingCommoditiesResponse.Data["+ i +"].OrdTimeCode"));
			bookkeepingCommodity.setOrdTimeValue(_ctx.stringValue("QueryBookkeepingCommoditiesResponse.Data["+ i +"].OrdTimeValue"));
			bookkeepingCommodity.setOrdTimeName(_ctx.stringValue("QueryBookkeepingCommoditiesResponse.Data["+ i +"].OrdTimeName"));
			bookkeepingCommodity.setTopOrgName(_ctx.stringValue("QueryBookkeepingCommoditiesResponse.Data["+ i +"].TopOrgName"));
			bookkeepingCommodity.setServiceModuleCode(_ctx.stringValue("QueryBookkeepingCommoditiesResponse.Data["+ i +"].ServiceModuleCode"));
			bookkeepingCommodity.setServiceModuleValue(_ctx.stringValue("QueryBookkeepingCommoditiesResponse.Data["+ i +"].ServiceModuleValue"));
			bookkeepingCommodity.setServiceModuleName(_ctx.stringValue("QueryBookkeepingCommoditiesResponse.Data["+ i +"].ServiceModuleName"));
			bookkeepingCommodity.setAreaType(_ctx.stringValue("QueryBookkeepingCommoditiesResponse.Data["+ i +"].AreaType"));

			data.add(bookkeepingCommodity);
		}
		queryBookkeepingCommoditiesResponse.setData(data);
	 
	 	return queryBookkeepingCommoditiesResponse;
	}
}