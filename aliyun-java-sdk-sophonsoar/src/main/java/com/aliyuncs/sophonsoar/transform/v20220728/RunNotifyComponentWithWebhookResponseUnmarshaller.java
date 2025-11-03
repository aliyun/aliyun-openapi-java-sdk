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

package com.aliyuncs.sophonsoar.transform.v20220728;

import com.aliyuncs.sophonsoar.model.v20220728.RunNotifyComponentWithWebhookResponse;
import com.aliyuncs.sophonsoar.model.v20220728.RunNotifyComponentWithWebhookResponse.Page;
import com.aliyuncs.transform.UnmarshallerContext;


public class RunNotifyComponentWithWebhookResponseUnmarshaller {

	public static RunNotifyComponentWithWebhookResponse unmarshall(RunNotifyComponentWithWebhookResponse runNotifyComponentWithWebhookResponse, UnmarshallerContext _ctx) {
		
		runNotifyComponentWithWebhookResponse.setRequestId(_ctx.stringValue("RunNotifyComponentWithWebhookResponse.RequestId"));
		runNotifyComponentWithWebhookResponse.setData(_ctx.stringValue("RunNotifyComponentWithWebhookResponse.Data"));

		Page page = new Page();
		page.setTotalCount(_ctx.integerValue("RunNotifyComponentWithWebhookResponse.Page.TotalCount"));
		page.setPageNumber(_ctx.integerValue("RunNotifyComponentWithWebhookResponse.Page.PageNumber"));
		page.setPageSize(_ctx.integerValue("RunNotifyComponentWithWebhookResponse.Page.PageSize"));
		runNotifyComponentWithWebhookResponse.setPage(page);
	 
	 	return runNotifyComponentWithWebhookResponse;
	}
}