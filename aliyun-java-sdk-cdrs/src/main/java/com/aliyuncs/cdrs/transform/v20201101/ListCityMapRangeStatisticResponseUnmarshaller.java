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

package com.aliyuncs.cdrs.transform.v20201101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cdrs.model.v20201101.ListCityMapRangeStatisticResponse;
import com.aliyuncs.cdrs.model.v20201101.ListCityMapRangeStatisticResponse.Datas;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCityMapRangeStatisticResponseUnmarshaller {

	public static ListCityMapRangeStatisticResponse unmarshall(ListCityMapRangeStatisticResponse listCityMapRangeStatisticResponse, UnmarshallerContext _ctx) {
		
		listCityMapRangeStatisticResponse.setRequestId(_ctx.stringValue("ListCityMapRangeStatisticResponse.RequestId"));
		listCityMapRangeStatisticResponse.setCode(_ctx.stringValue("ListCityMapRangeStatisticResponse.Code"));
		listCityMapRangeStatisticResponse.setMessage(_ctx.stringValue("ListCityMapRangeStatisticResponse.Message"));
		listCityMapRangeStatisticResponse.setPageNumber(_ctx.longValue("ListCityMapRangeStatisticResponse.PageNumber"));
		listCityMapRangeStatisticResponse.setPageSize(_ctx.longValue("ListCityMapRangeStatisticResponse.PageSize"));
		listCityMapRangeStatisticResponse.setTotalCount(_ctx.longValue("ListCityMapRangeStatisticResponse.TotalCount"));

		List<Datas> data = new ArrayList<Datas>();
		for (int i = 0; i < _ctx.lengthValue("ListCityMapRangeStatisticResponse.Data.Length"); i++) {
			Datas datas = new Datas();
			datas.setDataSourceId(_ctx.stringValue("ListCityMapRangeStatisticResponse.Data["+ i +"].DataSourceId"));
			datas.setLatitude(_ctx.stringValue("ListCityMapRangeStatisticResponse.Data["+ i +"].Latitude"));
			datas.setLongitude(_ctx.stringValue("ListCityMapRangeStatisticResponse.Data["+ i +"].Longitude"));
			datas.setDataSourceName(_ctx.stringValue("ListCityMapRangeStatisticResponse.Data["+ i +"].DataSourceName"));
			datas.setCorpId(_ctx.stringValue("ListCityMapRangeStatisticResponse.Data["+ i +"].CorpId"));
			datas.setAdultValue(_ctx.stringValue("ListCityMapRangeStatisticResponse.Data["+ i +"].AdultValue"));
			datas.setWomanValue(_ctx.stringValue("ListCityMapRangeStatisticResponse.Data["+ i +"].WomanValue"));
			datas.setMotorValue(_ctx.stringValue("ListCityMapRangeStatisticResponse.Data["+ i +"].MotorValue"));
			datas.setManValue(_ctx.stringValue("ListCityMapRangeStatisticResponse.Data["+ i +"].ManValue"));
			datas.setOldValue(_ctx.stringValue("ListCityMapRangeStatisticResponse.Data["+ i +"].OldValue"));
			datas.setChildValue(_ctx.stringValue("ListCityMapRangeStatisticResponse.Data["+ i +"].ChildValue"));

			data.add(datas);
		}
		listCityMapRangeStatisticResponse.setData(data);
	 
	 	return listCityMapRangeStatisticResponse;
	}
}