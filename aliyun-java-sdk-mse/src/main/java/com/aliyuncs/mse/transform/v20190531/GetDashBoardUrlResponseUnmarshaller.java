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

package com.aliyuncs.mse.transform.v20190531;

import com.aliyuncs.mse.model.v20190531.GetDashBoardUrlResponse;
import com.aliyuncs.mse.model.v20190531.GetDashBoardUrlResponse.Data;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDashBoardUrlResponseUnmarshaller {

	public static GetDashBoardUrlResponse unmarshall(GetDashBoardUrlResponse getDashBoardUrlResponse, UnmarshallerContext _ctx) {
		
		getDashBoardUrlResponse.setRequestId(_ctx.stringValue("GetDashBoardUrlResponse.RequestId"));
		getDashBoardUrlResponse.setSuccess(_ctx.booleanValue("GetDashBoardUrlResponse.Success"));
		getDashBoardUrlResponse.setMessage(_ctx.stringValue("GetDashBoardUrlResponse.Message"));
		getDashBoardUrlResponse.setErrorCode(_ctx.stringValue("GetDashBoardUrlResponse.ErrorCode"));
		getDashBoardUrlResponse.setHttpCode(_ctx.stringValue("GetDashBoardUrlResponse.HttpCode"));

		Data data = new Data();
		data.setUrlMap(_ctx.mapValue("GetDashBoardUrlResponse.Data.UrlMap"));
		data.setMessage(_ctx.stringValue("GetDashBoardUrlResponse.Data.Message"));
		getDashBoardUrlResponse.setData(data);
	 
	 	return getDashBoardUrlResponse;
	}
}