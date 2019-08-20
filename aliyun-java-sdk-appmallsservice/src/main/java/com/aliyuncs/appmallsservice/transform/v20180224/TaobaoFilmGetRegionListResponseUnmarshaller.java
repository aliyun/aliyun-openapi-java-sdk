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

package com.aliyuncs.appmallsservice.transform.v20180224;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.appmallsservice.model.v20180224.TaobaoFilmGetRegionListResponse;
import com.aliyuncs.appmallsservice.model.v20180224.TaobaoFilmGetRegionListResponse.RegionsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class TaobaoFilmGetRegionListResponseUnmarshaller {

	public static TaobaoFilmGetRegionListResponse unmarshall(TaobaoFilmGetRegionListResponse taobaoFilmGetRegionListResponse, UnmarshallerContext _ctx) {
		
		taobaoFilmGetRegionListResponse.setRequestId(_ctx.stringValue("TaobaoFilmGetRegionListResponse.RequestId"));
		taobaoFilmGetRegionListResponse.setErrorCode(_ctx.stringValue("TaobaoFilmGetRegionListResponse.ErrorCode"));
		taobaoFilmGetRegionListResponse.setMsg(_ctx.stringValue("TaobaoFilmGetRegionListResponse.Msg"));
		taobaoFilmGetRegionListResponse.setSubCode(_ctx.stringValue("TaobaoFilmGetRegionListResponse.SubCode"));
		taobaoFilmGetRegionListResponse.setSubMsg(_ctx.stringValue("TaobaoFilmGetRegionListResponse.SubMsg"));
		taobaoFilmGetRegionListResponse.setLogsId(_ctx.stringValue("TaobaoFilmGetRegionListResponse.LogsId"));

		List<RegionsItem> regions = new ArrayList<RegionsItem>();
		for (int i = 0; i < _ctx.lengthValue("TaobaoFilmGetRegionListResponse.Regions.Length"); i++) {
			RegionsItem regionsItem = new RegionsItem();
			regionsItem.setCityCode(_ctx.longValue("TaobaoFilmGetRegionListResponse.Regions["+ i +"].CityCode"));
			regionsItem.setId(_ctx.longValue("TaobaoFilmGetRegionListResponse.Regions["+ i +"].Id"));
			regionsItem.setParentId(_ctx.longValue("TaobaoFilmGetRegionListResponse.Regions["+ i +"].ParentId"));
			regionsItem.setPinYin(_ctx.stringValue("TaobaoFilmGetRegionListResponse.Regions["+ i +"].PinYin"));
			regionsItem.setRegionName(_ctx.stringValue("TaobaoFilmGetRegionListResponse.Regions["+ i +"].RegionName"));

			regions.add(regionsItem);
		}
		taobaoFilmGetRegionListResponse.setRegions(regions);
	 
	 	return taobaoFilmGetRegionListResponse;
	}
}