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

import com.aliyuncs.ons.model.v20190214.OnsMessageGetByKeyResponse;
import com.aliyuncs.ons.model.v20190214.OnsMessageGetByKeyResponse.OnsRestMessageDo;
import com.aliyuncs.ons.model.v20190214.OnsMessageGetByKeyResponse.OnsRestMessageDo.MessageProperty;
import com.aliyuncs.transform.UnmarshallerContext;


public class OnsMessageGetByKeyResponseUnmarshaller {

	public static OnsMessageGetByKeyResponse unmarshall(OnsMessageGetByKeyResponse onsMessageGetByKeyResponse, UnmarshallerContext _ctx) {
		
		onsMessageGetByKeyResponse.setRequestId(_ctx.stringValue("OnsMessageGetByKeyResponse.RequestId"));
		onsMessageGetByKeyResponse.setHelpUrl(_ctx.stringValue("OnsMessageGetByKeyResponse.HelpUrl"));

		List<OnsRestMessageDo> data = new ArrayList<OnsRestMessageDo>();
		for (int i = 0; i < _ctx.lengthValue("OnsMessageGetByKeyResponse.Data.Length"); i++) {
			OnsRestMessageDo onsRestMessageDo = new OnsRestMessageDo();
			onsRestMessageDo.setTopic(_ctx.stringValue("OnsMessageGetByKeyResponse.Data["+ i +"].Topic"));
			onsRestMessageDo.setFlag(_ctx.integerValue("OnsMessageGetByKeyResponse.Data["+ i +"].Flag"));
			onsRestMessageDo.setBody(_ctx.stringValue("OnsMessageGetByKeyResponse.Data["+ i +"].Body"));
			onsRestMessageDo.setStoreSize(_ctx.integerValue("OnsMessageGetByKeyResponse.Data["+ i +"].StoreSize"));
			onsRestMessageDo.setBornTimestamp(_ctx.longValue("OnsMessageGetByKeyResponse.Data["+ i +"].BornTimestamp"));
			onsRestMessageDo.setBornHost(_ctx.stringValue("OnsMessageGetByKeyResponse.Data["+ i +"].BornHost"));
			onsRestMessageDo.setStoreTimestamp(_ctx.longValue("OnsMessageGetByKeyResponse.Data["+ i +"].StoreTimestamp"));
			onsRestMessageDo.setStoreHost(_ctx.stringValue("OnsMessageGetByKeyResponse.Data["+ i +"].StoreHost"));
			onsRestMessageDo.setMsgId(_ctx.stringValue("OnsMessageGetByKeyResponse.Data["+ i +"].MsgId"));
			onsRestMessageDo.setOffsetId(_ctx.stringValue("OnsMessageGetByKeyResponse.Data["+ i +"].OffsetId"));
			onsRestMessageDo.setBodyCRC(_ctx.integerValue("OnsMessageGetByKeyResponse.Data["+ i +"].BodyCRC"));
			onsRestMessageDo.setReconsumeTimes(_ctx.integerValue("OnsMessageGetByKeyResponse.Data["+ i +"].ReconsumeTimes"));
			onsRestMessageDo.setInstanceId(_ctx.stringValue("OnsMessageGetByKeyResponse.Data["+ i +"].InstanceId"));

			List<MessageProperty> propertyList = new ArrayList<MessageProperty>();
			for (int j = 0; j < _ctx.lengthValue("OnsMessageGetByKeyResponse.Data["+ i +"].PropertyList.Length"); j++) {
				MessageProperty messageProperty = new MessageProperty();
				messageProperty.setName(_ctx.stringValue("OnsMessageGetByKeyResponse.Data["+ i +"].PropertyList["+ j +"].Name"));
				messageProperty.setValue(_ctx.stringValue("OnsMessageGetByKeyResponse.Data["+ i +"].PropertyList["+ j +"].Value"));

				propertyList.add(messageProperty);
			}
			onsRestMessageDo.setPropertyList(propertyList);

			data.add(onsRestMessageDo);
		}
		onsMessageGetByKeyResponse.setData(data);
	 
	 	return onsMessageGetByKeyResponse;
	}
}