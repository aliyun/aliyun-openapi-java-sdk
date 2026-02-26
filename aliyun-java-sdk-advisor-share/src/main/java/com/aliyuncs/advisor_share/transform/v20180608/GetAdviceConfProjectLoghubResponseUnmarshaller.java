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

package com.aliyuncs.advisor_share.transform.v20180608;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.advisor_share.model.v20180608.GetAdviceConfProjectLoghubResponse;
import com.aliyuncs.advisor_share.model.v20180608.GetAdviceConfProjectLoghubResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAdviceConfProjectLoghubResponseUnmarshaller {

	public static GetAdviceConfProjectLoghubResponse unmarshall(GetAdviceConfProjectLoghubResponse getAdviceConfProjectLoghubResponse, UnmarshallerContext _ctx) {
		
		getAdviceConfProjectLoghubResponse.setRequestId(_ctx.stringValue("GetAdviceConfProjectLoghubResponse.RequestId"));
		getAdviceConfProjectLoghubResponse.setMessage(_ctx.stringValue("GetAdviceConfProjectLoghubResponse.Message"));
		getAdviceConfProjectLoghubResponse.setSuccess(_ctx.booleanValue("GetAdviceConfProjectLoghubResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetAdviceConfProjectLoghubResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setAccessKey(_ctx.stringValue("GetAdviceConfProjectLoghubResponse.Data["+ i +"].AccessKey"));
			dataItem.setRegion(_ctx.stringValue("GetAdviceConfProjectLoghubResponse.Data["+ i +"].Region"));
			dataItem.setProfiles(_ctx.stringValue("GetAdviceConfProjectLoghubResponse.Data["+ i +"].Profiles"));
			dataItem.setEndpoint(_ctx.stringValue("GetAdviceConfProjectLoghubResponse.Data["+ i +"].Endpoint"));
			dataItem.setLogstore(_ctx.stringValue("GetAdviceConfProjectLoghubResponse.Data["+ i +"].Logstore"));
			dataItem.setProject(_ctx.stringValue("GetAdviceConfProjectLoghubResponse.Data["+ i +"].Project"));
			dataItem.setAccessId(_ctx.stringValue("GetAdviceConfProjectLoghubResponse.Data["+ i +"].AccessId"));
			dataItem.setId(_ctx.longValue("GetAdviceConfProjectLoghubResponse.Data["+ i +"].Id"));

			data.add(dataItem);
		}
		getAdviceConfProjectLoghubResponse.setData(data);
	 
	 	return getAdviceConfProjectLoghubResponse;
	}
}