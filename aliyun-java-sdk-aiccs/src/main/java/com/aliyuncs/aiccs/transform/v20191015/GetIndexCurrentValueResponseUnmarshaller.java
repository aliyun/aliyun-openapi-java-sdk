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

package com.aliyuncs.aiccs.transform.v20191015;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.aiccs.model.v20191015.GetIndexCurrentValueResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetIndexCurrentValueResponseUnmarshaller {

	public static GetIndexCurrentValueResponse unmarshall(GetIndexCurrentValueResponse getIndexCurrentValueResponse, UnmarshallerContext _ctx) {
		
		getIndexCurrentValueResponse.setRequestId(_ctx.stringValue("GetIndexCurrentValueResponse.RequestId"));
		getIndexCurrentValueResponse.setSuccess(_ctx.booleanValue("GetIndexCurrentValueResponse.Success"));
		getIndexCurrentValueResponse.setCode(_ctx.stringValue("GetIndexCurrentValueResponse.Code"));
		getIndexCurrentValueResponse.setMessage(_ctx.stringValue("GetIndexCurrentValueResponse.Message"));

		List<Map<Object, Object>> data = _ctx.listMapValue("GetIndexCurrentValueResponse.Data");
		getIndexCurrentValueResponse.setData(data);
	 
	 	return getIndexCurrentValueResponse;
	}
}