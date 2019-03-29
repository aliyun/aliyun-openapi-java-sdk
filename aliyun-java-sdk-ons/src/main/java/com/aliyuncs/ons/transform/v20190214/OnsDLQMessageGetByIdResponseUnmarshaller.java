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

import com.aliyuncs.ons.model.v20190214.OnsDLQMessageGetByIdResponse;
import com.aliyuncs.ons.model.v20190214.OnsDLQMessageGetByIdResponse.Data;
import com.aliyuncs.ons.model.v20190214.OnsDLQMessageGetByIdResponse.Data.MessageProperty;
import com.aliyuncs.transform.UnmarshallerContext;


public class OnsDLQMessageGetByIdResponseUnmarshaller {

	public static OnsDLQMessageGetByIdResponse unmarshall(OnsDLQMessageGetByIdResponse onsDLQMessageGetByIdResponse, UnmarshallerContext context) {
		
		onsDLQMessageGetByIdResponse.setRequestId(context.stringValue("OnsDLQMessageGetByIdResponse.RequestId"));
		onsDLQMessageGetByIdResponse.setHelpUrl(context.stringValue("OnsDLQMessageGetByIdResponse.HelpUrl"));

		Data data = new Data();
		data.setTopic(context.stringValue("OnsDLQMessageGetByIdResponse.Data.Topic"));
		data.setFlag(context.integerValue("OnsDLQMessageGetByIdResponse.Data.Flag"));
		data.setBody(context.stringValue("OnsDLQMessageGetByIdResponse.Data.Body"));
		data.setStoreSize(context.integerValue("OnsDLQMessageGetByIdResponse.Data.StoreSize"));
		data.setBornTimestamp(context.longValue("OnsDLQMessageGetByIdResponse.Data.BornTimestamp"));
		data.setBornHost(context.stringValue("OnsDLQMessageGetByIdResponse.Data.BornHost"));
		data.setStoreTimestamp(context.longValue("OnsDLQMessageGetByIdResponse.Data.StoreTimestamp"));
		data.setStoreHost(context.stringValue("OnsDLQMessageGetByIdResponse.Data.StoreHost"));
		data.setMsgId(context.stringValue("OnsDLQMessageGetByIdResponse.Data.MsgId"));
		data.setOffsetId(context.stringValue("OnsDLQMessageGetByIdResponse.Data.OffsetId"));
		data.setBodyCRC(context.integerValue("OnsDLQMessageGetByIdResponse.Data.BodyCRC"));
		data.setReconsumeTimes(context.integerValue("OnsDLQMessageGetByIdResponse.Data.ReconsumeTimes"));
		data.setInstanceId(context.stringValue("OnsDLQMessageGetByIdResponse.Data.InstanceId"));

		List<MessageProperty> propertyList = new ArrayList<MessageProperty>();
		for (int i = 0; i < context.lengthValue("OnsDLQMessageGetByIdResponse.Data.PropertyList.Length"); i++) {
			MessageProperty messageProperty = new MessageProperty();
			messageProperty.setName(context.stringValue("OnsDLQMessageGetByIdResponse.Data.PropertyList["+ i +"].Name"));
			messageProperty.setValue(context.stringValue("OnsDLQMessageGetByIdResponse.Data.PropertyList["+ i +"].Value"));

			propertyList.add(messageProperty);
		}
		data.setPropertyList(propertyList);
		onsDLQMessageGetByIdResponse.setData(data);
	 
	 	return onsDLQMessageGetByIdResponse;
	}
}