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

package com.aliyuncs.dms_enterprise.transform.v20181101;

import com.aliyuncs.dms_enterprise.model.v20181101.GetDataArchiveCountResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.GetDataArchiveCountResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDataArchiveCountResponseUnmarshaller {

	public static GetDataArchiveCountResponse unmarshall(GetDataArchiveCountResponse getDataArchiveCountResponse, UnmarshallerContext _ctx) {
		
		getDataArchiveCountResponse.setRequestId(_ctx.stringValue("GetDataArchiveCountResponse.RequestId"));
		getDataArchiveCountResponse.setSuccess(_ctx.booleanValue("GetDataArchiveCountResponse.Success"));

		Data data = new Data();
		data.setFailCount(_ctx.longValue("GetDataArchiveCountResponse.Data.FailCount"));
		data.setProcessingCount(_ctx.longValue("GetDataArchiveCountResponse.Data.ProcessingCount"));
		data.setSuccessCount(_ctx.longValue("GetDataArchiveCountResponse.Data.SuccessCount"));
		data.setTotalCount(_ctx.longValue("GetDataArchiveCountResponse.Data.TotalCount"));
		getDataArchiveCountResponse.setData(data);
	 
	 	return getDataArchiveCountResponse;
	}
}