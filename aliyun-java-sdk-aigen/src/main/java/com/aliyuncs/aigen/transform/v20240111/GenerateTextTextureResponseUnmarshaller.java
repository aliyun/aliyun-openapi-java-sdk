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

package com.aliyuncs.aigen.transform.v20240111;

import com.aliyuncs.aigen.model.v20240111.GenerateTextTextureResponse;
import com.aliyuncs.aigen.model.v20240111.GenerateTextTextureResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GenerateTextTextureResponseUnmarshaller {

	public static GenerateTextTextureResponse unmarshall(GenerateTextTextureResponse generateTextTextureResponse, UnmarshallerContext _ctx) {
		
		generateTextTextureResponse.setRequestId(_ctx.stringValue("GenerateTextTextureResponse.RequestId"));
		generateTextTextureResponse.setMessage(_ctx.stringValue("GenerateTextTextureResponse.Message"));

		Data data = new Data();
		data.setResultUrl(_ctx.stringValue("GenerateTextTextureResponse.Data.ResultUrl"));
		generateTextTextureResponse.setData(data);
	 
	 	return generateTextTextureResponse;
	}
}