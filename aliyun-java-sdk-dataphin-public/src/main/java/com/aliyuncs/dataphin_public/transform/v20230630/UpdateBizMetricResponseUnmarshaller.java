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

import com.aliyuncs.dataphin_public.model.v20230630.UpdateBizMetricResponse;
import com.aliyuncs.dataphin_public.model.v20230630.UpdateBizMetricResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateBizMetricResponseUnmarshaller {

	public static UpdateBizMetricResponse unmarshall(UpdateBizMetricResponse updateBizMetricResponse, UnmarshallerContext _ctx) {
		
		updateBizMetricResponse.setRequestId(_ctx.stringValue("UpdateBizMetricResponse.RequestId"));
		updateBizMetricResponse.setSuccess(_ctx.booleanValue("UpdateBizMetricResponse.Success"));
		updateBizMetricResponse.setHttpStatusCode(_ctx.integerValue("UpdateBizMetricResponse.HttpStatusCode"));
		updateBizMetricResponse.setCode(_ctx.stringValue("UpdateBizMetricResponse.Code"));
		updateBizMetricResponse.setMessage(_ctx.stringValue("UpdateBizMetricResponse.Message"));

		Data data = new Data();
		data.setSuccess(_ctx.booleanValue("UpdateBizMetricResponse.Data.Success"));
		data.setMessage(_ctx.stringValue("UpdateBizMetricResponse.Data.Message"));
		updateBizMetricResponse.setData(data);
	 
	 	return updateBizMetricResponse;
	}
}