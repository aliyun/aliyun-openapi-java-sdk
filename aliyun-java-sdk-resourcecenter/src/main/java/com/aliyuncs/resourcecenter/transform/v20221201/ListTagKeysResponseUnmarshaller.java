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

package com.aliyuncs.resourcecenter.transform.v20221201;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.resourcecenter.model.v20221201.ListTagKeysResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTagKeysResponseUnmarshaller {

	public static ListTagKeysResponse unmarshall(ListTagKeysResponse listTagKeysResponse, UnmarshallerContext _ctx) {
		
		listTagKeysResponse.setRequestId(_ctx.stringValue("ListTagKeysResponse.RequestId"));
		listTagKeysResponse.setNextToken(_ctx.stringValue("ListTagKeysResponse.NextToken"));
		listTagKeysResponse.setSuccess(_ctx.booleanValue("ListTagKeysResponse.Success"));
		listTagKeysResponse.setDynamicCode(_ctx.stringValue("ListTagKeysResponse.DynamicCode"));
		listTagKeysResponse.setDynamicMessage(_ctx.stringValue("ListTagKeysResponse.DynamicMessage"));
		listTagKeysResponse.setErrorCode(_ctx.stringValue("ListTagKeysResponse.ErrorCode"));
		listTagKeysResponse.setErrorMessage(_ctx.stringValue("ListTagKeysResponse.ErrorMessage"));

		List<String> tagKeys = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ListTagKeysResponse.TagKeys.Length"); i++) {
			tagKeys.add(_ctx.stringValue("ListTagKeysResponse.TagKeys["+ i +"]"));
		}
		listTagKeysResponse.setTagKeys(tagKeys);
	 
	 	return listTagKeysResponse;
	}
}