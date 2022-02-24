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

package com.aliyuncs.dt_oc_info.transform.v20200401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dt_oc_info.model.v20200401.QueryRskStatisticResponse;
import com.aliyuncs.dt_oc_info.model.v20200401.QueryRskStatisticResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryRskStatisticResponseUnmarshaller {

	public static QueryRskStatisticResponse unmarshall(QueryRskStatisticResponse queryRskStatisticResponse, UnmarshallerContext _ctx) {
		
		queryRskStatisticResponse.setRequestId(_ctx.stringValue("QueryRskStatisticResponse.RequestId"));
		queryRskStatisticResponse.setCode(_ctx.integerValue("QueryRskStatisticResponse.Code"));
		queryRskStatisticResponse.setMessage(_ctx.stringValue("QueryRskStatisticResponse.Message"));
		queryRskStatisticResponse.setTotal(_ctx.integerValue("QueryRskStatisticResponse.Total"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryRskStatisticResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setType(_ctx.stringValue("QueryRskStatisticResponse.Data["+ i +"].Type"));
			dataItem.setOcId(_ctx.stringValue("QueryRskStatisticResponse.Data["+ i +"].OcId"));
			dataItem.setUpdateDate(_ctx.stringValue("QueryRskStatisticResponse.Data["+ i +"].UpdateDate"));
			dataItem.setCount(_ctx.longValue("QueryRskStatisticResponse.Data["+ i +"].Count"));
			dataItem.setCorpName(_ctx.stringValue("QueryRskStatisticResponse.Data["+ i +"].CorpName"));

			data.add(dataItem);
		}
		queryRskStatisticResponse.setData(data);
	 
	 	return queryRskStatisticResponse;
	}
}