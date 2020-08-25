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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.QueryODPBizDbnodesResponse;
import com.aliyuncs.sofa.model.v20190815.QueryODPBizDbnodesResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryODPBizDbnodesResponseUnmarshaller {

	public static QueryODPBizDbnodesResponse unmarshall(QueryODPBizDbnodesResponse queryODPBizDbnodesResponse, UnmarshallerContext _ctx) {
		
		queryODPBizDbnodesResponse.setRequestId(_ctx.stringValue("QueryODPBizDbnodesResponse.RequestId"));
		queryODPBizDbnodesResponse.setResultCode(_ctx.stringValue("QueryODPBizDbnodesResponse.ResultCode"));
		queryODPBizDbnodesResponse.setResultMessage(_ctx.stringValue("QueryODPBizDbnodesResponse.ResultMessage"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryODPBizDbnodesResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setCreateTime(_ctx.stringValue("QueryODPBizDbnodesResponse.Data["+ i +"].CreateTime"));
			dataItem.setDbInstanceId(_ctx.stringValue("QueryODPBizDbnodesResponse.Data["+ i +"].DbInstanceId"));
			dataItem.setDbType(_ctx.stringValue("QueryODPBizDbnodesResponse.Data["+ i +"].DbType"));
			dataItem.setHost(_ctx.stringValue("QueryODPBizDbnodesResponse.Data["+ i +"].Host"));
			dataItem.setImported(_ctx.booleanValue("QueryODPBizDbnodesResponse.Data["+ i +"].Imported"));
			dataItem.setNetMode(_ctx.stringValue("QueryODPBizDbnodesResponse.Data["+ i +"].NetMode"));
			dataItem.setPort(_ctx.longValue("QueryODPBizDbnodesResponse.Data["+ i +"].Port"));
			dataItem.setVpcId(_ctx.stringValue("QueryODPBizDbnodesResponse.Data["+ i +"].VpcId"));

			data.add(dataItem);
		}
		queryODPBizDbnodesResponse.setData(data);
	 
	 	return queryODPBizDbnodesResponse;
	}
}