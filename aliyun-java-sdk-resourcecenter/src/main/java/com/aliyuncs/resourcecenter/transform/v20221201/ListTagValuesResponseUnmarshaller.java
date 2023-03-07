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

import com.aliyuncs.resourcecenter.model.v20221201.ListTagValuesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTagValuesResponseUnmarshaller {

	public static ListTagValuesResponse unmarshall(ListTagValuesResponse listTagValuesResponse, UnmarshallerContext _ctx) {
		
		listTagValuesResponse.setRequestId(_ctx.stringValue("ListTagValuesResponse.RequestId"));
		listTagValuesResponse.setNextToken(_ctx.stringValue("ListTagValuesResponse.NextToken"));
		listTagValuesResponse.setSuccess(_ctx.booleanValue("ListTagValuesResponse.Success"));
		listTagValuesResponse.setDynamicCode(_ctx.stringValue("ListTagValuesResponse.DynamicCode"));
		listTagValuesResponse.setDynamicMessage(_ctx.stringValue("ListTagValuesResponse.DynamicMessage"));
		listTagValuesResponse.setErrorCode(_ctx.stringValue("ListTagValuesResponse.ErrorCode"));
		listTagValuesResponse.setErrorMessage(_ctx.stringValue("ListTagValuesResponse.ErrorMessage"));

		List<String> tagValues = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ListTagValuesResponse.TagValues.Length"); i++) {
			tagValues.add(_ctx.stringValue("ListTagValuesResponse.TagValues["+ i +"]"));
		}
		listTagValuesResponse.setTagValues(tagValues);
	 
	 	return listTagValuesResponse;
	}
}