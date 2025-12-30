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

import com.aliyuncs.dataphin_public.model.v20230630.DeleteBizMetricResponse;
import com.aliyuncs.dataphin_public.model.v20230630.DeleteBizMetricResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteBizMetricResponseUnmarshaller {

	public static DeleteBizMetricResponse unmarshall(DeleteBizMetricResponse deleteBizMetricResponse, UnmarshallerContext _ctx) {
		
		deleteBizMetricResponse.setRequestId(_ctx.stringValue("DeleteBizMetricResponse.RequestId"));
		deleteBizMetricResponse.setSuccess(_ctx.booleanValue("DeleteBizMetricResponse.Success"));
		deleteBizMetricResponse.setHttpStatusCode(_ctx.integerValue("DeleteBizMetricResponse.HttpStatusCode"));
		deleteBizMetricResponse.setCode(_ctx.stringValue("DeleteBizMetricResponse.Code"));
		deleteBizMetricResponse.setMessage(_ctx.stringValue("DeleteBizMetricResponse.Message"));

		Data data = new Data();
		data.setSuccess(_ctx.booleanValue("DeleteBizMetricResponse.Data.Success"));
		data.setMessage(_ctx.stringValue("DeleteBizMetricResponse.Data.Message"));
		deleteBizMetricResponse.setData(data);
	 
	 	return deleteBizMetricResponse;
	}
}