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

package com.aliyuncs.swas_open.transform.v20200601;

import com.aliyuncs.swas_open.model.v20200601.ApplyFirewallTemplateResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ApplyFirewallTemplateResponseUnmarshaller {

	public static ApplyFirewallTemplateResponse unmarshall(ApplyFirewallTemplateResponse applyFirewallTemplateResponse, UnmarshallerContext _ctx) {
		
		applyFirewallTemplateResponse.setRequestId(_ctx.stringValue("ApplyFirewallTemplateResponse.RequestId"));
		applyFirewallTemplateResponse.setTaskId(_ctx.stringValue("ApplyFirewallTemplateResponse.TaskId"));
	 
	 	return applyFirewallTemplateResponse;
	}
}