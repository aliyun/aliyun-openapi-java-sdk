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

package com.aliyuncs.ddoscoo.transform.v20200101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ddoscoo.model.v20200101.DescribeWebCcProtectSwitchResponse;
import com.aliyuncs.ddoscoo.model.v20200101.DescribeWebCcProtectSwitchResponse.ProtectSwitch;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeWebCcProtectSwitchResponseUnmarshaller {

	public static DescribeWebCcProtectSwitchResponse unmarshall(DescribeWebCcProtectSwitchResponse describeWebCcProtectSwitchResponse, UnmarshallerContext _ctx) {
		
		describeWebCcProtectSwitchResponse.setRequestId(_ctx.stringValue("DescribeWebCcProtectSwitchResponse.RequestId"));

		List<ProtectSwitch> protectSwitchList = new ArrayList<ProtectSwitch>();
		for (int i = 0; i < _ctx.lengthValue("DescribeWebCcProtectSwitchResponse.ProtectSwitchList.Length"); i++) {
			ProtectSwitch protectSwitch = new ProtectSwitch();
			protectSwitch.setDomain(_ctx.stringValue("DescribeWebCcProtectSwitchResponse.ProtectSwitchList["+ i +"].Domain"));
			protectSwitch.setBlackWhiteListEnable(_ctx.integerValue("DescribeWebCcProtectSwitchResponse.ProtectSwitchList["+ i +"].BlackWhiteListEnable"));
			protectSwitch.setRegionBlockEnable(_ctx.integerValue("DescribeWebCcProtectSwitchResponse.ProtectSwitchList["+ i +"].RegionBlockEnable"));
			protectSwitch.setCcEnable(_ctx.integerValue("DescribeWebCcProtectSwitchResponse.ProtectSwitchList["+ i +"].CcEnable"));
			protectSwitch.setCcCustomRuleEnable(_ctx.integerValue("DescribeWebCcProtectSwitchResponse.ProtectSwitchList["+ i +"].CcCustomRuleEnable"));
			protectSwitch.setPreciseRuleEnable(_ctx.integerValue("DescribeWebCcProtectSwitchResponse.ProtectSwitchList["+ i +"].PreciseRuleEnable"));
			protectSwitch.setAiRuleEnable(_ctx.integerValue("DescribeWebCcProtectSwitchResponse.ProtectSwitchList["+ i +"].AiRuleEnable"));
			protectSwitch.setCcTemplate(_ctx.stringValue("DescribeWebCcProtectSwitchResponse.ProtectSwitchList["+ i +"].CcTemplate"));
			protectSwitch.setAiTemplate(_ctx.stringValue("DescribeWebCcProtectSwitchResponse.ProtectSwitchList["+ i +"].AiTemplate"));
			protectSwitch.setAiMode(_ctx.stringValue("DescribeWebCcProtectSwitchResponse.ProtectSwitchList["+ i +"].AiMode"));

			protectSwitchList.add(protectSwitch);
		}
		describeWebCcProtectSwitchResponse.setProtectSwitchList(protectSwitchList);
	 
	 	return describeWebCcProtectSwitchResponse;
	}
}