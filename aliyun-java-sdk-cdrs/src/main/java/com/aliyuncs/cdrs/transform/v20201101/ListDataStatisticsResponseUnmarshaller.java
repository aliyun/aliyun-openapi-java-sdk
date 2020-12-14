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

import com.aliyuncs.cdrs.model.v20201101.ListDataStatisticsResponse;
import com.aliyuncs.cdrs.model.v20201101.ListDataStatisticsResponse.Datas;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDataStatisticsResponseUnmarshaller {

	public static ListDataStatisticsResponse unmarshall(ListDataStatisticsResponse listDataStatisticsResponse, UnmarshallerContext _ctx) {
		
		listDataStatisticsResponse.setRequestId(_ctx.stringValue("ListDataStatisticsResponse.RequestId"));
		listDataStatisticsResponse.setCode(_ctx.stringValue("ListDataStatisticsResponse.Code"));
		listDataStatisticsResponse.setMessage(_ctx.stringValue("ListDataStatisticsResponse.Message"));
		listDataStatisticsResponse.setPageNumber(_ctx.longValue("ListDataStatisticsResponse.PageNumber"));
		listDataStatisticsResponse.setPageSize(_ctx.longValue("ListDataStatisticsResponse.PageSize"));
		listDataStatisticsResponse.setTotalCount(_ctx.longValue("ListDataStatisticsResponse.TotalCount"));

		List<Datas> data = new ArrayList<Datas>();
		for (int i = 0; i < _ctx.lengthValue("ListDataStatisticsResponse.Data.Length"); i++) {
			Datas datas = new Datas();
			datas.setCorpId(_ctx.stringValue("ListDataStatisticsResponse.Data["+ i +"].CorpId"));
			datas.setNumber(_ctx.stringValue("ListDataStatisticsResponse.Data["+ i +"].Number"));

			data.add(datas);
		}
		listDataStatisticsResponse.setData(data);
	 
	 	return listDataStatisticsResponse;
	}
}