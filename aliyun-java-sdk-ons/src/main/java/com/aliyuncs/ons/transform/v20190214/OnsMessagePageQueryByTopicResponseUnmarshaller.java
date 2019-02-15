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

import com.aliyuncs.ons.model.v20190214.OnsMessagePageQueryByTopicResponse;
import com.aliyuncs.ons.model.v20190214.OnsMessagePageQueryByTopicResponse.MsgFoundDo;
import com.aliyuncs.ons.model.v20190214.OnsMessagePageQueryByTopicResponse.MsgFoundDo.OnsRestMessageDo;
import com.aliyuncs.ons.model.v20190214.OnsMessagePageQueryByTopicResponse.MsgFoundDo.OnsRestMessageDo.MessageProperty;
import com.aliyuncs.transform.UnmarshallerContext;


public class OnsMessagePageQueryByTopicResponseUnmarshaller {

	public static OnsMessagePageQueryByTopicResponse unmarshall(OnsMessagePageQueryByTopicResponse onsMessagePageQueryByTopicResponse, UnmarshallerContext context) {
		
		onsMessagePageQueryByTopicResponse.setRequestId(context.stringValue("OnsMessagePageQueryByTopicResponse.RequestId"));
		onsMessagePageQueryByTopicResponse.setHelpUrl(context.stringValue("OnsMessagePageQueryByTopicResponse.HelpUrl"));

		MsgFoundDo msgFoundDo = new MsgFoundDo();
		msgFoundDo.setTaskId(context.stringValue("OnsMessagePageQueryByTopicResponse.MsgFoundDo.TaskId"));
		msgFoundDo.setMaxPageCount(context.longValue("OnsMessagePageQueryByTopicResponse.MsgFoundDo.MaxPageCount"));
		msgFoundDo.setCurrentPage(context.longValue("OnsMessagePageQueryByTopicResponse.MsgFoundDo.CurrentPage"));

		List<OnsRestMessageDo> msgFoundList = new ArrayList<OnsRestMessageDo>();
		for (int i = 0; i < context.lengthValue("OnsMessagePageQueryByTopicResponse.MsgFoundDo.MsgFoundList.Length"); i++) {
			OnsRestMessageDo onsRestMessageDo = new OnsRestMessageDo();
			onsRestMessageDo.setTopic(context.stringValue("OnsMessagePageQueryByTopicResponse.MsgFoundDo.MsgFoundList["+ i +"].Topic"));
			onsRestMessageDo.setFlag(context.integerValue("OnsMessagePageQueryByTopicResponse.MsgFoundDo.MsgFoundList["+ i +"].Flag"));
			onsRestMessageDo.setBody(context.stringValue("OnsMessagePageQueryByTopicResponse.MsgFoundDo.MsgFoundList["+ i +"].Body"));
			onsRestMessageDo.setStoreSize(context.integerValue("OnsMessagePageQueryByTopicResponse.MsgFoundDo.MsgFoundList["+ i +"].StoreSize"));
			onsRestMessageDo.setBornTimestamp(context.longValue("OnsMessagePageQueryByTopicResponse.MsgFoundDo.MsgFoundList["+ i +"].BornTimestamp"));
			onsRestMessageDo.setBornHost(context.stringValue("OnsMessagePageQueryByTopicResponse.MsgFoundDo.MsgFoundList["+ i +"].BornHost"));
			onsRestMessageDo.setStoreTimestamp(context.longValue("OnsMessagePageQueryByTopicResponse.MsgFoundDo.MsgFoundList["+ i +"].StoreTimestamp"));
			onsRestMessageDo.setStoreHost(context.stringValue("OnsMessagePageQueryByTopicResponse.MsgFoundDo.MsgFoundList["+ i +"].StoreHost"));
			onsRestMessageDo.setMsgId(context.stringValue("OnsMessagePageQueryByTopicResponse.MsgFoundDo.MsgFoundList["+ i +"].MsgId"));
			onsRestMessageDo.setOffsetId(context.stringValue("OnsMessagePageQueryByTopicResponse.MsgFoundDo.MsgFoundList["+ i +"].OffsetId"));
			onsRestMessageDo.setBodyCRC(context.integerValue("OnsMessagePageQueryByTopicResponse.MsgFoundDo.MsgFoundList["+ i +"].BodyCRC"));
			onsRestMessageDo.setReconsumeTimes(context.integerValue("OnsMessagePageQueryByTopicResponse.MsgFoundDo.MsgFoundList["+ i +"].ReconsumeTimes"));
			onsRestMessageDo.setInstanceId(context.stringValue("OnsMessagePageQueryByTopicResponse.MsgFoundDo.MsgFoundList["+ i +"].InstanceId"));

			List<MessageProperty> propertyList = new ArrayList<MessageProperty>();
			for (int j = 0; j < context.lengthValue("OnsMessagePageQueryByTopicResponse.MsgFoundDo.MsgFoundList["+ i +"].PropertyList.Length"); j++) {
				MessageProperty messageProperty = new MessageProperty();
				messageProperty.setName(context.stringValue("OnsMessagePageQueryByTopicResponse.MsgFoundDo.MsgFoundList["+ i +"].PropertyList["+ j +"].Name"));
				messageProperty.setValue(context.stringValue("OnsMessagePageQueryByTopicResponse.MsgFoundDo.MsgFoundList["+ i +"].PropertyList["+ j +"].Value"));

				propertyList.add(messageProperty);
			}
			onsRestMessageDo.setPropertyList(propertyList);

			msgFoundList.add(onsRestMessageDo);
		}
		msgFoundDo.setMsgFoundList(msgFoundList);
		onsMessagePageQueryByTopicResponse.setMsgFoundDo(msgFoundDo);
	 
	 	return onsMessagePageQueryByTopicResponse;
	}
}