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

import com.aliyuncs.sofa.model.v20190815.QueryMqSofamqMessageByKeyResponse;
import com.aliyuncs.sofa.model.v20190815.QueryMqSofamqMessageByKeyResponse.DataItem;
import com.aliyuncs.sofa.model.v20190815.QueryMqSofamqMessageByKeyResponse.DataItem.PropertyListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMqSofamqMessageByKeyResponseUnmarshaller {

	public static QueryMqSofamqMessageByKeyResponse unmarshall(QueryMqSofamqMessageByKeyResponse queryMqSofamqMessageByKeyResponse, UnmarshallerContext _ctx) {
		
		queryMqSofamqMessageByKeyResponse.setRequestId(_ctx.stringValue("QueryMqSofamqMessageByKeyResponse.RequestId"));
		queryMqSofamqMessageByKeyResponse.setResultCode(_ctx.stringValue("QueryMqSofamqMessageByKeyResponse.ResultCode"));
		queryMqSofamqMessageByKeyResponse.setResultMessage(_ctx.stringValue("QueryMqSofamqMessageByKeyResponse.ResultMessage"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryMqSofamqMessageByKeyResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setBody(_ctx.stringValue("QueryMqSofamqMessageByKeyResponse.Data["+ i +"].Body"));
			dataItem.setBodyCrc(_ctx.longValue("QueryMqSofamqMessageByKeyResponse.Data["+ i +"].BodyCrc"));
			dataItem.setBornHost(_ctx.stringValue("QueryMqSofamqMessageByKeyResponse.Data["+ i +"].BornHost"));
			dataItem.setBornTimestamp(_ctx.longValue("QueryMqSofamqMessageByKeyResponse.Data["+ i +"].BornTimestamp"));
			dataItem.setInstanceId(_ctx.stringValue("QueryMqSofamqMessageByKeyResponse.Data["+ i +"].InstanceId"));
			dataItem.setMsgId(_ctx.stringValue("QueryMqSofamqMessageByKeyResponse.Data["+ i +"].MsgId"));
			dataItem.setReconsumeTimes(_ctx.longValue("QueryMqSofamqMessageByKeyResponse.Data["+ i +"].ReconsumeTimes"));
			dataItem.setStoreHost(_ctx.stringValue("QueryMqSofamqMessageByKeyResponse.Data["+ i +"].StoreHost"));
			dataItem.setStoreSize(_ctx.longValue("QueryMqSofamqMessageByKeyResponse.Data["+ i +"].StoreSize"));
			dataItem.setStoreTimestamp(_ctx.longValue("QueryMqSofamqMessageByKeyResponse.Data["+ i +"].StoreTimestamp"));
			dataItem.setTopic(_ctx.stringValue("QueryMqSofamqMessageByKeyResponse.Data["+ i +"].Topic"));

			List<PropertyListItem> propertyList = new ArrayList<PropertyListItem>();
			for (int j = 0; j < _ctx.lengthValue("QueryMqSofamqMessageByKeyResponse.Data["+ i +"].PropertyList.Length"); j++) {
				PropertyListItem propertyListItem = new PropertyListItem();
				propertyListItem.setName(_ctx.stringValue("QueryMqSofamqMessageByKeyResponse.Data["+ i +"].PropertyList["+ j +"].Name"));
				propertyListItem.setValue(_ctx.stringValue("QueryMqSofamqMessageByKeyResponse.Data["+ i +"].PropertyList["+ j +"].Value"));

				propertyList.add(propertyListItem);
			}
			dataItem.setPropertyList(propertyList);

			data.add(dataItem);
		}
		queryMqSofamqMessageByKeyResponse.setData(data);
	 
	 	return queryMqSofamqMessageByKeyResponse;
	}
}