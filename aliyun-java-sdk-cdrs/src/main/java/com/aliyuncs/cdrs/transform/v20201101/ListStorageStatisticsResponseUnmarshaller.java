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

import com.aliyuncs.cdrs.model.v20201101.ListStorageStatisticsResponse;
import com.aliyuncs.cdrs.model.v20201101.ListStorageStatisticsResponse.Datas;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListStorageStatisticsResponseUnmarshaller {

	public static ListStorageStatisticsResponse unmarshall(ListStorageStatisticsResponse listStorageStatisticsResponse, UnmarshallerContext _ctx) {
		
		listStorageStatisticsResponse.setRequestId(_ctx.stringValue("ListStorageStatisticsResponse.RequestId"));
		listStorageStatisticsResponse.setCode(_ctx.stringValue("ListStorageStatisticsResponse.Code"));
		listStorageStatisticsResponse.setMessage(_ctx.stringValue("ListStorageStatisticsResponse.Message"));
		listStorageStatisticsResponse.setTotalCount(_ctx.longValue("ListStorageStatisticsResponse.TotalCount"));

		List<Datas> data = new ArrayList<Datas>();
		for (int i = 0; i < _ctx.lengthValue("ListStorageStatisticsResponse.Data.Length"); i++) {
			Datas datas = new Datas();
			datas.setCorpId(_ctx.stringValue("ListStorageStatisticsResponse.Data["+ i +"].CorpId"));
			datas.setNumber(_ctx.stringValue("ListStorageStatisticsResponse.Data["+ i +"].Number"));
			datas.setTotalStore(_ctx.stringValue("ListStorageStatisticsResponse.Data["+ i +"].TotalStore"));
			datas.setUnusedStore(_ctx.stringValue("ListStorageStatisticsResponse.Data["+ i +"].UnusedStore"));
			datas.setUsedStore(_ctx.stringValue("ListStorageStatisticsResponse.Data["+ i +"].UsedStore"));

			data.add(datas);
		}
		listStorageStatisticsResponse.setData(data);
	 
	 	return listStorageStatisticsResponse;
	}
}