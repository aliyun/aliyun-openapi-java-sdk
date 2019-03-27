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

import com.aliyuncs.ons.model.v20190214.OnsDLQMessagePageQueryByGroupIdResponse;
import com.aliyuncs.ons.model.v20190214.OnsDLQMessagePageQueryByGroupIdResponse.MsgFoundDo;
import com.aliyuncs.ons.model.v20190214.OnsDLQMessagePageQueryByGroupIdResponse.MsgFoundDo.OnsRestMessageDo;
import com.aliyuncs.ons.model.v20190214.OnsDLQMessagePageQueryByGroupIdResponse.MsgFoundDo.OnsRestMessageDo.MessageProperty;
import com.aliyuncs.transform.UnmarshallerContext;


public class OnsDLQMessagePageQueryByGroupIdResponseUnmarshaller {

	public static OnsDLQMessagePageQueryByGroupIdResponse unmarshall(OnsDLQMessagePageQueryByGroupIdResponse onsDLQMessagePageQueryByGroupIdResponse, UnmarshallerContext context) {
		
		onsDLQMessagePageQueryByGroupIdResponse.setRequestId(context.stringValue("OnsDLQMessagePageQueryByGroupIdResponse.RequestId"));
		onsDLQMessagePageQueryByGroupIdResponse.setHelpUrl(context.stringValue("OnsDLQMessagePageQueryByGroupIdResponse.HelpUrl"));

		MsgFoundDo msgFoundDo = new MsgFoundDo();
		msgFoundDo.setTaskId(context.stringValue("OnsDLQMessagePageQueryByGroupIdResponse.MsgFoundDo.TaskId"));
		msgFoundDo.setMaxPageCount(context.longValue("OnsDLQMessagePageQueryByGroupIdResponse.MsgFoundDo.MaxPageCount"));
		msgFoundDo.setCurrentPage(context.longValue("OnsDLQMessagePageQueryByGroupIdResponse.MsgFoundDo.CurrentPage"));

		List<OnsRestMessageDo> msgFoundList = new ArrayList<OnsRestMessageDo>();
		for (int i = 0; i < context.lengthValue("OnsDLQMessagePageQueryByGroupIdResponse.MsgFoundDo.MsgFoundList.Length"); i++) {
			OnsRestMessageDo onsRestMessageDo = new OnsRestMessageDo();
			onsRestMessageDo.setTopic(context.stringValue("OnsDLQMessagePageQueryByGroupIdResponse.MsgFoundDo.MsgFoundList["+ i +"].Topic"));
			onsRestMessageDo.setFlag(context.integerValue("OnsDLQMessagePageQueryByGroupIdResponse.MsgFoundDo.MsgFoundList["+ i +"].Flag"));
			onsRestMessageDo.setBody(context.stringValue("OnsDLQMessagePageQueryByGroupIdResponse.MsgFoundDo.MsgFoundList["+ i +"].Body"));
			onsRestMessageDo.setStoreSize(context.integerValue("OnsDLQMessagePageQueryByGroupIdResponse.MsgFoundDo.MsgFoundList["+ i +"].StoreSize"));
			onsRestMessageDo.setBornTimestamp(context.longValue("OnsDLQMessagePageQueryByGroupIdResponse.MsgFoundDo.MsgFoundList["+ i +"].BornTimestamp"));
			onsRestMessageDo.setBornHost(context.stringValue("OnsDLQMessagePageQueryByGroupIdResponse.MsgFoundDo.MsgFoundList["+ i +"].BornHost"));
			onsRestMessageDo.setStoreTimestamp(context.longValue("OnsDLQMessagePageQueryByGroupIdResponse.MsgFoundDo.MsgFoundList["+ i +"].StoreTimestamp"));
			onsRestMessageDo.setStoreHost(context.stringValue("OnsDLQMessagePageQueryByGroupIdResponse.MsgFoundDo.MsgFoundList["+ i +"].StoreHost"));
			onsRestMessageDo.setMsgId(context.stringValue("OnsDLQMessagePageQueryByGroupIdResponse.MsgFoundDo.MsgFoundList["+ i +"].MsgId"));
			onsRestMessageDo.setOffsetId(context.stringValue("OnsDLQMessagePageQueryByGroupIdResponse.MsgFoundDo.MsgFoundList["+ i +"].OffsetId"));
			onsRestMessageDo.setBodyCRC(context.integerValue("OnsDLQMessagePageQueryByGroupIdResponse.MsgFoundDo.MsgFoundList["+ i +"].BodyCRC"));
			onsRestMessageDo.setReconsumeTimes(context.integerValue("OnsDLQMessagePageQueryByGroupIdResponse.MsgFoundDo.MsgFoundList["+ i +"].ReconsumeTimes"));
			onsRestMessageDo.setInstanceId(context.stringValue("OnsDLQMessagePageQueryByGroupIdResponse.MsgFoundDo.MsgFoundList["+ i +"].InstanceId"));

			List<MessageProperty> propertyList = new ArrayList<MessageProperty>();
			for (int j = 0; j < context.lengthValue("OnsDLQMessagePageQueryByGroupIdResponse.MsgFoundDo.MsgFoundList["+ i +"].PropertyList.Length"); j++) {
				MessageProperty messageProperty = new MessageProperty();
				messageProperty.setName(context.stringValue("OnsDLQMessagePageQueryByGroupIdResponse.MsgFoundDo.MsgFoundList["+ i +"].PropertyList["+ j +"].Name"));
				messageProperty.setValue(context.stringValue("OnsDLQMessagePageQueryByGroupIdResponse.MsgFoundDo.MsgFoundList["+ i +"].PropertyList["+ j +"].Value"));

				propertyList.add(messageProperty);
			}
			onsRestMessageDo.setPropertyList(propertyList);

			msgFoundList.add(onsRestMessageDo);
		}
		msgFoundDo.setMsgFoundList(msgFoundList);
		onsDLQMessagePageQueryByGroupIdResponse.setMsgFoundDo(msgFoundDo);
	 
	 	return onsDLQMessagePageQueryByGroupIdResponse;
	}
}