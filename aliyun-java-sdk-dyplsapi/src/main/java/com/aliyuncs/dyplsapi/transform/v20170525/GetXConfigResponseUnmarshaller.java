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

import com.aliyuncs.dyplsapi.model.v20170525.GetXConfigResponse;
import com.aliyuncs.dyplsapi.model.v20170525.GetXConfigResponse.Data;
import com.aliyuncs.dyplsapi.model.v20170525.GetXConfigResponse.Data.ReachJsonsItem;
import com.aliyuncs.dyplsapi.model.v20170525.GetXConfigResponse.Data.SequenceCallsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetXConfigResponseUnmarshaller {

	public static GetXConfigResponse unmarshall(GetXConfigResponse getXConfigResponse, UnmarshallerContext _ctx) {
		
		getXConfigResponse.setAccessDeniedDetail(_ctx.stringValue("GetXConfigResponse.AccessDeniedDetail"));
		getXConfigResponse.setMessage(_ctx.stringValue("GetXConfigResponse.Message"));
		getXConfigResponse.setCode(_ctx.stringValue("GetXConfigResponse.Code"));
		getXConfigResponse.setSuccess(_ctx.booleanValue("GetXConfigResponse.Success"));

		Data data = new Data();
		data.setSequenceStartTime(_ctx.stringValue("GetXConfigResponse.Data.SequenceStartTime"));
		data.setSmsAbility(_ctx.stringValue("GetXConfigResponse.Data.SmsAbility"));
		data.setGNFlag(_ctx.stringValue("GetXConfigResponse.Data.GNFlag"));
		data.setSmsSignMode(_ctx.stringValue("GetXConfigResponse.Data.SmsSignMode"));
		data.setCallAbility(_ctx.stringValue("GetXConfigResponse.Data.CallAbility"));
		data.setSequenceEndTime(_ctx.stringValue("GetXConfigResponse.Data.SequenceEndTime"));

		List<SequenceCallsItem> sequenceCalls = new ArrayList<SequenceCallsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetXConfigResponse.Data.SequenceCalls.Length"); i++) {
			SequenceCallsItem sequenceCallsItem = new SequenceCallsItem();
			sequenceCallsItem.setSequenceCallNoPlayCode(_ctx.stringValue("GetXConfigResponse.Data.SequenceCalls["+ i +"].SequenceCallNoPlayCode"));
			sequenceCallsItem.setSequenceCalledNo(_ctx.stringValue("GetXConfigResponse.Data.SequenceCalls["+ i +"].SequenceCalledNo"));
			sequenceCallsItem.setSequenceCalledPlayCode(_ctx.stringValue("GetXConfigResponse.Data.SequenceCalls["+ i +"].SequenceCalledPlayCode"));

			sequenceCalls.add(sequenceCallsItem);
		}
		data.setSequenceCalls(sequenceCalls);

		List<ReachJsonsItem> reachJsons = new ArrayList<ReachJsonsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetXConfigResponse.Data.ReachJsons.Length"); i++) {
			ReachJsonsItem reachJsonsItem = new ReachJsonsItem();
			reachJsonsItem.setReceiveDir(_ctx.stringValue("GetXConfigResponse.Data.ReachJsons["+ i +"].ReceiveDir"));
			reachJsonsItem.setCallDir(_ctx.stringValue("GetXConfigResponse.Data.ReachJsons["+ i +"].CallDir"));
			reachJsonsItem.setTempId(_ctx.stringValue("GetXConfigResponse.Data.ReachJsons["+ i +"].TempId"));
			reachJsonsItem.setRuleId(_ctx.stringValue("GetXConfigResponse.Data.ReachJsons["+ i +"].RuleId"));
			reachJsonsItem.setCallStatus(_ctx.stringValue("GetXConfigResponse.Data.ReachJsons["+ i +"].CallStatus"));
			reachJsonsItem.setRuleType(_ctx.stringValue("GetXConfigResponse.Data.ReachJsons["+ i +"].RuleType"));
			reachJsonsItem.setRuleName(_ctx.stringValue("GetXConfigResponse.Data.ReachJsons["+ i +"].RuleName"));

			reachJsons.add(reachJsonsItem);
		}
		data.setReachJsons(reachJsons);
		getXConfigResponse.setData(data);
	 
	 	return getXConfigResponse;
	}
}