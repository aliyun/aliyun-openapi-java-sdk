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

package com.aliyuncs.mns_open.transform.v20220119;

import com.aliyuncs.mns_open.model.v20220119.SetTopicAttributesResponse;
import com.aliyuncs.mns_open.model.v20220119.SetTopicAttributesResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class SetTopicAttributesResponseUnmarshaller {

	public static SetTopicAttributesResponse unmarshall(SetTopicAttributesResponse setTopicAttributesResponse, UnmarshallerContext _ctx) {
		
		setTopicAttributesResponse.setRequestId(_ctx.stringValue("SetTopicAttributesResponse.RequestId"));
		setTopicAttributesResponse.setCode(_ctx.longValue("SetTopicAttributesResponse.Code"));
		setTopicAttributesResponse.setStatus(_ctx.stringValue("SetTopicAttributesResponse.Status"));
		setTopicAttributesResponse.setMessage(_ctx.stringValue("SetTopicAttributesResponse.Message"));
		setTopicAttributesResponse.setSuccess(_ctx.booleanValue("SetTopicAttributesResponse.Success"));

		Data data = new Data();
		data.setCode(_ctx.longValue("SetTopicAttributesResponse.Data.Code"));
		data.setMessage(_ctx.stringValue("SetTopicAttributesResponse.Data.Message"));
		data.setSuccess(_ctx.booleanValue("SetTopicAttributesResponse.Data.Success"));
		setTopicAttributesResponse.setData(data);
	 
	 	return setTopicAttributesResponse;
	}
}