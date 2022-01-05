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

import com.aliyuncs.ccc.model.v20200701.CreateCampaignResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateCampaignResponseUnmarshaller {

	public static CreateCampaignResponse unmarshall(CreateCampaignResponse createCampaignResponse, UnmarshallerContext _ctx) {
		
		createCampaignResponse.setRequestId(_ctx.stringValue("CreateCampaignResponse.RequestId"));
		createCampaignResponse.setData(_ctx.stringValue("CreateCampaignResponse.Data"));
		createCampaignResponse.setCode(_ctx.stringValue("CreateCampaignResponse.Code"));
		createCampaignResponse.setMessage(_ctx.stringValue("CreateCampaignResponse.Message"));
		createCampaignResponse.setHttpStatusCode(_ctx.longValue("CreateCampaignResponse.HttpStatusCode"));
	 
	 	return createCampaignResponse;
	}
}