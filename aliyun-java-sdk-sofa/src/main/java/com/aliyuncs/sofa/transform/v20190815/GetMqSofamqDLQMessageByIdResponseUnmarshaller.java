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

import com.aliyuncs.sofa.model.v20190815.GetMqSofamqDLQMessageByIdResponse;
import com.aliyuncs.sofa.model.v20190815.GetMqSofamqDLQMessageByIdResponse.Data;
import com.aliyuncs.sofa.model.v20190815.GetMqSofamqDLQMessageByIdResponse.Data.PropertyListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMqSofamqDLQMessageByIdResponseUnmarshaller {

	public static GetMqSofamqDLQMessageByIdResponse unmarshall(GetMqSofamqDLQMessageByIdResponse getMqSofamqDLQMessageByIdResponse, UnmarshallerContext _ctx) {
		
		getMqSofamqDLQMessageByIdResponse.setRequestId(_ctx.stringValue("GetMqSofamqDLQMessageByIdResponse.RequestId"));
		getMqSofamqDLQMessageByIdResponse.setResultCode(_ctx.stringValue("GetMqSofamqDLQMessageByIdResponse.ResultCode"));
		getMqSofamqDLQMessageByIdResponse.setResultMessage(_ctx.stringValue("GetMqSofamqDLQMessageByIdResponse.ResultMessage"));

		Data data = new Data();
		data.setBody(_ctx.stringValue("GetMqSofamqDLQMessageByIdResponse.Data.Body"));
		data.setBodyCrc(_ctx.longValue("GetMqSofamqDLQMessageByIdResponse.Data.BodyCrc"));
		data.setBornHost(_ctx.stringValue("GetMqSofamqDLQMessageByIdResponse.Data.BornHost"));
		data.setBornTimestamp(_ctx.longValue("GetMqSofamqDLQMessageByIdResponse.Data.BornTimestamp"));
		data.setInstanceId(_ctx.stringValue("GetMqSofamqDLQMessageByIdResponse.Data.InstanceId"));
		data.setMsgId(_ctx.stringValue("GetMqSofamqDLQMessageByIdResponse.Data.MsgId"));
		data.setReconsumeTimes(_ctx.longValue("GetMqSofamqDLQMessageByIdResponse.Data.ReconsumeTimes"));
		data.setStoreHost(_ctx.stringValue("GetMqSofamqDLQMessageByIdResponse.Data.StoreHost"));
		data.setStoreSize(_ctx.longValue("GetMqSofamqDLQMessageByIdResponse.Data.StoreSize"));
		data.setStoreTimestamp(_ctx.longValue("GetMqSofamqDLQMessageByIdResponse.Data.StoreTimestamp"));
		data.setTopic(_ctx.stringValue("GetMqSofamqDLQMessageByIdResponse.Data.Topic"));

		List<PropertyListItem> propertyList = new ArrayList<PropertyListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetMqSofamqDLQMessageByIdResponse.Data.PropertyList.Length"); i++) {
			PropertyListItem propertyListItem = new PropertyListItem();
			propertyListItem.setName(_ctx.stringValue("GetMqSofamqDLQMessageByIdResponse.Data.PropertyList["+ i +"].Name"));
			propertyListItem.setValue(_ctx.stringValue("GetMqSofamqDLQMessageByIdResponse.Data.PropertyList["+ i +"].Value"));

			propertyList.add(propertyListItem);
		}
		data.setPropertyList(propertyList);
		getMqSofamqDLQMessageByIdResponse.setData(data);
	 
	 	return getMqSofamqDLQMessageByIdResponse;
	}
}