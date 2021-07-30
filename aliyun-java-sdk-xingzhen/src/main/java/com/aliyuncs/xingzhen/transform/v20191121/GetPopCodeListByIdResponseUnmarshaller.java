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

package com.aliyuncs.xingzhen.transform.v20191121;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.xingzhen.model.v20191121.GetPopCodeListByIdResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetPopCodeListByIdResponseUnmarshaller {

	public static GetPopCodeListByIdResponse unmarshall(GetPopCodeListByIdResponse getPopCodeListByIdResponse, UnmarshallerContext _ctx) {
		
		getPopCodeListByIdResponse.setRequestId(_ctx.stringValue("GetPopCodeListByIdResponse.RequestId"));
		getPopCodeListByIdResponse.setCode(_ctx.stringValue("GetPopCodeListByIdResponse.Code"));
		getPopCodeListByIdResponse.setSuccess(_ctx.booleanValue("GetPopCodeListByIdResponse.Success"));
		getPopCodeListByIdResponse.setMessage(_ctx.stringValue("GetPopCodeListByIdResponse.Message"));

		List<String> data = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetPopCodeListByIdResponse.Data.Length"); i++) {
			data.add(_ctx.stringValue("GetPopCodeListByIdResponse.Data["+ i +"]"));
		}
		getPopCodeListByIdResponse.setData(data);
	 
	 	return getPopCodeListByIdResponse;
	}
}