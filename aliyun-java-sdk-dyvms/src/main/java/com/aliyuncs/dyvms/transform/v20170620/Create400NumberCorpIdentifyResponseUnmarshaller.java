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

package com.aliyuncs.dyvms.transform.v20170620;

import com.aliyuncs.dyvms.model.v20170620.Create400NumberCorpIdentifyResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class Create400NumberCorpIdentifyResponseUnmarshaller {

	public static Create400NumberCorpIdentifyResponse unmarshall(Create400NumberCorpIdentifyResponse create400NumberCorpIdentifyResponse, UnmarshallerContext _ctx) {
		
		create400NumberCorpIdentifyResponse.setRequestId(_ctx.stringValue("Create400NumberCorpIdentifyResponse.RequestId"));
		create400NumberCorpIdentifyResponse.setCode(_ctx.stringValue("Create400NumberCorpIdentifyResponse.code"));
		create400NumberCorpIdentifyResponse.setData(_ctx.stringValue("Create400NumberCorpIdentifyResponse.data"));
	 
	 	return create400NumberCorpIdentifyResponse;
	}
}