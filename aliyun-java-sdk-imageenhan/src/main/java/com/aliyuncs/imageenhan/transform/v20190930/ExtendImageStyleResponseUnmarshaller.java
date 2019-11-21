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

package com.aliyuncs.imageenhan.transform.v20190930;

import com.aliyuncs.imageenhan.model.v20190930.ExtendImageStyleResponse;
import com.aliyuncs.imageenhan.model.v20190930.ExtendImageStyleResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class ExtendImageStyleResponseUnmarshaller {

	public static ExtendImageStyleResponse unmarshall(ExtendImageStyleResponse extendImageStyleResponse, UnmarshallerContext _ctx) {
		
		extendImageStyleResponse.setRequestId(_ctx.stringValue("ExtendImageStyleResponse.RequestId"));
		extendImageStyleResponse.setCode(_ctx.stringValue("ExtendImageStyleResponse.Code"));
		extendImageStyleResponse.setMessage(_ctx.stringValue("ExtendImageStyleResponse.Message"));

		Data data = new Data();
		data.setUrl(_ctx.stringValue("ExtendImageStyleResponse.Data.Url"));
		data.setMajorUrl(_ctx.stringValue("ExtendImageStyleResponse.Data.MajorUrl"));
		extendImageStyleResponse.setData(data);
	 
	 	return extendImageStyleResponse;
	}
}