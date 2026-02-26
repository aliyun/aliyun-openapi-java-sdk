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

package com.aliyuncs.xrengine.transform.v20221111;

import com.aliyuncs.xrengine.model.v20221111.ListAreaMapResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAreaMapResponseUnmarshaller {

	public static ListAreaMapResponse unmarshall(ListAreaMapResponse listAreaMapResponse, UnmarshallerContext _ctx) {
		
		listAreaMapResponse.setRequestId(_ctx.stringValue("ListAreaMapResponse.RequestId"));
		listAreaMapResponse.setData(_ctx.mapValue("ListAreaMapResponse.Data"));
		listAreaMapResponse.setCurrent(_ctx.integerValue("ListAreaMapResponse.Current"));
		listAreaMapResponse.setSize(_ctx.integerValue("ListAreaMapResponse.Size"));
		listAreaMapResponse.setTotal(_ctx.integerValue("ListAreaMapResponse.Total"));
		listAreaMapResponse.setPages(_ctx.integerValue("ListAreaMapResponse.Pages"));
		listAreaMapResponse.setSuccess(_ctx.booleanValue("ListAreaMapResponse.Success"));
		listAreaMapResponse.setCode(_ctx.stringValue("ListAreaMapResponse.Code"));
		listAreaMapResponse.setMessage(_ctx.stringValue("ListAreaMapResponse.Message"));
		listAreaMapResponse.setErrorName(_ctx.stringValue("ListAreaMapResponse.ErrorName"));
		listAreaMapResponse.setHttpCode(_ctx.integerValue("ListAreaMapResponse.HttpCode"));
	 
	 	return listAreaMapResponse;
	}
}