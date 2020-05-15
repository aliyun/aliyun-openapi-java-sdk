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

package com.aliyuncs.ivpd.transform.v20190625;

import com.aliyuncs.ivpd.model.v20190625.GetRenderResultResponse;
import com.aliyuncs.ivpd.model.v20190625.GetRenderResultResponse.Data;
import com.aliyuncs.ivpd.model.v20190625.GetRenderResultResponse.Data.ResultData;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetRenderResultResponseUnmarshaller {

	public static GetRenderResultResponse unmarshall(GetRenderResultResponse getRenderResultResponse, UnmarshallerContext _ctx) {
		
		getRenderResultResponse.setRequestId(_ctx.stringValue("GetRenderResultResponse.RequestId"));
		getRenderResultResponse.setCode(_ctx.stringValue("GetRenderResultResponse.Code"));
		getRenderResultResponse.setMessage(_ctx.stringValue("GetRenderResultResponse.Message"));

		Data data = new Data();
		data.setCompleted(_ctx.booleanValue("GetRenderResultResponse.Data.Completed"));
		data.setProgress(_ctx.floatValue("GetRenderResultResponse.Data.Progress"));
		data.setCode(_ctx.stringValue("GetRenderResultResponse.Data.Code"));
		data.setMessage(_ctx.stringValue("GetRenderResultResponse.Data.Message"));

		ResultData resultData = new ResultData();
		resultData.setImageUrl(_ctx.stringValue("GetRenderResultResponse.Data.ResultData.ImageUrl"));
		data.setResultData(resultData);
		getRenderResultResponse.setData(data);
	 
	 	return getRenderResultResponse;
	}
}