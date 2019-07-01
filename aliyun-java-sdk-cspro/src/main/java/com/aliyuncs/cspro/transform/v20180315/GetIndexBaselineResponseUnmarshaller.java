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

package com.aliyuncs.cspro.transform.v20180315;

import com.aliyuncs.cspro.model.v20180315.GetIndexBaselineResponse;
import com.aliyuncs.cspro.model.v20180315.GetIndexBaselineResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetIndexBaselineResponseUnmarshaller {

	public static GetIndexBaselineResponse unmarshall(GetIndexBaselineResponse getIndexBaselineResponse, UnmarshallerContext _ctx) {
		
		getIndexBaselineResponse.setSuccess(_ctx.booleanValue("GetIndexBaselineResponse.Success"));
		getIndexBaselineResponse.setCode(_ctx.stringValue("GetIndexBaselineResponse.Code"));
		getIndexBaselineResponse.setMessage(_ctx.stringValue("GetIndexBaselineResponse.Message"));

		Data data = new Data();
		data.setBaselinePic(_ctx.stringValue("GetIndexBaselineResponse.Data.BaselinePic"));
		data.setBaselineSource(_ctx.stringValue("GetIndexBaselineResponse.Data.BaselineSource"));
		data.setCheckId(_ctx.longValue("GetIndexBaselineResponse.Data.CheckId"));
		getIndexBaselineResponse.setData(data);
	 
	 	return getIndexBaselineResponse;
	}
}