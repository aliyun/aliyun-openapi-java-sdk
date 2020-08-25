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

import com.aliyuncs.sofa.model.v20190815.GetMqSofamqConsumerJStackResponse;
import com.aliyuncs.sofa.model.v20190815.GetMqSofamqConsumerJStackResponse.Data;
import com.aliyuncs.sofa.model.v20190815.GetMqSofamqConsumerJStackResponse.Data.JstackItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMqSofamqConsumerJStackResponseUnmarshaller {

	public static GetMqSofamqConsumerJStackResponse unmarshall(GetMqSofamqConsumerJStackResponse getMqSofamqConsumerJStackResponse, UnmarshallerContext _ctx) {
		
		getMqSofamqConsumerJStackResponse.setRequestId(_ctx.stringValue("GetMqSofamqConsumerJStackResponse.RequestId"));
		getMqSofamqConsumerJStackResponse.setResultCode(_ctx.stringValue("GetMqSofamqConsumerJStackResponse.ResultCode"));
		getMqSofamqConsumerJStackResponse.setResultMessage(_ctx.stringValue("GetMqSofamqConsumerJStackResponse.ResultMessage"));

		Data data = new Data();
		data.setClientId(_ctx.stringValue("GetMqSofamqConsumerJStackResponse.Data.ClientId"));

		List<JstackItem> jstack = new ArrayList<JstackItem>();
		for (int i = 0; i < _ctx.lengthValue("GetMqSofamqConsumerJStackResponse.Data.Jstack.Length"); i++) {
			JstackItem jstackItem = new JstackItem();
			jstackItem.setThread(_ctx.stringValue("GetMqSofamqConsumerJStackResponse.Data.Jstack["+ i +"].Thread"));

			List<String> trackList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetMqSofamqConsumerJStackResponse.Data.Jstack["+ i +"].TrackList.Length"); j++) {
				trackList.add(_ctx.stringValue("GetMqSofamqConsumerJStackResponse.Data.Jstack["+ i +"].TrackList["+ j +"]"));
			}
			jstackItem.setTrackList(trackList);

			jstack.add(jstackItem);
		}
		data.setJstack(jstack);
		getMqSofamqConsumerJStackResponse.setData(data);
	 
	 	return getMqSofamqConsumerJStackResponse;
	}
}