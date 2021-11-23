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

package com.aliyuncs.rtc.transform.v20180111;

import com.aliyuncs.rtc.model.v20180111.CreateRecordIndexFileResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateRecordIndexFileResponseUnmarshaller {

	public static CreateRecordIndexFileResponse unmarshall(CreateRecordIndexFileResponse createRecordIndexFileResponse, UnmarshallerContext _ctx) {
		
		createRecordIndexFileResponse.setRequestId(_ctx.stringValue("CreateRecordIndexFileResponse.RequestId"));
		createRecordIndexFileResponse.setUrl(_ctx.stringValue("CreateRecordIndexFileResponse.Url"));
		createRecordIndexFileResponse.setDuration(_ctx.floatValue("CreateRecordIndexFileResponse.Duration"));
		createRecordIndexFileResponse.setWidth(_ctx.integerValue("CreateRecordIndexFileResponse.Width"));
		createRecordIndexFileResponse.setHeight(_ctx.integerValue("CreateRecordIndexFileResponse.Height"));
	 
	 	return createRecordIndexFileResponse;
	}
}