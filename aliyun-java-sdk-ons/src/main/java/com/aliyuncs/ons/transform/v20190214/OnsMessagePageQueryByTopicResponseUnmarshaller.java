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

	public static OnsMessagePageQueryByTopicResponse unmarshall(OnsMessagePageQueryByTopicResponse onsMessagePageQueryByTopicResponse, UnmarshallerContext _ctx) {
		
		onsMessagePageQueryByTopicResponse.setRequestId(_ctx.stringValue("OnsMessagePageQueryByTopicResponse.RequestId"));
		onsMessagePageQueryByTopicResponse.setHelpUrl(_ctx.stringValue("OnsMessagePageQueryByTopicResponse.HelpUrl"));

		MsgFoundDo msgFoundDo = new MsgFoundDo();
		msgFoundDo.setTaskId(_ctx.stringValue("OnsMessagePageQueryByTopicResponse.MsgFoundDo.TaskId"));
		msgFoundDo.setMaxPageCount(_ctx.longValue("OnsMessagePageQueryByTopicResponse.MsgFoundDo.MaxPageCount"));
		msgFoundDo.setCurrentPage(_ctx.longValue("OnsMessagePageQueryByTopicResponse.MsgFoundDo.CurrentPage"));

		List<OnsRestMessageDo> msgFoundList = new ArrayList<OnsRestMessageDo>();
		for (int i = 0; i < _ctx.lengthValue("OnsMessagePageQueryByTopicResponse.MsgFoundDo.MsgFoundList.Length"); i++) {
			OnsRestMessageDo onsRestMessageDo = new OnsRestMessageDo();
			onsRestMessageDo.setTopic(_ctx.stringValue("OnsMessagePageQueryByTopicResponse.MsgFoundDo.MsgFoundList["+ i +"].Topic"));
			onsRestMessageDo.setFlag(_ctx.integerValue("OnsMessagePageQueryByTopicResponse.MsgFoundDo.MsgFoundList["+ i +"].Flag"));
			onsRestMessageDo.setBody(_ctx.stringValue("OnsMessagePageQueryByTopicResponse.MsgFoundDo.MsgFoundList["+ i +"].Body"));
			onsRestMessageDo.setStoreSize(_ctx.integerValue("OnsMessagePageQueryByTopicResponse.MsgFoundDo.MsgFoundList["+ i +"].StoreSize"));
			onsRestMessageDo.setBornTimestamp(_ctx.longValue("OnsMessagePageQueryByTopicResponse.MsgFoundDo.MsgFoundList["+ i +"].BornTimestamp"));
			onsRestMessageDo.setBornHost(_ctx.stringValue("OnsMessagePageQueryByTopicResponse.MsgFoundDo.MsgFoundList["+ i +"].BornHost"));
			onsRestMessageDo.setStoreTimestamp(_ctx.longValue("OnsMessagePageQueryByTopicResponse.MsgFoundDo.MsgFoundList["+ i +"].StoreTimestamp"));
			onsRestMessageDo.setStoreHost(_ctx.stringValue("OnsMessagePageQueryByTopicResponse.MsgFoundDo.MsgFoundList["+ i +"].StoreHost"));
			onsRestMessageDo.setMsgId(_ctx.stringValue("OnsMessagePageQueryByTopicResponse.MsgFoundDo.MsgFoundList["+ i +"].MsgId"));
			onsRestMessageDo.setOffsetId(_ctx.stringValue("OnsMessagePageQueryByTopicResponse.MsgFoundDo.MsgFoundList["+ i +"].OffsetId"));
			onsRestMessageDo.setBodyCRC(_ctx.integerValue("OnsMessagePageQueryByTopicResponse.MsgFoundDo.MsgFoundList["+ i +"].BodyCRC"));
			onsRestMessageDo.setReconsumeTimes(_ctx.integerValue("OnsMessagePageQueryByTopicResponse.MsgFoundDo.MsgFoundList["+ i +"].ReconsumeTimes"));
			onsRestMessageDo.setInstanceId(_ctx.stringValue("OnsMessagePageQueryByTopicResponse.MsgFoundDo.MsgFoundList["+ i +"].InstanceId"));

			List<MessageProperty> propertyList = new ArrayList<MessageProperty>();
			for (int j = 0; j < _ctx.lengthValue("OnsMessagePageQueryByTopicResponse.MsgFoundDo.MsgFoundList["+ i +"].PropertyList.Length"); j++) {
				MessageProperty messageProperty = new MessageProperty();
				messageProperty.setName(_ctx.stringValue("OnsMessagePageQueryByTopicResponse.MsgFoundDo.MsgFoundList["+ i +"].PropertyList["+ j +"].Name"));
				messageProperty.setValue(_ctx.stringValue("OnsMessagePageQueryByTopicResponse.MsgFoundDo.MsgFoundList["+ i +"].PropertyList["+ j +"].Value"));

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