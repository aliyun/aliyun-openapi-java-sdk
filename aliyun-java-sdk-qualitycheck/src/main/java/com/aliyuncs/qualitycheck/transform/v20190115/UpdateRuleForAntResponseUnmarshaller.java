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

import com.aliyuncs.qualitycheck.model.v20190115.UpdateRuleForAntResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateRuleForAntResponseUnmarshaller {

	public static UpdateRuleForAntResponse unmarshall(UpdateRuleForAntResponse updateRuleForAntResponse, UnmarshallerContext _ctx) {
		
		updateRuleForAntResponse.setRequestId(_ctx.stringValue("UpdateRuleForAntResponse.RequestId"));
		updateRuleForAntResponse.setSuccess(_ctx.booleanValue("UpdateRuleForAntResponse.Success"));
		updateRuleForAntResponse.setCode(_ctx.stringValue("UpdateRuleForAntResponse.Code"));
		updateRuleForAntResponse.setMessage(_ctx.stringValue("UpdateRuleForAntResponse.Message"));

		List<String> data = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateRuleForAntResponse.Data.Length"); i++) {
			data.add(_ctx.stringValue("UpdateRuleForAntResponse.Data["+ i +"]"));
		}
		updateRuleForAntResponse.setData(data);
	 
	 	return updateRuleForAntResponse;
	}
}