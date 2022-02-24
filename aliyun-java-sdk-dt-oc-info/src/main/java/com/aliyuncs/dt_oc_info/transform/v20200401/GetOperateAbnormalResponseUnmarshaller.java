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

package com.aliyuncs.dt_oc_info.transform.v20200401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dt_oc_info.model.v20200401.GetOperateAbnormalResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetOperateAbnormalResponseUnmarshaller {

	public static GetOperateAbnormalResponse unmarshall(GetOperateAbnormalResponse getOperateAbnormalResponse, UnmarshallerContext _ctx) {
		
		getOperateAbnormalResponse.setRequestId(_ctx.stringValue("GetOperateAbnormalResponse.RequestId"));
		getOperateAbnormalResponse.setCode(_ctx.integerValue("GetOperateAbnormalResponse.Code"));
		getOperateAbnormalResponse.setMessage(_ctx.stringValue("GetOperateAbnormalResponse.Message"));
		getOperateAbnormalResponse.setTotal(_ctx.integerValue("GetOperateAbnormalResponse.Total"));

		List<String> data = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetOperateAbnormalResponse.Data.Length"); i++) {
			data.add(_ctx.stringValue("GetOperateAbnormalResponse.Data["+ i +"]"));
		}
		getOperateAbnormalResponse.setData(data);
	 
	 	return getOperateAbnormalResponse;
	}
}