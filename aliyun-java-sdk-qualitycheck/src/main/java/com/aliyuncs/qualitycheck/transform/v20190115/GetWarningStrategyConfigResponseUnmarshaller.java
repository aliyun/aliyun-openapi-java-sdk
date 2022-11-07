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

package com.aliyuncs.qualitycheck.transform.v20190115;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.qualitycheck.model.v20190115.GetWarningStrategyConfigResponse;
import com.aliyuncs.qualitycheck.model.v20190115.GetWarningStrategyConfigResponse.Data;
import com.aliyuncs.qualitycheck.model.v20190115.GetWarningStrategyConfigResponse.Data.WarningStrategyListItem;
import com.aliyuncs.qualitycheck.model.v20190115.GetWarningStrategyConfigResponse.Data.WarningStrategyListItem.Range;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetWarningStrategyConfigResponseUnmarshaller {

	public static GetWarningStrategyConfigResponse unmarshall(GetWarningStrategyConfigResponse getWarningStrategyConfigResponse, UnmarshallerContext _ctx) {
		
		getWarningStrategyConfigResponse.setRequestId(_ctx.stringValue("GetWarningStrategyConfigResponse.RequestId"));
		getWarningStrategyConfigResponse.setMessage(_ctx.stringValue("GetWarningStrategyConfigResponse.Message"));
		getWarningStrategyConfigResponse.setCode(_ctx.stringValue("GetWarningStrategyConfigResponse.Code"));
		getWarningStrategyConfigResponse.setSuccess(_ctx.booleanValue("GetWarningStrategyConfigResponse.Success"));

		Data data = new Data();
		data.setId(_ctx.longValue("GetWarningStrategyConfigResponse.Data.Id"));
		data.setIntervalTime(_ctx.longValue("GetWarningStrategyConfigResponse.Data.IntervalTime"));
		data.setLambda(_ctx.stringValue("GetWarningStrategyConfigResponse.Data.Lambda"));
		data.setLevel(_ctx.longValue("GetWarningStrategyConfigResponse.Data.Level"));
		data.setMaxNumber(_ctx.longValue("GetWarningStrategyConfigResponse.Data.MaxNumber"));
		data.setName(_ctx.stringValue("GetWarningStrategyConfigResponse.Data.Name"));

		List<WarningStrategyListItem> warningStrategyList = new ArrayList<WarningStrategyListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetWarningStrategyConfigResponse.Data.WarningStrategyList.Length"); i++) {
			WarningStrategyListItem warningStrategyListItem = new WarningStrategyListItem();
			warningStrategyListItem.setCode(_ctx.stringValue("GetWarningStrategyConfigResponse.Data.WarningStrategyList["+ i +"].Code"));
			warningStrategyListItem.setDuration(_ctx.longValue("GetWarningStrategyConfigResponse.Data.WarningStrategyList["+ i +"].Duration"));
			warningStrategyListItem.setDurationExpression(_ctx.longValue("GetWarningStrategyConfigResponse.Data.WarningStrategyList["+ i +"].DurationExpression"));
			warningStrategyListItem.setHitNumber(_ctx.longValue("GetWarningStrategyConfigResponse.Data.WarningStrategyList["+ i +"].HitNumber"));
			warningStrategyListItem.setHitNumberExpression(_ctx.longValue("GetWarningStrategyConfigResponse.Data.WarningStrategyList["+ i +"].HitNumberExpression"));
			warningStrategyListItem.setHitRuleList(_ctx.stringValue("GetWarningStrategyConfigResponse.Data.WarningStrategyList["+ i +"].HitRuleList"));
			warningStrategyListItem.setHitType(_ctx.longValue("GetWarningStrategyConfigResponse.Data.WarningStrategyList["+ i +"].HitType"));
			warningStrategyListItem.setId(_ctx.longValue("GetWarningStrategyConfigResponse.Data.WarningStrategyList["+ i +"].Id"));
			warningStrategyListItem.setStatus(_ctx.longValue("GetWarningStrategyConfigResponse.Data.WarningStrategyList["+ i +"].Status"));

			Range range = new Range();
			range.setRangeNum(_ctx.longValue("GetWarningStrategyConfigResponse.Data.WarningStrategyList["+ i +"].Range.RangeNum"));
			range.setType(_ctx.longValue("GetWarningStrategyConfigResponse.Data.WarningStrategyList["+ i +"].Range.Type"));
			warningStrategyListItem.setRange(range);

			warningStrategyList.add(warningStrategyListItem);
		}
		data.setWarningStrategyList(warningStrategyList);
		getWarningStrategyConfigResponse.setData(data);
	 
	 	return getWarningStrategyConfigResponse;
	}
}