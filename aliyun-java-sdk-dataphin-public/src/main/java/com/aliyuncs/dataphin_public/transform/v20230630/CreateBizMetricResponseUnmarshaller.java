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

package com.aliyuncs.dataphin_public.transform.v20230630;

import com.aliyuncs.dataphin_public.model.v20230630.CreateBizMetricResponse;
import com.aliyuncs.dataphin_public.model.v20230630.CreateBizMetricResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateBizMetricResponseUnmarshaller {

	public static CreateBizMetricResponse unmarshall(CreateBizMetricResponse createBizMetricResponse, UnmarshallerContext _ctx) {
		
		createBizMetricResponse.setRequestId(_ctx.stringValue("CreateBizMetricResponse.RequestId"));
		createBizMetricResponse.setSuccess(_ctx.booleanValue("CreateBizMetricResponse.Success"));
		createBizMetricResponse.setHttpStatusCode(_ctx.integerValue("CreateBizMetricResponse.HttpStatusCode"));
		createBizMetricResponse.setCode(_ctx.stringValue("CreateBizMetricResponse.Code"));
		createBizMetricResponse.setMessage(_ctx.stringValue("CreateBizMetricResponse.Message"));

		Data data = new Data();
		data.setSuccess(_ctx.booleanValue("CreateBizMetricResponse.Data.Success"));
		data.setMessage(_ctx.stringValue("CreateBizMetricResponse.Data.Message"));
		createBizMetricResponse.setData(data);
	 
	 	return createBizMetricResponse;
	}
}