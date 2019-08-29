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

package com.aliyuncs.hiknoengine.transform.v20190625;

import com.aliyuncs.hiknoengine.model.v20190625.TranslateTextResponse;
import com.aliyuncs.hiknoengine.model.v20190625.TranslateTextResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class TranslateTextResponseUnmarshaller {

	public static TranslateTextResponse unmarshall(TranslateTextResponse translateTextResponse, UnmarshallerContext _ctx) {
		
		translateTextResponse.setRequestId(_ctx.stringValue("TranslateTextResponse.RequestId"));
		translateTextResponse.setCode(_ctx.stringValue("TranslateTextResponse.Code"));
		translateTextResponse.setMessage(_ctx.stringValue("TranslateTextResponse.Message"));

		Data data = new Data();
		data.setText(_ctx.stringValue("TranslateTextResponse.Data.Text"));
		translateTextResponse.setData(data);
	 
	 	return translateTextResponse;
	}
}