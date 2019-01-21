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

package com.aliyuncs.ons.transform.v20180516;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ons.model.v20180516.OnsTrendTopicInputTpsResponse;
import com.aliyuncs.ons.model.v20180516.OnsTrendTopicInputTpsResponse.Data;
import com.aliyuncs.ons.model.v20180516.OnsTrendTopicInputTpsResponse.Data.StatsDataDo;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class OnsTrendTopicInputTpsResponseUnmarshaller {

	public static OnsTrendTopicInputTpsResponse unmarshall(OnsTrendTopicInputTpsResponse onsTrendTopicInputTpsResponse, UnmarshallerContext context) {
		
		onsTrendTopicInputTpsResponse.setRequestId(context.stringValue("OnsTrendTopicInputTpsResponse.RequestId"));
		onsTrendTopicInputTpsResponse.setHelpUrl(context.stringValue("OnsTrendTopicInputTpsResponse.HelpUrl"));

		Data data = new Data();
		data.setTitle(context.stringValue("OnsTrendTopicInputTpsResponse.Data.Title"));
		data.setXUnit(context.stringValue("OnsTrendTopicInputTpsResponse.Data.XUnit"));
		data.setYUnit(context.stringValue("OnsTrendTopicInputTpsResponse.Data.YUnit"));

		List<StatsDataDo> records = new ArrayList<StatsDataDo>();
		for (int i = 0; i < context.lengthValue("OnsTrendTopicInputTpsResponse.Data.Records.Length"); i++) {
			StatsDataDo statsDataDo = new StatsDataDo();
			statsDataDo.setX(context.longValue("OnsTrendTopicInputTpsResponse.Data.Records["+ i +"].X"));
			statsDataDo.setY(context.floatValue("OnsTrendTopicInputTpsResponse.Data.Records["+ i +"].Y"));

			records.add(statsDataDo);
		}
		data.setRecords(records);
		onsTrendTopicInputTpsResponse.setData(data);
	 
	 	return onsTrendTopicInputTpsResponse;
	}
}