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

import com.aliyuncs.alimt.model.v20181012.GetTitleGenerateResponse;
import com.aliyuncs.alimt.model.v20181012.GetTitleGenerateResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTitleGenerateResponseUnmarshaller {

	public static GetTitleGenerateResponse unmarshall(GetTitleGenerateResponse getTitleGenerateResponse, UnmarshallerContext _ctx) {
		
		getTitleGenerateResponse.setRequestId(_ctx.stringValue("GetTitleGenerateResponse.RequestId"));
		getTitleGenerateResponse.setCode(_ctx.integerValue("GetTitleGenerateResponse.Code"));
		getTitleGenerateResponse.setMessage(_ctx.stringValue("GetTitleGenerateResponse.Message"));

		Data data = new Data();
		data.setTitles(_ctx.stringValue("GetTitleGenerateResponse.Data.Titles"));
		getTitleGenerateResponse.setData(data);
	 
	 	return getTitleGenerateResponse;
	}
}