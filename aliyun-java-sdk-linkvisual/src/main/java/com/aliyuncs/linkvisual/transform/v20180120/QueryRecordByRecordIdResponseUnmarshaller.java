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

package com.aliyuncs.linkvisual.transform.v20180120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.linkvisual.model.v20180120.QueryRecordByRecordIdResponse;
import com.aliyuncs.linkvisual.model.v20180120.QueryRecordByRecordIdResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryRecordByRecordIdResponseUnmarshaller {

	public static QueryRecordByRecordIdResponse unmarshall(QueryRecordByRecordIdResponse queryRecordByRecordIdResponse, UnmarshallerContext _ctx) {
		
		queryRecordByRecordIdResponse.setRequestId(_ctx.stringValue("QueryRecordByRecordIdResponse.RequestId"));
		queryRecordByRecordIdResponse.setSuccess(_ctx.booleanValue("QueryRecordByRecordIdResponse.Success"));
		queryRecordByRecordIdResponse.setErrorMessage(_ctx.stringValue("QueryRecordByRecordIdResponse.ErrorMessage"));
		queryRecordByRecordIdResponse.setCode(_ctx.stringValue("QueryRecordByRecordIdResponse.Code"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryRecordByRecordIdResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setFileName(_ctx.stringValue("QueryRecordByRecordIdResponse.Data["+ i +"].FileName"));
			dataItem.setVodUrl(_ctx.stringValue("QueryRecordByRecordIdResponse.Data["+ i +"].VodUrl"));
			dataItem.setBeginTime(_ctx.stringValue("QueryRecordByRecordIdResponse.Data["+ i +"].BeginTime"));
			dataItem.setEndTime(_ctx.stringValue("QueryRecordByRecordIdResponse.Data["+ i +"].EndTime"));

			data.add(dataItem);
		}
		queryRecordByRecordIdResponse.setData(data);
	 
	 	return queryRecordByRecordIdResponse;
	}
}