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

package com.aliyuncs.vod.transform.v20170321;

import com.aliyuncs.vod.model.v20170321.GetAuditResultResponse;
import com.aliyuncs.vod.model.v20170321.GetAuditResultResponse.AIAuditResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAuditResultResponseUnmarshaller {

	public static GetAuditResultResponse unmarshall(GetAuditResultResponse getAuditResultResponse, UnmarshallerContext context) {
		
		getAuditResultResponse.setRequestId(context.stringValue("GetAuditResultResponse.RequestId"));

		AIAuditResult aIAuditResult = new AIAuditResult();
		aIAuditResult.setAbnormalModules(context.stringValue("GetAuditResultResponse.AIAuditResult.AbnormalModules"));
		aIAuditResult.setLabel(context.stringValue("GetAuditResultResponse.AIAuditResult.Label"));
		aIAuditResult.setPornResult(context.stringValue("GetAuditResultResponse.AIAuditResult.PornResult"));
		aIAuditResult.setTerrorismResult(context.stringValue("GetAuditResultResponse.AIAuditResult.TerrorismResult"));
		aIAuditResult.setTitleResult(context.stringValue("GetAuditResultResponse.AIAuditResult.TitleResult"));
		aIAuditResult.setCoverResult(context.stringValue("GetAuditResultResponse.AIAuditResult.CoverResult"));
		getAuditResultResponse.setAIAuditResult(aIAuditResult);
	 
	 	return getAuditResultResponse;
	}
}