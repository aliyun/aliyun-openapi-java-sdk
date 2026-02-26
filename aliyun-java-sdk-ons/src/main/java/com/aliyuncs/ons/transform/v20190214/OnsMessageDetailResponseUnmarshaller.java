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

import com.aliyuncs.ons.model.v20190214.OnsMessageDetailResponse;
import com.aliyuncs.ons.model.v20190214.OnsMessageDetailResponse.Data;
import com.aliyuncs.ons.model.v20190214.OnsMessageDetailResponse.Data.MessageProperty;
import com.aliyuncs.transform.UnmarshallerContext;


public class OnsMessageDetailResponseUnmarshaller {

	public static OnsMessageDetailResponse unmarshall(OnsMessageDetailResponse onsMessageDetailResponse, UnmarshallerContext _ctx) {
		
		onsMessageDetailResponse.setRequestId(_ctx.stringValue("OnsMessageDetailResponse.RequestId"));
		onsMessageDetailResponse.setHelpUrl(_ctx.stringValue("OnsMessageDetailResponse.HelpUrl"));

		Data data = new Data();
		data.setOffsetId(_ctx.stringValue("OnsMessageDetailResponse.Data.OffsetId"));
		data.setStoreSize(_ctx.integerValue("OnsMessageDetailResponse.Data.StoreSize"));
		data.setReconsumeTimes(_ctx.integerValue("OnsMessageDetailResponse.Data.ReconsumeTimes"));
		data.setStoreTimestamp(_ctx.longValue("OnsMessageDetailResponse.Data.StoreTimestamp"));
		data.setBody(_ctx.stringValue("OnsMessageDetailResponse.Data.Body"));
		data.setInstanceId(_ctx.stringValue("OnsMessageDetailResponse.Data.InstanceId"));
		data.setMsgId(_ctx.stringValue("OnsMessageDetailResponse.Data.MsgId"));
		data.setFlag(_ctx.integerValue("OnsMessageDetailResponse.Data.Flag"));
		data.setStoreHost(_ctx.stringValue("OnsMessageDetailResponse.Data.StoreHost"));
		data.setTopic(_ctx.stringValue("OnsMessageDetailResponse.Data.Topic"));
		data.setBornTimestamp(_ctx.longValue("OnsMessageDetailResponse.Data.BornTimestamp"));
		data.setBodyCRC(_ctx.integerValue("OnsMessageDetailResponse.Data.BodyCRC"));
		data.setBornHost(_ctx.stringValue("OnsMessageDetailResponse.Data.BornHost"));

		List<MessageProperty> propertyList = new ArrayList<MessageProperty>();
		for (int i = 0; i < _ctx.lengthValue("OnsMessageDetailResponse.Data.PropertyList.Length"); i++) {
			MessageProperty messageProperty = new MessageProperty();
			messageProperty.setValue(_ctx.stringValue("OnsMessageDetailResponse.Data.PropertyList["+ i +"].Value"));
			messageProperty.setName(_ctx.stringValue("OnsMessageDetailResponse.Data.PropertyList["+ i +"].Name"));

			propertyList.add(messageProperty);
		}
		data.setPropertyList(propertyList);
		onsMessageDetailResponse.setData(data);
	 
	 	return onsMessageDetailResponse;
	}
}