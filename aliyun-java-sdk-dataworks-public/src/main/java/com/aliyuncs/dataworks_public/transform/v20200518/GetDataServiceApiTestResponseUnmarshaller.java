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

package com.aliyuncs.dataworks_public.transform.v20200518;

import com.aliyuncs.dataworks_public.model.v20200518.GetDataServiceApiTestResponse;
import com.aliyuncs.dataworks_public.model.v20200518.GetDataServiceApiTestResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDataServiceApiTestResponseUnmarshaller {

	public static GetDataServiceApiTestResponse unmarshall(GetDataServiceApiTestResponse getDataServiceApiTestResponse, UnmarshallerContext _ctx) {
		
		getDataServiceApiTestResponse.setRequestId(_ctx.stringValue("GetDataServiceApiTestResponse.RequestId"));

		Data data = new Data();
		data.setApiId(_ctx.longValue("GetDataServiceApiTestResponse.Data.ApiId"));
		data.setParamMap(_ctx.stringValue("GetDataServiceApiTestResponse.Data.ParamMap"));
		data.setRetCode(_ctx.longValue("GetDataServiceApiTestResponse.Data.RetCode"));
		data.setRetResult(_ctx.stringValue("GetDataServiceApiTestResponse.Data.RetResult"));
		data.setDebugInfo(_ctx.stringValue("GetDataServiceApiTestResponse.Data.DebugInfo"));
		data.setCostTime(_ctx.stringValue("GetDataServiceApiTestResponse.Data.CostTime"));
		data.setNodesDebugInfo(_ctx.stringValue("GetDataServiceApiTestResponse.Data.NodesDebugInfo"));
		data.setStatus(_ctx.stringValue("GetDataServiceApiTestResponse.Data.Status"));
		getDataServiceApiTestResponse.setData(data);
	 
	 	return getDataServiceApiTestResponse;
	}
}