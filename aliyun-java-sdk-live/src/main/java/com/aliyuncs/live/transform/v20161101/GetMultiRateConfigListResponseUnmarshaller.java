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

package com.aliyuncs.live.transform.v20161101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.live.model.v20161101.GetMultiRateConfigListResponse;
import com.aliyuncs.live.model.v20161101.GetMultiRateConfigListResponse.Info;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMultiRateConfigListResponseUnmarshaller {

	public static GetMultiRateConfigListResponse unmarshall(GetMultiRateConfigListResponse getMultiRateConfigListResponse, UnmarshallerContext _ctx) {
		
		getMultiRateConfigListResponse.setRequestId(_ctx.stringValue("GetMultiRateConfigListResponse.RequestId"));
		getMultiRateConfigListResponse.setMessage(_ctx.stringValue("GetMultiRateConfigListResponse.Message"));
		getMultiRateConfigListResponse.setCode(_ctx.integerValue("GetMultiRateConfigListResponse.Code"));

		List<Info> groupInfo = new ArrayList<Info>();
		for (int i = 0; i < _ctx.lengthValue("GetMultiRateConfigListResponse.GroupInfo.Length"); i++) {
			Info info = new Info();
			info.setApp(_ctx.stringValue("GetMultiRateConfigListResponse.GroupInfo["+ i +"].App"));
			info.setAvFormat(_ctx.stringValue("GetMultiRateConfigListResponse.GroupInfo["+ i +"].AvFormat"));
			info.setGroupId(_ctx.stringValue("GetMultiRateConfigListResponse.GroupInfo["+ i +"].GroupId"));
			info.setCount(_ctx.integerValue("GetMultiRateConfigListResponse.GroupInfo["+ i +"].Count"));

			groupInfo.add(info);
		}
		getMultiRateConfigListResponse.setGroupInfo(groupInfo);
	 
	 	return getMultiRateConfigListResponse;
	}
}