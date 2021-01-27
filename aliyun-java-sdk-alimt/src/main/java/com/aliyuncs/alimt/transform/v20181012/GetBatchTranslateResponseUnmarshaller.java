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

package com.aliyuncs.alimt.transform.v20181012;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.alimt.model.v20181012.GetBatchTranslateResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetBatchTranslateResponseUnmarshaller {

	public static GetBatchTranslateResponse unmarshall(GetBatchTranslateResponse getBatchTranslateResponse, UnmarshallerContext _ctx) {
		
		getBatchTranslateResponse.setRequestId(_ctx.stringValue("GetBatchTranslateResponse.RequestId"));
		getBatchTranslateResponse.setCode(_ctx.integerValue("GetBatchTranslateResponse.Code"));
		getBatchTranslateResponse.setMessage(_ctx.stringValue("GetBatchTranslateResponse.Message"));

		List<Map<Object, Object>> translatedList = _ctx.listMapValue("GetBatchTranslateResponse.TranslatedList");
		getBatchTranslateResponse.setTranslatedList(translatedList);
	 
	 	return getBatchTranslateResponse;
	}
}