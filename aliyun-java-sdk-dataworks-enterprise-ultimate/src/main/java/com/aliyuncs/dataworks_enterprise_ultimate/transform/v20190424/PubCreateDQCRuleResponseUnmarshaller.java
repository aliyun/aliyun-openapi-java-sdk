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

package com.aliyuncs.dataworks_enterprise_ultimate.transform.v20190424;

import com.aliyuncs.dataworks_enterprise_ultimate.model.v20190424.PubCreateDQCRuleResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class PubCreateDQCRuleResponseUnmarshaller {

	public static PubCreateDQCRuleResponse unmarshall(PubCreateDQCRuleResponse pubCreateDQCRuleResponse, UnmarshallerContext _ctx) {
		
		pubCreateDQCRuleResponse.setReturnCode(_ctx.stringValue("PubCreateDQCRuleResponse.ReturnCode"));
		pubCreateDQCRuleResponse.setReturnValue(_ctx.booleanValue("PubCreateDQCRuleResponse.ReturnValue"));
	 
	 	return pubCreateDQCRuleResponse;
	}
}