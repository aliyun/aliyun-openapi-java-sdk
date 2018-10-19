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

package com.aliyuncs.linkedmall.transform.v20180116;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.linkedmall.model.v20180116.QueryAllCitiesResponse;
import com.aliyuncs.linkedmall.model.v20180116.QueryAllCitiesResponse.City;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryAllCitiesResponseUnmarshaller {

	public static QueryAllCitiesResponse unmarshall(QueryAllCitiesResponse queryAllCitiesResponse, UnmarshallerContext context) {
		
		queryAllCitiesResponse.setRequestId(context.stringValue("QueryAllCitiesResponse.RequestId"));
		queryAllCitiesResponse.setCode(context.stringValue("QueryAllCitiesResponse.Code"));
		queryAllCitiesResponse.setMessage(context.stringValue("QueryAllCitiesResponse.Message"));
		queryAllCitiesResponse.setSubCode(context.stringValue("QueryAllCitiesResponse.SubCode"));
		queryAllCitiesResponse.setSubMessage(context.stringValue("QueryAllCitiesResponse.SubMessage"));
		queryAllCitiesResponse.setLogsId(context.stringValue("QueryAllCitiesResponse.LogsId"));
		queryAllCitiesResponse.setSuccess(context.booleanValue("QueryAllCitiesResponse.Success"));

		List<City> cities = new ArrayList<City>();
		for (int i = 0; i < context.lengthValue("QueryAllCitiesResponse.Cities.Length"); i++) {
			City city = new City();
			city.setPinYin(context.stringValue("QueryAllCitiesResponse.Cities["+ i +"].PinYin"));
			city.setCityCode(context.longValue("QueryAllCitiesResponse.Cities["+ i +"].CityCode"));
			city.setName(context.stringValue("QueryAllCitiesResponse.Cities["+ i +"].Name"));
			city.setId(context.longValue("QueryAllCitiesResponse.Cities["+ i +"].Id"));
			city.setParentId(context.longValue("QueryAllCitiesResponse.Cities["+ i +"].ParentId"));

			cities.add(city);
		}
		queryAllCitiesResponse.setCities(cities);
	 
	 	return queryAllCitiesResponse;
	}
}