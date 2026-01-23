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

import com.aliyuncs.dataphin_public.model.v20230630.UpsertQualityWatchResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpsertQualityWatchResponseUnmarshaller {

	public static UpsertQualityWatchResponse unmarshall(UpsertQualityWatchResponse upsertQualityWatchResponse, UnmarshallerContext _ctx) {
		
		upsertQualityWatchResponse.setRequestId(_ctx.stringValue("UpsertQualityWatchResponse.RequestId"));
		upsertQualityWatchResponse.setSuccess(_ctx.booleanValue("UpsertQualityWatchResponse.Success"));
		upsertQualityWatchResponse.setHttpStatusCode(_ctx.integerValue("UpsertQualityWatchResponse.HttpStatusCode"));
		upsertQualityWatchResponse.setCode(_ctx.stringValue("UpsertQualityWatchResponse.Code"));
		upsertQualityWatchResponse.setMessage(_ctx.stringValue("UpsertQualityWatchResponse.Message"));
		upsertQualityWatchResponse.setData(_ctx.longValue("UpsertQualityWatchResponse.Data"));
	 
	 	return upsertQualityWatchResponse;
	}
}