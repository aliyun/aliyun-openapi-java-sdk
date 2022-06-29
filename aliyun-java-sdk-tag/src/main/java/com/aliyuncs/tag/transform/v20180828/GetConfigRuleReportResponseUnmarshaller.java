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

import com.aliyuncs.tag.model.v20180828.GetConfigRuleReportResponse;
import com.aliyuncs.tag.model.v20180828.GetConfigRuleReportResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetConfigRuleReportResponseUnmarshaller {

	public static GetConfigRuleReportResponse unmarshall(GetConfigRuleReportResponse getConfigRuleReportResponse, UnmarshallerContext _ctx) {
		
		getConfigRuleReportResponse.setRequestId(_ctx.stringValue("GetConfigRuleReportResponse.RequestId"));
		getConfigRuleReportResponse.setSuccess(_ctx.booleanValue("GetConfigRuleReportResponse.Success"));
		getConfigRuleReportResponse.setHttpStatusCode(_ctx.integerValue("GetConfigRuleReportResponse.HttpStatusCode"));

		Data data = new Data();
		data.setReportId(_ctx.stringValue("GetConfigRuleReportResponse.Data.ReportId"));
		data.setCreatedTime(_ctx.longValue("GetConfigRuleReportResponse.Data.CreatedTime"));
		data.setTargetId(_ctx.stringValue("GetConfigRuleReportResponse.Data.TargetId"));
		data.setTargetType(_ctx.stringValue("GetConfigRuleReportResponse.Data.TargetType"));
		getConfigRuleReportResponse.setData(data);
	 
	 	return getConfigRuleReportResponse;
	}
}