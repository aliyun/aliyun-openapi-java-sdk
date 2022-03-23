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

package com.aliyuncs.copyright.transform.v20190123;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.copyright.model.v20190123.QuerySupplementInfoListResponse;
import com.aliyuncs.copyright.model.v20190123.QuerySupplementInfoListResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QuerySupplementInfoListResponseUnmarshaller {

	public static QuerySupplementInfoListResponse unmarshall(QuerySupplementInfoListResponse querySupplementInfoListResponse, UnmarshallerContext _ctx) {
		
		querySupplementInfoListResponse.setRequestId(_ctx.stringValue("QuerySupplementInfoListResponse.RequestId"));
		querySupplementInfoListResponse.setSuccess(_ctx.booleanValue("QuerySupplementInfoListResponse.Success"));
		querySupplementInfoListResponse.setMessage(_ctx.stringValue("QuerySupplementInfoListResponse.Message"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QuerySupplementInfoListResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setBizId(_ctx.stringValue("QuerySupplementInfoListResponse.Data["+ i +"].BizId"));
			dataItem.setSupplementId(_ctx.stringValue("QuerySupplementInfoListResponse.Data["+ i +"].SupplementId"));
			dataItem.setSupplementReason(_ctx.stringValue("QuerySupplementInfoListResponse.Data["+ i +"].SupplementReason"));
			dataItem.setReceiveTimestamp(_ctx.longValue("QuerySupplementInfoListResponse.Data["+ i +"].ReceiveTimestamp"));
			dataItem.setSupplementFields(_ctx.stringValue("QuerySupplementInfoListResponse.Data["+ i +"].SupplementFields"));
			dataItem.setSupplementType(_ctx.stringValue("QuerySupplementInfoListResponse.Data["+ i +"].SupplementType"));
			dataItem.setSupplementFileUrl(_ctx.stringValue("QuerySupplementInfoListResponse.Data["+ i +"].SupplementFileUrl"));
			dataItem.setAdditionalReason(_ctx.stringValue("QuerySupplementInfoListResponse.Data["+ i +"].AdditionalReason"));

			data.add(dataItem);
		}
		querySupplementInfoListResponse.setData(data);
	 
	 	return querySupplementInfoListResponse;
	}
}