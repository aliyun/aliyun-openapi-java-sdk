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

package com.aliyuncs.aliyunauth.transform.v20181222;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.aliyunauth.model.v20181222.QueryAuthResponse;
import com.aliyuncs.aliyunauth.model.v20181222.QueryAuthResponse.Data;
import com.aliyuncs.aliyunauth.model.v20181222.QueryAuthResponse.Data.InfoDTOListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryAuthResponseUnmarshaller {

	public static QueryAuthResponse unmarshall(QueryAuthResponse queryAuthResponse, UnmarshallerContext _ctx) {
		
		queryAuthResponse.setRequestId(_ctx.stringValue("QueryAuthResponse.RequestId"));
		queryAuthResponse.setCode(_ctx.integerValue("QueryAuthResponse.Code"));
		queryAuthResponse.setSuccess(_ctx.booleanValue("QueryAuthResponse.Success"));
		queryAuthResponse.setMessage(_ctx.stringValue("QueryAuthResponse.Message"));

		Data data = new Data();
		data.setInstanceId(_ctx.stringValue("QueryAuthResponse.Data.InstanceId"));
		data.setProductCode(_ctx.stringValue("QueryAuthResponse.Data.ProductCode"));

		List<InfoDTOListItem> infoDTOList = new ArrayList<InfoDTOListItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryAuthResponse.Data.InfoDTOList.Length"); i++) {
			InfoDTOListItem infoDTOListItem = new InfoDTOListItem();
			infoDTOListItem.setItemName(_ctx.stringValue("QueryAuthResponse.Data.InfoDTOList["+ i +"].ItemName"));
			infoDTOListItem.setItemRecordVid(_ctx.stringValue("QueryAuthResponse.Data.InfoDTOList["+ i +"].ItemRecordVid"));
			infoDTOListItem.setAuthOrderVid(_ctx.stringValue("QueryAuthResponse.Data.InfoDTOList["+ i +"].AuthOrderVid"));
			infoDTOListItem.setOperateCode(_ctx.stringValue("QueryAuthResponse.Data.InfoDTOList["+ i +"].OperateCode"));

			infoDTOList.add(infoDTOListItem);
		}
		data.setInfoDTOList(infoDTOList);
		queryAuthResponse.setData(data);
	 
	 	return queryAuthResponse;
	}
}