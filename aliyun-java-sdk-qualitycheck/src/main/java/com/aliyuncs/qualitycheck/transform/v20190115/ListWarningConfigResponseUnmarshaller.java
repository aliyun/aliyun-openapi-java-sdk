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

import com.aliyuncs.qualitycheck.model.v20190115.ListWarningConfigResponse;
import com.aliyuncs.qualitycheck.model.v20190115.ListWarningConfigResponse.WarningConfigInfo;
import com.aliyuncs.qualitycheck.model.v20190115.ListWarningConfigResponse.WarningConfigInfo.Channel;
import com.aliyuncs.qualitycheck.model.v20190115.ListWarningConfigResponse.WarningConfigInfo.WarningRule;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListWarningConfigResponseUnmarshaller {

	public static ListWarningConfigResponse unmarshall(ListWarningConfigResponse listWarningConfigResponse, UnmarshallerContext _ctx) {
		
		listWarningConfigResponse.setRequestId(_ctx.stringValue("ListWarningConfigResponse.RequestId"));
		listWarningConfigResponse.setSuccess(_ctx.booleanValue("ListWarningConfigResponse.Success"));
		listWarningConfigResponse.setCode(_ctx.stringValue("ListWarningConfigResponse.Code"));
		listWarningConfigResponse.setMessage(_ctx.stringValue("ListWarningConfigResponse.Message"));

		List<WarningConfigInfo> data = new ArrayList<WarningConfigInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListWarningConfigResponse.Data.Length"); i++) {
			WarningConfigInfo warningConfigInfo = new WarningConfigInfo();
			warningConfigInfo.setConfigId(_ctx.longValue("ListWarningConfigResponse.Data["+ i +"].ConfigId"));
			warningConfigInfo.setConfigName(_ctx.stringValue("ListWarningConfigResponse.Data["+ i +"].ConfigName"));
			warningConfigInfo.setStatus(_ctx.integerValue("ListWarningConfigResponse.Data["+ i +"].Status"));
			warningConfigInfo.setCreateTime(_ctx.stringValue("ListWarningConfigResponse.Data["+ i +"].CreateTime"));
			warningConfigInfo.setUpdateTime(_ctx.stringValue("ListWarningConfigResponse.Data["+ i +"].UpdateTime"));

			List<String> ridList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListWarningConfigResponse.Data["+ i +"].RidList.Length"); j++) {
				ridList.add(_ctx.stringValue("ListWarningConfigResponse.Data["+ i +"].RidList["+ j +"]"));
			}
			warningConfigInfo.setRidList(ridList);

			List<WarningRule> ruleList = new ArrayList<WarningRule>();
			for (int j = 0; j < _ctx.lengthValue("ListWarningConfigResponse.Data["+ i +"].RuleList.Length"); j++) {
				WarningRule warningRule = new WarningRule();
				warningRule.setRid(_ctx.longValue("ListWarningConfigResponse.Data["+ i +"].RuleList["+ j +"].Rid"));
				warningRule.setRuleName(_ctx.stringValue("ListWarningConfigResponse.Data["+ i +"].RuleList["+ j +"].RuleName"));

				ruleList.add(warningRule);
			}
			warningConfigInfo.setRuleList(ruleList);

			List<Channel> channels = new ArrayList<Channel>();
			for (int j = 0; j < _ctx.lengthValue("ListWarningConfigResponse.Data["+ i +"].Channels.Length"); j++) {
				Channel channel = new Channel();
				channel.setType(_ctx.integerValue("ListWarningConfigResponse.Data["+ i +"].Channels["+ j +"].Type"));
				channel.setUrl(_ctx.stringValue("ListWarningConfigResponse.Data["+ i +"].Channels["+ j +"].Url"));

				channels.add(channel);
			}
			warningConfigInfo.setChannels(channels);

			data.add(warningConfigInfo);
		}
		listWarningConfigResponse.setData(data);
	 
	 	return listWarningConfigResponse;
	}
}