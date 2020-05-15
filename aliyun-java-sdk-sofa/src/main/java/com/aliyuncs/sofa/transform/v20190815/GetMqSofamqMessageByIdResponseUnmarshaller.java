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

import com.aliyuncs.sofa.model.v20190815.GetMqSofamqMessageByIdResponse;
import com.aliyuncs.sofa.model.v20190815.GetMqSofamqMessageByIdResponse.Data;
import com.aliyuncs.sofa.model.v20190815.GetMqSofamqMessageByIdResponse.Data.PropertyListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMqSofamqMessageByIdResponseUnmarshaller {

	public static GetMqSofamqMessageByIdResponse unmarshall(GetMqSofamqMessageByIdResponse getMqSofamqMessageByIdResponse, UnmarshallerContext _ctx) {
		
		getMqSofamqMessageByIdResponse.setRequestId(_ctx.stringValue("GetMqSofamqMessageByIdResponse.RequestId"));
		getMqSofamqMessageByIdResponse.setResultCode(_ctx.stringValue("GetMqSofamqMessageByIdResponse.ResultCode"));
		getMqSofamqMessageByIdResponse.setResultMessage(_ctx.stringValue("GetMqSofamqMessageByIdResponse.ResultMessage"));

		Data data = new Data();
		data.setBody(_ctx.stringValue("GetMqSofamqMessageByIdResponse.Data.Body"));
		data.setBodyCrc(_ctx.longValue("GetMqSofamqMessageByIdResponse.Data.BodyCrc"));
		data.setBornHost(_ctx.stringValue("GetMqSofamqMessageByIdResponse.Data.BornHost"));
		data.setBornTimestamp(_ctx.longValue("GetMqSofamqMessageByIdResponse.Data.BornTimestamp"));
		data.setInstanceId(_ctx.stringValue("GetMqSofamqMessageByIdResponse.Data.InstanceId"));
		data.setMsgId(_ctx.stringValue("GetMqSofamqMessageByIdResponse.Data.MsgId"));
		data.setReconsumeTimes(_ctx.longValue("GetMqSofamqMessageByIdResponse.Data.ReconsumeTimes"));
		data.setStoreHost(_ctx.stringValue("GetMqSofamqMessageByIdResponse.Data.StoreHost"));
		data.setStoreSize(_ctx.longValue("GetMqSofamqMessageByIdResponse.Data.StoreSize"));
		data.setStoreTimestamp(_ctx.longValue("GetMqSofamqMessageByIdResponse.Data.StoreTimestamp"));
		data.setTopic(_ctx.stringValue("GetMqSofamqMessageByIdResponse.Data.Topic"));

		List<PropertyListItem> propertyList = new ArrayList<PropertyListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetMqSofamqMessageByIdResponse.Data.PropertyList.Length"); i++) {
			PropertyListItem propertyListItem = new PropertyListItem();
			propertyListItem.setName(_ctx.stringValue("GetMqSofamqMessageByIdResponse.Data.PropertyList["+ i +"].Name"));
			propertyListItem.setValue(_ctx.stringValue("GetMqSofamqMessageByIdResponse.Data.PropertyList["+ i +"].Value"));

			propertyList.add(propertyListItem);
		}
		data.setPropertyList(propertyList);
		getMqSofamqMessageByIdResponse.setData(data);
	 
	 	return getMqSofamqMessageByIdResponse;
	}
}