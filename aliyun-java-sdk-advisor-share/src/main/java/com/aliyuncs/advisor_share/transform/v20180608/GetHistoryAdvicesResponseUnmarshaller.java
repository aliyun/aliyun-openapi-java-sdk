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

import com.aliyuncs.advisor_share.model.v20180608.GetHistoryAdvicesResponse;
import com.aliyuncs.advisor_share.model.v20180608.GetHistoryAdvicesResponse.Data;
import com.aliyuncs.advisor_share.model.v20180608.GetHistoryAdvicesResponse.Data.Advice;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetHistoryAdvicesResponseUnmarshaller {

	public static GetHistoryAdvicesResponse unmarshall(GetHistoryAdvicesResponse getHistoryAdvicesResponse, UnmarshallerContext _ctx) {
		
		getHistoryAdvicesResponse.setRequestId(_ctx.stringValue("GetHistoryAdvicesResponse.RequestId"));

		Data data = new Data();
		data.setPageNo(_ctx.integerValue("GetHistoryAdvicesResponse.Data.PageNo"));
		data.setTotal(_ctx.integerValue("GetHistoryAdvicesResponse.Data.Total"));

		List<Advice> result = new ArrayList<Advice>();
		for (int i = 0; i < _ctx.lengthValue("GetHistoryAdvicesResponse.Data.Result.Length"); i++) {
			Advice advice = new Advice();
			advice.setSeverity(_ctx.integerValue("GetHistoryAdvicesResponse.Data.Result["+ i +"].Severity"));
			advice.setProduct(_ctx.stringValue("GetHistoryAdvicesResponse.Data.Result["+ i +"].Product"));
			advice.setGmtCreated(_ctx.stringValue("GetHistoryAdvicesResponse.Data.Result["+ i +"].GmtCreated"));
			advice.setDescription(_ctx.stringValue("GetHistoryAdvicesResponse.Data.Result["+ i +"].Description"));
			advice.setCheckId(_ctx.stringValue("GetHistoryAdvicesResponse.Data.Result["+ i +"].CheckId"));
			advice.setResourceId(_ctx.stringValue("GetHistoryAdvicesResponse.Data.Result["+ i +"].ResourceId"));
			advice.setCheckName(_ctx.stringValue("GetHistoryAdvicesResponse.Data.Result["+ i +"].CheckName"));
			advice.setUrl(_ctx.stringValue("GetHistoryAdvicesResponse.Data.Result["+ i +"].Url"));

			result.add(advice);
		}
		data.setResult(result);
		getHistoryAdvicesResponse.setData(data);
	 
	 	return getHistoryAdvicesResponse;
	}
}