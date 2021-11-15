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

package com.aliyuncs.unimkt.transform.v20181212;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.unimkt.model.v20181212.GetMainPartListResponse;
import com.aliyuncs.unimkt.model.v20181212.GetMainPartListResponse.Data;
import com.aliyuncs.unimkt.model.v20181212.GetMainPartListResponse.Data.MainPartBizs;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMainPartListResponseUnmarshaller {

	public static GetMainPartListResponse unmarshall(GetMainPartListResponse getMainPartListResponse, UnmarshallerContext _ctx) {
		
		getMainPartListResponse.setRequestId(_ctx.stringValue("GetMainPartListResponse.RequestId"));
		getMainPartListResponse.setCode(_ctx.longValue("GetMainPartListResponse.Code"));
		getMainPartListResponse.setSuccess(_ctx.booleanValue("GetMainPartListResponse.Success"));

		Data data = new Data();
		data.setCount(_ctx.longValue("GetMainPartListResponse.Data.Count"));

		List<MainPartBizs> list = new ArrayList<MainPartBizs>();
		for (int i = 0; i < _ctx.lengthValue("GetMainPartListResponse.Data.List.Length"); i++) {
			MainPartBizs mainPartBizs = new MainPartBizs();
			mainPartBizs.setAccountNo(_ctx.stringValue("GetMainPartListResponse.Data.List["+ i +"].AccountNo"));
			mainPartBizs.setAccountType(_ctx.stringValue("GetMainPartListResponse.Data.List["+ i +"].AccountType"));
			mainPartBizs.setBrandUserId(_ctx.longValue("GetMainPartListResponse.Data.List["+ i +"].BrandUserId"));
			mainPartBizs.setBrandUserNick(_ctx.stringValue("GetMainPartListResponse.Data.List["+ i +"].BrandUserNick"));
			mainPartBizs.setMainId(_ctx.longValue("GetMainPartListResponse.Data.List["+ i +"].MainId"));
			mainPartBizs.setMainName(_ctx.stringValue("GetMainPartListResponse.Data.List["+ i +"].MainName"));
			mainPartBizs.setProxyUserId(_ctx.longValue("GetMainPartListResponse.Data.List["+ i +"].ProxyUserId"));

			list.add(mainPartBizs);
		}
		data.setList(list);
		getMainPartListResponse.setData(data);
	 
	 	return getMainPartListResponse;
	}
}