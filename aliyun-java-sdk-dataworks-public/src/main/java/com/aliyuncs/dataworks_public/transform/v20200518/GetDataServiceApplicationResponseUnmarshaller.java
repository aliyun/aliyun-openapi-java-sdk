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

import com.aliyuncs.dataworks_public.model.v20200518.GetDataServiceApplicationResponse;
import com.aliyuncs.dataworks_public.model.v20200518.GetDataServiceApplicationResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDataServiceApplicationResponseUnmarshaller {

	public static GetDataServiceApplicationResponse unmarshall(GetDataServiceApplicationResponse getDataServiceApplicationResponse, UnmarshallerContext _ctx) {
		
		getDataServiceApplicationResponse.setRequestId(_ctx.stringValue("GetDataServiceApplicationResponse.RequestId"));
		getDataServiceApplicationResponse.setHttpStatusCode(_ctx.integerValue("GetDataServiceApplicationResponse.HttpStatusCode"));
		getDataServiceApplicationResponse.setErrorMessage(_ctx.stringValue("GetDataServiceApplicationResponse.ErrorMessage"));
		getDataServiceApplicationResponse.setSuccess(_ctx.booleanValue("GetDataServiceApplicationResponse.Success"));
		getDataServiceApplicationResponse.setErrorCode(_ctx.stringValue("GetDataServiceApplicationResponse.ErrorCode"));

		Data data = new Data();
		data.setApplicationCode(_ctx.stringValue("GetDataServiceApplicationResponse.Data.ApplicationCode"));
		data.setApplicationKey(_ctx.stringValue("GetDataServiceApplicationResponse.Data.ApplicationKey"));
		data.setApplicationSecret(_ctx.stringValue("GetDataServiceApplicationResponse.Data.ApplicationSecret"));
		data.setProjectId(_ctx.longValue("GetDataServiceApplicationResponse.Data.ProjectId"));
		data.setApplicationName(_ctx.stringValue("GetDataServiceApplicationResponse.Data.ApplicationName"));
		data.setApplicationId(_ctx.longValue("GetDataServiceApplicationResponse.Data.ApplicationId"));
		getDataServiceApplicationResponse.setData(data);
	 
	 	return getDataServiceApplicationResponse;
	}
}