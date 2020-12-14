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

import com.aliyuncs.cdrs.model.v20201101.ListCityMapCameraResultsResponse;
import com.aliyuncs.cdrs.model.v20201101.ListCityMapCameraResultsResponse.Datas;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCityMapCameraResultsResponseUnmarshaller {

	public static ListCityMapCameraResultsResponse unmarshall(ListCityMapCameraResultsResponse listCityMapCameraResultsResponse, UnmarshallerContext _ctx) {
		
		listCityMapCameraResultsResponse.setRequestId(_ctx.stringValue("ListCityMapCameraResultsResponse.RequestId"));
		listCityMapCameraResultsResponse.setCode(_ctx.stringValue("ListCityMapCameraResultsResponse.Code"));
		listCityMapCameraResultsResponse.setMessage(_ctx.stringValue("ListCityMapCameraResultsResponse.Message"));
		listCityMapCameraResultsResponse.setTotalCount(_ctx.longValue("ListCityMapCameraResultsResponse.TotalCount"));
		listCityMapCameraResultsResponse.setPageNum(_ctx.stringValue("ListCityMapCameraResultsResponse.PageNum"));
		listCityMapCameraResultsResponse.setPageSize(_ctx.stringValue("ListCityMapCameraResultsResponse.PageSize"));

		List<Datas> data = new ArrayList<Datas>();
		for (int i = 0; i < _ctx.lengthValue("ListCityMapCameraResultsResponse.Data.Length"); i++) {
			Datas datas = new Datas();
			datas.setDataSourceId(_ctx.stringValue("ListCityMapCameraResultsResponse.Data["+ i +"].DataSourceId"));
			datas.setLatitude(_ctx.stringValue("ListCityMapCameraResultsResponse.Data["+ i +"].Latitude"));
			datas.setLongitude(_ctx.stringValue("ListCityMapCameraResultsResponse.Data["+ i +"].Longitude"));
			datas.setNearPoi(_ctx.stringValue("ListCityMapCameraResultsResponse.Data["+ i +"].NearPoi"));
			datas.setDataSourcePoi(_ctx.stringValue("ListCityMapCameraResultsResponse.Data["+ i +"].DataSourcePoi"));
			datas.setDataSourceName(_ctx.stringValue("ListCityMapCameraResultsResponse.Data["+ i +"].DataSourceName"));
			datas.setCorpId(_ctx.stringValue("ListCityMapCameraResultsResponse.Data["+ i +"].CorpId"));

			data.add(datas);
		}
		listCityMapCameraResultsResponse.setData(data);
	 
	 	return listCityMapCameraResultsResponse;
	}
}