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

package com.aliyuncs.dyplsapi.transform.v20170525;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dyplsapi.model.v20170525.GetXDefaultConfigResponse;
import com.aliyuncs.dyplsapi.model.v20170525.GetXDefaultConfigResponse.Data;
import com.aliyuncs.dyplsapi.model.v20170525.GetXDefaultConfigResponse.Data.ReachJsonItem;
import com.aliyuncs.dyplsapi.model.v20170525.GetXDefaultConfigResponse.Data.SequenceCallItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetXDefaultConfigResponseUnmarshaller {

	public static GetXDefaultConfigResponse unmarshall(GetXDefaultConfigResponse getXDefaultConfigResponse, UnmarshallerContext _ctx) {
		
		getXDefaultConfigResponse.setAccessDeniedDetail(_ctx.stringValue("GetXDefaultConfigResponse.AccessDeniedDetail"));
		getXDefaultConfigResponse.setMessage(_ctx.stringValue("GetXDefaultConfigResponse.Message"));
		getXDefaultConfigResponse.setCode(_ctx.stringValue("GetXDefaultConfigResponse.Code"));
		getXDefaultConfigResponse.setSuccess(_ctx.booleanValue("GetXDefaultConfigResponse.Success"));

		Data data = new Data();
		data.setSequenceStartTime(_ctx.stringValue("GetXDefaultConfigResponse.Data.SequenceStartTime"));
		data.setSmsAbility(_ctx.stringValue("GetXDefaultConfigResponse.Data.SmsAbility"));
		data.setGNFlag(_ctx.stringValue("GetXDefaultConfigResponse.Data.GNFlag"));
		data.setSmsSignMode(_ctx.stringValue("GetXDefaultConfigResponse.Data.SmsSignMode"));
		data.setCallAbility(_ctx.stringValue("GetXDefaultConfigResponse.Data.CallAbility"));
		data.setSequenceEndTime(_ctx.stringValue("GetXDefaultConfigResponse.Data.SequenceEndTime"));

		List<ReachJsonItem> reachJson = new ArrayList<ReachJsonItem>();
		for (int i = 0; i < _ctx.lengthValue("GetXDefaultConfigResponse.Data.ReachJson.Length"); i++) {
			ReachJsonItem reachJsonItem = new ReachJsonItem();
			reachJsonItem.setReceiveDir(_ctx.stringValue("GetXDefaultConfigResponse.Data.ReachJson["+ i +"].ReceiveDir"));
			reachJsonItem.setCallDir(_ctx.stringValue("GetXDefaultConfigResponse.Data.ReachJson["+ i +"].CallDir"));
			reachJsonItem.setTempId(_ctx.stringValue("GetXDefaultConfigResponse.Data.ReachJson["+ i +"].TempId"));
			reachJsonItem.setRuleId(_ctx.stringValue("GetXDefaultConfigResponse.Data.ReachJson["+ i +"].RuleId"));
			reachJsonItem.setCallStatus(_ctx.stringValue("GetXDefaultConfigResponse.Data.ReachJson["+ i +"].CallStatus"));
			reachJsonItem.setRuleType(_ctx.stringValue("GetXDefaultConfigResponse.Data.ReachJson["+ i +"].RuleType"));
			reachJsonItem.setRuleName(_ctx.stringValue("GetXDefaultConfigResponse.Data.ReachJson["+ i +"].RuleName"));

			reachJson.add(reachJsonItem);
		}
		data.setReachJson(reachJson);

		List<SequenceCallItem> sequenceCall = new ArrayList<SequenceCallItem>();
		for (int i = 0; i < _ctx.lengthValue("GetXDefaultConfigResponse.Data.SequenceCall.Length"); i++) {
			SequenceCallItem sequenceCallItem = new SequenceCallItem();
			sequenceCallItem.setSequenceCallNoPlayCode(_ctx.stringValue("GetXDefaultConfigResponse.Data.SequenceCall["+ i +"].SequenceCallNoPlayCode"));
			sequenceCallItem.setSequenceCalledNo(_ctx.stringValue("GetXDefaultConfigResponse.Data.SequenceCall["+ i +"].SequenceCalledNo"));
			sequenceCallItem.setSequenceCalledPlayCode(_ctx.stringValue("GetXDefaultConfigResponse.Data.SequenceCall["+ i +"].SequenceCalledPlayCode"));

			sequenceCall.add(sequenceCallItem);
		}
		data.setSequenceCall(sequenceCall);
		getXDefaultConfigResponse.setData(data);
	 
	 	return getXDefaultConfigResponse;
	}
}