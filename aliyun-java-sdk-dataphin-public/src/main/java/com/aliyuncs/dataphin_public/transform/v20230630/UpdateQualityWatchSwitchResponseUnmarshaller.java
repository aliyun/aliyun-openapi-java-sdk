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

package com.aliyuncs.dataphin_public.transform.v20230630;

import com.aliyuncs.dataphin_public.model.v20230630.UpdateQualityWatchSwitchResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateQualityWatchSwitchResponseUnmarshaller {

	public static UpdateQualityWatchSwitchResponse unmarshall(UpdateQualityWatchSwitchResponse updateQualityWatchSwitchResponse, UnmarshallerContext _ctx) {
		
		updateQualityWatchSwitchResponse.setRequestId(_ctx.stringValue("UpdateQualityWatchSwitchResponse.RequestId"));
		updateQualityWatchSwitchResponse.setSuccess(_ctx.booleanValue("UpdateQualityWatchSwitchResponse.Success"));
		updateQualityWatchSwitchResponse.setHttpStatusCode(_ctx.integerValue("UpdateQualityWatchSwitchResponse.HttpStatusCode"));
		updateQualityWatchSwitchResponse.setCode(_ctx.stringValue("UpdateQualityWatchSwitchResponse.Code"));
		updateQualityWatchSwitchResponse.setMessage(_ctx.stringValue("UpdateQualityWatchSwitchResponse.Message"));
		updateQualityWatchSwitchResponse.setData(_ctx.integerValue("UpdateQualityWatchSwitchResponse.Data"));
	 
	 	return updateQualityWatchSwitchResponse;
	}
}