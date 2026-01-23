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

import com.aliyuncs.dataphin_public.model.v20230630.UpsertQualityTemplateResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpsertQualityTemplateResponseUnmarshaller {

	public static UpsertQualityTemplateResponse unmarshall(UpsertQualityTemplateResponse upsertQualityTemplateResponse, UnmarshallerContext _ctx) {
		
		upsertQualityTemplateResponse.setRequestId(_ctx.stringValue("UpsertQualityTemplateResponse.RequestId"));
		upsertQualityTemplateResponse.setSuccess(_ctx.booleanValue("UpsertQualityTemplateResponse.Success"));
		upsertQualityTemplateResponse.setHttpStatusCode(_ctx.integerValue("UpsertQualityTemplateResponse.HttpStatusCode"));
		upsertQualityTemplateResponse.setCode(_ctx.stringValue("UpsertQualityTemplateResponse.Code"));
		upsertQualityTemplateResponse.setMessage(_ctx.stringValue("UpsertQualityTemplateResponse.Message"));
		upsertQualityTemplateResponse.setData(_ctx.longValue("UpsertQualityTemplateResponse.Data"));
	 
	 	return upsertQualityTemplateResponse;
	}
}