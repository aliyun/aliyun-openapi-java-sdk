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

import com.aliyuncs.imageenhan.model.v20190930.AssessSharpnessResponse;
import com.aliyuncs.imageenhan.model.v20190930.AssessSharpnessResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class AssessSharpnessResponseUnmarshaller {

	public static AssessSharpnessResponse unmarshall(AssessSharpnessResponse assessSharpnessResponse, UnmarshallerContext _ctx) {
		
		assessSharpnessResponse.setRequestId(_ctx.stringValue("AssessSharpnessResponse.RequestId"));

		Data data = new Data();
		data.setSharpness(_ctx.floatValue("AssessSharpnessResponse.Data.Sharpness"));
		assessSharpnessResponse.setData(data);
	 
	 	return assessSharpnessResponse;
	}
}