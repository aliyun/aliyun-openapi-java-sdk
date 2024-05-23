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

import com.aliyuncs.ccc.model.v20200701.UpdateCampaignResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateCampaignResponseUnmarshaller {

	public static UpdateCampaignResponse unmarshall(UpdateCampaignResponse updateCampaignResponse, UnmarshallerContext _ctx) {
		
		updateCampaignResponse.setRequestId(_ctx.stringValue("UpdateCampaignResponse.RequestId"));
		updateCampaignResponse.setCode(_ctx.stringValue("UpdateCampaignResponse.Code"));
		updateCampaignResponse.setMessage(_ctx.stringValue("UpdateCampaignResponse.Message"));
		updateCampaignResponse.setHttpStatusCode(_ctx.longValue("UpdateCampaignResponse.HttpStatusCode"));
	 
	 	return updateCampaignResponse;
	}
}