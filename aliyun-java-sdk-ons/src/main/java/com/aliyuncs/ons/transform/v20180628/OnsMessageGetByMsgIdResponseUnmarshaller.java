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

package com.aliyuncs.ons.transform.v20180628;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ons.model.v20180628.OnsMessageGetByMsgIdResponse;
import com.aliyuncs.ons.model.v20180628.OnsMessageGetByMsgIdResponse.Data;
import com.aliyuncs.ons.model.v20180628.OnsMessageGetByMsgIdResponse.Data.MessageProperty;
import com.aliyuncs.transform.UnmarshallerContext;


public class OnsMessageGetByMsgIdResponseUnmarshaller {

	public static OnsMessageGetByMsgIdResponse unmarshall(OnsMessageGetByMsgIdResponse onsMessageGetByMsgIdResponse, UnmarshallerContext context) {
		
		onsMessageGetByMsgIdResponse.setRequestId(context.stringValue("OnsMessageGetByMsgIdResponse.RequestId"));
		onsMessageGetByMsgIdResponse.setHelpUrl(context.stringValue("OnsMessageGetByMsgIdResponse.HelpUrl"));

		Data data = new Data();
		data.setTopic(context.stringValue("OnsMessageGetByMsgIdResponse.Data.Topic"));
		data.setFlag(context.integerValue("OnsMessageGetByMsgIdResponse.Data.Flag"));
		data.setBody(context.stringValue("OnsMessageGetByMsgIdResponse.Data.Body"));
		data.setStoreSize(context.integerValue("OnsMessageGetByMsgIdResponse.Data.StoreSize"));
		data.setBornTimestamp(context.longValue("OnsMessageGetByMsgIdResponse.Data.BornTimestamp"));
		data.setBornHost(context.stringValue("OnsMessageGetByMsgIdResponse.Data.BornHost"));
		data.setStoreTimestamp(context.longValue("OnsMessageGetByMsgIdResponse.Data.StoreTimestamp"));
		data.setStoreHost(context.stringValue("OnsMessageGetByMsgIdResponse.Data.StoreHost"));
		data.setMsgId(context.stringValue("OnsMessageGetByMsgIdResponse.Data.MsgId"));
		data.setOffsetId(context.stringValue("OnsMessageGetByMsgIdResponse.Data.OffsetId"));
		data.setBodyCRC(context.integerValue("OnsMessageGetByMsgIdResponse.Data.BodyCRC"));
		data.setReconsumeTimes(context.integerValue("OnsMessageGetByMsgIdResponse.Data.ReconsumeTimes"));
		data.setInstanceId(context.stringValue("OnsMessageGetByMsgIdResponse.Data.InstanceId"));

		List<MessageProperty> propertyList = new ArrayList<MessageProperty>();
		for (int i = 0; i < context.lengthValue("OnsMessageGetByMsgIdResponse.Data.PropertyList.Length"); i++) {
			MessageProperty messageProperty = new MessageProperty();
			messageProperty.setName(context.stringValue("OnsMessageGetByMsgIdResponse.Data.PropertyList["+ i +"].Name"));
			messageProperty.setValue(context.stringValue("OnsMessageGetByMsgIdResponse.Data.PropertyList["+ i +"].Value"));

			propertyList.add(messageProperty);
		}
		data.setPropertyList(propertyList);
		onsMessageGetByMsgIdResponse.setData(data);
	 
	 	return onsMessageGetByMsgIdResponse;
	}
}