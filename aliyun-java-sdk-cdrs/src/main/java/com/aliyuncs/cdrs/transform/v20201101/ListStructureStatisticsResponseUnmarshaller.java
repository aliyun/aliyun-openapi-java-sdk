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

import com.aliyuncs.cdrs.model.v20201101.ListStructureStatisticsResponse;
import com.aliyuncs.cdrs.model.v20201101.ListStructureStatisticsResponse.Datas;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListStructureStatisticsResponseUnmarshaller {

	public static ListStructureStatisticsResponse unmarshall(ListStructureStatisticsResponse listStructureStatisticsResponse, UnmarshallerContext _ctx) {
		
		listStructureStatisticsResponse.setRequestId(_ctx.stringValue("ListStructureStatisticsResponse.RequestId"));
		listStructureStatisticsResponse.setCode(_ctx.stringValue("ListStructureStatisticsResponse.Code"));
		listStructureStatisticsResponse.setMessage(_ctx.stringValue("ListStructureStatisticsResponse.Message"));
		listStructureStatisticsResponse.setPageNumber(_ctx.longValue("ListStructureStatisticsResponse.PageNumber"));
		listStructureStatisticsResponse.setPageSize(_ctx.longValue("ListStructureStatisticsResponse.PageSize"));
		listStructureStatisticsResponse.setTotalCount(_ctx.longValue("ListStructureStatisticsResponse.TotalCount"));

		List<Datas> data = new ArrayList<Datas>();
		for (int i = 0; i < _ctx.lengthValue("ListStructureStatisticsResponse.Data.Length"); i++) {
			Datas datas = new Datas();
			datas.setNumber(_ctx.stringValue("ListStructureStatisticsResponse.Data["+ i +"].Number"));
			datas.setCorpId(_ctx.stringValue("ListStructureStatisticsResponse.Data["+ i +"].CorpId"));

			data.add(datas);
		}
		listStructureStatisticsResponse.setData(data);
	 
	 	return listStructureStatisticsResponse;
	}
}