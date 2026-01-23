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

import com.aliyuncs.dataphin_public.model.v20230630.DeleteQualityRulesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteQualityRulesResponseUnmarshaller {

	public static DeleteQualityRulesResponse unmarshall(DeleteQualityRulesResponse deleteQualityRulesResponse, UnmarshallerContext _ctx) {
		
		deleteQualityRulesResponse.setRequestId(_ctx.stringValue("DeleteQualityRulesResponse.RequestId"));
		deleteQualityRulesResponse.setSuccess(_ctx.booleanValue("DeleteQualityRulesResponse.Success"));
		deleteQualityRulesResponse.setHttpStatusCode(_ctx.integerValue("DeleteQualityRulesResponse.HttpStatusCode"));
		deleteQualityRulesResponse.setCode(_ctx.stringValue("DeleteQualityRulesResponse.Code"));
		deleteQualityRulesResponse.setMessage(_ctx.stringValue("DeleteQualityRulesResponse.Message"));
		deleteQualityRulesResponse.setData(_ctx.integerValue("DeleteQualityRulesResponse.Data"));
	 
	 	return deleteQualityRulesResponse;
	}
}