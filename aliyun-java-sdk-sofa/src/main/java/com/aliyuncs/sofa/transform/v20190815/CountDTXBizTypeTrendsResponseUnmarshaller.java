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

import com.aliyuncs.sofa.model.v20190815.CountDTXBizTypeTrendsResponse;
import com.aliyuncs.sofa.model.v20190815.CountDTXBizTypeTrendsResponse.Data;
import com.aliyuncs.sofa.model.v20190815.CountDTXBizTypeTrendsResponse.Data.ActionTrendItem;
import com.aliyuncs.sofa.model.v20190815.CountDTXBizTypeTrendsResponse.Data.ActivityTrendItem;
import com.aliyuncs.sofa.model.v20190815.CountDTXBizTypeTrendsResponse.Data.ExceptionTrendItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class CountDTXBizTypeTrendsResponseUnmarshaller {

	public static CountDTXBizTypeTrendsResponse unmarshall(CountDTXBizTypeTrendsResponse countDTXBizTypeTrendsResponse, UnmarshallerContext _ctx) {
		
		countDTXBizTypeTrendsResponse.setRequestId(_ctx.stringValue("CountDTXBizTypeTrendsResponse.RequestId"));
		countDTXBizTypeTrendsResponse.setResultCode(_ctx.stringValue("CountDTXBizTypeTrendsResponse.ResultCode"));
		countDTXBizTypeTrendsResponse.setResultMessage(_ctx.stringValue("CountDTXBizTypeTrendsResponse.ResultMessage"));
		countDTXBizTypeTrendsResponse.setSuccess(_ctx.booleanValue("CountDTXBizTypeTrendsResponse.Success"));

		Data data = new Data();

		List<ActionTrendItem> actionTrend = new ArrayList<ActionTrendItem>();
		for (int i = 0; i < _ctx.lengthValue("CountDTXBizTypeTrendsResponse.Data.ActionTrend.Length"); i++) {
			ActionTrendItem actionTrendItem = new ActionTrendItem();
			actionTrendItem.setRollback(_ctx.longValue("CountDTXBizTypeTrendsResponse.Data.ActionTrend["+ i +"].Rollback"));
			actionTrendItem.setSuccess(_ctx.longValue("CountDTXBizTypeTrendsResponse.Data.ActionTrend["+ i +"].Success"));
			actionTrendItem.setTime(_ctx.longValue("CountDTXBizTypeTrendsResponse.Data.ActionTrend["+ i +"].Time"));
			actionTrendItem.setTotal(_ctx.longValue("CountDTXBizTypeTrendsResponse.Data.ActionTrend["+ i +"].Total"));

			actionTrend.add(actionTrendItem);
		}
		data.setActionTrend(actionTrend);

		List<ActivityTrendItem> activityTrend = new ArrayList<ActivityTrendItem>();
		for (int i = 0; i < _ctx.lengthValue("CountDTXBizTypeTrendsResponse.Data.ActivityTrend.Length"); i++) {
			ActivityTrendItem activityTrendItem = new ActivityTrendItem();
			activityTrendItem.setRollback(_ctx.longValue("CountDTXBizTypeTrendsResponse.Data.ActivityTrend["+ i +"].Rollback"));
			activityTrendItem.setSuccess(_ctx.longValue("CountDTXBizTypeTrendsResponse.Data.ActivityTrend["+ i +"].Success"));
			activityTrendItem.setTime(_ctx.longValue("CountDTXBizTypeTrendsResponse.Data.ActivityTrend["+ i +"].Time"));
			activityTrendItem.setTotal(_ctx.longValue("CountDTXBizTypeTrendsResponse.Data.ActivityTrend["+ i +"].Total"));

			activityTrend.add(activityTrendItem);
		}
		data.setActivityTrend(activityTrend);

		List<ExceptionTrendItem> exceptionTrend = new ArrayList<ExceptionTrendItem>();
		for (int i = 0; i < _ctx.lengthValue("CountDTXBizTypeTrendsResponse.Data.ExceptionTrend.Length"); i++) {
			ExceptionTrendItem exceptionTrendItem = new ExceptionTrendItem();
			exceptionTrendItem.setTime(_ctx.longValue("CountDTXBizTypeTrendsResponse.Data.ExceptionTrend["+ i +"].Time"));
			exceptionTrendItem.setTotal(_ctx.longValue("CountDTXBizTypeTrendsResponse.Data.ExceptionTrend["+ i +"].Total"));

			exceptionTrend.add(exceptionTrendItem);
		}
		data.setExceptionTrend(exceptionTrend);
		countDTXBizTypeTrendsResponse.setData(data);
	 
	 	return countDTXBizTypeTrendsResponse;
	}
}