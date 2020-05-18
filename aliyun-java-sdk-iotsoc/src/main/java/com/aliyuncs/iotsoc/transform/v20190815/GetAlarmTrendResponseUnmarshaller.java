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

package com.aliyuncs.iotsoc.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iotsoc.model.v20190815.GetAlarmTrendResponse;
import com.aliyuncs.iotsoc.model.v20190815.GetAlarmTrendResponse.LabelE;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAlarmTrendResponseUnmarshaller {

	public static GetAlarmTrendResponse unmarshall(GetAlarmTrendResponse getAlarmTrendResponse, UnmarshallerContext _ctx) {
		
		getAlarmTrendResponse.setRequestId(_ctx.stringValue("GetAlarmTrendResponse.RequestId"));
		getAlarmTrendResponse.setSuccess(_ctx.booleanValue("GetAlarmTrendResponse.Success"));
		getAlarmTrendResponse.setCode(_ctx.stringValue("GetAlarmTrendResponse.Code"));
		getAlarmTrendResponse.setMessage(_ctx.stringValue("GetAlarmTrendResponse.Message"));

		List<LabelE> data = new ArrayList<LabelE>();
		for (int i = 0; i < _ctx.lengthValue("GetAlarmTrendResponse.Data.Length"); i++) {
			LabelE labelE = new LabelE();
			labelE.setTemplateName(_ctx.stringValue("GetAlarmTrendResponse.Data["+ i +"].TemplateName"));

			List<String> alarmTrend = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetAlarmTrendResponse.Data["+ i +"].AlarmTrend.Length"); j++) {
				alarmTrend.add(_ctx.stringValue("GetAlarmTrendResponse.Data["+ i +"].AlarmTrend["+ j +"]"));
			}
			labelE.setAlarmTrend(alarmTrend);

			data.add(labelE);
		}
		getAlarmTrendResponse.setData(data);
	 
	 	return getAlarmTrendResponse;
	}
}