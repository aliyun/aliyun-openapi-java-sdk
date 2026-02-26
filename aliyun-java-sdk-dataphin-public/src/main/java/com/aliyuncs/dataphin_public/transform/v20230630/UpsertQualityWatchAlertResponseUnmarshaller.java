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

import com.aliyuncs.dataphin_public.model.v20230630.UpsertQualityWatchAlertResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpsertQualityWatchAlertResponseUnmarshaller {

	public static UpsertQualityWatchAlertResponse unmarshall(UpsertQualityWatchAlertResponse upsertQualityWatchAlertResponse, UnmarshallerContext _ctx) {
		
		upsertQualityWatchAlertResponse.setRequestId(_ctx.stringValue("UpsertQualityWatchAlertResponse.RequestId"));
		upsertQualityWatchAlertResponse.setSuccess(_ctx.booleanValue("UpsertQualityWatchAlertResponse.Success"));
		upsertQualityWatchAlertResponse.setHttpStatusCode(_ctx.integerValue("UpsertQualityWatchAlertResponse.HttpStatusCode"));
		upsertQualityWatchAlertResponse.setCode(_ctx.stringValue("UpsertQualityWatchAlertResponse.Code"));
		upsertQualityWatchAlertResponse.setMessage(_ctx.stringValue("UpsertQualityWatchAlertResponse.Message"));
		upsertQualityWatchAlertResponse.setData(_ctx.booleanValue("UpsertQualityWatchAlertResponse.Data"));
	 
	 	return upsertQualityWatchAlertResponse;
	}
}