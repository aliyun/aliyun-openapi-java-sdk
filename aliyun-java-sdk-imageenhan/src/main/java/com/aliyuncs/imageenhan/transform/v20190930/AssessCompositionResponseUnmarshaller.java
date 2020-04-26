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

import com.aliyuncs.imageenhan.model.v20190930.AssessCompositionResponse;
import com.aliyuncs.imageenhan.model.v20190930.AssessCompositionResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class AssessCompositionResponseUnmarshaller {

	public static AssessCompositionResponse unmarshall(AssessCompositionResponse assessCompositionResponse, UnmarshallerContext _ctx) {
		
		assessCompositionResponse.setRequestId(_ctx.stringValue("AssessCompositionResponse.RequestId"));

		Data data = new Data();
		data.setScore(_ctx.floatValue("AssessCompositionResponse.Data.Score"));
		assessCompositionResponse.setData(data);
	 
	 	return assessCompositionResponse;
	}
}