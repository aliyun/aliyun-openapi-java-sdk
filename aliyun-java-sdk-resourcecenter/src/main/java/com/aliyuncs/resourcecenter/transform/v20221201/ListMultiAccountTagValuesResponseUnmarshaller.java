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

import com.aliyuncs.resourcecenter.model.v20221201.ListMultiAccountTagValuesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListMultiAccountTagValuesResponseUnmarshaller {

	public static ListMultiAccountTagValuesResponse unmarshall(ListMultiAccountTagValuesResponse listMultiAccountTagValuesResponse, UnmarshallerContext _ctx) {
		
		listMultiAccountTagValuesResponse.setRequestId(_ctx.stringValue("ListMultiAccountTagValuesResponse.RequestId"));
		listMultiAccountTagValuesResponse.setDynamicCode(_ctx.stringValue("ListMultiAccountTagValuesResponse.DynamicCode"));
		listMultiAccountTagValuesResponse.setDynamicMessage(_ctx.stringValue("ListMultiAccountTagValuesResponse.DynamicMessage"));
		listMultiAccountTagValuesResponse.setErrorCode(_ctx.stringValue("ListMultiAccountTagValuesResponse.ErrorCode"));
		listMultiAccountTagValuesResponse.setErrorMessage(_ctx.stringValue("ListMultiAccountTagValuesResponse.ErrorMessage"));
		listMultiAccountTagValuesResponse.setNextToken(_ctx.stringValue("ListMultiAccountTagValuesResponse.NextToken"));
		listMultiAccountTagValuesResponse.setSuccess(_ctx.booleanValue("ListMultiAccountTagValuesResponse.Success"));

		List<String> tagValues = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ListMultiAccountTagValuesResponse.TagValues.Length"); i++) {
			tagValues.add(_ctx.stringValue("ListMultiAccountTagValuesResponse.TagValues["+ i +"]"));
		}
		listMultiAccountTagValuesResponse.setTagValues(tagValues);
	 
	 	return listMultiAccountTagValuesResponse;
	}
}