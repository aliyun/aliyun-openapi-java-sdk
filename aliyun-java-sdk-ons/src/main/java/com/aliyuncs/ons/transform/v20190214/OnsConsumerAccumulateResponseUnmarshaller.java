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

import com.aliyuncs.ons.model.v20190214.OnsConsumerAccumulateResponse;
import com.aliyuncs.ons.model.v20190214.OnsConsumerAccumulateResponse.Data;
import com.aliyuncs.ons.model.v20190214.OnsConsumerAccumulateResponse.Data.DetailInTopicDo;
import com.aliyuncs.transform.UnmarshallerContext;


public class OnsConsumerAccumulateResponseUnmarshaller {

	public static OnsConsumerAccumulateResponse unmarshall(OnsConsumerAccumulateResponse onsConsumerAccumulateResponse, UnmarshallerContext _ctx) {
		
		onsConsumerAccumulateResponse.setRequestId(_ctx.stringValue("OnsConsumerAccumulateResponse.RequestId"));
		onsConsumerAccumulateResponse.setHelpUrl(_ctx.stringValue("OnsConsumerAccumulateResponse.HelpUrl"));

		Data data = new Data();
		data.setOnline(_ctx.booleanValue("OnsConsumerAccumulateResponse.Data.Online"));
		data.setTotalDiff(_ctx.longValue("OnsConsumerAccumulateResponse.Data.TotalDiff"));
		data.setConsumeTps(_ctx.floatValue("OnsConsumerAccumulateResponse.Data.ConsumeTps"));
		data.setLastTimestamp(_ctx.longValue("OnsConsumerAccumulateResponse.Data.LastTimestamp"));
		data.setDelayTime(_ctx.longValue("OnsConsumerAccumulateResponse.Data.DelayTime"));

		List<DetailInTopicDo> detailInTopicList = new ArrayList<DetailInTopicDo>();
		for (int i = 0; i < _ctx.lengthValue("OnsConsumerAccumulateResponse.Data.DetailInTopicList.Length"); i++) {
			DetailInTopicDo detailInTopicDo = new DetailInTopicDo();
			detailInTopicDo.setTopic(_ctx.stringValue("OnsConsumerAccumulateResponse.Data.DetailInTopicList["+ i +"].Topic"));
			detailInTopicDo.setTotalDiff(_ctx.longValue("OnsConsumerAccumulateResponse.Data.DetailInTopicList["+ i +"].TotalDiff"));
			detailInTopicDo.setLastTimestamp(_ctx.longValue("OnsConsumerAccumulateResponse.Data.DetailInTopicList["+ i +"].LastTimestamp"));
			detailInTopicDo.setDelayTime(_ctx.longValue("OnsConsumerAccumulateResponse.Data.DetailInTopicList["+ i +"].DelayTime"));

			detailInTopicList.add(detailInTopicDo);
		}
		data.setDetailInTopicList(detailInTopicList);
		onsConsumerAccumulateResponse.setData(data);
	 
	 	return onsConsumerAccumulateResponse;
	}
}