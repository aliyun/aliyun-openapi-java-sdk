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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataphin_public.model.v20230630.GetSparkLocalClientInfoResponse;
import com.aliyuncs.dataphin_public.model.v20230630.GetSparkLocalClientInfoResponse.SparkLocalClientInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSparkLocalClientInfoResponseUnmarshaller {

	public static GetSparkLocalClientInfoResponse unmarshall(GetSparkLocalClientInfoResponse getSparkLocalClientInfoResponse, UnmarshallerContext _ctx) {
		
		getSparkLocalClientInfoResponse.setRequestId(_ctx.stringValue("GetSparkLocalClientInfoResponse.RequestId"));
		getSparkLocalClientInfoResponse.setSuccess(_ctx.booleanValue("GetSparkLocalClientInfoResponse.Success"));
		getSparkLocalClientInfoResponse.setHttpStatusCode(_ctx.integerValue("GetSparkLocalClientInfoResponse.HttpStatusCode"));
		getSparkLocalClientInfoResponse.setCode(_ctx.stringValue("GetSparkLocalClientInfoResponse.Code"));
		getSparkLocalClientInfoResponse.setMessage(_ctx.stringValue("GetSparkLocalClientInfoResponse.Message"));

		List<SparkLocalClientInfo> data = new ArrayList<SparkLocalClientInfo>();
		for (int i = 0; i < _ctx.lengthValue("GetSparkLocalClientInfoResponse.Data.Length"); i++) {
			SparkLocalClientInfo sparkLocalClientInfo = new SparkLocalClientInfo();
			sparkLocalClientInfo.setClientName(_ctx.stringValue("GetSparkLocalClientInfoResponse.Data["+ i +"].ClientName"));
			sparkLocalClientInfo.setClientFileResourceName(_ctx.stringValue("GetSparkLocalClientInfoResponse.Data["+ i +"].ClientFileResourceName"));
			sparkLocalClientInfo.setClientFileResourceId(_ctx.stringValue("GetSparkLocalClientInfoResponse.Data["+ i +"].ClientFileResourceId"));
			sparkLocalClientInfo.setEditable(_ctx.booleanValue("GetSparkLocalClientInfoResponse.Data["+ i +"].Editable"));

			data.add(sparkLocalClientInfo);
		}
		getSparkLocalClientInfoResponse.setData(data);
	 
	 	return getSparkLocalClientInfoResponse;
	}
}