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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.ListDTXBizTypesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDTXBizTypesResponseUnmarshaller {

	public static ListDTXBizTypesResponse unmarshall(ListDTXBizTypesResponse listDTXBizTypesResponse, UnmarshallerContext _ctx) {
		
		listDTXBizTypesResponse.setRequestId(_ctx.stringValue("ListDTXBizTypesResponse.RequestId"));
		listDTXBizTypesResponse.setResultCode(_ctx.stringValue("ListDTXBizTypesResponse.ResultCode"));
		listDTXBizTypesResponse.setResultMessage(_ctx.stringValue("ListDTXBizTypesResponse.ResultMessage"));
		listDTXBizTypesResponse.setSuccess(_ctx.booleanValue("ListDTXBizTypesResponse.Success"));

		List<String> data = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ListDTXBizTypesResponse.Data.Length"); i++) {
			data.add(_ctx.stringValue("ListDTXBizTypesResponse.Data["+ i +"]"));
		}
		listDTXBizTypesResponse.setData(data);
	 
	 	return listDTXBizTypesResponse;
	}
}