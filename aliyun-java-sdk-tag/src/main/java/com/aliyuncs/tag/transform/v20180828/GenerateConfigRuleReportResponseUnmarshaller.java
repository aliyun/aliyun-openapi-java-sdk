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

package com.aliyuncs.tag.transform.v20180828;

import com.aliyuncs.tag.model.v20180828.GenerateConfigRuleReportResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GenerateConfigRuleReportResponseUnmarshaller {

	public static GenerateConfigRuleReportResponse unmarshall(GenerateConfigRuleReportResponse generateConfigRuleReportResponse, UnmarshallerContext _ctx) {
		
		generateConfigRuleReportResponse.setRequestId(_ctx.stringValue("GenerateConfigRuleReportResponse.RequestId"));
		generateConfigRuleReportResponse.setReportId(_ctx.stringValue("GenerateConfigRuleReportResponse.ReportId"));
	 
	 	return generateConfigRuleReportResponse;
	}
}