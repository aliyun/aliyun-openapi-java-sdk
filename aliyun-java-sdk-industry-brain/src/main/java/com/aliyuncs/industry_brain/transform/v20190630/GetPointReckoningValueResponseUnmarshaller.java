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

package com.aliyuncs.industry_brain.transform.v20190630;

import com.aliyuncs.industry_brain.model.v20190630.GetPointReckoningValueResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetPointReckoningValueResponseUnmarshaller {

	public static GetPointReckoningValueResponse unmarshall(GetPointReckoningValueResponse getPointReckoningValueResponse, UnmarshallerContext _ctx) {
		
		getPointReckoningValueResponse.setRequestId(_ctx.stringValue("GetPointReckoningValueResponse.RequestId"));
		getPointReckoningValueResponse.setData(_ctx.stringValue("GetPointReckoningValueResponse.Data"));
		getPointReckoningValueResponse.setCode(_ctx.stringValue("GetPointReckoningValueResponse.Code"));
		getPointReckoningValueResponse.setMessage(_ctx.stringValue("GetPointReckoningValueResponse.Message"));
	 
	 	return getPointReckoningValueResponse;
	}
}