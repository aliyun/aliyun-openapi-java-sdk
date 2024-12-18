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

package com.aliyuncs.selectdb.transform.v20230522;

import com.aliyuncs.selectdb.model.v20230522.EnDisableScalingRulesResponse;
import com.aliyuncs.selectdb.model.v20230522.EnDisableScalingRulesResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class EnDisableScalingRulesResponseUnmarshaller {

	public static EnDisableScalingRulesResponse unmarshall(EnDisableScalingRulesResponse enDisableScalingRulesResponse, UnmarshallerContext _ctx) {
		
		enDisableScalingRulesResponse.setRequestId(_ctx.stringValue("EnDisableScalingRulesResponse.RequestId"));

		Data data = new Data();
		data.setDbInstanceId(_ctx.stringValue("EnDisableScalingRulesResponse.Data.DbInstanceId"));
		data.setClusterId(_ctx.stringValue("EnDisableScalingRulesResponse.Data.ClusterId"));
		data.setScalingRulesEnable(_ctx.booleanValue("EnDisableScalingRulesResponse.Data.ScalingRulesEnable"));
		enDisableScalingRulesResponse.setData(data);
	 
	 	return enDisableScalingRulesResponse;
	}
}