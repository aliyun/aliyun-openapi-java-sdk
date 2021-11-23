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

package com.aliyuncs.ons.transform.v20190214;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ons.model.v20190214.OnsMessageGetByMsgIdResponse;
import com.aliyuncs.ons.model.v20190214.OnsMessageGetByMsgIdResponse.Data;
import com.aliyuncs.ons.model.v20190214.OnsMessageGetByMsgIdResponse.Data.MessageProperty;
import com.aliyuncs.transform.UnmarshallerContext;


public class OnsMessageGetByMsgIdResponseUnmarshaller {

	public static OnsMessageGetByMsgIdResponse unmarshall(OnsMessageGetByMsgIdResponse onsMessageGetByMsgIdResponse, UnmarshallerContext _ctx) {
		
		onsMessageGetByMsgIdResponse.setRequestId(_ctx.stringValue("OnsMessageGetByMsgIdResponse.RequestId"));
		onsMessageGetByMsgIdResponse.setHelpUrl(_ctx.stringValue("OnsMessageGetByMsgIdResponse.HelpUrl"));

		Data data = new Data();
		data.setOffsetId(_ctx.stringValue("OnsMessageGetByMsgIdResponse.Data.OffsetId"));
		data.setStoreSize(_ctx.integerValue("OnsMessageGetByMsgIdResponse.Data.StoreSize"));
		data.setReconsumeTimes(_ctx.integerValue("OnsMessageGetByMsgIdResponse.Data.ReconsumeTimes"));
		data.setStoreTimestamp(_ctx.longValue("OnsMessageGetByMsgIdResponse.Data.StoreTimestamp"));
		data.setBody(_ctx.stringValue("OnsMessageGetByMsgIdResponse.Data.Body"));
		data.setInstanceId(_ctx.stringValue("OnsMessageGetByMsgIdResponse.Data.InstanceId"));
		data.setMsgId(_ctx.stringValue("OnsMessageGetByMsgIdResponse.Data.MsgId"));
		data.setFlag(_ctx.integerValue("OnsMessageGetByMsgIdResponse.Data.Flag"));
		data.setStoreHost(_ctx.stringValue("OnsMessageGetByMsgIdResponse.Data.StoreHost"));
		data.setTopic(_ctx.stringValue("OnsMessageGetByMsgIdResponse.Data.Topic"));
		data.setBornTimestamp(_ctx.longValue("OnsMessageGetByMsgIdResponse.Data.BornTimestamp"));
		data.setBodyCRC(_ctx.integerValue("OnsMessageGetByMsgIdResponse.Data.BodyCRC"));
		data.setBornHost(_ctx.stringValue("OnsMessageGetByMsgIdResponse.Data.BornHost"));

		List<MessageProperty> propertyList = new ArrayList<MessageProperty>();
		for (int i = 0; i < _ctx.lengthValue("OnsMessageGetByMsgIdResponse.Data.PropertyList.Length"); i++) {
			MessageProperty messageProperty = new MessageProperty();
			messageProperty.setValue(_ctx.stringValue("OnsMessageGetByMsgIdResponse.Data.PropertyList["+ i +"].Value"));
			messageProperty.setName(_ctx.stringValue("OnsMessageGetByMsgIdResponse.Data.PropertyList["+ i +"].Name"));

			propertyList.add(messageProperty);
		}
		data.setPropertyList(propertyList);
		onsMessageGetByMsgIdResponse.setData(data);
	 
	 	return onsMessageGetByMsgIdResponse;
	}
}