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

package com.aliyuncs.edas.transform.v20170801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.edas.model.v20170801.QueryMigrateRegionListResponse;
import com.aliyuncs.edas.model.v20170801.QueryMigrateRegionListResponse.RegionEntity;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMigrateRegionListResponseUnmarshaller {

	public static QueryMigrateRegionListResponse unmarshall(QueryMigrateRegionListResponse queryMigrateRegionListResponse, UnmarshallerContext _ctx) {
		
		queryMigrateRegionListResponse.setRequestId(_ctx.stringValue("QueryMigrateRegionListResponse.RequestId"));
		queryMigrateRegionListResponse.setCode(_ctx.integerValue("QueryMigrateRegionListResponse.Code"));
		queryMigrateRegionListResponse.setMessage(_ctx.stringValue("QueryMigrateRegionListResponse.Message"));

		List<RegionEntity> regionEntityList = new ArrayList<RegionEntity>();
		for (int i = 0; i < _ctx.lengthValue("QueryMigrateRegionListResponse.RegionEntityList.Length"); i++) {
			RegionEntity regionEntity = new RegionEntity();
			regionEntity.setRegionNo(_ctx.stringValue("QueryMigrateRegionListResponse.RegionEntityList["+ i +"].RegionNo"));
			regionEntity.setRegionName(_ctx.stringValue("QueryMigrateRegionListResponse.RegionEntityList["+ i +"].RegionName"));

			regionEntityList.add(regionEntity);
		}
		queryMigrateRegionListResponse.setRegionEntityList(regionEntityList);
	 
	 	return queryMigrateRegionListResponse;
	}
}