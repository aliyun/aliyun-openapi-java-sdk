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

import com.aliyuncs.resourcecenter.model.v20221201.ListMultiAccountTagKeysResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListMultiAccountTagKeysResponseUnmarshaller {

	public static ListMultiAccountTagKeysResponse unmarshall(ListMultiAccountTagKeysResponse listMultiAccountTagKeysResponse, UnmarshallerContext _ctx) {
		
		listMultiAccountTagKeysResponse.setRequestId(_ctx.stringValue("ListMultiAccountTagKeysResponse.RequestId"));
		listMultiAccountTagKeysResponse.setNextToken(_ctx.stringValue("ListMultiAccountTagKeysResponse.NextToken"));
		listMultiAccountTagKeysResponse.setSuccess(_ctx.booleanValue("ListMultiAccountTagKeysResponse.Success"));
		listMultiAccountTagKeysResponse.setDynamicCode(_ctx.stringValue("ListMultiAccountTagKeysResponse.DynamicCode"));
		listMultiAccountTagKeysResponse.setDynamicMessage(_ctx.stringValue("ListMultiAccountTagKeysResponse.DynamicMessage"));
		listMultiAccountTagKeysResponse.setErrorCode(_ctx.stringValue("ListMultiAccountTagKeysResponse.ErrorCode"));
		listMultiAccountTagKeysResponse.setErrorMessage(_ctx.stringValue("ListMultiAccountTagKeysResponse.ErrorMessage"));

		List<String> tagKeys = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ListMultiAccountTagKeysResponse.TagKeys.Length"); i++) {
			tagKeys.add(_ctx.stringValue("ListMultiAccountTagKeysResponse.TagKeys["+ i +"]"));
		}
		listMultiAccountTagKeysResponse.setTagKeys(tagKeys);
	 
	 	return listMultiAccountTagKeysResponse;
	}
}