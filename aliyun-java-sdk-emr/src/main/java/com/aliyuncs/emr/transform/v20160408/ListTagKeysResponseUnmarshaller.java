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

package com.aliyuncs.emr.transform.v20160408;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emr.model.v20160408.ListTagKeysResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTagKeysResponseUnmarshaller {

	public static ListTagKeysResponse unmarshall(ListTagKeysResponse listTagKeysResponse, UnmarshallerContext _ctx) {
		
		listTagKeysResponse.setRequestId(_ctx.stringValue("ListTagKeysResponse.RequestId"));
		listTagKeysResponse.setCode(_ctx.stringValue("ListTagKeysResponse.Code"));
		listTagKeysResponse.setMessage(_ctx.stringValue("ListTagKeysResponse.Message"));
		listTagKeysResponse.setSuccess(_ctx.booleanValue("ListTagKeysResponse.Success"));
		listTagKeysResponse.setPageSize(_ctx.integerValue("ListTagKeysResponse.PageSize"));
		listTagKeysResponse.setTotalCount(_ctx.integerValue("ListTagKeysResponse.TotalCount"));
		listTagKeysResponse.setNextToken(_ctx.stringValue("ListTagKeysResponse.NextToken"));

		List<String> keys = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ListTagKeysResponse.Keys.Length"); i++) {
			keys.add(_ctx.stringValue("ListTagKeysResponse.Keys["+ i +"]"));
		}
		listTagKeysResponse.setKeys(keys);
	 
	 	return listTagKeysResponse;
	}
}