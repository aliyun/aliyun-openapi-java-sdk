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

package com.aliyuncs.sas.transform.v20181203;

import com.aliyuncs.sas.model.v20181203.DescribeClientConfSetupResponse;
import com.aliyuncs.sas.model.v20181203.DescribeClientConfSetupResponse.ClientConf;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeClientConfSetupResponseUnmarshaller {

	public static DescribeClientConfSetupResponse unmarshall(DescribeClientConfSetupResponse describeClientConfSetupResponse, UnmarshallerContext _ctx) {
		
		describeClientConfSetupResponse.setRequestId(_ctx.stringValue("DescribeClientConfSetupResponse.RequestId"));

		ClientConf clientConf = new ClientConf();
		clientConf.setStrategyTagValue(_ctx.stringValue("DescribeClientConfSetupResponse.ClientConf.StrategyTagValue"));
		clientConf.setConfig(_ctx.stringValue("DescribeClientConfSetupResponse.ClientConf.Config"));
		clientConf.setStrategyTag(_ctx.stringValue("DescribeClientConfSetupResponse.ClientConf.StrategyTag"));
		describeClientConfSetupResponse.setClientConf(clientConf);
	 
	 	return describeClientConfSetupResponse;
	}
}