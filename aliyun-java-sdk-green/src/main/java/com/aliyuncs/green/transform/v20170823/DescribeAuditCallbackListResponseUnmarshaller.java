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

package com.aliyuncs.green.transform.v20170823;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.green.model.v20170823.DescribeAuditCallbackListResponse;
import com.aliyuncs.green.model.v20170823.DescribeAuditCallbackListResponse.Callback;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAuditCallbackListResponseUnmarshaller {

	public static DescribeAuditCallbackListResponse unmarshall(DescribeAuditCallbackListResponse describeAuditCallbackListResponse, UnmarshallerContext _ctx) {
		
		describeAuditCallbackListResponse.setRequestId(_ctx.stringValue("DescribeAuditCallbackListResponse.RequestId"));
		describeAuditCallbackListResponse.setTotalCount(_ctx.integerValue("DescribeAuditCallbackListResponse.TotalCount"));

		List<Callback> callbackList = new ArrayList<Callback>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAuditCallbackListResponse.CallbackList.Length"); i++) {
			Callback callback = new Callback();
			callback.setId(_ctx.longValue("DescribeAuditCallbackListResponse.CallbackList["+ i +"].Id"));
			callback.setName(_ctx.stringValue("DescribeAuditCallbackListResponse.CallbackList["+ i +"].Name"));
			callback.setUrl(_ctx.stringValue("DescribeAuditCallbackListResponse.CallbackList["+ i +"].Url"));
			callback.setSeed(_ctx.stringValue("DescribeAuditCallbackListResponse.CallbackList["+ i +"].Seed"));
			callback.setCryptType(_ctx.stringValue("DescribeAuditCallbackListResponse.CallbackList["+ i +"].CryptType"));
			callback.setCreateTime(_ctx.stringValue("DescribeAuditCallbackListResponse.CallbackList["+ i +"].CreateTime"));
			callback.setModifiedTime(_ctx.stringValue("DescribeAuditCallbackListResponse.CallbackList["+ i +"].ModifiedTime"));

			List<String> callbackTypes = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeAuditCallbackListResponse.CallbackList["+ i +"].CallbackTypes.Length"); j++) {
				callbackTypes.add(_ctx.stringValue("DescribeAuditCallbackListResponse.CallbackList["+ i +"].CallbackTypes["+ j +"]"));
			}
			callback.setCallbackTypes(callbackTypes);

			List<String> callbackSuggestions = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeAuditCallbackListResponse.CallbackList["+ i +"].CallbackSuggestions.Length"); j++) {
				callbackSuggestions.add(_ctx.stringValue("DescribeAuditCallbackListResponse.CallbackList["+ i +"].CallbackSuggestions["+ j +"]"));
			}
			callback.setCallbackSuggestions(callbackSuggestions);

			callbackList.add(callback);
		}
		describeAuditCallbackListResponse.setCallbackList(callbackList);
	 
	 	return describeAuditCallbackListResponse;
	}
}