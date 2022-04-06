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

package com.aliyuncs.ccc.transform.v20200701;

import com.aliyuncs.ccc.model.v20200701.PauseCampaignResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class PauseCampaignResponseUnmarshaller {

	public static PauseCampaignResponse unmarshall(PauseCampaignResponse pauseCampaignResponse, UnmarshallerContext _ctx) {
		
		pauseCampaignResponse.setRequestId(_ctx.stringValue("PauseCampaignResponse.RequestId"));
		pauseCampaignResponse.setCode(_ctx.stringValue("PauseCampaignResponse.Code"));
		pauseCampaignResponse.setMessage(_ctx.stringValue("PauseCampaignResponse.Message"));
		pauseCampaignResponse.setHttpStatusCode(_ctx.stringValue("PauseCampaignResponse.HttpStatusCode"));
	 
	 	return pauseCampaignResponse;
	}
}