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

package com.aliyuncs.eflo.transform.v20220530;

import com.aliyuncs.eflo.model.v20220530.QueryInstanceNcdResponse;
import com.aliyuncs.eflo.model.v20220530.QueryInstanceNcdResponse.Content;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryInstanceNcdResponseUnmarshaller {

	public static QueryInstanceNcdResponse unmarshall(QueryInstanceNcdResponse queryInstanceNcdResponse, UnmarshallerContext _ctx) {
		
		queryInstanceNcdResponse.setRequestId(_ctx.stringValue("QueryInstanceNcdResponse.RequestId"));
		queryInstanceNcdResponse.setCode(_ctx.integerValue("QueryInstanceNcdResponse.Code"));
		queryInstanceNcdResponse.setMessage(_ctx.stringValue("QueryInstanceNcdResponse.Message"));

		Content content = new Content();
		content.setNcd(_ctx.integerValue("QueryInstanceNcdResponse.Content.Ncd"));
		content.setInstanceId1(_ctx.stringValue("QueryInstanceNcdResponse.Content.InstanceId1"));
		content.setInstanceId2(_ctx.stringValue("QueryInstanceNcdResponse.Content.InstanceId2"));
		content.setInstanceType(_ctx.stringValue("QueryInstanceNcdResponse.Content.InstanceType"));
		queryInstanceNcdResponse.setContent(content);
	 
	 	return queryInstanceNcdResponse;
	}
}