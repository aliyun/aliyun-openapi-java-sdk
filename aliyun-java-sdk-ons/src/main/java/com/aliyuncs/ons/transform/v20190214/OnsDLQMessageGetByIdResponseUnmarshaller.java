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

	public static OnsDLQMessageGetByIdResponse unmarshall(OnsDLQMessageGetByIdResponse onsDLQMessageGetByIdResponse, UnmarshallerContext _ctx) {
		
		onsDLQMessageGetByIdResponse.setRequestId(_ctx.stringValue("OnsDLQMessageGetByIdResponse.RequestId"));
		onsDLQMessageGetByIdResponse.setHelpUrl(_ctx.stringValue("OnsDLQMessageGetByIdResponse.HelpUrl"));

		Data data = new Data();
		data.setOffsetId(_ctx.stringValue("OnsDLQMessageGetByIdResponse.Data.OffsetId"));
		data.setStoreSize(_ctx.integerValue("OnsDLQMessageGetByIdResponse.Data.StoreSize"));
		data.setReconsumeTimes(_ctx.integerValue("OnsDLQMessageGetByIdResponse.Data.ReconsumeTimes"));
		data.setStoreTimestamp(_ctx.longValue("OnsDLQMessageGetByIdResponse.Data.StoreTimestamp"));
		data.setBody(_ctx.stringValue("OnsDLQMessageGetByIdResponse.Data.Body"));
		data.setInstanceId(_ctx.stringValue("OnsDLQMessageGetByIdResponse.Data.InstanceId"));
		data.setMsgId(_ctx.stringValue("OnsDLQMessageGetByIdResponse.Data.MsgId"));
		data.setFlag(_ctx.integerValue("OnsDLQMessageGetByIdResponse.Data.Flag"));
		data.setStoreHost(_ctx.stringValue("OnsDLQMessageGetByIdResponse.Data.StoreHost"));
		data.setTopic(_ctx.stringValue("OnsDLQMessageGetByIdResponse.Data.Topic"));
		data.setBornTimestamp(_ctx.longValue("OnsDLQMessageGetByIdResponse.Data.BornTimestamp"));
		data.setBodyCRC(_ctx.integerValue("OnsDLQMessageGetByIdResponse.Data.BodyCRC"));
		data.setBornHost(_ctx.stringValue("OnsDLQMessageGetByIdResponse.Data.BornHost"));

		List<MessageProperty> propertyList = new ArrayList<MessageProperty>();
		for (int i = 0; i < _ctx.lengthValue("OnsDLQMessageGetByIdResponse.Data.PropertyList.Length"); i++) {
			MessageProperty messageProperty = new MessageProperty();
			messageProperty.setValue(_ctx.stringValue("OnsDLQMessageGetByIdResponse.Data.PropertyList["+ i +"].Value"));
			messageProperty.setName(_ctx.stringValue("OnsDLQMessageGetByIdResponse.Data.PropertyList["+ i +"].Name"));

			propertyList.add(messageProperty);
		}
		data.setPropertyList(propertyList);
		onsDLQMessageGetByIdResponse.setData(data);
	 
	 	return onsDLQMessageGetByIdResponse;
	}
}